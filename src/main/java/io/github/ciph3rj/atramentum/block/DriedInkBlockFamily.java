package io.github.ciph3rj.atramentum.block;

import io.github.ciph3rj.atramentum.Atramentum;
import io.github.ciph3rj.cipherlib.helper.CipherLibRecipeGenerator;
import io.github.ciph3rj.cipherlib.helper.ColorMapHelper;
import io.github.ciph3rj.cipherlib.helper.RegistryHelper;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

public record DriedInkBlockFamily(Block driedInk, Block driedInkStairs, Block driedInkSlab, Block driedInkWall, Block driedInkBricks, Block driedInkBrickStairs, Block driedInkBrickSlab,
                                  Block driedInkBrickWall, Block driedInkTiles, Block driedInkTileStairs, Block driedInkTileSlab, Block driedInkTileWall) {
    public static DriedInkBlockFamily create(String color, DyeColor dyeColor) {
        Block DRIED_INK = RegistryHelper.registerBlockWithItem("dried_" + color + "_ink", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(dyeColor));
        Block DRIED_INK_STAIRS = RegistryHelper.registerBlockWithItem("dried_" + color + "_ink_stairs", properties -> new StairBlock(DRIED_INK.defaultBlockState(), properties),
                BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).mapColor(dyeColor));
        Block DRIED_INK_SLAB = RegistryHelper.registerBlockWithItem("dried_" + color + "_ink_slab", SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).mapColor(dyeColor));
        Block DRIED_INK_WALL = RegistryHelper.registerBlockWithItem("dried_" + color + "_ink_wall", WallBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).mapColor(dyeColor));
        Block DRIED_INK_BRICKS = RegistryHelper.registerBlockWithItem("dried_" + color + "_ink_bricks", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(dyeColor));
        Block DRIED_INK_BRICK_STAIRS = RegistryHelper.registerBlockWithItem("dried_" + color + "_ink_brick_stairs", properties -> new StairBlock(DRIED_INK_BRICKS.defaultBlockState(), properties),
                BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS).mapColor(dyeColor));
        Block DRIED_INK_BRICK_SLAB = RegistryHelper.registerBlockWithItem("dried_" + color + "_ink_brick_slab", SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB).mapColor(dyeColor));
        Block DRIED_INK_BRICK_WALL = RegistryHelper.registerBlockWithItem("dried_" + color + "_ink_brick_wall", WallBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).mapColor(dyeColor));
        Block DRIED_INK_TILES = RegistryHelper.registerBlockWithItem("dried_" + color + "_ink_tiles", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(dyeColor));
        Block DRIED_INK_TILE_STAIRS = RegistryHelper.registerBlockWithItem("dried_" + color + "_ink_tile_stairs", properties -> new StairBlock(DRIED_INK_TILES.defaultBlockState(), properties),
                BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS).mapColor(dyeColor));
        Block DRIED_INK_TILE_SLAB = RegistryHelper.registerBlockWithItem("dried_" + color + "_ink_tile_slab", SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB).mapColor(dyeColor));
        Block DRIED_INK_TILE_WALL = RegistryHelper.registerBlockWithItem("dried_" + color + "_ink_tile_wall", WallBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).mapColor(dyeColor));
        return new DriedInkBlockFamily(DRIED_INK, DRIED_INK_STAIRS, DRIED_INK_SLAB, DRIED_INK_WALL, DRIED_INK_BRICKS, DRIED_INK_BRICK_STAIRS, DRIED_INK_BRICK_SLAB, DRIED_INK_BRICK_WALL, DRIED_INK_TILES,
                DRIED_INK_TILE_STAIRS, DRIED_INK_TILE_SLAB, DRIED_INK_TILE_WALL);
    }

    public static void addToCreativeModeTab(DriedInkBlockFamily family) {
        ItemGroupEvents.modifyEntriesEvent(ResourceKey.create(Registries.CREATIVE_MODE_TAB, Atramentum.id("atramentum"))).register(entries -> {
            entries.accept(family.driedInk);
            entries.accept(family.driedInkStairs);
            entries.accept(family.driedInkSlab);
            entries.accept(family.driedInkWall);
            entries.accept(family.driedInkBricks);
            entries.accept(family.driedInkBrickStairs);
            entries.accept(family.driedInkBrickSlab);
            entries.accept(family.driedInkBrickWall);
            entries.accept(family.driedInkTiles);
            entries.accept(family.driedInkTileStairs);
            entries.accept(family.driedInkTileSlab);
            entries.accept(family.driedInkTileWall);
        });
    }

    public static void generateBlockLootTables(FabricBlockLootTableProvider provider, DriedInkBlockFamily family) {
        provider.dropSelf(family.driedInk);
        provider.dropSelf(family.driedInkStairs);
        provider.dropSelf(family.driedInkWall);
        provider.dropSelf(family.driedInkBricks);
        provider.dropSelf(family.driedInkBrickStairs);
        provider.dropSelf(family.driedInkBrickWall);
        provider.dropSelf(family.driedInkTiles);
        provider.dropSelf(family.driedInkTileStairs);
        provider.dropSelf(family.driedInkTileWall);
    }

    public static void generateRecipes(CipherLibRecipeGenerator provider, DriedInkBlockFamily family, RecipeOutput output) {
        provider.offerStairsRecipeWithStonecutting(family.driedInk, family.driedInkStairs);
        provider.offerSlabRecipeWithStonecutting(family.driedInk, family.driedInkSlab);
        provider.offerWallRecipeWithStonecutting(family.driedInk, family.driedInkWall);
        provider.shaped(RecipeCategory.BUILDING_BLOCKS, family.driedInkBricks, 4).define('#', family.driedInk).pattern("##").pattern("##")
                .unlockedBy(RecipeProvider.getHasName(family.driedInkBricks), RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(provider.items, family.driedInk))).save(output);
        provider.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, family.driedInkBricks, family.driedInk);
        provider.offerStairsRecipeWithStonecutting(family.driedInk, family.driedInkBrickStairs);
        provider.offerSlabRecipeWithStonecutting(family.driedInk, family.driedInkBrickSlab);
        provider.offerWallRecipeWithStonecutting(family.driedInk, family.driedInkBrickWall);
        provider.shaped(RecipeCategory.BUILDING_BLOCKS, family.driedInkTiles, 4).define('#', family.driedInkBricks).pattern("##").pattern("##")
                .unlockedBy(RecipeProvider.getHasName(family.driedInkTiles), RecipeProvider.inventoryTrigger(ItemPredicate.Builder.item().of(provider.items, family.driedInkBricks))).save(output);
        provider.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, family.driedInkTiles, family.driedInkBricks);
        provider.offerStairsRecipeWithStonecutting(family.driedInkBricks, family.driedInkTileStairs);
        provider.offerSlabRecipeWithStonecutting(family.driedInkBricks, family.driedInkTileSlab);
        provider.offerWallRecipeWithStonecutting(family.driedInkBricks, family.driedInkTileWall);
    }

    public static void assignColors(DriedInkBlockFamily family, int color) {
        ColorMapHelper.assignBlockColor(family.driedInk, color);
        ColorMapHelper.assignBlockColor(family.driedInkStairs, color);
        ColorMapHelper.assignBlockColor(family.driedInkSlab, color);
        ColorMapHelper.assignBlockColor(family.driedInkWall, color);
        ColorMapHelper.assignBlockColor(family.driedInkBricks, color);
        ColorMapHelper.assignBlockColor(family.driedInkBrickStairs, color);
        ColorMapHelper.assignBlockColor(family.driedInkBrickSlab, color);
        ColorMapHelper.assignBlockColor(family.driedInkBrickWall, color);
        ColorMapHelper.assignBlockColor(family.driedInkTiles, color);
        ColorMapHelper.assignBlockColor(family.driedInkTileStairs, color);
        ColorMapHelper.assignBlockColor(family.driedInkTileSlab, color);
        ColorMapHelper.assignBlockColor(family.driedInkTileWall, color);
    }
}
