package com.Zaren.Lumens.util;

import com.Zaren.Lumens.Lumens;
import com.Zaren.Lumens.gui.CelestialScreen;
import com.Zaren.Lumens.gui.LunarScreen;
import com.Zaren.Lumens.gui.SolarScreen;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Lumens.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        //GUI
            ScreenManager.registerFactory(RegistryHandler.PRIMITIVE_SOLAR_CONTAINER.get(), SolarScreen::new);
            ScreenManager.registerFactory(RegistryHandler.BASIC_SOLAR_CONTAINER.get(), SolarScreen::new);
            ScreenManager.registerFactory(RegistryHandler.ADVANCED_SOLAR_CONTAINER.get(), SolarScreen::new);
            ScreenManager.registerFactory(RegistryHandler.ELITE_SOLAR_CONTAINER.get(), SolarScreen::new);
            ScreenManager.registerFactory(RegistryHandler.HELLBORN_SOLAR_CONTAINER.get(), SolarScreen::new);
            ScreenManager.registerFactory(RegistryHandler.QUANTUM_SOLAR_CONTAINER.get(), SolarScreen::new);
            ScreenManager.registerFactory(RegistryHandler.DRAGONFORGED_SOLAR_CONTAINER.get(), SolarScreen::new);

            ScreenManager.registerFactory(RegistryHandler.PRIMITIVE_LUNAR_CONTAINER.get(), LunarScreen::new);
            ScreenManager.registerFactory(RegistryHandler.BASIC_LUNAR_CONTAINER.get(), LunarScreen::new);
            ScreenManager.registerFactory(RegistryHandler.ADVANCED_LUNAR_CONTAINER.get(), LunarScreen::new);
            ScreenManager.registerFactory(RegistryHandler.ELITE_LUNAR_CONTAINER.get(), LunarScreen::new);
            ScreenManager.registerFactory(RegistryHandler.HELLBORN_LUNAR_CONTAINER.get(), LunarScreen::new);
            ScreenManager.registerFactory(RegistryHandler.QUANTUM_LUNAR_CONTAINER.get(), LunarScreen::new);
            ScreenManager.registerFactory(RegistryHandler.DRAGONFORGED_LUNAR_CONTAINER.get(), LunarScreen::new);

            ScreenManager.registerFactory(RegistryHandler.PRIMITIVE_CELESTIAL_CONTAINER.get(), CelestialScreen::new);
            ScreenManager.registerFactory(RegistryHandler.BASIC_CELESTIAL_CONTAINER.get(), CelestialScreen::new);
            ScreenManager.registerFactory(RegistryHandler.ADVANCED_CELESTIAL_CONTAINER.get(), CelestialScreen::new);
            ScreenManager.registerFactory(RegistryHandler.ELITE_CELESTIAL_CONTAINER.get(), CelestialScreen::new);
            ScreenManager.registerFactory(RegistryHandler.HELLBORN_CELESTIAL_CONTAINER.get(), CelestialScreen::new);
            ScreenManager.registerFactory(RegistryHandler.QUANTUM_CELESTIAL_CONTAINER.get(), CelestialScreen::new);
            ScreenManager.registerFactory(RegistryHandler.DRAGONFORGED_CELESTIAL_CONTAINER.get(), CelestialScreen::new);
        }
    }

