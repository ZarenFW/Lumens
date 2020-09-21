package com.Zaren.Lumens.blocks;

import com.Zaren.Lumens.tile.*;
import com.Zaren.Lumens.tools.LunarPanelLevel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class LunarBlock extends Block {
    private final LunarPanelLevel levelLunarPanel;
    private static final BooleanProperty WATERLOGGED = BooleanProperty.create("waterlogged");
public static VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D);
    public LunarBlock(LunarPanelLevel levelLunarPanel) {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(5F, 6.0F)
                .sound(SoundType.METAL)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE));
        this.levelLunarPanel = levelLunarPanel;
        this.setDefaultState(getDefaultState().with(WATERLOGGED, false));
    }
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {return SHAPE;
    }
    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world)
    {
        switch (this.levelLunarPanel)
        {
            case PRIMITIVE:
                return new TileEntityPrimitiveLunar();
            case BASIC:
                return new TileEntityBasicLunar();
            case ADVANCED:
                return new TileEntityAdvancedLunar();
            case ELITE:
                return new TileEntityEliteLunar();
            case HELLBORN:
                return new TileEntityHellbornLunar();
            case QUANTUM:
                return new TileEntityQuantumLunar();
            case DRAGONFORGED:
                return new TileEntityDragonforgedLunar();
            default:
                return null;
        }
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

