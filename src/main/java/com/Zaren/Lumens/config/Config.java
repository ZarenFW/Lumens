package com.Zaren.Lumens.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;

import java.nio.file.Path;


public class Config {

    private static final Builder COMMON_BUILDER = new Builder();

    public static final ForgeConfigSpec COMMON_CONFIG;

   //Categories

    public static String CATEGORY_WORLDGEN = "worldgen";
    public static String SUB_CATEGORY_OVERWORLD = "overworld";
    public static String ALUMINIUM_ORE = "aluminium_ore";

    //Ores Config
        //ADAMANT
    public static ForgeConfigSpec.IntValue ADAMANT_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue ADAMANT_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue ADAMANT_ORE_MINY;
    public static ForgeConfigSpec.IntValue ADAMANT_ORE_MAXY;  
        //ALUMINIUM
    public static ForgeConfigSpec.IntValue ALUMINIUM_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue ALUMINIUM_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue ALUMINIUM_ORE_MINY;
    public static ForgeConfigSpec.IntValue ALUMINIUM_ORE_MAXY;
        //ANTARIUM
    public static ForgeConfigSpec.IntValue ANTARIUM_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue ANTARIUM_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue ANTARIUM_ORE_MINY;
    public static ForgeConfigSpec.IntValue ANTARIUM_ORE_MAXY;
        //ARNALIOS
    public static ForgeConfigSpec.IntValue ARNALIOS_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue ARNALIOS_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue ARNALIOS_ORE_MINY;
    public static ForgeConfigSpec.IntValue ARNALIOS_ORE_MAXY;
        //AZURITE
    public static ForgeConfigSpec.IntValue AZURITE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue AZURITE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue AZURITE_ORE_MINY;
    public static ForgeConfigSpec.IntValue AZURITE_ORE_MAXY;
        //CARNELIAN
    public static ForgeConfigSpec.IntValue CARNELIAN_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue CARNELIAN_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue CARNELIAN_ORE_MINY;
    public static ForgeConfigSpec.IntValue CARNELIAN_ORE_MAXY;
        //CELESTINE
    public static ForgeConfigSpec.IntValue CELESTINE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue CELESTINE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue CELESTINE_ORE_MINY;
    public static ForgeConfigSpec.IntValue CELESTINE_ORE_MAXY;
        //CHROME
    public static ForgeConfigSpec.IntValue CHROME_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue CHROME_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue CHROME_ORE_MINY;
    public static ForgeConfigSpec.IntValue CHROME_ORE_MAXY;
        //COPPER
    public static ForgeConfigSpec.IntValue COPPER_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue COPPER_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue COPPER_ORE_MINY;
    public static ForgeConfigSpec.IntValue COPPER_ORE_MAXY;
        //DRAKANINE
    public static ForgeConfigSpec.IntValue DRAKANINE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue DRAKANINE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue DRAKANINE_ORE_MINY;
    public static ForgeConfigSpec.IntValue DRAKANINE_ORE_MAXY;
        //GALLIUM
    public static ForgeConfigSpec.IntValue GALLIUM_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue GALLIUM_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue GALLIUM_ORE_MINY;
    public static ForgeConfigSpec.IntValue GALLIUM_ORE_MAXY;
        //GERMANIUM
    public static ForgeConfigSpec.IntValue GERMANIUM_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue GERMANIUM_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue GERMANIUM_ORE_MINY;
    public static ForgeConfigSpec.IntValue GERMANIUM_ORE_MAXY;
        //HELIOTROPE
    public static ForgeConfigSpec.IntValue HELIOTROPE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue HELIOTROPE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue HELIOTROPE_ORE_MINY;
    public static ForgeConfigSpec.IntValue HELIOTROPE_ORE_MAXY;
        //INDIUM
    public static ForgeConfigSpec.IntValue INDIUM_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue INDIUM_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue INDIUM_ORE_MINY;
    public static ForgeConfigSpec.IntValue INDIUM_ORE_MAXY;
        //KAI STONE
    public static ForgeConfigSpec.IntValue KAI_STONE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue KAI_STONE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue KAI_STONE_ORE_MINY;
    public static ForgeConfigSpec.IntValue KAI_STONE_ORE_MAXY;
        //KALINITE
    public static ForgeConfigSpec.IntValue KALINITE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue KALINITE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue KALINITE_ORE_MINY;
    public static ForgeConfigSpec.IntValue KALINITE_ORE_MAXY;
        //KARROSH
    public static ForgeConfigSpec.IntValue KARROSH_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue KARROSH_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue KARROSH_ORE_MINY;
    public static ForgeConfigSpec.IntValue KARROSH_ORE_MAXY;
        //LITHIUM
    public static ForgeConfigSpec.IntValue LITHIUM_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue LITHIUM_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue LITHIUM_ORE_MINY;
    public static ForgeConfigSpec.IntValue LITHIUM_ORE_MAXY;
        //LORITE
    public static ForgeConfigSpec.IntValue LORITE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue LORITE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue LORITE_ORE_MINY;
    public static ForgeConfigSpec.IntValue LORITE_ORE_MAXY;
        //LUNARITE
    public static ForgeConfigSpec.IntValue LUNARITE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue LUNARITE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue LUNARITE_ORE_MINY;
    public static ForgeConfigSpec.IntValue LUNARITE_ORE_MAXY;
        //MAGNESIUM
    public static ForgeConfigSpec.IntValue MAGNESIUM_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue MAGNESIUM_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue MAGNESIUM_ORE_MINY;
    public static ForgeConfigSpec.IntValue MAGNESIUM_ORE_MAXY;
        //MANGANESE
    public static ForgeConfigSpec.IntValue MANGANESE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue MANGANESE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue MANGANESE_ORE_MINY;
    public static ForgeConfigSpec.IntValue MANGANESE_ORE_MAXY;
        //MYTHRIL
    public static ForgeConfigSpec.IntValue MYTHRIL_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue MYTHRIL_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue MYTHRIL_ORE_MINY;
    public static ForgeConfigSpec.IntValue MYTHRIL_ORE_MAXY;
        //NANITE
    public static ForgeConfigSpec.IntValue NANITE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue NANITE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue NANITE_ORE_MINY;
    public static ForgeConfigSpec.IntValue NANITE_ORE_MAXY;
        //NEPHRITE
    public static ForgeConfigSpec.IntValue NEPHRITE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue NEPHRITE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue NEPHRITE_ORE_MINY;
    public static ForgeConfigSpec.IntValue NEPHRITE_ORE_MAXY;
        //ORTALOS
    public static ForgeConfigSpec.IntValue ORTALOS_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue ORTALOS_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue ORTALOS_ORE_MINY;
    public static ForgeConfigSpec.IntValue ORTALOS_ORE_MAXY;
        //PYROLITE
    public static ForgeConfigSpec.IntValue PYROLITE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue PYROLITE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue PYROLITE_ORE_MINY;
    public static ForgeConfigSpec.IntValue PYROLITE_ORE_MAXY;
        //RADIUM
    public static ForgeConfigSpec.IntValue RADIUM_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue RADIUM_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue RADIUM_ORE_MINY;
    public static ForgeConfigSpec.IntValue RADIUM_ORE_MAXY;
        //REALGAR
    public static ForgeConfigSpec.IntValue REALGAR_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue REALGAR_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue REALGAR_ORE_MINY;
    public static ForgeConfigSpec.IntValue REALGAR_ORE_MAXY;
        //RHENIUM
    public static ForgeConfigSpec.IntValue RHENIUM_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue RHENIUM_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue RHENIUM_ORE_MINY;
    public static ForgeConfigSpec.IntValue RHENIUM_ORE_MAXY;
        //RHODIUM
    public static ForgeConfigSpec.IntValue RHODIUM_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue RHODIUM_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue RHODIUM_ORE_MINY;
    public static ForgeConfigSpec.IntValue RHODIUM_ORE_MAXY;
        //SCRITH
    public static ForgeConfigSpec.IntValue SCRITH_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue SCRITH_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue SCRITH_ORE_MINY;
    public static ForgeConfigSpec.IntValue SCRITH_ORE_MAXY;
        //SILVER
    public static ForgeConfigSpec.IntValue SILVER_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue SILVER_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue SILVER_ORE_MINY;
    public static ForgeConfigSpec.IntValue SILVER_ORE_MAXY;
        //SYRALTITE
    public static ForgeConfigSpec.IntValue SYRALTITE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue SYRALTITE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue SYRALTITE_ORE_MINY;
    public static ForgeConfigSpec.IntValue SYRALTITE_ORE_MAXY;
        //TANTALUM
    public static ForgeConfigSpec.IntValue TANTALUM_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue TANTALUM_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue TANTALUM_ORE_MINY;
    public static ForgeConfigSpec.IntValue TANTALUM_ORE_MAXY;
        //TANZANITE
    public static ForgeConfigSpec.IntValue TANZANITE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue TANZANITE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue TANZANITE_ORE_MINY;
    public static ForgeConfigSpec.IntValue TANZANITE_ORE_MAXY;
        //TIN
    public static ForgeConfigSpec.IntValue TIN_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue TIN_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue TIN_ORE_MINY;
    public static ForgeConfigSpec.IntValue TIN_ORE_MAXY;
        //TITANIUM
    public static ForgeConfigSpec.IntValue TITANIUM_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue TITANIUM_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue TITANIUM_ORE_MINY;
    public static ForgeConfigSpec.IntValue TITANIUM_ORE_MAXY;
        //TUNGSTEN
    public static ForgeConfigSpec.IntValue TUNGSTEN_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue TUNGSTEN_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue TUNGSTEN_ORE_MINY;
    public static ForgeConfigSpec.IntValue TUNGSTEN_ORE_MAXY;
        //YALITE
    public static ForgeConfigSpec.IntValue YALITE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue YALITE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue YALITE_ORE_MINY;
    public static ForgeConfigSpec.IntValue YALITE_ORE_MAXY;
        //ZINC
    public static ForgeConfigSpec.IntValue ZINC_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue ZINC_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue ZINC_ORE_MINY;
    public static ForgeConfigSpec.IntValue ZINC_ORE_MAXY;
    
    public static void loadConfig(ForgeConfigSpec spec, Path path) {

        final CommentedFileConfig configData = CommentedFileConfig.builder(path)
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();
        configData.load();
        spec.setConfig(configData);
    }

    static {
        setupWorldgenConfig();
        COMMON_CONFIG = COMMON_BUILDER.build();

    }

    private static void setupWorldgenConfig() {
        COMMON_BUILDER.comment("Ore generation").push(CATEGORY_WORLDGEN);
        COMMON_BUILDER.comment("Overworld").push(SUB_CATEGORY_OVERWORLD);

        //Ad Ore
        //Al Ore
            COMMON_BUILDER.comment("Aluminium Ore").push(ALUMINIUM_ORE);
                    ALUMINIUM_ORE_CHANCES = COMMON_BUILDER
                            .comment("Number of times to try and generate the ore - set to 0 to disable")
                            .defineInRange("oreChances", 5, 0, 256);
                    ALUMINIUM_ORE_VEINSIZE = COMMON_BUILDER
                            .comment("Maximum size of a single vein")
                            .defineInRange("veinSize", 6, 1, 256);
                    ALUMINIUM_ORE_MINY = COMMON_BUILDER
                            .comment("Minimum Y value at which the ore can spawn")
                            .defineInRange("minY", 16, 0, 256);
                    ALUMINIUM_ORE_MAXY = COMMON_BUILDER
                            .comment("Maximum Y value at which the ore can spawn")
                            .defineInRange("maxY", 50, 0, 256);
            COMMON_BUILDER.pop();
            //An Ore
            //Az Ore
            //Car Ore
            //Cel Ore
            //Cr Ore
            //Cu Ore
            //Drak Ore
            //Ga Ore
            //Ge Ore
            //Hel Ore
            //In Ore
            //Kai Ore
            //Kal Ore
            //Kar Ore
            //Li Ore
            //Lor Ore
            //Lu Ore
            //Mg Ore
            //Mn Ore
            //My Ore
            //Nan Ore
            //Nep Ore
            //Ort Ore
            //Pyr Ore
            //Ra Ore
            //Rea Ore
            //Re Ore
            //Rh Ore
            //Scr Ore
            //Ag Ore
            //Syr Ore
            //Ta Ore
            //Tan Ore
            //Sn Ore
            //Ti Ore
            //W Ore
            //Yal Ore
            //Zn Ore
    }
}
