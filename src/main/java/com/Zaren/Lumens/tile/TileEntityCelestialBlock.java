package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.blocks.containers.*;
import com.Zaren.Lumens.config.Config;
import com.Zaren.Lumens.network.PacketHandler;
import com.Zaren.Lumens.network.packet.UpdateCelestial;
import com.Zaren.Lumens.tools.CustomEnergyStorage;
import com.Zaren.Lumens.tools.ProductionCelestial;
import com.Zaren.Lumens.tools.CelestialPanelLevel;
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

public class TileEntityCelestialBlock extends TileEntity implements ITickableTileEntity, INamedContainerProvider {

    // Energy
    private LazyOptional<IEnergyStorage> energy = LazyOptional.of(this::createEnergy);
    private int energyGeneration, maxEnergyOutput;
    public int maxEnergy;
    private CelestialPanelLevel levelCelestialPanel;
    public int energyClient, energyProductionClient;

    public TileEntityCelestialBlock(CelestialPanelLevel levelCelestialPanel, TileEntityType<?> tileEntityCelestialPanel)
    {
        super(tileEntityCelestialPanel);
        this.levelCelestialPanel = levelCelestialPanel;
        if(levelCelestialPanel.ordinal()==0){energyGeneration = PRIMITIVE_GEN;}
        else if(levelCelestialPanel.ordinal()==1){energyGeneration = BASIC_GEN;}
        else if(levelCelestialPanel.ordinal()==2){energyGeneration = ADVANCED_GEN;}
        else if(levelCelestialPanel.ordinal()==3){energyGeneration = ELITE_GEN;}
        else if(levelCelestialPanel.ordinal()==4){energyGeneration = HELLBORN_GEN;}
        else if(levelCelestialPanel.ordinal()==5){energyGeneration = QUANTUM_GEN;}
        else {energyGeneration = DRAGONFORGED_GEN;}
        maxEnergyOutput = energyGeneration * 10;
        if(levelCelestialPanel.ordinal()==0){maxEnergy = PRIMITIVE_MAX;}
        else if(levelCelestialPanel.ordinal()==1){maxEnergy = BASIC_MAX;}
        else if(levelCelestialPanel.ordinal()==2){maxEnergy = ADVANCED_MAX;}
        else if(levelCelestialPanel.ordinal()==3){maxEnergy = ELITE_MAX;}
        else if(levelCelestialPanel.ordinal()==4){maxEnergy = HELLBORN_MAX;}
        else if(levelCelestialPanel.ordinal()==5){maxEnergy = QUANTUM_MAX;}
        else {maxEnergy = DRAGONFORGED_MAX;}
        energyClient = energyProductionClient = -1;
    }

    int PRIMITIVE_GEN = Config.PRIMITIVE_CELESTIALBLOCK_GENERATE.get();
    int BASIC_GEN = Config.BASIC_CELESTIALBLOCK_GENERATE.get();
    int ADVANCED_GEN = Config.ADVANCED_CELESTIALBLOCK_GENERATE.get();
    int ELITE_GEN = Config.ELITE_CELESTIALBLOCK_GENERATE.get();
    int HELLBORN_GEN = Config.HELLBORN_CELESTIALBLOCK_GENERATE.get();
    int QUANTUM_GEN = Config.QUANTUM_CELESTIALBLOCK_GENERATE.get();
    int DRAGONFORGED_GEN = Config.DRAGONFORGED_CELESTIALBLOCK_GENERATE.get();

    int PRIMITIVE_MAX = Config.PRIMITIVE_CELESTIALBLOCK_MAXPOWER.get();
    int BASIC_MAX = Config.BASIC_CELESTIALBLOCK_MAXPOWER.get();
    int ADVANCED_MAX = Config.ADVANCED_CELESTIALBLOCK_MAXPOWER.get();
    int ELITE_MAX = Config.ELITE_CELESTIALBLOCK_MAXPOWER.get();
    int HELLBORN_MAX = Config.HELLBORN_CELESTIALBLOCK_MAXPOWER.get();
    int QUANTUM_MAX = Config.QUANTUM_CELESTIALBLOCK_MAXPOWER.get();
    int DRAGONFORGED_MAX = Config.DRAGONFORGED_CELESTIALBLOCK_MAXPOWER.get();

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
                PacketHandler.INSTANCE.send(PacketDistributor.ALL.noArg(), new UpdateCelestial(getPos(), getEnergy(), energyProduced));
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

    public int currentAmountEnergyProduced()
    {
        return (int) (energyGeneration * ProductionCelestial.computeIntensity(world, getPos(), levelCelestialPanel));
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
    public void read(CompoundNBT compound)
    {
        CompoundNBT energyTag = compound.getCompound("energy");
        energy.ifPresent(h -> ((INBTSerializable<CompoundNBT>) h).deserializeNBT(energyTag));
        super.read(getBlockState(),compound);
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
        switch (levelCelestialPanel)
        {
            case PRIMITIVE:
                return new CelestialPrimitiveContainer(id, world, pos, playerEntity);
            case BASIC:
                return new CelestialBasicContainer(id, world, pos, playerEntity);
            case ADVANCED:
                return new CelestialAdvancedContainer(id, world, pos, playerEntity);
            case ELITE:
                return new CelestialEliteContainer(id, world, pos, playerEntity);
            case HELLBORN:
                return new CelestialHellbornContainer(id, world, pos, playerEntity);
            case QUANTUM:
                return new CelestialQuantumContainer(id, world, pos, playerEntity);
            case DRAGONFORGED:
                return new CelestialDragonforgedContainer(id, world, pos, playerEntity);
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