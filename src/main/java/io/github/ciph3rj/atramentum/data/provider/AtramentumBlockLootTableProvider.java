package io.github.ciph3rj.atramentum.data.provider;

import io.github.ciph3rj.atramentum.block.DriedInkBlockFamily;
import io.github.ciph3rj.atramentum.content.AtramentumBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class AtramentumBlockLootTableProvider extends FabricBlockLootTableProvider {
    public AtramentumBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        dropSelf(AtramentumBlocks.DRIED_GLOW_INK);
        dropSelf(AtramentumBlocks.DRIED_GLOW_INK_STAIRS);
        dropSelf(AtramentumBlocks.DRIED_GLOW_INK_WALL);
        dropSelf(AtramentumBlocks.DRIED_GLOW_INK_BRICKS);
        dropSelf(AtramentumBlocks.DRIED_GLOW_INK_BRICK_STAIRS);
        dropSelf(AtramentumBlocks.DRIED_GLOW_INK_BRICK_WALL);
        dropSelf(AtramentumBlocks.DRIED_GLOW_INK_TILES);
        dropSelf(AtramentumBlocks.DRIED_GLOW_INK_TILE_STAIRS);
        dropSelf(AtramentumBlocks.DRIED_GLOW_INK_TILE_WALL);

        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_INK_FAMILY);
        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_WHITE_INK_FAMILY);
        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY);
        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_GRAY_INK_FAMILY);
        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_BROWN_INK_FAMILY);
        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_RED_INK_FAMILY);
        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_ORANGE_INK_FAMILY);
        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_YELLOW_INK_FAMILY);
        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_LIME_INK_FAMILY);
        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_GREEN_INK_FAMILY);
        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_CYAN_INK_FAMILY);
        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY);
        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_BLUE_INK_FAMILY);
        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_PURPLE_INK_FAMILY);
        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY);
        DriedInkBlockFamily.generateBlockLootTables(this, AtramentumBlocks.DRIED_PINK_INK_FAMILY);
    }
}
