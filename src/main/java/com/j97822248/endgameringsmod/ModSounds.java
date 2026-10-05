package com.j97822248.endgameringsmod;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public
class ModSounds {
    public static final SoundEvent AURA_FARMING_RING_ACTIVATE = SoundEvent.createVariableRangeEvent(new ResourceLocation(EndGameRingsMod.MOD_ID, "aura_farming_ring_activate"));
    public static final SoundEvent THERMOTIC_RING_FIRE = SoundEvent.createVariableRangeEvent(new ResourceLocation(EndGameRingsMod.MOD_ID, "thermotic_ring_fire"));

    public static void register() {
        Registry.register(Registry.SOUND_EVENT, new ResourceLocation(EndGameRingsMod.MOD_ID, "aura_farming_ring_activate"), AURA_FARMING_RING_ACTIVATE);
        Registry.register(Registry.SOUND_EVENT, new ResourceLocation(EndGameRingsMod.MOD_ID, "thermotic_ring_fire"), THERMOTIC_RING_FIRE);
    }
}
