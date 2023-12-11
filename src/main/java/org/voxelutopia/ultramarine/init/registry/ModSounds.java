package org.voxelutopia.ultramarine.init.registry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import org.voxelutopia.ultramarine.Ultramarine;

public class ModSounds {
    public static SoundEvent BAMBOO_WOOD_HIT;
    public static SoundEvent BAMBOO_WOOD_FALL;
    public static SoundEvent BAMBOO_WOOD_STEP;
    public static SoundEvent BAMBOO_WOOD_PLACE;
    public static SoundEvent BAMBOO_WOOD_BREAK;
    public static SoundEvent WOOD_HAMMER;
    public static SoundEvent WOODWORK;
    public static SoundEvent SACK_BREAK;
    public static SoundEvent SACK_PLACE;

    public static SoundType BAMBOO_WOOD;
    public static SoundType PORCELAIN;
    public static SoundType FLAX;

    public static void registerModSounds() {
        BAMBOO_WOOD_HIT = register("bamboo_wood_hit");
        BAMBOO_WOOD_FALL = register("bamboo_wood_fall");
        BAMBOO_WOOD_STEP = register("bamboo_wood_step");
        BAMBOO_WOOD_PLACE = register("bamboo_wood_place");
        BAMBOO_WOOD_BREAK = register("bamboo_wood_break");
        WOOD_HAMMER = register("wood_hammer");
        WOODWORK = register("woodwork");
        SACK_BREAK = register("sack_break");
        SACK_PLACE = register("sack_place");

        BAMBOO_WOOD = new SoundType(1, 1,
                BAMBOO_WOOD_BREAK, BAMBOO_WOOD_STEP, BAMBOO_WOOD_PLACE, BAMBOO_WOOD_HIT, BAMBOO_WOOD_FALL);
        PORCELAIN = new SoundType(1, 1,
                SoundEvents.GLASS_BREAK, SoundEvents.COPPER_STEP, SoundEvents.COPPER_PLACE, SoundEvents.COPPER_HIT, SoundEvents.COPPER_FALL);
        FLAX = new SoundType(0.35F, 1.2F,
                SACK_BREAK, SoundEvents.WOOL_STEP, SACK_PLACE, SoundEvents.WOOL_HIT, SoundEvents.WOOL_FALL);
    }


    private static SoundEvent register(String name) {
        return Registry.register(BuiltInRegistries.SOUND_EVENT, name, SoundEvent.createVariableRangeEvent(new ResourceLocation(Ultramarine.MOD_ID, name)));
    }

    private static SoundEvent register(String name, SoundEvent soundEvent) {
        return Registry.register(BuiltInRegistries.SOUND_EVENT, name, soundEvent);
    }

}
