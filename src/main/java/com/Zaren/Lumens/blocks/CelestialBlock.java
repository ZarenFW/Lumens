package com.Zaren.Lumens.blocks;

import com.Zaren.Lumens.tile.*;
import com.Zaren.Lumens.tools.CelestialPanelLevel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;

public class CelestialBlock extends Block {
    private final CelestialPanelLevel levelCelestialPanel;
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    private static final BooleanProperty WATERLOGGED = BooleanProperty.create("waterlogged");
public static VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D);
    public CelestialBlock(CelestialPanelLevel levelCelestialPanel) {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(5F, 6.0F)
                .sound(SoundType.METAL)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE));
        this.levelCelestialPanel = levelCelestialPanel;
        this.setDefaultState(getDefaultState().with(WATERLOGGED, false));
    }
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {return SHAPE;
    }
    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world)
    {
        switch (this.levelCelestialPanel)
        {
            case PRIMITIVE:
                return new TileEntityPrimitiveCelestial();
            case BASIC:
                return new TileEntityBasicCelestial();
            case ADVANCED:
                return new TileEntityAdvancedCelestial();
            case ELITE:
                return new TileEntityEliteCelestial();
            case HELLBORN:
                return new TileEntityHellbornCelestial();
            case QUANTUM:
                return new TileEntityQuantumCelestial();
            case DRAGONFORGED:
                return new TileEntityDragonforgedCelestial();
            default:
                return null;
        }
    }

    @SuppressWarnings("deprecation")

    @Override
    public boolean removedByPlayer(BlockState state, World world, BlockPos pos, PlayerEntity player, boolean willHarvest, FluidState fluid)
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
    public FluidState getFluidState(BlockState state)
    {
        return (FluidState) (state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state));
    }
    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote) {
            TileEntity tileEntity = worldIn.getTileEntity(pos);
            if (tileEntity instanceof INamedContainerProvider) {
                NetworkHooks.openGui((ServerPlayerEntity) player, (INamedContainerProvider) tileEntity, tileEntity.getPos());
            }
        }
        return ActionResultType.SUCCESS;
    }
    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        super.fillStateContainer(builder);
        builder.add(WATERLOGGED);
    }
    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }
    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn){
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }
}

