package com.Zaren.Lumens;

import com.Zaren.Lumens.config.Config;
import com.Zaren.Lumens.util.RegistryHandler;
import com.Zaren.Lumens.util.proxy.IProxy;
import com.Zaren.Lumens.util.proxy.Proxy;
import com.Zaren.Lumens.util.proxy.ProxyClient;
import com.Zaren.Lumens.network.PacketHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("lumens")
public class Lumens {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "lumens";
    public static final String MOD_NAME = "Lumens";
    public static IProxy proxy = DistExecutor.runForDist(() -> ProxyClient::new, () -> Proxy::new);

    public Lumens() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
        RegistryHandler.init();
        PacketHandler.init();
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    public static final ItemGroup TAB = new ItemGroup("LumensTab") {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(RegistryHandler.SOLAR_DRAGONFORGED.get());
        }
            };
        }

