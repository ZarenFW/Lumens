package com.Zaren.Lumens.blocks.containers;

import com.Zaren.Lumens.tile.TileEntityCelestialBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CelestialContainer extends Container {

    public final TileEntityCelestialBlock tile;
    private final PlayerEntity player;

    public CelestialContainer(ContainerType<?> type, int windowId, World world, BlockPos pos, PlayerEntity player)
    {
        super(type, windowId);
        this.tile = (TileEntityCelestialBlock) world.getTileEntity(pos);
        this.player = player;
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn)
    {
        return isWithinUsableDistance(IWorldPosCallable.of(tile.getWorld(), tile.getPos()), player, tile.getBlockState().getBlock());
    }
}

