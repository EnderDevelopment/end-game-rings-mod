package com.j97822248.endgameringsmod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public
class ModEntities {
    public static final EntityType<StandardOrbEntity> STANDARD_ORB = FabricEntityTypeBuilder.create(MobCategory.MISC, StandardOrbEntity::new)
    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build();
    public static final EntityType<HollowPurpleOrbEntity> HOLLOW_PURPLE_ORB = FabricEntityTypeBuilder.create(MobCategory.MISC, HollowPurpleOrbEntity::new)
    .dimensions(EntityDimensions.fixed(1.0f, 1.0f)).build();

    public static void register() {
        Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(EndGameRingsMod.MOD_ID, "standard_orb"), STANDARD_ORB);
        Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(EndGameRingsMod.MOD_ID, "hollow_purple_orb"), HOLLOW_PURPLE_ORB);
    }
}
