package com.j97822248.endgameringsmod;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;

public
class ModNetworking {
    public static final ResourceLocation RING_ACTIVATE_PACKET = new ResourceLocation(EndGameRingsMod.MOD_ID, "ring_activate");

    public static void register() {
        ServerPlayNetworking.registerGlobalReceiver(RING_ACTIVATE_PACKET, (server, player, handler, buf, responseSender) -> {
            FriendlyByteBuf packetBuf = PacketByteBufs.create();
            packetBuf.writeUuid(player.getUUID());
            ServerPlayNetworking.send(player, RING_ACTIVATE_PACKET, packetBuf);
        });
    }
}
