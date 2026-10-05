package com.j97822248.endgameringsmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public
class EndGameRingsMod implements ModInitializer {
    public static final String MOD_ID = "endgameringsmod";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static final CreativeModeTab END_GAME_RINGS_TAB = FabricItemGroupBuilder.build(
    new ResourceLocation(MOD_ID, "end_game_rings_tab"),
    () -> new ItemStack(ModItems.AURA_FARMING_RING.get()));

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing End Game Rings Mod");
        ModItems.register();
        ModEntities.register();
        ModSounds.register();
    }
}
