package io.github.ciph3rj.atramentum.data.provider;

import io.github.ciph3rj.atramentum.content.AtramentumFluids;
import io.github.ciph3rj.atramentum.util.AtramentumTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class AtramentumFluidTagProvider extends FabricTagProvider.FluidTagProvider {
    public AtramentumFluidTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        valueLookupBuilder(AtramentumTags.FluidTags.INK)
                .add(AtramentumFluids.INK)
                .add(AtramentumFluids.FLOWING_INK)
                .add(AtramentumFluids.GLOW_INK)
                .add(AtramentumFluids.GLOW_FLOWING_INK)
                .add(AtramentumFluids.WHITE_INK)
                .add(AtramentumFluids.WHITE_FLOWING_INK)
                .add(AtramentumFluids.LIGHT_GRAY_INK)
                .add(AtramentumFluids.LIGHT_GRAY_FLOWING_INK)
                .add(AtramentumFluids.GRAY_INK)
                .add(AtramentumFluids.GRAY_FLOWING_INK)
                .add(AtramentumFluids.BROWN_INK)
                .add(AtramentumFluids.BROWN_FLOWING_INK)
                .add(AtramentumFluids.RED_INK)
                .add(AtramentumFluids.RED_FLOWING_INK)
                .add(AtramentumFluids.ORANGE_INK)
                .add(AtramentumFluids.ORANGE_FLOWING_INK)
                .add(AtramentumFluids.YELLOW_INK)
                .add(AtramentumFluids.YELLOW_FLOWING_INK)
                .add(AtramentumFluids.LIME_INK)
                .add(AtramentumFluids.LIME_FLOWING_INK)
                .add(AtramentumFluids.GREEN_INK)
                .add(AtramentumFluids.GREEN_FLOWING_INK)
                .add(AtramentumFluids.CYAN_INK)
                .add(AtramentumFluids.CYAN_FLOWING_INK)
                .add(AtramentumFluids.LIGHT_BLUE_INK)
                .add(AtramentumFluids.LIGHT_BLUE_FLOWING_INK)
                .add(AtramentumFluids.BLUE_INK)
                .add(AtramentumFluids.BLUE_FLOWING_INK)
                .add(AtramentumFluids.PURPLE_INK)
                .add(AtramentumFluids.PURPLE_FLOWING_INK)
                .add(AtramentumFluids.MAGENTA_INK)
                .add(AtramentumFluids.MAGENTA_FLOWING_INK)
                .add(AtramentumFluids.PINK_INK)
                .add(AtramentumFluids.PINK_FLOWING_INK)
        ;
    }
}
