package com.Zaren.Lumens.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.*;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class SolarBlock extends Block {

    public SolarBlock(int harvestLevel, float hardness) {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(hardness, 6.0F)
                .sound(SoundType.METAL)
                .harvestLevel(harvestLevel)
                .harvestTool(ToolType.PICKAXE)
                );
    }
}
