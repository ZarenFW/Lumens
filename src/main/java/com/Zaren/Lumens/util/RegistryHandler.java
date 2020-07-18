package com.Zaren.Lumens.util;

import com.Zaren.Lumens.Lumens;
import com.Zaren.Lumens.blocks.BlockItemBase;
import com.Zaren.Lumens.blocks.OreRealgar;
import com.Zaren.Lumens.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

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
    public static final RegistryObject<Item> AZURITE = ITEMS.register("crystal_azurite", ItemBase::new);
    public static final RegistryObject<Item> REALGAR = ITEMS.register("crystal_realgar", ItemBase::new);
    public static final RegistryObject<Item> NEPHRITE = ITEMS.register("crystal_nephrite", ItemBase::new);
    public static final RegistryObject<Item> CARNELIAN = ITEMS.register("crystal_carnelian", ItemBase::new);
    public static final RegistryObject<Item> TANZANITE = ITEMS.register("crystal_tanzanite", ItemBase::new);
    public static final RegistryObject<Item> HELIOTROPE = ITEMS.register("crystal_heliotrope", ItemBase::new);
    public static final RegistryObject<Item> CELESTINE = ITEMS.register("crystal_celestine", ItemBase::new);
    public static final RegistryObject<Item> KAI_STONE = ITEMS.register("crystal_kai_stone", ItemBase::new);
    public static final RegistryObject<Item> LUNARITE = ITEMS.register("crystal_lunarite", ItemBase::new);
    public static final RegistryObject<Item> SYRALTITE = ITEMS.register("crystal_syraltite", ItemBase::new);
    public static final RegistryObject<Item> ARNALIOS = ITEMS.register("crystal_arnalios", ItemBase::new);
    public static final RegistryObject<Item> ORTALOS = ITEMS.register("crystal_ortalos", ItemBase::new);
    public static final RegistryObject<Item> DRAKANINE = ITEMS.register("crystal_drakanine", ItemBase::new);

        //Ingots
    public static final RegistryObject<Item> ADAMANT = ITEMS.register("ingot_adamant", ItemBase::new);
    public static final RegistryObject<Item> ALSCAN = ITEMS.register("ingot_alscan", ItemBase::new);
    public static final RegistryObject<Item> ALUMINIUM = ITEMS.register("ingot_aluminium", ItemBase::new);
    public static final RegistryObject<Item> ANTARIUM = ITEMS.register("ingot_antarium", ItemBase::new);
    public static final RegistryObject<Item> BLAZING_ALLOY = ITEMS.register("ingot_blazing_alloy", ItemBase::new);
    public static final RegistryObject<Item> BRASS = ITEMS.register("ingot_brass", ItemBase::new);
    public static final RegistryObject<Item> BRONZE = ITEMS.register("ingot_bronze", ItemBase::new);
    public static final RegistryObject<Item> CELESTIAL_KALINITE = ITEMS.register("ingot_celestial_kalinite", ItemBase::new);
    public static final RegistryObject<Item> CHROME = ITEMS.register("ingot_chrome", ItemBase::new);
    public static final RegistryObject<Item> CHROME_STEEL = ITEMS.register("ingot_chrome_steel", ItemBase::new);
    public static final RegistryObject<Item> COPPER = ITEMS.register("ingot_copper", ItemBase::new);
    public static final RegistryObject<Item> DRACONIAN_SCRITH = ITEMS.register("ingot_draconian_scrith", ItemBase::new);
    public static final RegistryObject<Item> ELECTRUM = ITEMS.register("ingot_electrum", ItemBase::new);
    public static final RegistryObject<Item> ENCHANTED_MYTHRIL = ITEMS.register("ingot_enchanted_mythril", ItemBase::new);
    public static final RegistryObject<Item> ENDER_GOLD = ITEMS.register("ingot_ender_gold", ItemBase::new);
    public static final RegistryObject<Item> GALINSTAN = ITEMS.register("ingot_galinstan", ItemBase::new);
    public static final RegistryObject<Item> GALLIUM = ITEMS.register("ingot_gallium", ItemBase::new);
    public static final RegistryObject<Item> HC_STEEL = ITEMS.register("ingot_hc_steel", ItemBase::new);
    public static final RegistryObject<Item> INDIUM = ITEMS.register("ingot_indium", ItemBase::new);
    public static final RegistryObject<Item> KAI_BRONZE = ITEMS.register("ingot_kai_bronze", ItemBase::new);
    public static final RegistryObject<Item> KALINITE = ITEMS.register("ingot_kalinite", ItemBase::new);
    public static final RegistryObject<Item> KARROSH = ITEMS.register("ingot_karrosh", ItemBase::new);
    public static final RegistryObject<Item> KOVAR = ITEMS.register("ingot_kovar", ItemBase::new);
    public static final RegistryObject<Item> LITHIUM = ITEMS.register("ingot_lithium", ItemBase::new);
    public static final RegistryObject<Item> LORITE = ITEMS.register("ingot_lorite", ItemBase::new);
    public static final RegistryObject<Item> MAGNALIUM = ITEMS.register("ingot_magnalium", ItemBase::new);
    public static final RegistryObject<Item> MAGNESIUM = ITEMS.register("ingot_magnesium", ItemBase::new);
    public static final RegistryObject<Item> MANGANESE = ITEMS.register("ingot_manganese", ItemBase::new);
    public static final RegistryObject<Item> MYTHRIL = ITEMS.register("ingot_mythril", ItemBase::new);
    public static final RegistryObject<Item> NANITE = ITEMS.register("ingot_nanite", ItemBase::new);
    public static final RegistryObject<Item> NETHER_SILVER = ITEMS.register("ingot_nether_silver", ItemBase::new);
    public static final RegistryObject<Item> PYROLITE = ITEMS.register("ingot_pyrolite", ItemBase::new);
    public static final RegistryObject<Item> RADIUM = ITEMS.register("ingot_radium", ItemBase::new);
    public static final RegistryObject<Item> RHENIUM = ITEMS.register("ingot_rhenium", ItemBase::new);
    public static final RegistryObject<Item> RHODIUM = ITEMS.register("ingot_rhodium", ItemBase::new);
    public static final RegistryObject<Item> SCRITH = ITEMS.register("ingot_scrith", ItemBase::new);
    public static final RegistryObject<Item> SILVER = ITEMS.register("ingot_silver", ItemBase::new);
    public static final RegistryObject<Item> SPRING_STEEL = ITEMS.register("ingot_spring_steel", ItemBase::new);
    public static final RegistryObject<Item> STEEL = ITEMS.register("ingot_steel", ItemBase::new);
    public static final RegistryObject<Item> SYRAL_STEEL = ITEMS.register("ingot_syral_steel", ItemBase::new);
    public static final RegistryObject<Item> TANTALUM = ITEMS.register("ingot_tantalum", ItemBase::new);
    public static final RegistryObject<Item> TIGO = ITEMS.register("ingot_tigo", ItemBase::new);
    public static final RegistryObject<Item> TIN = ITEMS.register("ingot_tin", ItemBase::new);
    public static final RegistryObject<Item> TITANIUM = ITEMS.register("ingot_titanium", ItemBase::new);
    public static final RegistryObject<Item> TUNGSTEN = ITEMS.register("ingot_tungsten", ItemBase::new);
    public static final RegistryObject<Item> YALITE = ITEMS.register("ingot_yalite", ItemBase::new);
    public static final RegistryObject<Item> ZINC = ITEMS.register("ingot_zinc", ItemBase::new);

    //Block Registry
        //Ores
    public static final RegistryObject<Block> ORE_REALGAR= BLOCKS.register("ore_realgar", OreRealgar::new);


    //Block Item Registry
        //Ores
    public static final RegistryObject<Item> ORE_REALGAR_ITEM = ITEMS.register("ore_realgar", () -> new BlockItemBase(ORE_REALGAR.get()));
}
