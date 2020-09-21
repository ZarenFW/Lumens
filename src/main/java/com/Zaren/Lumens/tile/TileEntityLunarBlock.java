package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.blocks.containers.*;
import com.Zaren.Lumens.config.Config;
import com.Zaren.Lumens.network.PacketHandler;
import com.Zaren.Lumens.network.packet.UpdateLunar;
import com.Zaren.Lumens.tools.CustomEnergyStorage;
import com.Zaren.Lumens.tools.ProductionLunar;
import com.Zaren.Lumens.tools.LunarPanelLevel;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fml.network.PacketDistributor;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.concurrent.atomic.AtomicInteger;

public class TileEntityLunarBlock extends TileEntity implements ITickableTileEntity, INamedContainerProvider {

    // Energy
    private LazyOptional<IEnergyStorage> energy = LazyOptional.of(this::createEnergy);
    private int energyGeneration, maxEnergyOutput;
    public int maxEnergy;
    private LunarPanelLevel levelLunarPanel;
    public int energyClient, energyProductionClient;

    public TileEntityLunarBlock(LunarPanelLevel levelLunarPanel, TileEntityType<?> tileEntityLunarPanel)
    {
        super(tileEntityLunarPanel);
        this.levelLunarPanel = levelLunarPanel;
        if(levelLunarPanel.ordinal()==0){energyGeneration = PRIMITIVE_GEN;}
        else if(levelLunarPanel.ordinal()==1){energyGeneration = BASIC_GEN;}
        else if(levelLunarPanel.ordinal()==2){energyGeneration = ADVANCED_GEN;}
        else if(levelLunarPanel.ordinal()==3){energyGeneration = ELITE_GEN;}
        else if(levelLunarPanel.ordinal()==4){energyGeneration = HELLBORN_GEN;}
        else if(levelLunarPanel.ordinal()==5){energyGeneration = QUANTUM_GEN;}
        else {energyGeneration = DRAGONFORGED_GEN;}
        maxEnergyOutput = energyGeneration * 10;
        if(levelLunarPanel.ordinal()==0){maxEnergy = PRIMITIVE_MAX;}
        else if(levelLunarPanel.ordinal()==1){maxEnergy = BASIC_MAX;}
        else if(levelLunarPanel.ordinal()==2){maxEnergy = ADVANCED_MAX;}
        else if(levelLunarPanel.ordinal()==3){maxEnergy = ELITE_MAX;}
        else if(levelLunarPanel.ordinal()==4){maxEnergy = HELLBORN_MAX;}
        else if(levelLunarPanel.ordinal()==5){maxEnergy = QUANTUM_MAX;}
        else {maxEnergy = DRAGONFORGED_MAX;}
        energyClient = energyProductionClient = -1;
    }

    int PRIMITIVE_GEN = Config.PRIMITIVE_SOLARBLOCK_GENERATE.get();
    int BASIC_GEN = Config.BASIC_SOLARBLOCK_GENERATE.get();
    int ADVANCED_GEN = Config.ADVANCED_SOLARBLOCK_GENERATE.get();
    int ELITE_GEN = Config.ELITE_SOLARBLOCK_GENERATE.get();
    int HELLBORN_GEN = Config.HELLBORN_SOLARBLOCK_GENERATE.get();
    int QUANTUM_GEN = Config.QUANTUM_SOLARBLOCK_GENERATE.get();
    int DRAGONFORGED_GEN = Config.DRAGONFORGED_SOLARBLOCK_GENERATE.get();

    int PRIMITIVE_MAX = Config.PRIMITIVE_SOLARBLOCK_MAXPOWER.get();
    int BASIC_MAX = Config.BASIC_SOLARBLOCK_MAXPOWER.get();
    int ADVANCED_MAX = Config.ADVANCED_SOLARBLOCK_MAXPOWER.get();
    int ELITE_MAX = Config.ELITE_SOLARBLOCK_MAXPOWER.get();
    int HELLBORN_MAX = Config.HELLBORN_SOLARBLOCK_MAXPOWER.get();
    int QUANTUM_MAX = Config.QUANTUM_SOLARBLOCK_MAXPOWER.get();
    int DRAGONFORGED_MAX = Config.DRAGONFORGED_SOLARBLOCK_MAXPOWER.get();

    private IEnergyStorage createEnergy()
    {
        return new CustomEnergyStorage(maxEnergyOutput, maxEnergy);
    }

    @Override
    public void tick()
    {
        if(!world.isRemote)
        {
            energy.ifPresent(e -> ((CustomEnergyStorage) e).generatePower(currentAmountEnergyProduced()));
            sendEnergy();
            if(energyClient != getEnergy() || energyProductionClient != currentAmountEnergyProduced())
            {
                int energyProduced = (getEnergy() != getMaxEnergy()) ? currentAmountEnergyProduced() : 0;
                PacketHandler.INSTANCE.send(PacketDistributor.ALL.noArg(), new UpdateLunar(getPos(), getEnergy(), energyProduced));
            }
        }
    }

    private int getMaxEnergy()
    {
        return getCapability(CapabilityEnergy.ENERGY).map(IEnergyStorage::getMaxEnergyStored).orElse(0);
    }

    private int getEnergy()
    {
        return getCapability(CapabilityEnergy.ENERGY).map(IEnergyStorage::getEnergyStored).orElse(0);
    }

    private int currentAmountEnergyProduced()
    {
        return (int) (energyGeneration * ProductionLunar.computeMoonIntensity(world, getPos(), levelLunarPanel));
    }

    private void sendEnergy()
    {
        energy.ifPresent(energy ->
        {
            AtomicInteger capacity = new AtomicInteger(energy.getEnergyStored());

            for(int i = 0; (i < Direction.values().length) && (capacity.get() > 0); i++)
            {
                Direction facing = Direction.values()[i];
                if(facing != Direction.UP)
                {
                    TileEntity tileEntity = world.getTileEntity(pos.offset(facing));
                    if(tileEntity != null)
                    {
                        tileEntity.getCapability(CapabilityEnergy.ENERGY, facing.getOpposite()).ifPresent(handler ->
                        {
                            if(handler.canReceive())
                            {
                                int received = handler.receiveEnergy(Math.min(capacity.get(), maxEnergyOutput), false);
                                capacity.addAndGet(-received);
                                ((CustomEnergyStorage) energy).consumePower(received);
                            }
                        });
                    }
                }
            }
        });
    }

    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, Direction facing)
    {
        if(capability == CapabilityEnergy.ENERGY && facing != Direction.UP)
        {
            return energy.cast();
        }
        return super.getCapability(capability, facing);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void read(CompoundNBT compound)
    {
        CompoundNBT energyTag = compound.getCompound("energy");
        energy.ifPresent(h -> ((INBTSerializable<CompoundNBT>) h).deserializeNBT(energyTag));
        super.read(compound);
    }

    @SuppressWarnings("unchecked")
    @Override
    public CompoundNBT write(CompoundNBT compound)
    {
        energy.ifPresent(h ->
        {
            CompoundNBT tag = ((INBTSerializable<CompoundNBT>) h).serializeNBT();
            compound.put("energy", tag);
        });
        return super.write(compound);
    }

    @Nullable
    @Override
    public Container createMenu(int id, PlayerInventory playerInventory, PlayerEntity playerEntity)
    {
        switch (levelLunarPanel)
        {
            case PRIMITIVE:
                return new LunarPrimitiveContainer(id, world, pos, playerEntity);
            case BASIC:
                return new LunarBasicContainer(id, world, pos, playerEntity);
            case ADVANCED:
                return new LunarAdvancedContainer(id, world, pos, playerEntity);
            case ELITE:
                return new LunarEliteContainer(id, world, pos, playerEntity);
            case HELLBORN:
                return new LunarHellbornContainer(id, world, pos, playerEntity);
            case QUANTUM:
                return new LunarQuantumContainer(id, world, pos, playerEntity);
            case DRAGONFORGED:
                return new LunarDragonforgedContainer(id, world, pos, playerEntity);
            default:
                return null;
        }
    }

    @Override
    public ITextComponent getDisplayName()
    {
        return new TranslationTextComponent(this.getBlockState().getBlock().getTranslationKey());
    }
}