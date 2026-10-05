package com.j97822248.endgameringsmod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public
class ModItems {
    public static final Item AURA_FARMING_RING = new Item(new FabricItemSettings().group(EndGameRingsMod.END_GAME_RINGS_TAB));
    public static final Item THERMOTIC_RING = new Item(new FabricItemSettings().group(EndGameRingsMod.END_GAME_RINGS_TAB));

    public static void register() {
        Registry.register(Registry.ITEM, new ResourceLocation(EndGameRingsMod.MOD_ID, "aura_farming_ring"), AURA_FARMING_RING);
        Registry.register(Registry.ITEM, new ResourceLocation(EndGameRingsMod.MOD_ID, "thermotic_ring"), THERMOTIC_RING);
    }
}
