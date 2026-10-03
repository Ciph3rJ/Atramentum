package io.github.ciph3rj.atramentum.data.provider;

import io.github.ciph3rj.atramentum.util.AtramentumTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.entity.EntityType;

import java.util.concurrent.CompletableFuture;

public class AtramentumEntityTypeTagProvider extends FabricTagProvider.EntityTypeTagProvider {
    public AtramentumEntityTypeTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        valueLookupBuilder(AtramentumTags.EntityTypeTags.IMMUNE_TO_INKED)
                .add(EntityType.VEX)
                .add(EntityType.ARMOR_STAND)
                .add(EntityType.BLAZE)
                .add(EntityType.BREEZE)
                .add(EntityType.WITHER)
                .add(EntityType.ENDER_DRAGON)
        ;
    }
}
