package io.github.ciph3rj.atramentum.util;

import io.github.ciph3rj.atramentum.Atramentum;
import io.github.ciph3rj.cipherlib.helper.RegistryHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class AtramentumTags {
    public static class BlockTags {
        public static final TagKey<Block> INK = RegistryHelper.registerBlockTags("ink");

        public static final TagKey<Block> DIRED_INK = RegistryHelper.registerBlockTags("dried_ink");
        public static final TagKey<Block> CAULDRON_HEAT_SOURCES = RegistryHelper.registerBlockTags("cauldron_heat_sources");

        public static void init() {}
    }

    public static class ItemTags {
        public static final TagKey<Item> INK_BUCKETS = RegistryHelper.registerItemTags("ink_buckets");

        public static final TagKey<Item> COVERS_INK_FOOTSTEPS = RegistryHelper.registerItemTags("covers_ink_footsteps");

        public static void init() {}
    }

    public static class EntityTypeTags {
        public static final TagKey<EntityType<?>> IMMUNE_TO_INKED = TagKey.create(Registries.ENTITY_TYPE, Atramentum.id("immune_to_inked"));

        public static void init() {}
    }

    public static class FluidTags {
        public static final TagKey<Fluid> INK = register("ink");

        private static TagKey<Fluid> register(String id) {
            return TagKey.create(Registries.FLUID, Atramentum.id(id));
        }

        public static void init() {}
    }
}
