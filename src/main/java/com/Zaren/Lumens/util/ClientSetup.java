package com.Zaren.Lumens.util;

import com.Zaren.Lumens.gui.SolarScreen;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {
    public static void init(FMLClientSetupEvent event) {
        //Version checker
        MinecraftForge.EVENT_BUS.register(EventHandler.INSTANCE);

        //GUI
        ScreenManager.registerFactory(RegistryHandler.PRIMITIVE_SOLAR_CONTAINER.get(), SolarScreen::new);
        ScreenManager.registerFactory(RegistryHandler.BASIC_SOLAR_CONTAINER.get(), SolarScreen::new);
        ScreenManager.registerFactory(RegistryHandler.ADVANCED_SOLAR_CONTAINER.get(), SolarScreen::new);
        ScreenManager.registerFactory(RegistryHandler.ELITE_SOLAR_CONTAINER.get(), SolarScreen::new);
        ScreenManager.registerFactory(RegistryHandler.HELLBORN_SOLAR_CONTAINER.get(), SolarScreen::new);
        ScreenManager.registerFactory(RegistryHandler.QUANTUM_SOLAR_CONTAINER.get(), SolarScreen::new);
        ScreenManager.registerFactory(RegistryHandler.DRAGONFORGED_SOLAR_CONTAINER.get(), SolarScreen::new);
    }
}