package com.Zaren.Lumens.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OreBlock extends Block {
    public OreBlock(int harvestLevel, float hardness) {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(hardness, 6.0F)
                .sound(SoundType.STONE)
                .harvestLevel(harvestLevel)
                .harvestTool(ToolType.PICKAXE)
                );
    }
}
