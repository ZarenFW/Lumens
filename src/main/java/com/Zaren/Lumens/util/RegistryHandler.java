package com.Zaren.Lumens.util;

import com.Zaren.Lumens.Lumens;
import com.Zaren.Lumens.blocks.BlockItemBase;
import com.Zaren.Lumens.blocks.OreBlock;
import com.Zaren.Lumens.items.ItemCrystal;
import com.Zaren.Lumens.items.ItemIngot;
import com.Zaren.Lumens.items.ItemPlate;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class RegistryHandler {

    //Init Handler
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Lumens.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Lumens.MOD_ID);
    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Item Registry
        //Crystals
        public static final RegistryObject<Item> AZURITE = ITEMS.register("crystal_azurite", ItemCrystal::new);
        public static final RegistryObject<Item> REALGAR = ITEMS.register("crystal_realgar", ItemCrystal::new);
        public static final RegistryObject<Item> NEPHRITE = ITEMS.register("crystal_nephrite", ItemCrystal::new);
        public static final RegistryObject<Item> CARNELIAN = ITEMS.register("crystal_carnelian", ItemCrystal::new);
        public static final RegistryObject<Item> TANZANITE = ITEMS.register("crystal_tanzanite", ItemCrystal::new);
        public static final RegistryObject<Item> HELIOTROPE = ITEMS.register("crystal_heliotrope", ItemCrystal::new);
        public static final RegistryObject<Item> CELESTINE = ITEMS.register("crystal_celestine", ItemCrystal::new);
        public static final RegistryObject<Item> KAI_STONE = ITEMS.register("crystal_kai_stone", ItemCrystal::new);
        public static final RegistryObject<Item> LUNARITE = ITEMS.register("crystal_lunarite", ItemCrystal::new);
        public static final RegistryObject<Item> SYRALTITE = ITEMS.register("crystal_syraltite", ItemCrystal::new);
        public static final RegistryObject<Item> ARNALIOS = ITEMS.register("crystal_arnalios", ItemCrystal::new);
        public static final RegistryObject<Item> ORTALOS = ITEMS.register("crystal_ortalos", ItemCrystal::new);
        public static final RegistryObject<Item> DRAKANINE = ITEMS.register("crystal_drakanine", ItemCrystal::new);
        public static final RegistryObject<Item> JALSHADE = ITEMS.register("crystal_jalshade", ItemCrystal::new);
        public static final RegistryObject<Item> RASHADINE = ITEMS.register("crystal_rashadine", ItemCrystal::new);
        public static final RegistryObject<Item> UVAORITE = ITEMS.register("crystal_uvaorite", ItemCrystal::new);
        public static final RegistryObject<Item> TRALLINISH = ITEMS.register("crystal_trallinish", ItemCrystal::new);
        public static final RegistryObject<Item> HALLINITE = ITEMS.register("crystal_hallinite", ItemCrystal::new);
        public static final RegistryObject<Item> XANDANZINE = ITEMS.register("crystal_xandanzine", ItemCrystal::new);
        public static final RegistryObject<Item> ZARITE = ITEMS.register("crystal_zarite", ItemCrystal::new);
        //Ingots
        public static final RegistryObject<Item> ADAMANT = ITEMS.register("ingot_adamant", ItemIngot::new);
        public static final RegistryObject<Item> ALSCAN = ITEMS.register("ingot_alscan", ItemIngot::new);
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register("ingot_aluminium", ItemIngot::new);
        public static final RegistryObject<Item> ANTARIUM = ITEMS.register("ingot_antarium", ItemIngot::new);
        public static final RegistryObject<Item> BLAZING_ALLOY = ITEMS.register("ingot_blazing_alloy", ItemIngot::new);
        public static final RegistryObject<Item> BRASS = ITEMS.register("ingot_brass", ItemIngot::new);
        public static final RegistryObject<Item> BRONZE = ITEMS.register("ingot_bronze", ItemIngot::new);
        public static final RegistryObject<Item> CELESTIAL_KALINITE = ITEMS.register("ingot_celestial_kalinite", ItemIngot::new);
        public static final RegistryObject<Item> CHROME = ITEMS.register("ingot_chrome", ItemIngot::new);
        public static final RegistryObject<Item> CHROME_STEEL = ITEMS.register("ingot_chrome_steel", ItemIngot::new);
        public static final RegistryObject<Item> COPPER = ITEMS.register("ingot_copper", ItemIngot::new);
        public static final RegistryObject<Item> DRACONIAN_SCRITH = ITEMS.register("ingot_draconian_scrith", ItemIngot::new);
        public static final RegistryObject<Item> ELECTRUM = ITEMS.register("ingot_electrum", ItemIngot::new);
        public static final RegistryObject<Item> ENCHANTED_MYTHRIL = ITEMS.register("ingot_enchanted_mythril", ItemIngot::new);
        public static final RegistryObject<Item> ENDER_GOLD = ITEMS.register("ingot_ender_gold", ItemIngot::new);
        public static final RegistryObject<Item> GALINSTAN = ITEMS.register("ingot_galinstan", ItemIngot::new);
        public static final RegistryObject<Item> GALLIUM = ITEMS.register("ingot_gallium", ItemIngot::new);
        public static final RegistryObject<Item> HC_STEEL = ITEMS.register("ingot_hc_steel", ItemIngot::new);
        public static final RegistryObject<Item> INDIUM = ITEMS.register("ingot_indium", ItemIngot::new);
        public static final RegistryObject<Item> KAI_BRONZE = ITEMS.register("ingot_kai_bronze", ItemIngot::new);
        public static final RegistryObject<Item> KALINITE = ITEMS.register("ingot_kalinite", ItemIngot::new);
        public static final RegistryObject<Item> KARROSH = ITEMS.register("ingot_karrosh", ItemIngot::new);
        public static final RegistryObject<Item> KOVAR = ITEMS.register("ingot_kovar", ItemIngot::new);
        public static final RegistryObject<Item> LITHIUM = ITEMS.register("ingot_lithium", ItemIngot::new);
        public static final RegistryObject<Item> LORITE = ITEMS.register("ingot_lorite", ItemIngot::new);
        public static final RegistryObject<Item> MAGNALIUM = ITEMS.register("ingot_magnalium", ItemIngot::new);
        public static final RegistryObject<Item> MAGNESIUM = ITEMS.register("ingot_magnesium", ItemIngot::new);
        public static final RegistryObject<Item> MANGANESE = ITEMS.register("ingot_manganese", ItemIngot::new);
        public static final RegistryObject<Item> MYTHRIL = ITEMS.register("ingot_mythril", ItemIngot::new);
        public static final RegistryObject<Item> NANITE = ITEMS.register("ingot_nanite", ItemIngot::new);
        public static final RegistryObject<Item> NETHER_SILVER = ITEMS.register("ingot_nether_silver", ItemIngot::new);
        public static final RegistryObject<Item> PYROLITE = ITEMS.register("ingot_pyrolite", ItemIngot::new);
        public static final RegistryObject<Item> RADIUM = ITEMS.register("ingot_radium", ItemIngot::new);
        public static final RegistryObject<Item> RHENIUM = ITEMS.register("ingot_rhenium", ItemIngot::new);
        public static final RegistryObject<Item> RHODIUM = ITEMS.register("ingot_rhodium", ItemIngot::new);
        public static final RegistryObject<Item> SCRITH = ITEMS.register("ingot_scrith", ItemIngot::new);
        public static final RegistryObject<Item> SILVER = ITEMS.register("ingot_silver", ItemIngot::new);
        public static final RegistryObject<Item> SPRING_STEEL = ITEMS.register("ingot_spring_steel", ItemIngot::new);
        public static final RegistryObject<Item> STEEL = ITEMS.register("ingot_steel", ItemIngot::new);
        public static final RegistryObject<Item> SYRAL_STEEL = ITEMS.register("ingot_syral_steel", ItemIngot::new);
        public static final RegistryObject<Item> TANTALUM = ITEMS.register("ingot_tantalum", ItemIngot::new);
        public static final RegistryObject<Item> TIGO = ITEMS.register("ingot_tigo", ItemIngot::new);
        public static final RegistryObject<Item> TIN = ITEMS.register("ingot_tin", ItemIngot::new);
        public static final RegistryObject<Item> TITANIUM = ITEMS.register("ingot_titanium", ItemIngot::new);
        public static final RegistryObject<Item> TUNGSTEN = ITEMS.register("ingot_tungsten", ItemIngot::new);
        public static final RegistryObject<Item> YALITE = ITEMS.register("ingot_yalite", ItemIngot::new);
        public static final RegistryObject<Item> ZINC = ITEMS.register("ingot_zinc", ItemIngot::new);
        //Plates
        public static final RegistryObject<Item> ALSCAN_PLATE = ITEMS.register("plate_alscan", ItemPlate::new);
        public static final RegistryObject<Item> BLACK_GLASS_PLATE = ITEMS.register("plate_black_glass", ItemPlate::new);
        public static final RegistryObject<Item> BLAZING_ALLOY_PLATE = ITEMS.register("plate_blazing_alloy", ItemPlate::new);
        public static final RegistryObject<Item> BRASS_PLATE = ITEMS.register("plate_brass", ItemPlate::new);
        public static final RegistryObject<Item> BRONZE_PLATE = ITEMS.register("plate_bronze", ItemPlate::new);
        public static final RegistryObject<Item> CELESTIAL_KALINITE_PLATE = ITEMS.register("plate_celestial_kalinite", ItemPlate::new);
        public static final RegistryObject<Item> COPPER_PLATE = ITEMS.register("plate_copper", ItemPlate::new);
        public static final RegistryObject<Item> DRACONIAN_SCRITH_PLATE = ITEMS.register("plate_draconian_scrith", ItemPlate::new);
        public static final RegistryObject<Item> ENCHANTED_MYTHRIL_PLATE = ITEMS.register("plate_enchanted_mythril", ItemPlate::new);
        public static final RegistryObject<Item> ENDER_GLASS_PLATE = ITEMS.register("plate_ender_glass", ItemPlate::new);
        public static final RegistryObject<Item> GLASS_PLATE = ITEMS.register("plate_glass", ItemPlate::new);
        public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("plate_iron", ItemPlate::new);
        public static final RegistryObject<Item> KAI_BRONZE_PLATE = ITEMS.register("plate_kai_bronze", ItemPlate::new);
        public static final RegistryObject<Item> KOVAR_PLATE = ITEMS.register("plate_kovar", ItemPlate::new);
        public static final RegistryObject<Item> MAGNALIUM_PLATE = ITEMS.register("plate_magnalium", ItemPlate::new);
        public static final RegistryObject<Item> NETHER_GLASS_PLATE = ITEMS.register("plate_nether_glass", ItemPlate::new);
        public static final RegistryObject<Item> PURPUR_GLASS_PLATE = ITEMS.register("plate_purpur_glass", ItemPlate::new);
        public static final RegistryObject<Item> RHENIUM_PLATE = ITEMS.register("plate_rhenium", ItemPlate::new);
        public static final RegistryObject<Item> RHODIUM_PLATE = ITEMS.register("plate_rhodium", ItemPlate::new);
        public static final RegistryObject<Item> SOUL_GLASS_PLATE = ITEMS.register("plate_soul_glass", ItemPlate::new);
        public static final RegistryObject<Item> SPRING_STEEL_PLATE = ITEMS.register("plate_spring_steel", ItemPlate::new);
        public static final RegistryObject<Item> STEEL_PLATE = ITEMS.register("plate_steel", ItemPlate::new);
        public static final RegistryObject<Item> SYRAL_STEEL_PLATE = ITEMS.register("plate_syral_steel", ItemPlate::new);
        public static final RegistryObject<Item> TIGO_PLATE = ITEMS.register("plate_tigo", ItemPlate::new);
        public static final RegistryObject<Item> TIN_PLATE = ITEMS.register("plate_tin", ItemPlate::new);
        public static final RegistryObject<Item> TITANIUM_PLATE = ITEMS.register("plate_titanium", ItemPlate::new);
        public static final RegistryObject<Item> TUNGSTEN_PLATE = ITEMS.register("plate_tungsten", ItemPlate::new);
        //Block Registry
        //Ores
            //Overworld Ores
            public static final RegistryObject<Block> ORE_ALUMINIUM = BLOCKS.register("ore_aluminium", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_ANTARIUM = BLOCKS.register("ore_antarium", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_AZURITE = BLOCKS.register("ore_azurite", () -> new OreBlock(2,2));
            public static final RegistryObject<Block> ORE_CELESTINE = BLOCKS.register("ore_celestine", () -> new OreBlock(2,2));
            public static final RegistryObject<Block> ORE_COPPER = BLOCKS.register("ore_copper", () -> new OreBlock(2,2));
            public static final RegistryObject<Block> ORE_KAI_STONE = BLOCKS.register("ore_kai_stone", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_LITHIUM = BLOCKS.register("ore_lithium", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_LORITE = BLOCKS.register("ore_lorite", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_LUNARITE = BLOCKS.register("ore_lunarite", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_MANGANESE = BLOCKS.register("ore_manganese", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_MYTHRIL = BLOCKS.register("ore_mythril", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_REALGAR = BLOCKS.register("ore_realgar", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_SILVER = BLOCKS.register("ore_silver", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_TIN = BLOCKS.register("ore_tin", () -> new OreBlock(2,2));
            public static final RegistryObject<Block> ORE_YALITE = BLOCKS.register("ore_yalite", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_ZINC = BLOCKS.register("ore_zinc", () -> new OreBlock(3,3));
            //Nether Ores
            public static final RegistryObject<Block> ORE_ARNALIOS = BLOCKS.register("ore_arnalios", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_CARNELIAN = BLOCKS.register("ore_carnelian", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_CHROME = BLOCKS.register("ore_chrome", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_GERMANIUM = BLOCKS.register("ore_germanium", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_INDIUM = BLOCKS.register("ore_indium", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_KARROSH = BLOCKS.register("ore_karrosh", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_MAGNESIUM = BLOCKS.register("ore_magnesium", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_NANITE = BLOCKS.register("ore_nanite", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_NEPHRITE = BLOCKS.register("ore_nephrite", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_PYROLITE = BLOCKS.register("ore_pyrolite", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_RHODIUM = BLOCKS.register("ore_rhodium", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_SYRALTITE = BLOCKS.register("ore_syraltite", () -> new OreBlock(3,3));
            public static final RegistryObject<Block> ORE_TITANIUM = BLOCKS.register("ore_titanium", () -> new OreBlock(3,3));
            //Ender Ores
            public static final RegistryObject<Block> ORE_ADAMANT = BLOCKS.register("ore_adamant", () -> new OreBlock(4,3));
            public static final RegistryObject<Block> ORE_DRAKANINE = BLOCKS.register("ore_drakanine", () -> new OreBlock(4,3));
            public static final RegistryObject<Block> ORE_GALLIUM = BLOCKS.register("ore_gallium", () -> new OreBlock(4,3));
            public static final RegistryObject<Block> ORE_HELIOTROPE = BLOCKS.register("ore_heliotrope", () -> new OreBlock(4,3));
            public static final RegistryObject<Block> ORE_KALINITE = BLOCKS.register("ore_kalinite", () -> new OreBlock(4,3));
            public static final RegistryObject<Block> ORE_ORTALOS = BLOCKS.register("ore_ortalos", () -> new OreBlock(4,3));
            public static final RegistryObject<Block> ORE_RADIUM = BLOCKS.register("ore_radium", () -> new OreBlock(4,3));
            public static final RegistryObject<Block> ORE_RHENIUM = BLOCKS.register("ore_rhenium", () -> new OreBlock(4,3));
            public static final RegistryObject<Block> ORE_SCRITH = BLOCKS.register("ore_scrith", () -> new OreBlock(4,3));
            public static final RegistryObject<Block> ORE_TANTALUM = BLOCKS.register("ore_tantalum", () -> new OreBlock(4,3));
            public static final RegistryObject<Block> ORE_TUNGSTEN = BLOCKS.register("ore_tungsten", () -> new OreBlock(4,3));
            //Celestial Ores
            public static final RegistryObject<Block> ORE_JALSHADE = BLOCKS.register("ore_jalshade", () -> new OreBlock(5,3));
            public static final RegistryObject<Block> ORE_RASHADINE = BLOCKS.register("ore_rashadine", () -> new OreBlock(5,3));
            public static final RegistryObject<Block> ORE_UVAORITE = BLOCKS.register("ore_uvaorite", () -> new OreBlock(5,3));
            public static final RegistryObject<Block> ORE_TRALLINISH = BLOCKS.register("ore_trallinish", () -> new OreBlock(5,3));
            public static final RegistryObject<Block> ORE_HALLINITE = BLOCKS.register("ore_hallinite", () -> new OreBlock(5,3));
            public static final RegistryObject<Block> ORE_XANDANZINE = BLOCKS.register("ore_xandanzine", () -> new OreBlock(5,3));
            public static final RegistryObject<Block> ORE_ZARITE = BLOCKS.register("ore_zarite", () -> new OreBlock(5,3));

    //Block Item Registry
            //Ores
            //Overworld Ores
    public static final RegistryObject<Item> ORE_ALUMINIUM_ITEM = ITEMS.register("ore_aluminium", () -> new BlockItemBase(ORE_ALUMINIUM.get()));
    public static final RegistryObject<Item> ORE_ANTARIUM_ITEM = ITEMS.register("ore_antarium", () -> new BlockItemBase(ORE_ANTARIUM.get()));
    public static final RegistryObject<Item> ORE_AZURITE_ITEM = ITEMS.register("ore_azurite", () -> new BlockItemBase(ORE_AZURITE.get()));
    public static final RegistryObject<Item> ORE_CELESTINE_ITEM = ITEMS.register("ore_celestine", () -> new BlockItemBase(ORE_CELESTINE.get()));
    public static final RegistryObject<Item> ORE_COPPER_ITEM = ITEMS.register("ore_copper", () -> new BlockItemBase(ORE_COPPER.get()));
    public static final RegistryObject<Item> ORE_KAI_STONE_ITEM = ITEMS.register("ore_kai_stone", () -> new BlockItemBase(ORE_KAI_STONE.get()));
    public static final RegistryObject<Item> ORE_LITHIUM_ITEM = ITEMS.register("ore_lithium", () -> new BlockItemBase(ORE_LITHIUM.get()));
    public static final RegistryObject<Item> ORE_LORITE_ITEM = ITEMS.register("ore_lorite", () -> new BlockItemBase(ORE_LORITE.get()));
    public static final RegistryObject<Item> ORE_LUNARITE_ITEM = ITEMS.register("ore_lunarite", () -> new BlockItemBase(ORE_LUNARITE.get()));
    public static final RegistryObject<Item> ORE_MANGANESE_ITEM = ITEMS.register("ore_manganese", () -> new BlockItemBase(ORE_MANGANESE.get()));
    public static final RegistryObject<Item> ORE_MYTHRIL_ITEM = ITEMS.register("ore_mythril", () -> new BlockItemBase(ORE_MYTHRIL.get()));
    public static final RegistryObject<Item> ORE_REALGAR_ITEM = ITEMS.register("ore_realgar", () -> new BlockItemBase(ORE_REALGAR.get()));
    public static final RegistryObject<Item> ORE_SILVER_ITEM = ITEMS.register("ore_silver", () -> new BlockItemBase(ORE_SILVER.get()));
    public static final RegistryObject<Item> ORE_TIN_ITEM = ITEMS.register("ore_tin", () -> new BlockItemBase(ORE_TIN.get()));
    public static final RegistryObject<Item> ORE_YALITE_ITEM = ITEMS.register("ore_yalite", () -> new BlockItemBase(ORE_YALITE.get()));
    public static final RegistryObject<Item> ORE_ZINC_ITEM = ITEMS.register("ore_zinc", () -> new BlockItemBase(ORE_ZINC.get()));
            //Nether Ores
    public static final RegistryObject<Item> ORE_ARNALIOS_ITEM = ITEMS.register("ore_arnalios", () -> new BlockItemBase(ORE_ARNALIOS.get()));
    public static final RegistryObject<Item> ORE_CARNELIAN_ITEM = ITEMS.register("ore_carnelian", () -> new BlockItemBase(ORE_CARNELIAN.get()));
    public static final RegistryObject<Item> ORE_CHROME_ITEM = ITEMS.register("ore_chrome", () -> new BlockItemBase(ORE_CHROME.get()));
    public static final RegistryObject<Item> ORE_GERMANIUM_ITEM = ITEMS.register("ore_germanium", () -> new BlockItemBase(ORE_GERMANIUM.get()));
    public static final RegistryObject<Item> ORE_INDIUM_ITEM = ITEMS.register("ore_indium", () -> new BlockItemBase(ORE_INDIUM.get()));
    public static final RegistryObject<Item> ORE_KARROSH_ITEM = ITEMS.register("ore_karrosh", () -> new BlockItemBase(ORE_KARROSH.get()));
    public static final RegistryObject<Item> ORE_MAGNESIUM_ITEM = ITEMS.register("ore_magnesium", () -> new BlockItemBase(ORE_MAGNESIUM.get()));
    public static final RegistryObject<Item> ORE_NANITE_ITEM = ITEMS.register("ore_nanite", () -> new BlockItemBase(ORE_NANITE.get()));
    public static final RegistryObject<Item> ORE_NEPHRITE_ITEM = ITEMS.register("ore_nephrite", () -> new BlockItemBase(ORE_NEPHRITE.get()));
    public static final RegistryObject<Item> ORE_PYROLITE_ITEM = ITEMS.register("ore_pyrolite", () -> new BlockItemBase(ORE_PYROLITE.get()));
    public static final RegistryObject<Item> ORE_RHODIUM_ITEM = ITEMS.register("ore_rhodium", () -> new BlockItemBase(ORE_RHODIUM.get()));
    public static final RegistryObject<Item> ORE_SYRALTITE_ITEM = ITEMS.register("ore_syraltite", () -> new BlockItemBase(ORE_SYRALTITE.get()));
    public static final RegistryObject<Item> ORE_TITANIUM_ITEM = ITEMS.register("ore_titanium", () -> new BlockItemBase(ORE_TITANIUM.get()));
            //Ender Ores
    public static final RegistryObject<Item> ORE_ADAMANT_ITEM = ITEMS.register("ore_adamant", () -> new BlockItemBase(ORE_ADAMANT.get()));
    public static final RegistryObject<Item> ORE_DRAKANINE_ITEM = ITEMS.register("ore_drakanine", () -> new BlockItemBase(ORE_DRAKANINE.get()));
    public static final RegistryObject<Item> ORE_GALLIUM_ITEM = ITEMS.register("ore_gallium", () -> new BlockItemBase(ORE_GALLIUM.get()));
    public static final RegistryObject<Item> ORE_HELIOTROPE_ITEM = ITEMS.register("ore_heliotrope", () -> new BlockItemBase(ORE_HELIOTROPE.get()));
    public static final RegistryObject<Item> ORE_KALINITE_ITEM = ITEMS.register("ore_kalinite", () -> new BlockItemBase(ORE_KALINITE.get()));
    public static final RegistryObject<Item> ORE_ORTALOS_ITEM = ITEMS.register("ore_ortalos", () -> new BlockItemBase(ORE_ORTALOS.get()));
    public static final RegistryObject<Item> ORE_RADIUM_ITEM = ITEMS.register("ore_radium", () -> new BlockItemBase(ORE_RADIUM.get()));
    public static final RegistryObject<Item> ORE_RHENIUM_ITEM = ITEMS.register("ore_rhenium", () -> new BlockItemBase(ORE_RHENIUM.get()));
    public static final RegistryObject<Item> ORE_SCRITH_ITEM = ITEMS.register("ore_scrith", () -> new BlockItemBase(ORE_SCRITH.get()));
    public static final RegistryObject<Item> ORE_TANTALUM_ITEM = ITEMS.register("ore_tantalum", () -> new BlockItemBase(ORE_TANTALUM.get()));
    public static final RegistryObject<Item> ORE_TUNGSTEN_ITEM = ITEMS.register("ore_tungsten", () -> new BlockItemBase(ORE_TUNGSTEN.get()));
            //Celestial Ores
    public static final RegistryObject<Item> ORE_JALSHADE_ITEM = ITEMS.register("ore_jalshade", () -> new BlockItemBase(ORE_JALSHADE.get()));
    public static final RegistryObject<Item> ORE_RASHADINE_ITEM = ITEMS.register("ore_rashadine", () -> new BlockItemBase(ORE_RASHADINE.get()));
    public static final RegistryObject<Item> ORE_UVAORITE_ITEM = ITEMS.register("ore_uvaorite", () -> new BlockItemBase(ORE_UVAORITE.get()));
    public static final RegistryObject<Item> ORE_TRALLINISH_ITEM = ITEMS.register("ore_trallinish", () -> new BlockItemBase(ORE_TRALLINISH.get()));
    public static final RegistryObject<Item> ORE_HALLINITE_ITEM = ITEMS.register("ore_hallinite", () -> new BlockItemBase(ORE_HALLINITE.get()));
    public static final RegistryObject<Item> ORE_XANDANZINE_ITEM = ITEMS.register("ore_xandanzine", () -> new BlockItemBase(ORE_XANDANZINE.get()));
    public static final RegistryObject<Item> ORE_ZARITE_ITEM = ITEMS.register("ore_zarite", () -> new BlockItemBase(ORE_ZARITE.get()));
}
