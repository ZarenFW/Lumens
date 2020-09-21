package com.Zaren.Lumens.blocks.containers;

import com.Zaren.Lumens.util.RegistryHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SolarBasicContainer extends SolarContainer{
    public SolarBasicContainer(int windowId, World world, BlockPos pos, PlayerEntity player)
    {
        super(RegistryHandler.BASIC_SOLAR_CONTAINER.get(), windowId, world, pos, player);
    }

}
