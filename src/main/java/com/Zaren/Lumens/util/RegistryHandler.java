package com.Zaren.Lumens.util;

import com.Zaren.Lumens.Lumens;
import com.Zaren.Lumens.blocks.*;
import com.Zaren.Lumens.blocks.containers.SolarPrimitiveContainer;
import com.Zaren.Lumens.items.*;
import com.Zaren.Lumens.tile.TileEntityPrimitiveSolar;
import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.Zaren.Lumens.tools.SolarPanelLevel;

import java.rmi.registry.Registry;

public class RegistryHandler {

    //Init Handler
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Lumens.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Lumens.MOD_ID);
    public static final DeferredRegister<TileEntityType<?>> TILES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, Lumens.MOD_ID);
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = new DeferredRegister<>(ForgeRegistries.CONTAINERS, Lumens.MOD_ID);
    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        TILES.register(FMLJavaModLoadingContext.get().getModEventBus());
        CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
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
        //Geodes
        public static final RegistryObject<Item> ARNALIOS_GEODE = ITEMS.register("geode_arnalios", ItemGeode::new);
        public static final RegistryObject<Item> AZURITE_GEODE = ITEMS.register("geode_azurite", ItemGeode::new);
        public static final RegistryObject<Item> CARNELIAN_GEODE = ITEMS.register("geode_carnelian", ItemGeode::new);
        public static final RegistryObject<Item> CELESTINE_GEODE = ITEMS.register("geode_celestine", ItemGeode::new);
        public static final RegistryObject<Item> DRAKANINE_GEODE = ITEMS.register("geode_drakanine", ItemGeode::new);
        public static final RegistryObject<Item> HELIOTROPE_GEODE = ITEMS.register("geode_heliotrope", ItemGeode::new);
        public static final RegistryObject<Item> KAI_STONE_GEODE = ITEMS.register("geode_kai_stone", ItemGeode::new);
        public static final RegistryObject<Item> LUNARITE_GEODE = ITEMS.register("geode_lunarite", ItemGeode::new);
        public static final RegistryObject<Item> NEPHRITE_GEODE = ITEMS.register("geode_nephrite", ItemGeode::new);
        public static final RegistryObject<Item> ORTALOS_GEODE = ITEMS.register("geode_ortalos", ItemGeode::new);
        public static final RegistryObject<Item> REALGAR_GEODE = ITEMS.register("geode_realgar", ItemGeode::new);
        public static final RegistryObject<Item> SYRALTITE_GEODE = ITEMS.register("geode_syraltite", ItemGeode::new);
        public static final RegistryObject<Item> TANZANITE_GEODE = ITEMS.register("geode_tanzanite", ItemGeode::new);
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
        public static final RegistryObject<Item> GERMANIUM = ITEMS.register("ingot_germanium", ItemIngot::new);
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
        //Dusts
        public static final RegistryObject<Item> DUST_ADAMANT = ITEMS.register("dust_adamant", ItemDust::new);
        public static final RegistryObject<Item> DUST_ALSCAN = ITEMS.register("dust_alscan", ItemDust::new);
        public static final RegistryObject<Item> DUST_ALUMINIUM = ITEMS.register("dust_aluminium", ItemDust::new);
        public static final RegistryObject<Item> DUST_ANTARIUM = ITEMS.register("dust_antarium", ItemDust::new);
        public static final RegistryObject<Item> DUST_ARNALIOS = ITEMS.register("dust_arnalios", ItemDust::new);
        public static final RegistryObject<Item> DUST_AZURITE = ITEMS.register("dust_azurite", ItemDust::new);
        public static final RegistryObject<Item> DUST_BLAZING_ALLOY = ITEMS.register("dust_blazing_alloy", ItemDust::new);
        public static final RegistryObject<Item> DUST_BRASS = ITEMS.register("dust_brass", ItemDust::new);
        public static final RegistryObject<Item> DUST_BRONZE = ITEMS.register("dust_bronze", ItemDust::new);
        public static final RegistryObject<Item> DUST_CARNELIAN = ITEMS.register("dust_carnelian", ItemDust::new);
        public static final RegistryObject<Item> DUST_CELESTIAL_KALINITE = ITEMS.register("dust_celestial_kalinite", ItemDust::new);
        public static final RegistryObject<Item> DUST_CELESTINE = ITEMS.register("dust_celestine", ItemDust::new);
        public static final RegistryObject<Item> DUST_CHROME = ITEMS.register("dust_chrome", ItemDust::new);
        public static final RegistryObject<Item> DUST_CHROME_STEEL = ITEMS.register("dust_chrome_steel", ItemDust::new);
        public static final RegistryObject<Item> DUST_COPPER = ITEMS.register("dust_copper", ItemDust::new);
        public static final RegistryObject<Item> DUST_DIAMOND = ITEMS.register("dust_diamond", ItemDust::new);
        public static final RegistryObject<Item> DUST_DRACONIAN_SCRITH = ITEMS.register("dust_draconian_scrith", ItemDust::new);
        public static final RegistryObject<Item> DUST_DRAKANINE = ITEMS.register("dust_drakanine", ItemDust::new);
        public static final RegistryObject<Item> DUST_ELECTRUM = ITEMS.register("dust_electrum", ItemDust::new);
        public static final RegistryObject<Item> DUST_EMERALD = ITEMS.register("dust_emerald", ItemDust::new);
        public static final RegistryObject<Item> DUST_ENCHANTED_MYTHRIL = ITEMS.register("dust_enchanted_mythril", ItemDust::new);
        public static final RegistryObject<Item> DUST_ENDER_GOLD = ITEMS.register("dust_ender_gold", ItemDust::new);
        public static final RegistryObject<Item> DUST_GALINSTAN = ITEMS.register("dust_galinstan", ItemDust::new);
        public static final RegistryObject<Item> DUST_GALLIUM = ITEMS.register("dust_gallium", ItemDust::new);
        public static final RegistryObject<Item> DUST_GERMANIUM = ITEMS.register("dust_germanium", ItemDust::new);
        public static final RegistryObject<Item> DUST_GOLD = ITEMS.register("dust_gold", ItemDust::new);
        public static final RegistryObject<Item> DUST_HALLINITE = ITEMS.register("dust_hallinite", ItemDust::new);
        public static final RegistryObject<Item> DUST_HC_STEEL = ITEMS.register("dust_hc_steel", ItemDust::new);
        public static final RegistryObject<Item> DUST_HELIOTROPE = ITEMS.register("dust_heliotrope", ItemDust::new);
        public static final RegistryObject<Item> DUST_INDIUM = ITEMS.register("dust_indium", ItemDust::new);
        public static final RegistryObject<Item> DUST_IRON = ITEMS.register("dust_iron", ItemDust::new);
        public static final RegistryObject<Item> DUST_JALSHADE = ITEMS.register("dust_jalshade", ItemDust::new);
        public static final RegistryObject<Item> DUST_KAI_BRONZE = ITEMS.register("dust_kai_bronze", ItemDust::new);
        public static final RegistryObject<Item> DUST_KAI_STONE = ITEMS.register("dust_kai_stone", ItemDust::new);
        public static final RegistryObject<Item> DUST_KALINITE = ITEMS.register("dust_kalinite", ItemDust::new);
        public static final RegistryObject<Item> DUST_KARROSH = ITEMS.register("dust_karrosh", ItemDust::new);
        public static final RegistryObject<Item> DUST_KOVAR = ITEMS.register("dust_kovar", ItemDust::new);
        public static final RegistryObject<Item> DUST_LITHIUM = ITEMS.register("dust_lithium", ItemDust::new);
        public static final RegistryObject<Item> DUST_LORITE = ITEMS.register("dust_lorite", ItemDust::new);
        public static final RegistryObject<Item> DUST_LUNARITE = ITEMS.register("dust_lunarite", ItemDust::new);
        public static final RegistryObject<Item> DUST_MAGNALIUM = ITEMS.register("dust_magnalium", ItemDust::new);
        public static final RegistryObject<Item> DUST_MAGNESIUM = ITEMS.register("dust_magnesium", ItemDust::new);
        public static final RegistryObject<Item> DUST_MANGANESE = ITEMS.register("dust_manganese", ItemDust::new);
        public static final RegistryObject<Item> DUST_MYTHRIL = ITEMS.register("dust_mythril", ItemDust::new);
        public static final RegistryObject<Item> DUST_NANITE = ITEMS.register("dust_nanite", ItemDust::new);
        public static final RegistryObject<Item> DUST_NEPHRITE = ITEMS.register("dust_nephrite", ItemDust::new);
        public static final RegistryObject<Item> DUST_NETHER_SILVER = ITEMS.register("dust_nether_silver", ItemDust::new);
        public static final RegistryObject<Item> DUST_ORTALOS = ITEMS.register("dust_ortalos", ItemDust::new);
        public static final RegistryObject<Item> DUST_PYROLITE = ITEMS.register("dust_pyrolite", ItemDust::new);
        public static final RegistryObject<Item> DUST_RADIUM = ITEMS.register("dust_radium", ItemDust::new);
        public static final RegistryObject<Item> DUST_RASHADINE = ITEMS.register("dust_rashadine", ItemDust::new);
        public static final RegistryObject<Item> DUST_REALGAR = ITEMS.register("dust_realgar", ItemDust::new);
        public static final RegistryObject<Item> DUST_RHENIUM = ITEMS.register("dust_rhenium", ItemDust::new);
        public static final RegistryObject<Item> DUST_RHODIUM = ITEMS.register("dust_rhodium", ItemDust::new);
        public static final RegistryObject<Item> DUST_SCRITH = ITEMS.register("dust_scrith", ItemDust::new);
        public static final RegistryObject<Item> DUST_SILVER = ITEMS.register("dust_silver", ItemDust::new);
        public static final RegistryObject<Item> DUST_SPRING_STEEL = ITEMS.register("dust_spring_steel", ItemDust::new);
        public static final RegistryObject<Item> DUST_STEEL = ITEMS.register("dust_steel", ItemDust::new);
        public static final RegistryObject<Item> DUST_SYRAL_STEEL = ITEMS.register("dust_syral_steel", ItemDust::new);
        public static final RegistryObject<Item> DUST_SYRALTITE = ITEMS.register("dust_syraltite", ItemDust::new);
        public static final RegistryObject<Item> DUST_TANTALUM = ITEMS.register("dust_tantalum", ItemDust::new);
        public static final RegistryObject<Item> DUST_TANZANITE = ITEMS.register("dust_tanzanite", ItemDust::new);
        public static final RegistryObject<Item> DUST_TIGO = ITEMS.register("dust_tigo", ItemDust::new);
        public static final RegistryObject<Item> DUST_TIN = ITEMS.register("dust_tin", ItemDust::new);
        public static final RegistryObject<Item> DUST_TITANIUM = ITEMS.register("dust_titanium", ItemDust::new);
        public static final RegistryObject<Item> DUST_TRALLINISH = ITEMS.register("dust_trallinish", ItemDust::new);
        public static final RegistryObject<Item> DUST_TUNGSTEN = ITEMS.register("dust_tungsten", ItemDust::new);
        public static final RegistryObject<Item> DUST_UVAORITE = ITEMS.register("dust_uvaorite", ItemDust::new);
        public static final RegistryObject<Item> DUST_XANDANZINE = ITEMS.register("dust_xandanzine", ItemDust::new);
        public static final RegistryObject<Item> DUST_YALITE = ITEMS.register("dust_yalite", ItemDust::new);
        public static final RegistryObject<Item> DUST_ZARITE = ITEMS.register("dust_zarite", ItemDust::new);
        public static final RegistryObject<Item> DUST_ZINC = ITEMS.register("dust_zinc", ItemDust::new);
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
        // Wires
        public static final RegistryObject<Item> ADAMANT_WIRE = ITEMS.register("wire_adamant", ItemWire::new);
        public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("wire_copper", ItemWire::new);
        public static final RegistryObject<Item> ENDER_GOLD_WIRE = ITEMS.register("wire_ender_gold", ItemWire::new);
        public static final RegistryObject<Item> GALINSTAN_WIRE = ITEMS.register("wire_galinstan", ItemWire::new);
        public static final RegistryObject<Item> GALLIUM_WIRE = ITEMS.register("wire_gallium", ItemWire::new);
        public static final RegistryObject<Item> GERMANIUM_WIRE = ITEMS.register("wire_germanium", ItemWire::new);
        public static final RegistryObject<Item> HC_STEEL_WIRE = ITEMS.register("wire_hc_steel", ItemWire::new);
        public static final RegistryObject<Item> LAPIS_WIRE = ITEMS.register("wire_lapis", ItemWire::new);
        public static final RegistryObject<Item> LITHIUM_WIRE = ITEMS.register("wire_lithium", ItemWire::new);
        public static final RegistryObject<Item> LORITE_WIRE = ITEMS.register("wire_lorite", ItemWire::new);
        public static final RegistryObject<Item> NANITE_WIRE = ITEMS.register("wire_nanite", ItemWire::new);
        public static final RegistryObject<Item> NETHER_SILVER_WIRE = ITEMS.register("wire_nether_silver", ItemWire::new);
        public static final RegistryObject<Item> REDSTONE_WIRE = ITEMS.register("wire_redstone", ItemWire::new);
        public static final RegistryObject<Item> YALITE_WIRE = ITEMS.register("wire_yalite", ItemWire::new);
        public static final RegistryObject<Item> PRIMITIVE_WIRE = ITEMS.register("wire_primitive", ItemWire::new);
        public static final RegistryObject<Item> BASIC_WIRE = ITEMS.register("wire_basic", ItemWire::new);
        public static final RegistryObject<Item> ADVANCED_WIRE = ITEMS.register("wire_advanced", ItemWire::new);
        public static final RegistryObject<Item> ELITE_WIRE = ITEMS.register("wire_elite", ItemWire::new);
        public static final RegistryObject<Item> HELLBORN_WIRE = ITEMS.register("wire_hellborn", ItemWire::new);
        public static final RegistryObject<Item> QUANTUM_WIRE = ITEMS.register("wire_quantum", ItemWire::new);
        public static final RegistryObject<Item> DRAGONFORGED_WIRE = ITEMS.register("wire_dragonforged", ItemWire::new);
        // Wire Shells
        public static final RegistryObject<Item> PRIMITIVE_WIRE_SHELL = ITEMS.register("wire_shell_primitive", ItemWire::new);
        public static final RegistryObject<Item> BASIC_WIRE_SHELL = ITEMS.register("wire_shell_basic", ItemWire::new);
        public static final RegistryObject<Item> ADVANCED_WIRE_SHELL = ITEMS.register("wire_shell_advanced", ItemWire::new);
        public static final RegistryObject<Item> ELITE_WIRE_SHELL = ITEMS.register("wire_shell_elite", ItemWire::new);
        public static final RegistryObject<Item> HELLBORN_WIRE_SHELL = ITEMS.register("wire_shell_hellborn", ItemWire::new);
        public static final RegistryObject<Item> QUANTUM_WIRE_SHELL = ITEMS.register("wire_shell_quantum", ItemWire::new);
        public static final RegistryObject<Item> DRAGONFORGED_WIRE_SHELL = ITEMS.register("wire_shell_dragonforged", ItemWire::new);
        // PVBs
        public static final RegistryObject<Item> PRIMITIVE_PVB = ITEMS.register("pvb_primitive", ItemVB::new);
        public static final RegistryObject<Item> BASIC_PVB = ITEMS.register("pvb_basic", ItemVB::new);
        public static final RegistryObject<Item> ADVANCED_PVB = ITEMS.register("pvb_advanced", ItemVB::new);
        public static final RegistryObject<Item> ELITE_PVB = ITEMS.register("pvb_elite", ItemVB::new);
        public static final RegistryObject<Item> HELLBORN_PVB = ITEMS.register("pvb_hellborn", ItemVB::new);
        public static final RegistryObject<Item> QUANTUM_PVB = ITEMS.register("pvb_quantum", ItemVB::new);
        public static final RegistryObject<Item> DRAGONFORGED_PVB = ITEMS.register("pvb_dragonforged", ItemVB::new);
        // LVBs
        public static final RegistryObject<Item> PRIMITIVE_LVB = ITEMS.register("lvb_primitive", ItemVB::new);
        public static final RegistryObject<Item> BASIC_LVB = ITEMS.register("lvb_basic", ItemVB::new);
        public static final RegistryObject<Item> ADVANCED_LVB = ITEMS.register("lvb_advanced", ItemVB::new);
        public static final RegistryObject<Item> ELITE_LVB = ITEMS.register("lvb_elite", ItemVB::new);
        public static final RegistryObject<Item> HELLBORN_LVB = ITEMS.register("lvb_hellborn", ItemVB::new);
        public static final RegistryObject<Item> QUANTUM_LVB = ITEMS.register("lvb_quantum", ItemVB::new);
        public static final RegistryObject<Item> DRAGONFORGED_LVB = ITEMS.register("lvb_dragonforged", ItemVB::new);
        // Reflectors
        public static final RegistryObject<Item> PRIMITIVE_REFLECTOR = ITEMS.register("reflector_primitive", ItemReflector::new);
        public static final RegistryObject<Item> BASIC_REFLECTOR = ITEMS.register("reflector_basic", ItemReflector::new);
        public static final RegistryObject<Item> ADVANCED_REFLECTOR = ITEMS.register("reflector_advanced", ItemReflector::new);
        public static final RegistryObject<Item> ELITE_REFLECTOR = ITEMS.register("reflector_elite", ItemReflector::new);
        public static final RegistryObject<Item> HELLBORN_REFLECTOR = ITEMS.register("reflector_hellborn", ItemReflector::new);
        public static final RegistryObject<Item> QUANTUM_REFLECTOR = ITEMS.register("reflector_quantum", ItemReflector::new);
        public static final RegistryObject<Item> DRAGONFORGED_REFLECTOR = ITEMS.register("reflector_dragonforged", ItemReflector::new);
        public static final RegistryObject<Item> PRIMITIVE_LUNAR_REFLECTOR = ITEMS.register("reflector_lunar_primitive", ItemReflector::new);
        public static final RegistryObject<Item> BASIC_LUNAR_REFLECTOR = ITEMS.register("reflector_lunar_basic", ItemReflector::new);
        public static final RegistryObject<Item> ADVANCED_LUNAR_REFLECTOR = ITEMS.register("reflector_lunar_advanced", ItemReflector::new);
        public static final RegistryObject<Item> ELITE_LUNAR_REFLECTOR = ITEMS.register("reflector_lunar_elite", ItemReflector::new);
        public static final RegistryObject<Item> HELLBORN_LUNAR_REFLECTOR = ITEMS.register("reflector_lunar_hellborn", ItemReflector::new);
        public static final RegistryObject<Item> QUANTUM_LUNAR_REFLECTOR = ITEMS.register("reflector_lunar_quantum", ItemReflector::new);
        public static final RegistryObject<Item> DRAGONFORGED_LUNAR_REFLECTOR = ITEMS.register("reflector_lunar_dragonforged", ItemReflector::new);
        // Block Registry
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
            //Solar Panels
            public static final RegistryObject<Block> SOLAR_ADVANCED = BLOCKS.register("solar_advanced", () -> new SolarBlock(SolarPanelLevel.PRIMITIVE));
            public static final RegistryObject<Block> SOLAR_BASIC = BLOCKS.register("solar_basic", () -> new SolarBlock(SolarPanelLevel.BASIC));
            public static final RegistryObject<Block> SOLAR_DRAGONFORGED = BLOCKS.register("solar_dragonforged", () -> new SolarBlock(SolarPanelLevel.ADVANCED));
            public static final RegistryObject<Block> SOLAR_ELITE = BLOCKS.register("solar_elite", () -> new SolarBlock(SolarPanelLevel.ELITE));
            public static final RegistryObject<Block> SOLAR_HELLBORN = BLOCKS.register("solar_hellborn", () -> new SolarBlock(SolarPanelLevel.HELLBORN));
            public static final RegistryObject<Block> SOLAR_PRIMITIVE = BLOCKS.register("solar_primitive", () -> new SolarBlock(SolarPanelLevel.QUANTUM));
            public static final RegistryObject<Block> SOLAR_QUANTUM = BLOCKS.register("solar_quantum", () -> new SolarBlock(SolarPanelLevel.DRAGONFORGED));
            //Lunar Panels
            public static final RegistryObject<Block> LUNAR_ADVANCED = BLOCKS.register("lunar_advanced", () -> new SolarBlock(SolarPanelLevel.PRIMITIVE));
            public static final RegistryObject<Block> LUNAR_BASIC = BLOCKS.register("lunar_basic", () -> new SolarBlock(SolarPanelLevel.BASIC));
            public static final RegistryObject<Block> LUNAR_DRAGONFORGED = BLOCKS.register("lunar_dragonforged", () -> new SolarBlock(SolarPanelLevel.ADVANCED));
            public static final RegistryObject<Block> LUNAR_ELITE = BLOCKS.register("lunar_elite", () -> new SolarBlock(SolarPanelLevel.ELITE));
            public static final RegistryObject<Block> LUNAR_HELLBORN = BLOCKS.register("lunar_hellborn", () -> new SolarBlock(SolarPanelLevel.HELLBORN));
            public static final RegistryObject<Block> LUNAR_PRIMITIVE = BLOCKS.register("lunar_primitive", () -> new SolarBlock(SolarPanelLevel.QUANTUM));
            public static final RegistryObject<Block> LUNAR_QUANTUM = BLOCKS.register("lunar_quantum", () -> new SolarBlock(SolarPanelLevel.DRAGONFORGED));;
            //Lunar Panels
            public static final RegistryObject<Block> CELESTIAL_ADVANCED = BLOCKS.register("celestial_advanced", () -> new SolarBlock(SolarPanelLevel.PRIMITIVE));;
            public static final RegistryObject<Block> CELESTIAL_BASIC = BLOCKS.register("celestial_basic", () -> new SolarBlock(SolarPanelLevel.BASIC));;
            public static final RegistryObject<Block> CELESTIAL_DRAGONFORGED = BLOCKS.register("celestial_dragonforged", () -> new SolarBlock(SolarPanelLevel.ADVANCED));;
            public static final RegistryObject<Block> CELESTIAL_ELITE = BLOCKS.register("celestial_elite", () -> new SolarBlock(SolarPanelLevel.ELITE));;
            public static final RegistryObject<Block> CELESTIAL_HELLBORN = BLOCKS.register("celestial_hellborn", () -> new SolarBlock(SolarPanelLevel.HELLBORN));;
            public static final RegistryObject<Block> CELESTIAL_PRIMITIVE = BLOCKS.register("celestial_primitive", () -> new SolarBlock(SolarPanelLevel.QUANTUM));;
            public static final RegistryObject<Block> CELESTIAL_QUANTUM = BLOCKS.register("celestial_quantum", () -> new SolarBlock(SolarPanelLevel.DRAGONFORGED));;
            //Machines
            public static final RegistryObject<Block> GRINDER_PRIMITIVE = BLOCKS.register("grinder_primitive", () -> new MachineBlock(0,3));
            public static final RegistryObject<Block> FURNACE_PRIMITIVE = BLOCKS.register("furnace_primitive", () -> new MachineBlock(0,3));
            public static final RegistryObject<Block> COMPACTOR_PRIMITIVE = BLOCKS.register("compactor_primitive", () -> new MachineBlock(0,3));
            public static final RegistryObject<Block> ALLOY_FURNACE_PRIMITIVE = BLOCKS.register("alloy_furnace_primitive", () -> new MachineBlock(0,3));
            public static final RegistryObject<Block> AETHER_HARVESTER_PRIMITIVE = BLOCKS.register("aether_harvester_primitive", () -> new MachineBlock(0,3));
            public static final RegistryObject<Block> EXTRUDER_PRIMITIVE = BLOCKS.register("extruder_primitive", () -> new MachineBlock(0,3));
            public static final RegistryObject<Block> SONICATOR_PRIMITIVE = BLOCKS.register("sonicator_primitive", () -> new MachineBlock(0,3));
            public static final RegistryObject<Block> FLUID_REACTOR_PRIMITIVE = BLOCKS.register("fluid_reactor_primitive", () -> new MachineBlock(0,3));
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
            //Solar Panels
    public static final RegistryObject<Item> SOLAR_ADVANCED_ITEM = ITEMS.register("solar_advanced", () -> new BlockItemBase(SOLAR_ADVANCED.get()));
    public static final RegistryObject<Item> SOLAR_BASIC_ITEM = ITEMS.register("solar_basic", () -> new BlockItemBase(SOLAR_BASIC.get()));
    public static final RegistryObject<Item> SOLAR_DRAGONFORGED_ITEM = ITEMS.register("solar_dragonforged", () -> new BlockItemBase(SOLAR_DRAGONFORGED.get()));
    public static final RegistryObject<Item> SOLAR_ELITE_ITEM = ITEMS.register("solar_elite", () -> new BlockItemBase(SOLAR_ELITE.get()));
    public static final RegistryObject<Item> SOLAR_HELLBORN_ITEM = ITEMS.register("solar_hellborn", () -> new BlockItemBase(SOLAR_HELLBORN.get()));
    public static final RegistryObject<Item> SOLAR_PRIMITIVE_ITEM = ITEMS.register("solar_primitive", () -> new BlockItemBase(SOLAR_PRIMITIVE.get()));
    public static final RegistryObject<Item> SOLAR_QUANTUM_ITEM = ITEMS.register("solar_quantum", () -> new BlockItemBase(SOLAR_QUANTUM.get()));
            //Lunar Panels
    public static final RegistryObject<Item> LUNAR_ADVANCED_ITEM = ITEMS.register("lunar_advanced", () -> new BlockItemBase(LUNAR_ADVANCED.get()));
    public static final RegistryObject<Item> LUNAR_BASIC_ITEM = ITEMS.register("lunar_basic", () -> new BlockItemBase(LUNAR_BASIC.get()));
    public static final RegistryObject<Item> LUNAR_DRAGONFORGED_ITEM = ITEMS.register("lunar_dragonforged", () -> new BlockItemBase(LUNAR_DRAGONFORGED.get()));
    public static final RegistryObject<Item> LUNAR_ELITE_ITEM = ITEMS.register("lunar_elite", () -> new BlockItemBase(LUNAR_ELITE.get()));
    public static final RegistryObject<Item> LUNAR_HELLBORN_ITEM = ITEMS.register("lunar_hellborn", () -> new BlockItemBase(LUNAR_HELLBORN.get()));
    public static final RegistryObject<Item> LUNAR_PRIMITIVE_ITEM = ITEMS.register("lunar_primitive", () -> new BlockItemBase(LUNAR_PRIMITIVE.get()));
    public static final RegistryObject<Item> LUNAR_QUANTUM_ITEM = ITEMS.register("lunar_quantum", () -> new BlockItemBase(LUNAR_QUANTUM.get()));
            //Lunar Panels
    public static final RegistryObject<Item> CELESTIAL_ADVANCED_ITEM = ITEMS.register("celestial_advanced", () -> new BlockItemBase(CELESTIAL_ADVANCED.get()));
    public static final RegistryObject<Item> CELESTIAL_BASIC_ITEM = ITEMS.register("celestial_basic", () -> new BlockItemBase(CELESTIAL_BASIC.get()));
    public static final RegistryObject<Item> CELESTIAL_DRAGONFORGED_ITEM = ITEMS.register("celestial_dragonforged", () -> new BlockItemBase(CELESTIAL_DRAGONFORGED.get()));
    public static final RegistryObject<Item> CELESTIAL_ELITE_ITEM = ITEMS.register("celestial_elite", () -> new BlockItemBase(CELESTIAL_ELITE.get()));
    public static final RegistryObject<Item> CELESTIAL_HELLBORN_ITEM = ITEMS.register("celestial_hellborn", () -> new BlockItemBase(CELESTIAL_HELLBORN.get()));
    public static final RegistryObject<Item> CELESTIAL_PRIMITIVE_ITEM = ITEMS.register("celestial_primitive", () -> new BlockItemBase(CELESTIAL_PRIMITIVE.get()));
    public static final RegistryObject<Item> CELESTIAL_QUANTUM_ITEM = ITEMS.register("celestial_quantum", () -> new BlockItemBase(CELESTIAL_QUANTUM.get()));
        //Machines
    public static final RegistryObject<Item> GRINDER_PRIMITIVE_ITEM = ITEMS.register("grinder_primitive", () -> new BlockItemBase(GRINDER_PRIMITIVE.get()));
    public static final RegistryObject<Item> FURNACE_PRIMITIVE_ITEM = ITEMS.register("furnace_primitive", () -> new BlockItemBase(FURNACE_PRIMITIVE.get()));
    public static final RegistryObject<Item> COMPACTOR_PRIMITIVE_ITEM = ITEMS.register("compactor_primitive", () -> new BlockItemBase(COMPACTOR_PRIMITIVE.get()));
    public static final RegistryObject<Item> ALLOY_FURNACE_PRIMITIVE_ITEM = ITEMS.register("alloy_furnace_primitive", () -> new BlockItemBase(ALLOY_FURNACE_PRIMITIVE.get()));
    public static final RegistryObject<Item> AETHER_HARVESTER_PRIMITIVE_ITEM = ITEMS.register("aether_harvester_primitive", () -> new BlockItemBase(AETHER_HARVESTER_PRIMITIVE.get()));
    public static final RegistryObject<Item> EXTRUDER_PRIMITIVE_ITEM = ITEMS.register("extruder_primitive", () -> new BlockItemBase(EXTRUDER_PRIMITIVE.get()));
    public static final RegistryObject<Item> SONICATOR_PRIMITIVE_ITEM = ITEMS.register("sonicator_primitive", () -> new BlockItemBase(SONICATOR_PRIMITIVE.get()));
    public static final RegistryObject<Item> FLUID_REACTOR_PRIMITIVE_ITEM = ITEMS.register("fluid_reactor_primitive", () -> new BlockItemBase(FLUID_REACTOR_PRIMITIVE.get()));
    //Tile Entities
    //Solars
    public static final RegistryObject<TileEntityType<TileEntityPrimitiveSolar>> PRIMITIVE_SOLAR_TILE = TILES.register("solar_primitive", () -> TileEntityType.Builder.create(TileEntityPrimitiveSolar::new, SOLAR_PRIMITIVE.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityPrimitiveSolar>> BASIC_SOLAR_TILE = TILES.register("solar_basic", () -> TileEntityType.Builder.create(TileEntityPrimitiveSolar::new, SOLAR_BASIC.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityPrimitiveSolar>> ADVANCED_SOLAR_TILE = TILES.register("solar_advanced", () -> TileEntityType.Builder.create(TileEntityPrimitiveSolar::new, SOLAR_ADVANCED.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityPrimitiveSolar>> ELITE_SOLAR_TILE = TILES.register("solar_elite", () -> TileEntityType.Builder.create(TileEntityPrimitiveSolar::new, SOLAR_ELITE.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityPrimitiveSolar>> HELLBORN_SOLAR_TILE = TILES.register("solar_hellborn", () -> TileEntityType.Builder.create(TileEntityPrimitiveSolar::new, SOLAR_HELLBORN.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityPrimitiveSolar>> QUANTUM_SOLAR_TILE = TILES.register("solar_quantum", () -> TileEntityType.Builder.create(TileEntityPrimitiveSolar::new, SOLAR_QUANTUM.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityPrimitiveSolar>> DRAGONFORGED_SOLAR_TILE = TILES.register("solar_dragonforged", () -> TileEntityType.Builder.create(TileEntityPrimitiveSolar::new, SOLAR_DRAGONFORGED.get()).build(null));
    //Containers
    //Solars
    public static final RegistryObject<ContainerType<SolarPrimitiveContainer>> PRIMITIVE_SOLAR_CONTAINER = CONTAINERS.register("solar_primitive", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new SolarPrimitiveContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<SolarPrimitiveContainer>> BASIC_SOLAR_CONTAINER = CONTAINERS.register("solar_basic", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new SolarPrimitiveContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<SolarPrimitiveContainer>> ADVANCED_SOLAR_CONTAINER = CONTAINERS.register("solar_advanced", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new SolarPrimitiveContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<SolarPrimitiveContainer>> ELITE_SOLAR_CONTAINER = CONTAINERS.register("solar_elite", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new SolarPrimitiveContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<SolarPrimitiveContainer>> HELLBORN_SOLAR_CONTAINER = CONTAINERS.register("solar_hellborn", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new SolarPrimitiveContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<SolarPrimitiveContainer>> QUANTUM_SOLAR_CONTAINER = CONTAINERS.register("solar_quantum", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new SolarPrimitiveContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<SolarPrimitiveContainer>> DRAGONFORGED_SOLAR_CONTAINER = CONTAINERS.register("solar_dragonforged", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new SolarPrimitiveContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));

}


