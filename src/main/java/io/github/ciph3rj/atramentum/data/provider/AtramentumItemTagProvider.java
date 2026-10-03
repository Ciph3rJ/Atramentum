package io.github.ciph3rj.atramentum.data.provider;

import io.github.ciph3rj.atramentum.content.AtramentumItems;
import io.github.ciph3rj.atramentum.util.AtramentumTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class AtramentumItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public AtramentumItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        valueLookupBuilder(AtramentumTags.ItemTags.INK_BUCKETS)
                .add(AtramentumItems.INK_BUCKET)
                .add(AtramentumItems.GLOW_INK_BUCKET)
                .add(AtramentumItems.WHITE_INK_BUCKET)
                .add(AtramentumItems.LIGHT_GRAY_INK_BUCKET)
                .add(AtramentumItems.GRAY_INK_BUCKET)
                .add(AtramentumItems.BROWN_INK_BUCKET)
                .add(AtramentumItems.RED_INK_BUCKET)
                .add(AtramentumItems.ORANGE_INK_BUCKET)
                .add(AtramentumItems.YELLOW_INK_BUCKET)
                .add(AtramentumItems.LIME_INK_BUCKET)
                .add(AtramentumItems.GREEN_INK_BUCKET)
                .add(AtramentumItems.CYAN_INK_BUCKET)
                .add(AtramentumItems.LIGHT_BLUE_INK_BUCKET)
                .add(AtramentumItems.BLUE_INK_BUCKET)
                .add(AtramentumItems.PURPLE_INK_BUCKET)
                .add(AtramentumItems.MAGENTA_INK_BUCKET)
                .add(AtramentumItems.PINK_INK_BUCKET)
        ;

        valueLookupBuilder(AtramentumTags.ItemTags.COVERS_INK_FOOTSTEPS)
                .add(Items.LEATHER_BOOTS)
        ;
    }
}
