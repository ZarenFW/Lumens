package com.Zaren.Lumens.network;

import com.Zaren.Lumens.Lumens;
import com.Zaren.Lumens.network.packet.UpdateLunar;
import com.Zaren.Lumens.network.packet.UpdateSolar;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

import java.util.Optional;

public class PacketHandler {
    private static final String PROTOCOL_VERSION = "1";
    // @formatter:off
    public static SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(Lumens.MOD_ID, "net"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals);
    // @formatter:on
    public static void init()
    {
        int id = 0;
        INSTANCE.registerMessage(id++, UpdateSolar.class, UpdateSolar::toBytes, UpdateSolar::new, UpdateSolar::handle, Optional.of(NetworkDirection.PLAY_TO_CLIENT));
        INSTANCE.registerMessage(id++, UpdateLunar.class, UpdateLunar::toBytes, UpdateLunar::new, UpdateLunar::handle, Optional.of(NetworkDirection.PLAY_TO_CLIENT));
    };
}


