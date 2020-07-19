package com.Zaren.Lumens.world_gen;

import com.Zaren.Lumens.Lumens;
import com.Zaren.Lumens.config.Config;
import com.Zaren.Lumens.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;



@Mod.EventBusSubscriber(modid = Lumens.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGen{

    public static OreFeatureConfig.FillerBlockType END_STONE = OreFeatureConfig.FillerBlockType.create("END_STONE", "end_stone", new BlockMatcher(Blocks.END_STONE));

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES)



            //Nether
            if (biome.getCategory() == Biome.Category.NETHER) {
                genOre(biome, 10, 5, 5, 150, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.ORE_ARNALIOS.get().getDefaultState(), 6);
                genOre(biome, 10, 5, 5, 150, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.ORE_CARNELIAN.get().getDefaultState(), 6);
                genOre(biome, 10, 5, 5, 150, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.ORE_CHROME.get().getDefaultState(), 6);
                genOre(biome, 10, 5, 5, 150, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.ORE_GERMANIUM.get().getDefaultState(), 6);
                genOre(biome, 10, 5, 5, 150, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.ORE_INDIUM.get().getDefaultState(), 6);
                genOre(biome, 10, 5, 5, 150, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.ORE_KARROSH.get().getDefaultState(), 6);
                genOre(biome, 10, 5, 5, 150, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.ORE_MAGNESIUM.get().getDefaultState(), 6);
                genOre(biome, 10, 5, 5, 150, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.ORE_NANITE.get().getDefaultState(), 6);
                genOre(biome, 10, 5, 5, 150, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.ORE_NEPHRITE.get().getDefaultState(), 6);
                genOre(biome, 10, 5, 5, 150, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.ORE_RHODIUM.get().getDefaultState(), 6);
                genOre(biome, 10, 5, 5, 150, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.ORE_SYRALTITE.get().getDefaultState(), 6);
                genOre(biome, 10, 5, 5, 150, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.ORE_TITANIUM.get().getDefaultState(), 6);
                //End
                 } else if (biome.getCategory() == Biome.Category.THEEND) {
                    genOre(biome, 30, 5, 5, 200, END_STONE, RegistryHandler.ORE_SYRALTITE.get().getDefaultState(), 6);
                    //OverWorld
                    } else {
                int aluminiumOreChances = Config.ALUMINIUM_ORE_CHANCES.get();
                if (aluminiumOreChances > 0) {
                    genOre(biome, Config.ALUMINIUM_ORE_CHANCES.get(), Config.ALUMINIUM_ORE_MINY.get(), 0, Config.ALUMINIUM_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_ALUMINIUM.get().getDefaultState(), Config.ALUMINIUM_ORE_VEINSIZE.get());
                                };
                genOre(biome, 5, 16, 5, 50, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_ANTARIUM.get().getDefaultState(), 6);
                genOre(biome, 8, 42, 5, 75, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_AZURITE.get().getDefaultState(), 5);
                genOre(biome, 8, 42, 5, 75, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_CELESTINE.get().getDefaultState(), 5);
                genOre(biome, 10, 15, 5, 85, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_COPPER.get().getDefaultState(), 7);
                genOre(biome, 6, 25, 5, 60, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_KAI_STONE.get().getDefaultState(), 4);
                genOre(biome, 4, 15, 5, 40, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_LITHIUM.get().getDefaultState(), 3);
                genOre(biome, 4, 3, 5, 25, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_LUNARITE.get().getDefaultState(), 4);
                genOre(biome, 4, 15, 5, 40, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_MANGANESE.get().getDefaultState(), 3);
                genOre(biome, 6, 25, 5, 60, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_MYTHRIL.get().getDefaultState(), 4);
                genOre(biome, 4, 3, 5, 25, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_REALGAR.get().getDefaultState(), 4);
                genOre(biome, 7, 10, 5, 55, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_SILVER.get().getDefaultState(), 6);
                genOre(biome, 10, 15, 5, 85, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_TIN.get().getDefaultState(), 7);
                genOre(biome, 4, 40, 5, 125, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_YALITE.get().getDefaultState(), 3);
                genOre(biome, 6, 15, 5, 55, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_ZINC.get().getDefaultState(), 4);
            }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size) {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
    }

