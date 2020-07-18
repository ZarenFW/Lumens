package com.Zaren.Lumens.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OreRealgar extends Block {
    public OreRealgar() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(5.0F, 6.0F)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                );
    }
}
