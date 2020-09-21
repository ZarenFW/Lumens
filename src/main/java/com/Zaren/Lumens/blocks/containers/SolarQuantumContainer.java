package com.Zaren.Lumens.blocks.containers;

import com.Zaren.Lumens.util.RegistryHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SolarQuantumContainer extends SolarContainer{
    public SolarQuantumContainer(int windowId, World world, BlockPos pos, PlayerEntity player)
    {
        super(RegistryHandler.QUANTUM_SOLAR_CONTAINER.get(), windowId, world, pos, player);
    }

}
