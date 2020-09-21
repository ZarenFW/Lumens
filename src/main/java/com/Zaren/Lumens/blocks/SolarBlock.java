package com.Zaren.Lumens.blocks;

import com.Zaren.Lumens.tile.*;
import com.Zaren.Lumens.tools.SolarPanelLevel;
import com.Zaren.Lumens.tools.Tooltip;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.List;

public class SolarBlock extends Block {
    private final SolarPanelLevel levelSolarPanel;
    private static final BooleanProperty WATERLOGGED = BooleanProperty.create("waterlogged");
public static VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D);
    public SolarBlock(SolarPanelLevel levelSolarPanel) {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(5F, 6.0F)
                .sound(SoundType.METAL)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE));
        this.levelSolarPanel = levelSolarPanel;
        this.setDefaultState(getDefaultState().with(WATERLOGGED, false));
    }
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {return SHAPE;
    }
    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world)
    {
        switch (this.levelSolarPanel)
        {
            case PRIMITIVE:
                return new TileEntityPrimitiveSolar();
            case BASIC:
                return new TileEntityBasicSolar();
            case ADVANCED:
                return new TileEntityAdvancedSolar();
            case ELITE:
                return new TileEntityEliteSolar();
            case HELLBORN:
                return new TileEntityHellbornSolar();
            case QUANTUM:
                return new TileEntityQuantumSolar();
            case DRAGONFORGED:
                return new TileEntityDragonforgedSolar();
            default:
                return null;
        }
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public void addInformation(ItemStack stack, IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        CompoundNBT compoundnbt = stack.getChildTag("BlockEntityTag");
        int energy = 0;
        if(compoundnbt != null)
            if(compoundnbt.contains("energy"))
                energy = compoundnbt.getCompound("energy").getInt("value");

    }
    @SuppressWarnings("deprecation")

    @Override
    public boolean removedByPlayer(BlockState state, World world, BlockPos pos, PlayerEntity player, boolean willHarvest, IFluidState fluid)
    {
        return willHarvest || super.removedByPlayer(state, world, pos, player, willHarvest, fluid);
    }
    @Override
    public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, TileEntity te, ItemStack stack)
    {
        super.harvestBlock(worldIn, player, pos, state, te, stack);
        worldIn.removeBlock(pos, false);
    }

    @Override
    public boolean hasTileEntity(BlockState state)
    {
        return true;
    }
    @Override
    public IFluidState getFluidState(BlockState state)
    {
        return (FluidState) (state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state));
    }
    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        super.fillStateContainer(builder);
        builder.add(WATERLOGGED);
    }
}

