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
                int arnaliosOreChances = Config.ARNALIOS_ORE_CHANCES.get();
                int carnelianOreChances = Config.CARNELIAN_ORE_CHANCES.get();
                int chromeOreChances = Config.CHROME_ORE_CHANCES.get();
                int germaniumOreChances = Config.GERMANIUM_ORE_CHANCES.get();
                int indiumOreChanes = Config.INDIUM_ORE_CHANCES.get();
                int karroshOreChances = Config.KARROSH_ORE_CHANCES.get();
                int magnesiumOreChances = Config.MAGNESIUM_ORE_CHANCES.get();
                int naniteOreChances = Config.NANITE_ORE_CHANCES.get();
                int nephriteOreChances = Config.NEPHRITE_ORE_CHANCES.get();
                int pyroliteOreChances = Config.PYROLITE_ORE_CHANCES.get();
                int rhodiumOreChances = Config.RHODIUM_ORE_CHANCES.get();
                int syraltiteOreChances = Config.SYRALTITE_ORE_CHANCES.get();
                int titaniumOreChances = Config.TITANIUM_ORE_CHANCES.get();
                    if (arnaliosOreChances > 0) {
                        genOre(biome, Config.ARNALIOS_ORE_CHANCES.get(), Config.ARNALIOS_ORE_MINY.get(), 0, Config.ARNALIOS_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_ARNALIOS.get().getDefaultState(), Config.ARNALIOS_ORE_VEINSIZE.get());
                    };
                    if (carnelianOreChances > 0) {
                        genOre(biome, Config.CARNELIAN_ORE_CHANCES.get(), Config.CARNELIAN_ORE_MINY.get(), 0, Config.CARNELIAN_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_CARNELIAN.get().getDefaultState(), Config.CARNELIAN_ORE_VEINSIZE.get());
                    };
                    if (chromeOreChances > 0) {
                        genOre(biome, Config.CHROME_ORE_CHANCES.get(), Config.CHROME_ORE_MINY.get(), 0, Config.CHROME_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_CHROME.get().getDefaultState(), Config.CHROME_ORE_VEINSIZE.get());
                    };
                    if (germaniumOreChances > 0) {
                        genOre(biome, Config.GERMANIUM_ORE_CHANCES.get(), Config.GERMANIUM_ORE_MINY.get(), 0, Config.GERMANIUM_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_GERMANIUM.get().getDefaultState(), Config.GERMANIUM_ORE_VEINSIZE.get());
                    };
                    if (indiumOreChanes > 0) {
                        genOre(biome, Config.INDIUM_ORE_CHANCES.get(), Config.INDIUM_ORE_MINY.get(), 0, Config.INDIUM_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_INDIUM.get().getDefaultState(), Config.INDIUM_ORE_VEINSIZE.get());
                    };
                    if (karroshOreChances > 0) {
                        genOre(biome, Config.KARROSH_ORE_CHANCES.get(), Config.KARROSH_ORE_MINY.get(), 0, Config.KARROSH_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_KARROSH.get().getDefaultState(), Config.KARROSH_ORE_VEINSIZE.get());
                    };
                    if (magnesiumOreChances > 0) {
                        genOre(biome, Config.MAGNESIUM_ORE_CHANCES.get(), Config.MAGNESIUM_ORE_MINY.get(), 0, Config.MAGNESIUM_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_MAGNESIUM.get().getDefaultState(), Config.MAGNESIUM_ORE_VEINSIZE.get());
                    };
                    if (naniteOreChances > 0) {
                        genOre(biome, Config.NANITE_ORE_CHANCES.get(), Config.NANITE_ORE_MINY.get(), 0, Config.NANITE_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_NANITE.get().getDefaultState(), Config.NANITE_ORE_VEINSIZE.get());
                    };
                    if (nephriteOreChances > 0) {
                        genOre(biome, Config.NEPHRITE_ORE_CHANCES.get(), Config.NEPHRITE_ORE_MINY.get(), 0, Config.NEPHRITE_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_NEPHRITE.get().getDefaultState(), Config.NEPHRITE_ORE_VEINSIZE.get());
                    };
                    if (pyroliteOreChances > 0) {
                        genOre(biome, Config.PYROLITE_ORE_CHANCES.get(), Config.PYROLITE_ORE_MINY.get(), 0, Config.PYROLITE_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_PYROLITE.get().getDefaultState(), Config.PYROLITE_ORE_VEINSIZE.get());
                    };
                    if (rhodiumOreChances > 0) {
                        genOre(biome, Config.RHODIUM_ORE_CHANCES.get(), Config.RHODIUM_ORE_MINY.get(), 0, Config.RHODIUM_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_RHODIUM.get().getDefaultState(), Config.RHODIUM_ORE_VEINSIZE.get());
                    };
                    if (syraltiteOreChances > 0) {
                        genOre(biome, Config.SYRALTITE_ORE_CHANCES.get(), Config.SYRALTITE_ORE_MINY.get(), 0, Config.SYRALTITE_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_SYRALTITE.get().getDefaultState(), Config.SYRALTITE_ORE_VEINSIZE.get());
                    };
                    if (titaniumOreChances > 0) {
                        genOre(biome, Config.TITANIUM_ORE_CHANCES.get(), Config.TITANIUM_ORE_MINY.get(), 0, Config.TITANIUM_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_TITANIUM.get().getDefaultState(), Config.TITANIUM_ORE_VEINSIZE.get());
                    };
               //End
                 } else if (biome.getCategory() == Biome.Category.THEEND) {
                int adamantOreChances = Config.ADAMANT_ORE_CHANCES.get();
                int drakanineOreChances = Config.DRAKANINE_ORE_CHANCES.get();
                int galliumOreChances = Config.GALLIUM_ORE_CHANCES.get();
                int heliotropeOreChances = Config.HELIOTROPE_ORE_CHANCES.get();
                int kaliniteOreChances = Config.KALINITE_ORE_CHANCES.get();
                int ortalosOreChances = Config.ORTALOS_ORE_CHANCES.get();
                int radiumOreChances = Config.RADIUM_ORE_CHANCES.get();
                int rheniumOreChances = Config.RHENIUM_ORE_CHANCES.get();
                int scrithOreChances = Config.SCRITH_ORE_CHANCES.get();
                int tantalumOreChances = Config.TANTALUM_ORE_CHANCES.get();
                int tungstenOreChances = Config.TUNGSTEN_ORE_CHANCES.get();
                    if (adamantOreChances > 0) {
                        genOre(biome, Config.ADAMANT_ORE_CHANCES.get(), Config.ADAMANT_ORE_MINY.get(), 0, Config.ADAMANT_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_ADAMANT.get().getDefaultState(), Config.ADAMANT_ORE_VEINSIZE.get());
                    };
                    if (drakanineOreChances > 0) {
                        genOre(biome, Config.DRAKANINE_ORE_CHANCES.get(), Config.DRAKANINE_ORE_MINY.get(), 0, Config.DRAKANINE_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_DRAKANINE.get().getDefaultState(), Config.DRAKANINE_ORE_VEINSIZE.get());
                    };
                    if (galliumOreChances > 0) {
                        genOre(biome, Config.GALLIUM_ORE_CHANCES.get(), Config.GALLIUM_ORE_MINY.get(), 0, Config.GALLIUM_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_GALLIUM.get().getDefaultState(), Config.GALLIUM_ORE_VEINSIZE.get());
                    };
                    if (heliotropeOreChances > 0) {
                        genOre(biome, Config.HELIOTROPE_ORE_CHANCES.get(), Config.HELIOTROPE_ORE_MINY.get(), 0, Config.HELIOTROPE_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_HELIOTROPE.get().getDefaultState(), Config.HELIOTROPE_ORE_VEINSIZE.get());
                    };
                    if (kaliniteOreChances > 0) {
                        genOre(biome, Config.KALINITE_ORE_CHANCES.get(), Config.KALINITE_ORE_MINY.get(), 0, Config.KALINITE_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_KALINITE.get().getDefaultState(), Config.KALINITE_ORE_VEINSIZE.get());
                    };
                    if (ortalosOreChances > 0) {
                        genOre(biome, Config.ORTALOS_ORE_CHANCES.get(), Config.ORTALOS_ORE_MINY.get(), 0, Config.ORTALOS_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_ORTALOS.get().getDefaultState(), Config.ORTALOS_ORE_VEINSIZE.get());
                    };
                    if (radiumOreChances > 0) {
                        genOre(biome, Config.RADIUM_ORE_CHANCES.get(), Config.RADIUM_ORE_MINY.get(), 0, Config.RADIUM_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_RADIUM.get().getDefaultState(), Config.RADIUM_ORE_VEINSIZE.get());
                    };
                    if (rheniumOreChances > 0) {
                        genOre(biome, Config.RHENIUM_ORE_CHANCES.get(), Config.RHENIUM_ORE_MINY.get(), 0, Config.RHENIUM_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_RHENIUM.get().getDefaultState(), Config.RHENIUM_ORE_VEINSIZE.get());
                    };
                    if (scrithOreChances > 0) {
                        genOre(biome, Config.SCRITH_ORE_CHANCES.get(), Config.SCRITH_ORE_MINY.get(), 0, Config.SCRITH_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_SCRITH.get().getDefaultState(), Config.SCRITH_ORE_VEINSIZE.get());
                    };
                    if (tantalumOreChances > 0) {
                        genOre(biome, Config.TANTALUM_ORE_CHANCES.get(), Config.TANTALUM_ORE_MINY.get(), 0, Config.TANTALUM_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_TANTALUM.get().getDefaultState(), Config.TANTALUM_ORE_VEINSIZE.get());
                    };
                    if (tungstenOreChances > 0) {
                        genOre(biome, Config.TUNGSTEN_ORE_CHANCES.get(), Config.TUNGSTEN_ORE_MINY.get(), 0, Config.TUNGSTEN_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_TUNGSTEN.get().getDefaultState(), Config.TUNGSTEN_ORE_VEINSIZE.get());
                    };
                    //OverWorld
                    } else {
                int aluminiumOreChances = Config.ALUMINIUM_ORE_CHANCES.get();
                int antariumOreChances = Config.ANTARIUM_ORE_CHANCES.get();
                int azuriteOreChances = Config.AZURITE_ORE_CHANCES.get();
                int celestineOreChances = Config.CELESTINE_ORE_CHANCES.get();
                int copperOreChances = Config.COPPER_ORE_CHANCES.get();
                int kaiStoneOreChances = Config.KAI_STONE_ORE_CHANCES.get();
                int lithiumOreChances = Config.LITHIUM_ORE_CHANCES.get();
                int loriteOreChances = Config.LORITE_ORE_CHANCES.get();
                int lunariteOreChances = Config.LUNARITE_ORE_CHANCES.get();
                int manganeseOreChances = Config.MANGANESE_ORE_CHANCES.get();
                int mythrilOreChances = Config.MYTHRIL_ORE_CHANCES.get();
                int realgarOreChances = Config.REALGAR_ORE_CHANCES.get();
                int silverOreChances = Config.SILVER_ORE_CHANCES.get();
                int tinOreChances = Config.TIN_ORE_CHANCES.get();
                int yaliteOreChances = Config.YALITE_ORE_CHANCES.get();
                int zincOreChances = Config.ZINC_ORE_CHANCES.get();
                    if (aluminiumOreChances > 0) {
                    genOre(biome, Config.ALUMINIUM_ORE_CHANCES.get(), Config.ALUMINIUM_ORE_MINY.get(), 0, Config.ALUMINIUM_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_ALUMINIUM.get().getDefaultState(), Config.ALUMINIUM_ORE_VEINSIZE.get());
                    };
                    if (antariumOreChances > 0) {
                    genOre(biome, Config.ANTARIUM_ORE_CHANCES.get(), Config.ANTARIUM_ORE_MINY.get(), 0, Config.ANTARIUM_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_ANTARIUM.get().getDefaultState(), Config.ANTARIUM_ORE_VEINSIZE.get());
                    };
                    if (azuriteOreChances > 0) {
                    genOre(biome, Config.AZURITE_ORE_CHANCES.get(), Config.AZURITE_ORE_MINY.get(), 0, Config.AZURITE_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_AZURITE.get().getDefaultState(), Config.AZURITE_ORE_VEINSIZE.get());
                    };
                    if (celestineOreChances > 0) {
                    genOre(biome, Config.CELESTINE_ORE_CHANCES.get(), Config.CELESTINE_ORE_MINY.get(), 0, Config.CELESTINE_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_CELESTINE.get().getDefaultState(), Config.CELESTINE_ORE_VEINSIZE.get());
                    };
                    if (copperOreChances > 0) {
                    genOre(biome, Config.COPPER_ORE_CHANCES.get(), Config.COPPER_ORE_MINY.get(), 0, Config.COPPER_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_COPPER.get().getDefaultState(), Config.COPPER_ORE_VEINSIZE.get());
                    };
                    if (kaiStoneOreChances > 0) {
                        genOre(biome, Config.KAI_STONE_ORE_CHANCES.get(), Config.KAI_STONE_ORE_MINY.get(), 0, Config.KAI_STONE_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_KAI_STONE.get().getDefaultState(), Config.KAI_STONE_ORE_VEINSIZE.get());
                    };
                    if (lithiumOreChances > 0) {
                        genOre(biome, Config.LITHIUM_ORE_CHANCES.get(), Config.LITHIUM_ORE_MINY.get(), 0, Config.LITHIUM_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_LITHIUM.get().getDefaultState(), Config.LITHIUM_ORE_VEINSIZE.get());
                    };
                    if (loriteOreChances > 0) {
                        genOre(biome, Config.LORITE_ORE_CHANCES.get(), Config.LORITE_ORE_MINY.get(), 0, Config.LORITE_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_LORITE.get().getDefaultState(), Config.LORITE_ORE_VEINSIZE.get());
                    };
                    if (lunariteOreChances > 0) {
                        genOre(biome, Config.LUNARITE_ORE_CHANCES.get(), Config.LUNARITE_ORE_MINY.get(), 0, Config.LUNARITE_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_LUNARITE.get().getDefaultState(), Config.LUNARITE_ORE_VEINSIZE.get());
                    };
                    if (manganeseOreChances > 0) {
                        genOre(biome, Config.MANGANESE_ORE_CHANCES.get(), Config.MANGANESE_ORE_MINY.get(), 0, Config.MANGANESE_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_MANGANESE.get().getDefaultState(), Config.MANGANESE_ORE_VEINSIZE.get());
                    };
                    if (mythrilOreChances > 0) {
                        genOre(biome, Config.MYTHRIL_ORE_CHANCES.get(), Config.MYTHRIL_ORE_MINY.get(), 0, Config.MYTHRIL_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_MYTHRIL.get().getDefaultState(), Config.MYTHRIL_ORE_VEINSIZE.get());
                    };
                    if (realgarOreChances > 0) {
                        genOre(biome, Config.REALGAR_ORE_CHANCES.get(), Config.REALGAR_ORE_MINY.get(), 0, Config.REALGAR_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_REALGAR.get().getDefaultState(), Config.REALGAR_ORE_VEINSIZE.get());
                    };
                    if (silverOreChances > 0) {
                        genOre(biome, Config.SILVER_ORE_CHANCES.get(), Config.SILVER_ORE_MINY.get(), 0, Config.SILVER_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_SILVER.get().getDefaultState(), Config.SILVER_ORE_VEINSIZE.get());
                    };
                    if (tinOreChances > 0) {
                        genOre(biome, Config.TIN_ORE_CHANCES.get(), Config.TIN_ORE_MINY.get(), 0, Config.TIN_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_TIN.get().getDefaultState(), Config.TIN_ORE_VEINSIZE.get());
                    };
                    if (yaliteOreChances > 0) {
                        genOre(biome, Config.YALITE_ORE_CHANCES.get(), Config.YALITE_ORE_MINY.get(), 0, Config.YALITE_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_YALITE.get().getDefaultState(), Config.YALITE_ORE_VEINSIZE.get());
                    };
                    if (zincOreChances > 0) {
                        genOre(biome, Config.ZINC_ORE_CHANCES.get(), Config.ZINC_ORE_MINY.get(), 0, Config.ZINC_ORE_MAXY.get(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_ZINC.get().getDefaultState(), Config.ZINC_ORE_VEINSIZE.get());
                    };
            }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size) {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
    }

