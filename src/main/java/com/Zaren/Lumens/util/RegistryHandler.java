package com.Zaren.Lumens.util;

import com.Zaren.Lumens.Lumens;
import com.Zaren.Lumens.blocks.*;
import com.Zaren.Lumens.blocks.containers.*;
import com.Zaren.Lumens.items.*;
import com.Zaren.Lumens.tile.*;
import com.Zaren.Lumens.tools.CelestialPanelLevel;
import com.Zaren.Lumens.tools.LunarPanelLevel;
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
        // Upgrade Cores
        public static final RegistryObject<Item> PRIMITIVE_UPGRADE_CORE = ITEMS.register("upgrade_core_primitive", ItemUpgradeCore::new);
        public static final RegistryObject<Item> BASIC_UPGRADE_CORE = ITEMS.register("upgrade_core_basic", ItemUpgradeCore::new);
        public static final RegistryObject<Item> ADVANCED_UPGRADE_CORE = ITEMS.register("upgrade_core_advanced", ItemUpgradeCore::new);
        public static final RegistryObject<Item> ELITE_UPGRADE_CORE = ITEMS.register("upgrade_core_elite", ItemUpgradeCore::new);
        public static final RegistryObject<Item> HELLBORN_UPGRADE_CORE = ITEMS.register("upgrade_core_hellborn", ItemUpgradeCore::new);
        public static final RegistryObject<Item> QUANTUM_UPGRADE_CORE = ITEMS.register("upgrade_core_quantum", ItemUpgradeCore::new);
        public static final RegistryObject<Item> DRAGONFORGED_UPGRADE_CORE = ITEMS.register("upgrade_core_dragonforged", ItemUpgradeCore::new);
        public static final RegistryObject<Item> PRIMITIVE_LUNAR_UPGRADE_CORE = ITEMS.register("upgrade_core_lunar_primitive", ItemUpgradeCore::new);
        public static final RegistryObject<Item> BASIC_LUNAR_UPGRADE_CORE = ITEMS.register("upgrade_core_lunar_basic", ItemUpgradeCore::new);
        public static final RegistryObject<Item> ADVANCED_LUNAR_UPGRADE_CORE = ITEMS.register("upgrade_core_lunar_advanced", ItemUpgradeCore::new);
        public static final RegistryObject<Item> ELITE_LUNAR_UPGRADE_CORE = ITEMS.register("upgrade_core_lunar_elite", ItemUpgradeCore::new);
        public static final RegistryObject<Item> HELLBORN_LUNAR_UPGRADE_CORE = ITEMS.register("upgrade_core_lunar_hellborn", ItemUpgradeCore::new);
        public static final RegistryObject<Item> QUANTUM_LUNAR_UPGRADE_CORE = ITEMS.register("upgrade_core_lunar_quantum", ItemUpgradeCore::new);
        public static final RegistryObject<Item> DRAGONFORGED_LUNAR_UPGRADE_CORE = ITEMS.register("upgrade_core_lunar_dragonforged", ItemUpgradeCore::new);
        // Block Registry

            //Solar Panels
            public static final RegistryObject<Block> SOLAR_PRIMITIVE = BLOCKS.register("solar_primitive", () -> new SolarBlock(SolarPanelLevel.PRIMITIVE));
            public static final RegistryObject<Block> SOLAR_BASIC = BLOCKS.register("solar_basic", () -> new SolarBlock(SolarPanelLevel.BASIC));
            public static final RegistryObject<Block> SOLAR_ADVANCED = BLOCKS.register("solar_advanced", () -> new SolarBlock(SolarPanelLevel.ADVANCED));
            public static final RegistryObject<Block> SOLAR_ELITE = BLOCKS.register("solar_elite", () -> new SolarBlock(SolarPanelLevel.ELITE));
            public static final RegistryObject<Block> SOLAR_HELLBORN = BLOCKS.register("solar_hellborn", () -> new SolarBlock(SolarPanelLevel.HELLBORN));
            public static final RegistryObject<Block> SOLAR_QUANTUM = BLOCKS.register("solar_quantum", () -> new SolarBlock(SolarPanelLevel.QUANTUM));
            public static final RegistryObject<Block> SOLAR_DRAGONFORGED = BLOCKS.register("solar_dragonforged", () -> new SolarBlock(SolarPanelLevel.DRAGONFORGED));
            //Lunar Panels
            public static final RegistryObject<Block> LUNAR_PRIMITIVE = BLOCKS.register("lunar_primitive", () -> new LunarBlock(LunarPanelLevel.PRIMITIVE));
            public static final RegistryObject<Block> LUNAR_BASIC = BLOCKS.register("lunar_basic", () -> new LunarBlock(LunarPanelLevel.BASIC));
            public static final RegistryObject<Block> LUNAR_ADVANCED = BLOCKS.register("lunar_advanced", () -> new LunarBlock(LunarPanelLevel.ADVANCED));
            public static final RegistryObject<Block> LUNAR_ELITE = BLOCKS.register("lunar_elite", () -> new LunarBlock(LunarPanelLevel.ELITE));
            public static final RegistryObject<Block> LUNAR_HELLBORN = BLOCKS.register("lunar_hellborn", () -> new LunarBlock(LunarPanelLevel.HELLBORN));
            public static final RegistryObject<Block> LUNAR_QUANTUM = BLOCKS.register("lunar_quantum", () -> new LunarBlock(LunarPanelLevel.QUANTUM));
            public static final RegistryObject<Block> LUNAR_DRAGONFORGED = BLOCKS.register("lunar_dragonforged", () -> new LunarBlock(LunarPanelLevel.DRAGONFORGED));
            //Celestial Panels
            public static final RegistryObject<Block> CELESTIAL_PRIMITIVE = BLOCKS.register("celestial_primitive", () -> new CelestialBlock(CelestialPanelLevel.PRIMITIVE));
            public static final RegistryObject<Block> CELESTIAL_BASIC = BLOCKS.register("celestial_basic", () -> new CelestialBlock(CelestialPanelLevel.BASIC));
            public static final RegistryObject<Block> CELESTIAL_ADVANCED = BLOCKS.register("celestial_advanced", () -> new CelestialBlock(CelestialPanelLevel.ADVANCED));
            public static final RegistryObject<Block> CELESTIAL_ELITE = BLOCKS.register("celestial_elite", () -> new CelestialBlock(CelestialPanelLevel.ELITE));
            public static final RegistryObject<Block> CELESTIAL_HELLBORN = BLOCKS.register("celestial_hellborn", () -> new CelestialBlock(CelestialPanelLevel.HELLBORN));
            public static final RegistryObject<Block> CELESTIAL_QUANTUM = BLOCKS.register("celestial_quantum", () -> new CelestialBlock(CelestialPanelLevel.QUANTUM));
            public static final RegistryObject<Block> CELESTIAL_DRAGONFORGED = BLOCKS.register("celestial_dragonforged", () -> new CelestialBlock(CelestialPanelLevel.DRAGONFORGED));

    //Block Item Registry

            //Solar Panels
    public static final RegistryObject<Item> SOLAR_PRIMITIVE_ITEM = ITEMS.register("solar_primitive", () -> new BlockItemBase(SOLAR_PRIMITIVE.get()));
    public static final RegistryObject<Item> SOLAR_BASIC_ITEM = ITEMS.register("solar_basic", () -> new BlockItemBase(SOLAR_BASIC.get()));
    public static final RegistryObject<Item> SOLAR_ADVANCED_ITEM = ITEMS.register("solar_advanced", () -> new BlockItemBase(SOLAR_ADVANCED.get()));
    public static final RegistryObject<Item> SOLAR_ELITE_ITEM = ITEMS.register("solar_elite", () -> new BlockItemBase(SOLAR_ELITE.get()));
    public static final RegistryObject<Item> SOLAR_HELLBORN_ITEM = ITEMS.register("solar_hellborn", () -> new BlockItemBase(SOLAR_HELLBORN.get()));
    public static final RegistryObject<Item> SOLAR_QUANTUM_ITEM = ITEMS.register("solar_quantum", () -> new BlockItemBase(SOLAR_QUANTUM.get()));
    public static final RegistryObject<Item> SOLAR_DRAGONFORGED_ITEM = ITEMS.register("solar_dragonforged", () -> new BlockItemBase(SOLAR_DRAGONFORGED.get()));
            //Lunar Panels
    public static final RegistryObject<Item> LUNAR_PRIMITIVE_ITEM = ITEMS.register("lunar_primitive", () -> new BlockItemBase(LUNAR_PRIMITIVE.get()));
    public static final RegistryObject<Item> LUNAR_BASIC_ITEM = ITEMS.register("lunar_basic", () -> new BlockItemBase(LUNAR_BASIC.get()));
    public static final RegistryObject<Item> LUNAR_ADVANCED_ITEM = ITEMS.register("lunar_advanced", () -> new BlockItemBase(LUNAR_ADVANCED.get()));
    public static final RegistryObject<Item> LUNAR_ELITE_ITEM = ITEMS.register("lunar_elite", () -> new BlockItemBase(LUNAR_ELITE.get()));
    public static final RegistryObject<Item> LUNAR_HELLBORN_ITEM = ITEMS.register("lunar_hellborn", () -> new BlockItemBase(LUNAR_HELLBORN.get()));
    public static final RegistryObject<Item> LUNAR_QUANTUM_ITEM = ITEMS.register("lunar_quantum", () -> new BlockItemBase(LUNAR_QUANTUM.get()));
    public static final RegistryObject<Item> LUNAR_DRAGONFORGED_ITEM = ITEMS.register("lunar_dragonforged", () -> new BlockItemBase(LUNAR_DRAGONFORGED.get()));
             //Celestial Panels
    public static final RegistryObject<Item> CELESTIAL_PRIMITIVE_ITEM = ITEMS.register("celestial_primitive", () -> new BlockItemBase(CELESTIAL_PRIMITIVE.get()));
    public static final RegistryObject<Item> CELESTIAL_BASIC_ITEM = ITEMS.register("celestial_basic", () -> new BlockItemBase(CELESTIAL_BASIC.get()));
    public static final RegistryObject<Item> CELESTIAL_ADVANCED_ITEM = ITEMS.register("celestial_advanced", () -> new BlockItemBase(CELESTIAL_ADVANCED.get()));
    public static final RegistryObject<Item> CELESTIAL_ELITE_ITEM = ITEMS.register("celestial_elite", () -> new BlockItemBase(CELESTIAL_ELITE.get()));
    public static final RegistryObject<Item> CELESTIAL_HELLBORN_ITEM = ITEMS.register("celestial_hellborn", () -> new BlockItemBase(CELESTIAL_HELLBORN.get()));
    public static final RegistryObject<Item> CELESTIAL_QUANTUM_ITEM = ITEMS.register("celestial_quantum", () -> new BlockItemBase(CELESTIAL_QUANTUM.get()));
    public static final RegistryObject<Item> CELESTIAL_DRAGONFORGED_ITEM = ITEMS.register("celestial_dragonforged", () -> new BlockItemBase(CELESTIAL_DRAGONFORGED.get()));

    //Tile Entities
    //Solars
    public static final RegistryObject<TileEntityType<TileEntityPrimitiveSolar>> PRIMITIVE_SOLAR_TILE = TILES.register("solar_primitive", () -> TileEntityType.Builder.create(TileEntityPrimitiveSolar::new, SOLAR_PRIMITIVE.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityBasicSolar>> BASIC_SOLAR_TILE = TILES.register("solar_basic", () -> TileEntityType.Builder.create(TileEntityBasicSolar::new, SOLAR_BASIC.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityAdvancedSolar>> ADVANCED_SOLAR_TILE = TILES.register("solar_advanced", () -> TileEntityType.Builder.create(TileEntityAdvancedSolar::new, SOLAR_ADVANCED.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityEliteSolar>> ELITE_SOLAR_TILE = TILES.register("solar_elite", () -> TileEntityType.Builder.create(TileEntityEliteSolar::new, SOLAR_ELITE.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityHellbornSolar>> HELLBORN_SOLAR_TILE = TILES.register("solar_hellborn", () -> TileEntityType.Builder.create(TileEntityHellbornSolar::new, SOLAR_HELLBORN.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityQuantumSolar>> QUANTUM_SOLAR_TILE = TILES.register("solar_quantum", () -> TileEntityType.Builder.create(TileEntityQuantumSolar::new, SOLAR_QUANTUM.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityDragonforgedSolar>> DRAGONFORGED_SOLAR_TILE = TILES.register("solar_dragonforged", () -> TileEntityType.Builder.create(TileEntityDragonforgedSolar::new, SOLAR_DRAGONFORGED.get()).build(null));
    //Lunars
    public static final RegistryObject<TileEntityType<TileEntityPrimitiveLunar>> PRIMITIVE_LUNAR_TILE = TILES.register("lunar_primitive", () -> TileEntityType.Builder.create(TileEntityPrimitiveLunar::new, LUNAR_PRIMITIVE.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityBasicLunar>> BASIC_LUNAR_TILE = TILES.register("lunar_basic", () -> TileEntityType.Builder.create(TileEntityBasicLunar::new, LUNAR_BASIC.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityAdvancedLunar>> ADVANCED_LUNAR_TILE = TILES.register("lunar_advanced", () -> TileEntityType.Builder.create(TileEntityAdvancedLunar::new, LUNAR_ADVANCED.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityEliteLunar>> ELITE_LUNAR_TILE = TILES.register("lunar_elite", () -> TileEntityType.Builder.create(TileEntityEliteLunar::new, LUNAR_ELITE.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityHellbornLunar>> HELLBORN_LUNAR_TILE = TILES.register("lunar_hellborn", () -> TileEntityType.Builder.create(TileEntityHellbornLunar::new, LUNAR_HELLBORN.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityQuantumLunar>> QUANTUM_LUNAR_TILE = TILES.register("lunar_quantum", () -> TileEntityType.Builder.create(TileEntityQuantumLunar::new, LUNAR_QUANTUM.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityDragonforgedLunar>> DRAGONFORGED_LUNAR_TILE = TILES.register("lunar_dragonforged", () -> TileEntityType.Builder.create(TileEntityDragonforgedLunar::new, LUNAR_DRAGONFORGED.get()).build(null));
    //Celestials
    public static final RegistryObject<TileEntityType<TileEntityPrimitiveCelestial>> PRIMITIVE_CELESTIAL_TILE = TILES.register("celestial_primitive", () -> TileEntityType.Builder.create(TileEntityPrimitiveCelestial::new, CELESTIAL_PRIMITIVE.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityBasicCelestial>> BASIC_CELESTIAL_TILE = TILES.register("celestial_basic", () -> TileEntityType.Builder.create(TileEntityBasicCelestial::new, CELESTIAL_BASIC.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityAdvancedCelestial>> ADVANCED_CELESTIAL_TILE = TILES.register("celestial_advanced", () -> TileEntityType.Builder.create(TileEntityAdvancedCelestial::new, CELESTIAL_ADVANCED.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityEliteCelestial>> ELITE_CELESTIAL_TILE = TILES.register("celestial_elite", () -> TileEntityType.Builder.create(TileEntityEliteCelestial::new, CELESTIAL_ELITE.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityHellbornCelestial>> HELLBORN_CELESTIAL_TILE = TILES.register("celestial_hellborn", () -> TileEntityType.Builder.create(TileEntityHellbornCelestial::new, CELESTIAL_HELLBORN.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityQuantumCelestial>> QUANTUM_CELESTIAL_TILE = TILES.register("celestial_quantum", () -> TileEntityType.Builder.create(TileEntityQuantumCelestial::new, CELESTIAL_QUANTUM.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityDragonforgedCelestial>> DRAGONFORGED_CELESTIAL_TILE = TILES.register("celestial_dragonforged", () -> TileEntityType.Builder.create(TileEntityDragonforgedCelestial::new, CELESTIAL_DRAGONFORGED.get()).build(null));
    //Containers    
    //Solars
    public static final RegistryObject<ContainerType<SolarPrimitiveContainer>> PRIMITIVE_SOLAR_CONTAINER = CONTAINERS.register("solar_primitive", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new SolarPrimitiveContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<SolarBasicContainer>> BASIC_SOLAR_CONTAINER = CONTAINERS.register("solar_basic", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new SolarBasicContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<SolarAdvancedContainer>> ADVANCED_SOLAR_CONTAINER = CONTAINERS.register("solar_advanced", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new SolarAdvancedContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<SolarEliteContainer>> ELITE_SOLAR_CONTAINER = CONTAINERS.register("solar_elite", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new SolarEliteContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<SolarHellbornContainer>> HELLBORN_SOLAR_CONTAINER = CONTAINERS.register("solar_hellborn", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new SolarHellbornContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<SolarQuantumContainer>> QUANTUM_SOLAR_CONTAINER = CONTAINERS.register("solar_quantum", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new SolarQuantumContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<SolarDragonforgedContainer>> DRAGONFORGED_SOLAR_CONTAINER = CONTAINERS.register("solar_dragonforged", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new SolarDragonforgedContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    //Lunars
    public static final RegistryObject<ContainerType<LunarPrimitiveContainer>> PRIMITIVE_LUNAR_CONTAINER = CONTAINERS.register("lunar_primitive", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new LunarPrimitiveContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<LunarBasicContainer>> BASIC_LUNAR_CONTAINER = CONTAINERS.register("lunar_basic", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new LunarBasicContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<LunarAdvancedContainer>> ADVANCED_LUNAR_CONTAINER = CONTAINERS.register("lunar_advanced", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new LunarAdvancedContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<LunarEliteContainer>> ELITE_LUNAR_CONTAINER = CONTAINERS.register("lunar_elite", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new LunarEliteContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<LunarHellbornContainer>> HELLBORN_LUNAR_CONTAINER = CONTAINERS.register("lunar_hellborn", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new LunarHellbornContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<LunarQuantumContainer>> QUANTUM_LUNAR_CONTAINER = CONTAINERS.register("lunar_quantum", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new LunarQuantumContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<LunarDragonforgedContainer>> DRAGONFORGED_LUNAR_CONTAINER = CONTAINERS.register("lunar_dragonforged", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new LunarDragonforgedContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    //Celestials
    public static final RegistryObject<ContainerType<CelestialPrimitiveContainer>> PRIMITIVE_CELESTIAL_CONTAINER = CONTAINERS.register("celestial_primitive", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new CelestialPrimitiveContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<CelestialBasicContainer>> BASIC_CELESTIAL_CONTAINER = CONTAINERS.register("celestial_basic", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new CelestialBasicContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<CelestialAdvancedContainer>> ADVANCED_CELESTIAL_CONTAINER = CONTAINERS.register("celestial_advanced", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new CelestialAdvancedContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<CelestialEliteContainer>> ELITE_CELESTIAL_CONTAINER = CONTAINERS.register("celestial_elite", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new CelestialEliteContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<CelestialHellbornContainer>> HELLBORN_CELESTIAL_CONTAINER = CONTAINERS.register("celestial_hellborn", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new CelestialHellbornContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<CelestialQuantumContainer>> QUANTUM_CELESTIAL_CONTAINER = CONTAINERS.register("celestial_quantum", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new CelestialQuantumContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<CelestialDragonforgedContainer>> DRAGONFORGED_CELESTIAL_CONTAINER = CONTAINERS.register("celestial_dragonforged", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new CelestialDragonforgedContainer(windowId, Lumens.proxy.getClientWorld(), data.readBlockPos(), Lumens.proxy.getClientPlayer());
    }));
}


