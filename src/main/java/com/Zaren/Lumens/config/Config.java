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
    public static String SUB_CATEGORY_CELESTIAL = "celestial";
    public static String PRIMITIVE_CELESTIAL = "primitive celestial";
    public static String BASIC_CELESTIAL = "basic celestial";
    public static String ADVANCED_CELESTIAL = "advanced celestial";
    public static String ELITE_CELESTIAL = "elite celestial";
    public static String HELLBORN_CELESTIAL = "hellborn celestial";
    public static String QUANTUM_CELESTIAL = "quantum celestial";
    public static String DRAGONFORGED_CELESTIAL = "dragonforged celestial";

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
    //Celestial
    public static ForgeConfigSpec.IntValue PRIMITIVE_CELESTIALBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue PRIMITIVE_CELESTIALBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue BASIC_CELESTIALBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue BASIC_CELESTIALBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue ADVANCED_CELESTIALBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue ADVANCED_CELESTIALBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue ELITE_CELESTIALBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue ELITE_CELESTIALBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue HELLBORN_CELESTIALBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue HELLBORN_CELESTIALBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue QUANTUM_CELESTIALBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue QUANTUM_CELESTIALBLOCK_GENERATE;
    public static ForgeConfigSpec.IntValue DRAGONFORGED_CELESTIALBLOCK_MAXPOWER;
    public static ForgeConfigSpec.IntValue DRAGONFORGED_CELESTIALBLOCK_GENERATE;


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
                .defineInRange("maxPower", 16000, 0, 2147483647);
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
                .defineInRange("maxPower", 2000000000, 0, 2147483647);
        DRAGONFORGED_SOLARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 1048576, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Lunars").push(SUB_CATEGORY_LUNAR);

        COMMON_BUILDER.comment("Primitive Lunar").push(PRIMITIVE_LUNAR);
        PRIMITIVE_LUNARBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Lunar generator")
                .defineInRange("maxPower", 16000, 0, 2147483647);
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
                .defineInRange("maxPower", 2000000000, 0, 2147483647);
        DRAGONFORGED_LUNARBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 1048576, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Celestials").push(SUB_CATEGORY_CELESTIAL);

        COMMON_BUILDER.comment("Primitive Celestial").push(PRIMITIVE_CELESTIAL);
        PRIMITIVE_CELESTIALBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Celestial generator")
                .defineInRange("maxPower", 16000, 0, 2147483647);
        PRIMITIVE_CELESTIALBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 4, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Basic Celestial").push(BASIC_CELESTIAL);
        BASIC_CELESTIALBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Celestial generator")
                .defineInRange("maxPower", 128000, 0, 2147483647);
        BASIC_CELESTIALBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 32, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Advanced Celestial").push(ADVANCED_CELESTIAL);
        ADVANCED_CELESTIALBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Celestial generator")
                .defineInRange("maxPower", 1024000, 0, 2147483647);
        ADVANCED_CELESTIALBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 256, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Elite Celestial").push(ELITE_CELESTIAL);
        ELITE_CELESTIALBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Celestial generator")
                .defineInRange("maxPower", 8192000, 0, 2147483647);
        ELITE_CELESTIALBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 2048, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Hellborn Celestial").push(HELLBORN_CELESTIAL);
        HELLBORN_CELESTIALBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Celestial generator")
                .defineInRange("maxPower", 65536000, 0, 2147483647);
        HELLBORN_CELESTIALBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 16384, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Quantum Celestial").push(QUANTUM_CELESTIAL);
        QUANTUM_CELESTIALBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Celestial generator")
                .defineInRange("maxPower", 524288000, 0, 2147483647);
        QUANTUM_CELESTIALBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 131072, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Dragonforged Celestial").push(DRAGONFORGED_CELESTIAL);
        DRAGONFORGED_CELESTIALBLOCK_MAXPOWER = COMMON_BUILDER.comment("Max power for Celestial generator")
                .defineInRange("maxPower", 2000000000, 0, 2147483647);
        DRAGONFORGED_CELESTIALBLOCK_GENERATE = COMMON_BUILDER.comment("Power generation per tick")
                .defineInRange("generate", 1048576, 0, 2147483647);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.pop();
        COMMON_BUILDER.pop();
    }
}
