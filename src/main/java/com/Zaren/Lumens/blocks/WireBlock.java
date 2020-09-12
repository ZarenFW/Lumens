package com.Zaren.Lumens.blocks;

import mcjty.theoneprobe.apiimpl.providers.BlockProbeInfoProvider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class WireBlock extends Block {
    public WireBlock(int harvestLevel, float hardness) {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(hardness, 6.0F)
                .sound(SoundType.METAL)
                .harvestLevel(harvestLevel)
                .harvestTool(ToolType.PICKAXE)
                );

    }
}