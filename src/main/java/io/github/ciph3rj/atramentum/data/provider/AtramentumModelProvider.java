package io.github.ciph3rj.atramentum.data.provider;

import io.github.ciph3rj.atramentum.content.AtramentumItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class AtramentumModelProvider extends FabricModelProvider {
    public AtramentumModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {}

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(AtramentumItems.INK_BUCKET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AtramentumItems.GLOW_INK_BUCKET, ModelTemplates.FLAT_ITEM);
    }
}
