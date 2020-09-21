package com.Zaren.Lumens.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.fml.common.Mod;

import java.nio.file.Path;


@Mod.EventBusSubscriber
public class Config {

    private static final Builder COMMON_BUILDER = new Builder();

    public static final ForgeConfigSpec COMMON_CONFIG;

    //Categories

    public static String CATEGORY_POWER = "power";
    public static String SUB_CATEGORY_SOLAR = "solar";
    public static String PRIMITIVE_SOLAR = "primitive solar";
    public static String BASIC_SOLAR = "basic solar";
    public static String ADVANCED_SOLAR = "advanced solar";
    public static String ELITE_SOLAR = "elite solar";
    public static String HELLBORN_SOLAR = "hellborn solar";
    public static String QUANTUM_SOLAR = "quantum solar";
    public static String DRAGONFORGED_SOLAR = "dragonforged solar";
    public static String SUB_CATEGORY_LUNAR = "lunar";
    public static String PRIMITIVE_LUNAR = "primitive lunar";
    public static String BASIC_LUNAR = "basic lunar";
    public static String ADVANCED_LUNAR = "advanced lunar";
    public static String ELITE_LUNAR = "elite lunar";
    public static String HELLBORN_LUNAR = "hellborn lunar";
    public static String QUANTUM_LUNAR = "quantum lunar";
    public static String DRAGONFORGED_LUNAR = "dragonforged lunar";
    public static String CATEGORY_WORLDGEN = "worldgen";
    public static String SUB_CATEGORY_OVERWORLD = "overworld";
    public static String SUB_CATEGORY_NETHER = "nether";
    public static String SUB_CATEGORY_THE_END = "the_end";
    public static String ADAMANT_ORE = "adamant_ore";
    public static String ALUMINIUM_ORE = "aluminium_ore";
    public static String ANTARIUM_ORE = "antarium_ore";
    public static String ARNALIOS_ORE = "arnalios_ore";
    public static String AZURITE_ORE = "azurite_ore";
    public static String CARNELIAN_ORE = "carnelian_ore";
    public static String CELESTINE_ORE = "celestine_ore";
    public static String CHROME_ORE = "chrome_ore";
    public static String COPPER_ORE = "copper_ore";
    public static String DRAKANINE_ORE = "drakanine_ore";
    public static String GALLIUM_ORE = "gallium_ore";
    public static String GERMANIUM_ORE = "germanium_ore";
    public static String HALLINITE_ORE = "hallinite_ore";
    public static String HELIOTROPE_ORE = "heliotrope_ore";
    public static String INDIUM_ORE = "indium_ore";
    public static String JALSHADE_ORE = "jalshade ore";
    public static String KAI_STONE_ORE = "kai_stone_ore";
    public static String KALINITE_ORE = "kalinite_ore";
    public static String KARROSH_ORE = "karrosh_ore";
    public static String LITHIUM_ORE = "lithium_ore";
    public static String LORITE_ORE = "lorite_ore";
    public static String LUNARITE_ORE = "lunarite_ore";
    public static String MAGNESIUM_ORE = "magnesium_ore";
    public static String MANGANESE_ORE = "manganese_ore";
    public static String MYTHRIL_ORE = "mythril_ore";
    public static String NANITE_ORE = "nanite_ore";
    public static String NEPHRITE_ORE = "nephrite_ore";
    public static String ORTALOS_ORE = "ortalos_ore";
    public static String PYROLITE_ORE = "pyrolite_ore";
    public static String RADIUM_ORE = "radium_ore";
    public static String RASHADINE_ORE = "rashadine_ore";
    public static String REALGAR_ORE = "realgar_ore";
    public static String RHENIUM_ORE = "rhenium_ore";
    public static String RHODIUM_ORE = "rhodium_ore";
    public static String SCRITH_ORE = "scrith_ore";
    public static String SILVER_ORE = "silver_ore";
    public static String SYRALTITE_ORE = "syraltite_ore";
    public static String TANTALUM_ORE = "tantalum_ore";
    public static String TANZANITE_ORE = "tanzanite_ore";
    public static String TIN_ORE = "tin_ore";
    public static String TITANIUM_ORE = "titanium_ore";
    public static String TRALLINISH_ORE = "trallinish_ore";
    public static String TUNGSTEN_ORE = "tungsten_ore";
    public static String UVAORITE_ORE = "uvaorite_ore";
    public static String XANDANZINE_ORE = "xandanzine_ore";
    public static String YALITE_ORE = "yalite_ore";
    public static String ZARITE_ORE = "zarite_ore";
    public static String ZINC_ORE = "zinc_ore";


    //Power Config
    //Solar
    public static ForgeConfigSpec.IntValue PRIMITIVE_SOLARBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue PRIMITIVE_SOLARBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue BASIC_SOLARBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue BASIC_SOLARBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue ADVANCED_SOLARBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue ADVANCED_SOLARBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue ELITE_SOLARBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue ELITE_SOLARBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue HELLBORN_SOLARBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue HELLBORN_SOLARBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue QUANTUM_SOLARBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue QUANTUM_SOLARBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue DRAGONFORGED_SOLARBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue DRAGONFORGED_SOLARBLOCK_GENERATE;
    //Lunar
    public static ForgeConfigSpec.IntValue PRIMITIVE_LUNARBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue PRIMITIVE_LUNARBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue BASIC_LUNARBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue BASIC_LUNARBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue ADVANCED_LUNARBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue ADVANCED_LUNARBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue ELITE_LUNARBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue ELITE_LUNARBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue HELLBORN_LUNARBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue HELLBORN_LUNARBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue QUANTUM_LUNARBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue QUANTUM_LUNARBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue DRAGONFORGED_LUNARBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue DRAGONFORGED_LUNARBLOCK_GENERATE;

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
    public static ForgeConfigSpec.IntValue ALUMINIUM_DIM;
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
    //HALLINITE
    public static ForgeConfigSpec.IntValue HALLINITE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue HALLINITE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue HALLINITE_ORE_MINY;
    public static ForgeConfigSpec.IntValue HALLINITE_ORE_MAXY;
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
    //JALSHADE
    public static ForgeConfigSpec.IntValue JALSHADE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue JALSHADE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue JALSHADE_ORE_MINY;
    public static ForgeConfigSpec.IntValue JALSHADE_ORE_MAXY;
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
    //RASHADINE
    public static ForgeConfigSpec.IntValue RASHADINE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue RASHADINE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue RASHADINE_ORE_MINY;
    public static ForgeConfigSpec.IntValue RASHADINE_ORE_MAXY;
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
    //TRALLINISH
    public static ForgeConfigSpec.IntValue TRALLINISH_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue TRALLINISH_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue TRALLINISH_ORE_MINY;
    public static ForgeConfigSpec.IntValue TRALLINISH_ORE_MAXY;
    //TUNGSTEN
    public static ForgeConfigSpec.IntValue TUNGSTEN_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue TUNGSTEN_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue TUNGSTEN_ORE_MINY;
    public static ForgeConfigSpec.IntValue TUNGSTEN_ORE_MAXY;
    //UVAORITE
    public static ForgeConfigSpec.IntValue UVAORITE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue UVAORITE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue UVAORITE_ORE_MINY;
    public static ForgeConfigSpec.IntValue UVAORITE_ORE_MAXY;
    //XANDANZINE
    public static ForgeConfigSpec.IntValue XANDANZINE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue XANDANZINE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue XANDANZINE_ORE_MINY;
    public static ForgeConfigSpec.IntValue XANDANZINE_ORE_MAXY;
    //YALITE
    public static ForgeConfigSpec.IntValue YALITE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue YALITE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue YALITE_ORE_MINY;
    public static ForgeConfigSpec.IntValue YALITE_ORE_MAXY;
    //ZARITE
    public static ForgeConfigSpec.IntValue ZARITE_ORE_CHANCES;
    public static ForgeConfigSpec.IntValue ZARITE_ORE_VEINSIZE;
    public static ForgeConfigSpec.IntValue ZARITE_ORE_MINY;
    public static ForgeConfigSpec.IntValue ZARITE_ORE_MAXY;
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
        COMMON_BUILDER.comment("Power").push(CATEGORY_POWER);
        COMMON_BUILDER.comment("Solars").push(SUB_CATEGORY_SOLAR);

        COMMON_BUILDER.comment("Primitive Solar").push(PRIMITIVE_SOLAR);
        PRIMITIVE_SOLARBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Solar generator")
                .defineInRange("maxPower", 160000, 0, 2147483647);
        PRIMITIVE_SOLARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 4, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Basic Solar").push(BASIC_SOLAR);
        BASIC_SOLARBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Solar generator")
                .defineInRange("maxPower", 128000, 0, 2147483647);
        BASIC_SOLARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 32, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Advanced Solar").push(ADVANCED_SOLAR);
        ADVANCED_SOLARBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Solar generator")
                .defineInRange("maxPower", 1024000, 0, 2147483647);
        ADVANCED_SOLARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 256, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Elite Solar").push(ELITE_SOLAR);
        ELITE_SOLARBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Solar generator")
                .defineInRange("maxPower", 8192000, 0, 2147483647);
        ELITE_SOLARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 2048, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Hellborn Solar").push(HELLBORN_SOLAR);
        HELLBORN_SOLARBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Solar generator")
                .defineInRange("maxPower", 65536000, 0, 2147483647);
        HELLBORN_SOLARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 16384, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Quantum Solar").push(QUANTUM_SOLAR);
        QUANTUM_SOLARBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Solar generator")
                .defineInRange("maxPower", 524288000, 0, 2147483647);
        QUANTUM_SOLARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 131072, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Dragonforged Solar").push(DRAGONFORGED_SOLAR);
        DRAGONFORGED_SOLARBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Solar generator")
                .defineInRange("maxPower", 2147483647, 0, 2147483647);
        DRAGONFORGED_SOLARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 1048576, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Lunars").push(SUB_CATEGORY_LUNAR);

        COMMON_BUILDER.comment("Primitive Lunar").push(PRIMITIVE_LUNAR);
        PRIMITIVE_LUNARBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Lunar generator")
                .defineInRange("maxPower", 160000, 0, 2147483647);
        PRIMITIVE_LUNARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 4, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Basic Lunar").push(BASIC_LUNAR);
        BASIC_LUNARBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Lunar generator")
                .defineInRange("maxPower", 128000, 0, 2147483647);
        BASIC_LUNARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 32, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Advanced Lunar").push(ADVANCED_LUNAR);
        ADVANCED_LUNARBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Lunar generator")
                .defineInRange("maxPower", 1024000, 0, 2147483647);
        ADVANCED_LUNARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 256, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Elite Lunar").push(ELITE_LUNAR);
        ELITE_LUNARBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Lunar generator")
                .defineInRange("maxPower", 8192000, 0, 2147483647);
        ELITE_LUNARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 2048, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Hellborn Lunar").push(HELLBORN_LUNAR);
        HELLBORN_LUNARBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Lunar generator")
                .defineInRange("maxPower", 65536000, 0, 2147483647);
        HELLBORN_LUNARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 16384, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Quantum Lunar").push(QUANTUM_LUNAR);
        QUANTUM_LUNARBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Lunar generator")
                .defineInRange("maxPower", 524288000, 0, 2147483647);
        QUANTUM_LUNARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 131072, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Dragonforged Lunar").push(DRAGONFORGED_LUNAR);
        DRAGONFORGED_LUNARBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Lunar generator")
                .defineInRange("maxPower", 2147483647, 0, 2147483647);
        DRAGONFORGED_LUNARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 1048576, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.pop();
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Ore generation").push(CATEGORY_WORLDGEN);
        COMMON_BUILDER.comment("Overworld").push(SUB_CATEGORY_OVERWORLD);

            //Al Ore
            COMMON_BUILDER.comment("Aluminium Ore").push(ALUMINIUM_ORE);
                    ALUMINIUM_DIM = COMMON_BUILDER
                            .comment("Which dimension aluminium spawns in - 0 for overworld, 1 for nether, 2 for end")
                            .defineInRange("dimension", 0, 0, 2);
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
            COMMON_BUILDER.comment("Antarium Ore").push(ANTARIUM_ORE);
                    ANTARIUM_ORE_CHANCES = COMMON_BUILDER
                            .comment("Number of times to try and generate the ore - set to 0 to disable")
                            .defineInRange("oreChances", 5, 0, 256);
                    ANTARIUM_ORE_VEINSIZE = COMMON_BUILDER
                            .comment("Maximum size of a single vein")
                            .defineInRange("veinSize", 6, 1, 256);
                    ANTARIUM_ORE_MINY = COMMON_BUILDER
                            .comment("Minimum Y value at which the ore can spawn")
                            .defineInRange("minY", 16, 0, 256);
                    ANTARIUM_ORE_MAXY = COMMON_BUILDER
                            .comment("Maximum Y value at which the ore can spawn")
                            .defineInRange("maxY", 50, 0, 256);
                    COMMON_BUILDER.pop();
                        //Az Ore
                    COMMON_BUILDER.comment("Azurite Ore").push(AZURITE_ORE);
                    AZURITE_ORE_CHANCES = COMMON_BUILDER
                            .comment("Number of times to try and generate the ore - set to 0 to disable")
                            .defineInRange("oreChances", 8, 0, 256);
                    AZURITE_ORE_VEINSIZE = COMMON_BUILDER
                            .comment("Maximum size of a single vein")
                            .defineInRange("veinSize", 5, 1, 256);
                    AZURITE_ORE_MINY = COMMON_BUILDER
                            .comment("Minimum Y value at which the ore can spawn")
                            .defineInRange("minY", 42, 0, 256);
                    AZURITE_ORE_MAXY = COMMON_BUILDER
                            .comment("Maximum Y value at which the ore can spawn")
                            .defineInRange("maxY", 75, 0, 256);
                    COMMON_BUILDER.pop();
            //Cel Ore
                    COMMON_BUILDER.comment("Celestine Ore").push(CELESTINE_ORE);
                    CELESTINE_ORE_CHANCES = COMMON_BUILDER
                            .comment("Number of times to try and generate the ore - set to 0 to disable")
                            .defineInRange("oreChances", 8, 0, 256);
                    CELESTINE_ORE_VEINSIZE = COMMON_BUILDER
                            .comment("Maximum size of a single vein")
                            .defineInRange("veinSize", 5, 1, 256);
                    CELESTINE_ORE_MINY = COMMON_BUILDER
                            .comment("Minimum Y value at which the ore can spawn")
                            .defineInRange("minY", 42, 0, 256);
                    CELESTINE_ORE_MAXY = COMMON_BUILDER
                            .comment("Maximum Y value at which the ore can spawn")
                            .defineInRange("maxY", 75, 0, 256);
                    COMMON_BUILDER.pop();
            //Cu Ore
                    COMMON_BUILDER.comment("Copper Ore").push(COPPER_ORE);
                    COPPER_ORE_CHANCES = COMMON_BUILDER
                            .comment("Number of times to try and generate the ore - set to 0 to disable")
                            .defineInRange("oreChances", 10, 0, 256);
                    COPPER_ORE_VEINSIZE = COMMON_BUILDER
                            .comment("Maximum size of a single vein")
                            .defineInRange("veinSize", 7, 1, 256);
                    COPPER_ORE_MINY = COMMON_BUILDER
                            .comment("Minimum Y value at which the ore can spawn")
                            .defineInRange("minY", 15, 0, 256);
                    COPPER_ORE_MAXY = COMMON_BUILDER
                            .comment("Maximum Y value at which the ore can spawn")
                            .defineInRange("maxY", 85, 0, 256);
                    COMMON_BUILDER.pop();
            //Jal Ore
                    COMMON_BUILDER.comment("Jalshade Ore").push(JALSHADE_ORE);
                    JALSHADE_ORE_CHANCES = COMMON_BUILDER
                            .comment("Number of times to try and generate the ore - set to 0 to disable")
                            .defineInRange("oreChances", 2, 0, 256);
                    JALSHADE_ORE_VEINSIZE = COMMON_BUILDER
                            .comment("Maximum size of a single vein")
                            .defineInRange("veinSize", 12, 1, 256);
                    JALSHADE_ORE_MINY = COMMON_BUILDER
                            .comment("Minimum Y value at which the ore can spawn")
                            .defineInRange("minY", 4, 0, 256);
                    JALSHADE_ORE_MAXY = COMMON_BUILDER
                            .comment("Maximum Y value at which the ore can spawn")
                            .defineInRange("maxY", 20, 0, 256);
                    COMMON_BUILDER.pop();
            //Kai Ore
                COMMON_BUILDER.comment("Kai Stone Ore").push(KAI_STONE_ORE);
                KAI_STONE_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 6, 0, 256);
                KAI_STONE_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 4, 1, 256);
                KAI_STONE_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 25, 0, 256);
                KAI_STONE_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 60, 0, 256);
                COMMON_BUILDER.pop();
            //Li Ore
                COMMON_BUILDER.comment("Lithium Ore").push(LITHIUM_ORE);
                LITHIUM_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 4, 0, 256);
                LITHIUM_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 3, 1, 256);
                LITHIUM_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 15, 0, 256);
                LITHIUM_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 40, 0, 256);
                COMMON_BUILDER.pop();
            //Lor Ore
                COMMON_BUILDER.comment("Lorite Ore").push(LORITE_ORE);
                LORITE_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 5, 0, 256);
                LORITE_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 5, 1, 256);
                LORITE_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 16, 0, 256);
                LORITE_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 60, 0, 256);
                COMMON_BUILDER.pop();
            //Lu Ore
                COMMON_BUILDER.comment("Lunarite Ore").push(LUNARITE_ORE);
                LUNARITE_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 3, 0, 256);
                LUNARITE_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 4, 1, 256);
                LUNARITE_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 5, 0, 256);
                LUNARITE_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 25, 0, 256);
                COMMON_BUILDER.pop();
            //Mn Ore
                COMMON_BUILDER.comment("Manganese Ore").push(MANGANESE_ORE);
                MANGANESE_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 4, 0, 256);
                MANGANESE_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 3, 1, 256);
                MANGANESE_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 15, 0, 256);
                MANGANESE_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 40, 0, 256);
                COMMON_BUILDER.pop();
            //My Ore
                COMMON_BUILDER.comment("Mythril Ore").push(MYTHRIL_ORE);
                MYTHRIL_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 6, 0, 256);
                MYTHRIL_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 4, 1, 256);
                MYTHRIL_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 25, 0, 256);
                MYTHRIL_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 60, 0, 256);
                COMMON_BUILDER.pop();
            //Ras Ore
                COMMON_BUILDER.comment("Rashadine Ore").push(RASHADINE_ORE);
                RASHADINE_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 2, 0, 256);
                RASHADINE_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 12, 1, 256);
                RASHADINE_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 4, 0, 256);
                RASHADINE_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 20, 0, 256);
                COMMON_BUILDER.pop();
            //Rea Ore
                COMMON_BUILDER.comment("Realgar Ore").push(REALGAR_ORE);
                REALGAR_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 4, 0, 256);
                REALGAR_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 4, 1, 256);
                REALGAR_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 3, 0, 256);
                REALGAR_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 25, 0, 256);
                COMMON_BUILDER.pop();
            //Ag Ore
                COMMON_BUILDER.comment("Silver Ore").push(SILVER_ORE);
                SILVER_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 7, 0, 256);
                SILVER_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 6, 1, 256);
                SILVER_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                SILVER_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 55, 0, 256);
                COMMON_BUILDER.pop();
            //Sn Ore
                COMMON_BUILDER.comment("Tin Ore").push(TIN_ORE);
                TIN_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 10, 0, 256);
                TIN_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 7, 1, 256);
                TIN_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 15, 0, 256);
                TIN_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 85, 0, 256);
                COMMON_BUILDER.pop();
            //Uva Ore
                COMMON_BUILDER.comment("Uvaorite Ore").push(UVAORITE_ORE);
                UVAORITE_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 2, 0, 256);
                UVAORITE_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 12, 1, 256);
                UVAORITE_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 4, 0, 256);
                UVAORITE_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 20, 0, 256);
                COMMON_BUILDER.pop();
            //Yal Ore
                COMMON_BUILDER.comment("Yalite Ore").push(YALITE_ORE);
                YALITE_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 4, 0, 256);
                YALITE_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 3, 1, 256);
                YALITE_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 40, 0, 256);
                YALITE_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 125, 0, 256);
                COMMON_BUILDER.pop();
            //Zn Ore
                COMMON_BUILDER.comment("Zinc Ore").push(ZINC_ORE);
                ZINC_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 6, 0, 256);
                ZINC_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 4, 1, 256);
                ZINC_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 15, 0, 256);
                ZINC_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 55, 0, 256);
                COMMON_BUILDER.pop();
                COMMON_BUILDER.pop();
            COMMON_BUILDER.comment("Nether").push(SUB_CATEGORY_NETHER);

                //Arn Ore
                COMMON_BUILDER.comment("Arnalios Ore").push(ARNALIOS_ORE);
                ARNALIOS_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 10, 0, 256);
                ARNALIOS_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 6, 1, 256);
                ARNALIOS_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                ARNALIOS_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 150, 0, 256);
                COMMON_BUILDER.pop();
                //Car Ore
                COMMON_BUILDER.comment("Carnelian Ore").push(CARNELIAN_ORE);
                CARNELIAN_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 10, 0, 256);
                CARNELIAN_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 6, 1, 256);
                CARNELIAN_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                CARNELIAN_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 150, 0, 256);
                COMMON_BUILDER.pop();
                //Cr Ore
                COMMON_BUILDER.comment("Chrome Ore").push(CHROME_ORE);
                CHROME_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 10, 0, 256);
                CHROME_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 6, 1, 256);
                CHROME_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                CHROME_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 150, 0, 256);
                COMMON_BUILDER.pop();
                //Ge Ore
                COMMON_BUILDER.comment("Germanium Ore").push(GERMANIUM_ORE);
                GERMANIUM_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 10, 0, 256);
                GERMANIUM_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 6, 1, 256);
                GERMANIUM_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                GERMANIUM_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 150, 0, 256);
                COMMON_BUILDER.pop();
                //Hal Ore
                COMMON_BUILDER.comment("Hallinite Ore").push(HALLINITE_ORE);
                HALLINITE_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 2, 0, 256);
                HALLINITE_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 18, 1, 256);
                HALLINITE_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                HALLINITE_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 150, 0, 256);
                COMMON_BUILDER.pop();
                //In Ore
                COMMON_BUILDER.comment("Indium Ore").push(INDIUM_ORE);
                INDIUM_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 10, 0, 256);
                INDIUM_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 6, 1, 256);
                INDIUM_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                INDIUM_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 150, 0, 256);
                COMMON_BUILDER.pop();
                //Kar Ore
                COMMON_BUILDER.comment("Karrosh Ore").push(KARROSH_ORE);
                KARROSH_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 10, 0, 256);
                KARROSH_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 6, 1, 256);
                KARROSH_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                KARROSH_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 150, 0, 256);
                COMMON_BUILDER.pop();
                //Mg Ore
                COMMON_BUILDER.comment("Magnesium Ore").push(MAGNESIUM_ORE);
                MAGNESIUM_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 10, 0, 256);
                MAGNESIUM_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 6, 1, 256);
                MAGNESIUM_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                MAGNESIUM_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 150, 0, 256);
                COMMON_BUILDER.pop();
                //Nan Ore
                COMMON_BUILDER.comment("Nanite Ore").push(NANITE_ORE);
                NANITE_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 10, 0, 256);
                NANITE_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 6, 1, 256);
                NANITE_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                NANITE_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 150, 0, 256);
                COMMON_BUILDER.pop();
                //Nep Ore
                COMMON_BUILDER.comment("Nephrite Ore").push(NEPHRITE_ORE);
                NEPHRITE_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 10, 0, 256);
                NEPHRITE_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 6, 1, 256);
                NEPHRITE_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                NEPHRITE_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 150, 0, 256);
                COMMON_BUILDER.pop();
                //Pyr Ore
                COMMON_BUILDER.comment("Pyrolite Ore").push(PYROLITE_ORE);
                PYROLITE_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 10, 0, 256);
                PYROLITE_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 6, 1, 256);
                PYROLITE_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                PYROLITE_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 150, 0, 256);
                COMMON_BUILDER.pop();
                //Rh Ore
                COMMON_BUILDER.comment("Rhodium Ore").push(RHODIUM_ORE);
                RHODIUM_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 10, 0, 256);
                RHODIUM_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 6, 1, 256);
                RHODIUM_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                RHODIUM_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 150, 0, 256);
                COMMON_BUILDER.pop();
                //Syr Ore
                COMMON_BUILDER.comment("Syraltite Ore").push(SYRALTITE_ORE);
                SYRALTITE_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 10, 0, 256);
                SYRALTITE_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 6, 1, 256);
                SYRALTITE_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                SYRALTITE_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 150, 0, 256);
                COMMON_BUILDER.pop();
                //Ti Ore
                COMMON_BUILDER.comment("Arnalios Ore").push(TITANIUM_ORE);
                TITANIUM_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 10, 0, 256);
                TITANIUM_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 6, 1, 256);
                TITANIUM_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                TITANIUM_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 150, 0, 256);
                COMMON_BUILDER.pop();
                //Tra Ore
                COMMON_BUILDER.comment("Trallinish Ore").push(TRALLINISH_ORE);
                TRALLINISH_ORE_CHANCES = COMMON_BUILDER
                        .comment("Number of times to try and generate the ore - set to 0 to disable")
                        .defineInRange("oreChances", 2, 0, 256);
                TRALLINISH_ORE_VEINSIZE = COMMON_BUILDER
                        .comment("Maximum size of a single vein")
                        .defineInRange("veinSize", 18, 1, 256);
                TRALLINISH_ORE_MINY = COMMON_BUILDER
                        .comment("Minimum Y value at which the ore can spawn")
                        .defineInRange("minY", 10, 0, 256);
                TRALLINISH_ORE_MAXY = COMMON_BUILDER
                        .comment("Maximum Y value at which the ore can spawn")
                        .defineInRange("maxY", 150, 0, 256);
                COMMON_BUILDER.pop();
            COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("The End").push(SUB_CATEGORY_THE_END);
        //Ad Ore
        COMMON_BUILDER.comment("Adamant Ore").push(ADAMANT_ORE);
        ADAMANT_ORE_CHANCES = COMMON_BUILDER
                .comment("Number of times to try and generate the ore - set to 0 to disable")
                .defineInRange("oreChances", 8, 0, 256);
        ADAMANT_ORE_VEINSIZE = COMMON_BUILDER
                .comment("Maximum size of a single vein")
                .defineInRange("veinSize", 5, 1, 256);
        ADAMANT_ORE_MINY = COMMON_BUILDER
                .comment("Minimum Y value at which the ore can spawn")
                .defineInRange("minY", 10, 0, 256);
        ADAMANT_ORE_MAXY = COMMON_BUILDER
                .comment("Maximum Y value at which the ore can spawn")
                .defineInRange("maxY", 150, 0, 256);
        COMMON_BUILDER.pop();
        //Drak Ore
        COMMON_BUILDER.comment("Drakanine Ore").push(DRAKANINE_ORE);
        DRAKANINE_ORE_CHANCES = COMMON_BUILDER
                .comment("Number of times to try and generate the ore - set to 0 to disable")
                .defineInRange("oreChances", 8, 0, 256);
        DRAKANINE_ORE_VEINSIZE = COMMON_BUILDER
                .comment("Maximum size of a single vein")
                .defineInRange("veinSize", 5, 1, 256);
        DRAKANINE_ORE_MINY = COMMON_BUILDER
                .comment("Minimum Y value at which the ore can spawn")
                .defineInRange("minY", 10, 0, 256);
        DRAKANINE_ORE_MAXY = COMMON_BUILDER
                .comment("Maximum Y value at which the ore can spawn")
                .defineInRange("maxY", 150, 0, 256);
        COMMON_BUILDER.pop();
        //Ga Ore
        COMMON_BUILDER.comment("Gallium Ore").push(GALLIUM_ORE);
        GALLIUM_ORE_CHANCES = COMMON_BUILDER
                .comment("Number of times to try and generate the ore - set to 0 to disable")
                .defineInRange("oreChances", 8, 0, 256);
        GALLIUM_ORE_VEINSIZE = COMMON_BUILDER
                .comment("Maximum size of a single vein")
                .defineInRange("veinSize", 5, 1, 256);
        GALLIUM_ORE_MINY = COMMON_BUILDER
                .comment("Minimum Y value at which the ore can spawn")
                .defineInRange("minY", 10, 0, 256);
        GALLIUM_ORE_MAXY = COMMON_BUILDER
                .comment("Maximum Y value at which the ore can spawn")
                .defineInRange("maxY", 150, 0, 256);
        COMMON_BUILDER.pop();
        //Hel Ore
        COMMON_BUILDER.comment("Heliotrope Ore").push(HELIOTROPE_ORE);
        HELIOTROPE_ORE_CHANCES = COMMON_BUILDER
                .comment("Number of times to try and generate the ore - set to 0 to disable")
                .defineInRange("oreChances", 8, 0, 256);
        HELIOTROPE_ORE_VEINSIZE = COMMON_BUILDER
                .comment("Maximum size of a single vein")
                .defineInRange("veinSize", 5, 1, 256);
        HELIOTROPE_ORE_MINY = COMMON_BUILDER
                .comment("Minimum Y value at which the ore can spawn")
                .defineInRange("minY", 10, 0, 256);
        HELIOTROPE_ORE_MAXY = COMMON_BUILDER
                .comment("Maximum Y value at which the ore can spawn")
                .defineInRange("maxY", 150, 0, 256);
        COMMON_BUILDER.pop();
        //Kal Ore
        COMMON_BUILDER.comment("Kalinite Ore").push(KALINITE_ORE);
        KALINITE_ORE_CHANCES = COMMON_BUILDER
                .comment("Number of times to try and generate the ore - set to 0 to disable")
                .defineInRange("oreChances", 8, 0, 256);
        KALINITE_ORE_VEINSIZE = COMMON_BUILDER
                .comment("Maximum size of a single vein")
                .defineInRange("veinSize", 5, 1, 256);
        KALINITE_ORE_MINY = COMMON_BUILDER
                .comment("Minimum Y value at which the ore can spawn")
                .defineInRange("minY", 10, 0, 256);
        KALINITE_ORE_MAXY = COMMON_BUILDER
                .comment("Maximum Y value at which the ore can spawn")
                .defineInRange("maxY", 150, 0, 256);
        COMMON_BUILDER.pop();
        //Ort Ore
        COMMON_BUILDER.comment("Ortalos Ore").push(ORTALOS_ORE);
        ORTALOS_ORE_CHANCES = COMMON_BUILDER
                .comment("Number of times to try and generate the ore - set to 0 to disable")
                .defineInRange("oreChances", 8, 0, 256);
        ORTALOS_ORE_VEINSIZE = COMMON_BUILDER
                .comment("Maximum size of a single vein")
                .defineInRange("veinSize", 5, 1, 256);
        ORTALOS_ORE_MINY = COMMON_BUILDER
                .comment("Minimum Y value at which the ore can spawn")
                .defineInRange("minY", 10, 0, 256);
        ORTALOS_ORE_MAXY = COMMON_BUILDER
                .comment("Maximum Y value at which the ore can spawn")
                .defineInRange("maxY", 150, 0, 256);
        COMMON_BUILDER.pop();
        //Ra Ore
        COMMON_BUILDER.comment("Radium Ore").push(RADIUM_ORE);
        RADIUM_ORE_CHANCES = COMMON_BUILDER
                .comment("Number of times to try and generate the ore - set to 0 to disable")
                .defineInRange("oreChances", 8, 0, 256);
        RADIUM_ORE_VEINSIZE = COMMON_BUILDER
                .comment("Maximum size of a single vein")
                .defineInRange("veinSize", 5, 1, 256);
        RADIUM_ORE_MINY = COMMON_BUILDER
                .comment("Minimum Y value at which the ore can spawn")
                .defineInRange("minY", 10, 0, 256);
        RADIUM_ORE_MAXY = COMMON_BUILDER
                .comment("Maximum Y value at which the ore can spawn")
                .defineInRange("maxY", 150, 0, 256);
        COMMON_BUILDER.pop();
        //Re Ore
        COMMON_BUILDER.comment("Rhenium Ore").push(RHENIUM_ORE);
        RHENIUM_ORE_CHANCES = COMMON_BUILDER
                .comment("Number of times to try and generate the ore - set to 0 to disable")
                .defineInRange("oreChances", 8, 0, 256);
        RHENIUM_ORE_VEINSIZE = COMMON_BUILDER
                .comment("Maximum size of a single vein")
                .defineInRange("veinSize", 5, 1, 256);
        RHENIUM_ORE_MINY = COMMON_BUILDER
                .comment("Minimum Y value at which the ore can spawn")
                .defineInRange("minY", 10, 0, 256);
        RHENIUM_ORE_MAXY = COMMON_BUILDER
                .comment("Maximum Y value at which the ore can spawn")
                .defineInRange("maxY", 150, 0, 256);
        COMMON_BUILDER.pop();
        //Scr Ore
        COMMON_BUILDER.comment("Scrith Ore").push(SCRITH_ORE);
        SCRITH_ORE_CHANCES = COMMON_BUILDER
                .comment("Number of times to try and generate the ore - set to 0 to disable")
                .defineInRange("oreChances", 8, 0, 256);
        SCRITH_ORE_VEINSIZE = COMMON_BUILDER
                .comment("Maximum size of a single vein")
                .defineInRange("veinSize", 5, 1, 256);
        SCRITH_ORE_MINY = COMMON_BUILDER
                .comment("Minimum Y value at which the ore can spawn")
                .defineInRange("minY", 10, 0, 256);
        SCRITH_ORE_MAXY = COMMON_BUILDER
                .comment("Maximum Y value at which the ore can spawn")
                .defineInRange("maxY", 150, 0, 256);
        COMMON_BUILDER.pop();
        //Ta Ore
        COMMON_BUILDER.comment("Tantalum Ore").push(TANTALUM_ORE);
        TANTALUM_ORE_CHANCES = COMMON_BUILDER
                .comment("Number of times to try and generate the ore - set to 0 to disable")
                .defineInRange("oreChances", 8, 0, 256);
        TANTALUM_ORE_VEINSIZE = COMMON_BUILDER
                .comment("Maximum size of a single vein")
                .defineInRange("veinSize", 5, 1, 256);
        TANTALUM_ORE_MINY = COMMON_BUILDER
                .comment("Minimum Y value at which the ore can spawn")
                .defineInRange("minY", 10, 0, 256);
        TANTALUM_ORE_MAXY = COMMON_BUILDER
                .comment("Maximum Y value at which the ore can spawn")
                .defineInRange("maxY", 150, 0, 256);
        COMMON_BUILDER.pop();
        //Tan Ore
        COMMON_BUILDER.comment("Tanzanite Ore").push(TANZANITE_ORE);
        TANZANITE_ORE_CHANCES = COMMON_BUILDER
                .comment("Number of times to try and generate the ore - set to 0 to disable")
                .defineInRange("oreChances", 8, 0, 256);
        TANZANITE_ORE_VEINSIZE = COMMON_BUILDER
                .comment("Maximum size of a single vein")
                .defineInRange("veinSize", 5, 1, 256);
        TANZANITE_ORE_MINY = COMMON_BUILDER
                .comment("Minimum Y value at which the ore can spawn")
                .defineInRange("minY", 10, 0, 256);
        TANZANITE_ORE_MAXY = COMMON_BUILDER
                .comment("Maximum Y value at which the ore can spawn")
                .defineInRange("maxY", 150, 0, 256);
        COMMON_BUILDER.pop();
        //W Ore
        COMMON_BUILDER.comment("Tungsten Ore").push(TUNGSTEN_ORE);
        TUNGSTEN_ORE_CHANCES = COMMON_BUILDER
                .comment("Number of times to try and generate the ore - set to 0 to disable")
                .defineInRange("oreChances", 8, 0, 256);
        TUNGSTEN_ORE_VEINSIZE = COMMON_BUILDER
                .comment("Maximum size of a single vein")
                .defineInRange("veinSize", 5, 1, 256);
        TUNGSTEN_ORE_MINY = COMMON_BUILDER
                .comment("Minimum Y value at which the ore can spawn")
                .defineInRange("minY", 10, 0, 256);
        TUNGSTEN_ORE_MAXY = COMMON_BUILDER
                .comment("Maximum Y value at which the ore can spawn")
                .defineInRange("maxY", 150, 0, 256);
        COMMON_BUILDER.pop();
        //Xan Ore
        COMMON_BUILDER.comment("Xandanzine Ore").push(XANDANZINE_ORE);
        XANDANZINE_ORE_CHANCES = COMMON_BUILDER
                .comment("Number of times to try and generate the ore - set to 0 to disable")
                .defineInRange("oreChances", 4, 0, 256);
        XANDANZINE_ORE_VEINSIZE = COMMON_BUILDER
                .comment("Maximum size of a single vein")
                .defineInRange("veinSize", 24, 1, 256);
        XANDANZINE_ORE_MINY = COMMON_BUILDER
                .comment("Minimum Y value at which the ore can spawn")
                .defineInRange("minY", 10, 0, 256);
        XANDANZINE_ORE_MAXY = COMMON_BUILDER
                .comment("Maximum Y value at which the ore can spawn")
                .defineInRange("maxY", 150, 0, 256);
        COMMON_BUILDER.pop();
        //Zar Ore
        COMMON_BUILDER.comment("Zarite Ore").push(ZARITE_ORE);
        ZARITE_ORE_CHANCES = COMMON_BUILDER
                .comment("Number of times to try and generate the ore - set to 0 to disable")
                .defineInRange("oreChances", 4, 0, 256);
        ZARITE_ORE_VEINSIZE = COMMON_BUILDER
                .comment("Maximum size of a single vein")
                .defineInRange("veinSize", 24, 1, 256);
        ZARITE_ORE_MINY = COMMON_BUILDER
                .comment("Minimum Y value at which the ore can spawn")
                .defineInRange("minY", 10, 0, 256);
        ZARITE_ORE_MAXY = COMMON_BUILDER
                .comment("Maximum Y value at which the ore can spawn")
                .defineInRange("maxY", 150, 0, 256);
        COMMON_BUILDER.pop();
    }
}
