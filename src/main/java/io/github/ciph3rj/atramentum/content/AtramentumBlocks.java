package io.github.ciph3rj.atramentum.content;

import io.github.ciph3rj.atramentum.Atramentum;
import io.github.ciph3rj.atramentum.block.DriedInkBlockFamily;
import io.github.ciph3rj.atramentum.block.InkCauldronBlock;
import io.github.ciph3rj.atramentum.util.AtramentumCauldronInteraction;
import io.github.ciph3rj.cipherlib.helper.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public interface AtramentumBlocks {
    Block INK = RegistryHelper.registerBlock("ink", properties -> new LiquidBlock(AtramentumFluids.INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block GLOW_INK = RegistryHelper.registerBlock("glow_ink", properties -> new LiquidBlock(AtramentumFluids.GLOW_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block WHITE_INK = RegistryHelper.registerBlock("white_ink", properties -> new LiquidBlock(AtramentumFluids.WHITE_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block LIGHT_GRAY_INK = RegistryHelper.registerBlock("light_gray_ink", properties -> new LiquidBlock(AtramentumFluids.LIGHT_GRAY_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block GRAY_INK = RegistryHelper.registerBlock("gray_ink", properties -> new LiquidBlock(AtramentumFluids.GRAY_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block BROWN_INK = RegistryHelper.registerBlock("brown_ink", properties -> new LiquidBlock(AtramentumFluids.BROWN_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block RED_INK = RegistryHelper.registerBlock("red_ink", properties -> new LiquidBlock(AtramentumFluids.RED_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block ORANGE_INK = RegistryHelper.registerBlock("orange_ink", properties -> new LiquidBlock(AtramentumFluids.ORANGE_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block YELLOW_INK = RegistryHelper.registerBlock("yellow_ink", properties -> new LiquidBlock(AtramentumFluids.YELLOW_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block LIME_INK = RegistryHelper.registerBlock("lime_ink", properties -> new LiquidBlock(AtramentumFluids.LIME_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block GREEN_INK = RegistryHelper.registerBlock("green_ink", properties -> new LiquidBlock(AtramentumFluids.GREEN_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block CYAN_INK = RegistryHelper.registerBlock("cyan_ink", properties -> new LiquidBlock(AtramentumFluids.CYAN_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block LIGHT_BLUE_INK = RegistryHelper.registerBlock("light_blue_ink", properties -> new LiquidBlock(AtramentumFluids.LIGHT_BLUE_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block BLUE_INK = RegistryHelper.registerBlock("blue_ink", properties -> new LiquidBlock(AtramentumFluids.BLUE_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block PURPLE_INK = RegistryHelper.registerBlock("purple_ink", properties -> new LiquidBlock(AtramentumFluids.PURPLE_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block MAGENTA_INK = RegistryHelper.registerBlock("magenta_ink", properties -> new LiquidBlock(AtramentumFluids.MAGENTA_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));
    Block PINK_INK = RegistryHelper.registerBlock("pink_ink", properties -> new LiquidBlock(AtramentumFluids.PINK_INK, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).replaceable().noCollision().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY));

    Block INK_CAULDRON = RegistryHelper.registerBlock("ink_cauldron", properties -> new InkCauldronBlock(properties, AtramentumCauldronInteraction.inkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block GLOW_INK_CAULDRON = RegistryHelper.registerBlock("glow_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.glowInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block WHITE_INK_CAULDRON = RegistryHelper.registerBlock("white_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.whiteInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block LIGHT_GRAY_INK_CAULDRON = RegistryHelper.registerBlock("light_gray_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.lightGrayInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block GRAY_INK_CAULDRON = RegistryHelper.registerBlock("gray_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.grayInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block BROWN_INK_CAULDRON = RegistryHelper.registerBlock("brown_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.brownInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block RED_INK_CAULDRON = RegistryHelper.registerBlock("red_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.redInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block ORANGE_INK_CAULDRON = RegistryHelper.registerBlock("orange_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.orangeInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block YELLOW_INK_CAULDRON = RegistryHelper.registerBlock("yellow_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.yellowInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block LIME_INK_CAULDRON = RegistryHelper.registerBlock("lime_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.limeInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block GREEN_INK_CAULDRON = RegistryHelper.registerBlock("green_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.greenInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block CYAN_INK_CAULDRON = RegistryHelper.registerBlock("cyan_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.cyanInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block LIGHT_BLUE_INK_CAULDRON = RegistryHelper.registerBlock("light_blue_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.lightBlueInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block BLUE_INK_CAULDRON = RegistryHelper.registerBlock("blue_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.blueInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block PURPLE_INK_CAULDRON = RegistryHelper.registerBlock("purple_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.purpleInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block MAGENTA_INK_CAULDRON = RegistryHelper.registerBlock("magenta_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.magentaInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));
    Block PINK_INK_CAULDRON = RegistryHelper.registerBlock("pink_ink_cauldron", settings -> new InkCauldronBlock(settings, AtramentumCauldronInteraction.pinkInkBehavior), BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON));

    Block DRIED_GLOW_INK = RegistryHelper.registerBlockWithItem("dried_glow_ink", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.COLOR_CYAN));
    Block DRIED_GLOW_INK_STAIRS = RegistryHelper.registerBlockWithItem("dried_glow_ink_stairs", properties -> new StairBlock(DRIED_GLOW_INK.defaultBlockState(), properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).mapColor(MapColor.COLOR_CYAN));
    Block DRIED_GLOW_INK_SLAB = RegistryHelper.registerBlockWithItem("dried_glow_ink_slab", SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).mapColor(MapColor.COLOR_CYAN));
    Block DRIED_GLOW_INK_WALL = RegistryHelper.registerBlockWithItem("dried_glow_ink_wall", WallBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).mapColor(MapColor.COLOR_CYAN));
    Block DRIED_GLOW_INK_BRICKS = RegistryHelper.registerBlockWithItem("dried_glow_ink_bricks", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_CYAN));
    Block DRIED_GLOW_INK_BRICK_STAIRS = RegistryHelper.registerBlockWithItem("dried_glow_ink_brick_stairs", properties -> new StairBlock(DRIED_GLOW_INK_BRICKS.defaultBlockState(), properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.COLOR_CYAN));
    Block DRIED_GLOW_INK_BRICK_SLAB = RegistryHelper.registerBlockWithItem("dried_glow_ink_brick_slab", SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.COLOR_CYAN));
    Block DRIED_GLOW_INK_BRICK_WALL = RegistryHelper.registerBlockWithItem("dried_glow_ink_brick_wall", WallBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).mapColor(MapColor.COLOR_CYAN));
    Block DRIED_GLOW_INK_TILES = RegistryHelper.registerBlockWithItem("dried_glow_ink_tiles", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_CYAN));
    Block DRIED_GLOW_INK_TILE_STAIRS = RegistryHelper.registerBlockWithItem("dried_glow_ink_tile_stairs", properties -> new StairBlock(DRIED_GLOW_INK_BRICKS.defaultBlockState(), properties),
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.COLOR_CYAN));
    Block DRIED_GLOW_INK_TILE_SLAB = RegistryHelper.registerBlockWithItem("dried_glow_ink_tile_slab", SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.COLOR_CYAN));
    Block DRIED_GLOW_INK_TILE_WALL = RegistryHelper.registerBlockWithItem("dried_glow_ink_tile_wall", WallBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).mapColor(MapColor.COLOR_CYAN));


    DriedInkBlockFamily DRIED_WHITE_INK_FAMILY = DriedInkBlockFamily.create("white", DyeColor.WHITE);
    DriedInkBlockFamily DRIED_LIGHT_GRAY_INK_FAMILY = DriedInkBlockFamily.create("light_gray", DyeColor.LIGHT_GRAY);
    DriedInkBlockFamily DRIED_GRAY_INK_FAMILY = DriedInkBlockFamily.create("gray", DyeColor.GRAY);
    DriedInkBlockFamily DRIED_INK_FAMILY = DriedInkBlockFamily.create("black", DyeColor.BLACK);
    DriedInkBlockFamily DRIED_BROWN_INK_FAMILY = DriedInkBlockFamily.create("brown", DyeColor.BROWN);
    DriedInkBlockFamily DRIED_RED_INK_FAMILY = DriedInkBlockFamily.create("red", DyeColor.RED);
    DriedInkBlockFamily DRIED_ORANGE_INK_FAMILY = DriedInkBlockFamily.create("orange", DyeColor.ORANGE);
    DriedInkBlockFamily DRIED_YELLOW_INK_FAMILY = DriedInkBlockFamily.create("yellow", DyeColor.YELLOW);
    DriedInkBlockFamily DRIED_LIME_INK_FAMILY = DriedInkBlockFamily.create("lime", DyeColor.LIME);
    DriedInkBlockFamily DRIED_GREEN_INK_FAMILY = DriedInkBlockFamily.create("green", DyeColor.GREEN);
    DriedInkBlockFamily DRIED_CYAN_INK_FAMILY = DriedInkBlockFamily.create("cyan", DyeColor.CYAN);
    DriedInkBlockFamily DRIED_LIGHT_BLUE_INK_FAMILY = DriedInkBlockFamily.create("light_blue", DyeColor.LIGHT_BLUE);
    DriedInkBlockFamily DRIED_BLUE_INK_FAMILY = DriedInkBlockFamily.create("blue", DyeColor.BLUE);
    DriedInkBlockFamily DRIED_PURPLE_INK_FAMILY = DriedInkBlockFamily.create("purple", DyeColor.PURPLE);
    DriedInkBlockFamily DRIED_MAGENTA_INK_FAMILY = DriedInkBlockFamily.create("magenta", DyeColor.MAGENTA);
    DriedInkBlockFamily DRIED_PINK_INK_FAMILY = DriedInkBlockFamily.create("pink", DyeColor.PINK);

    static void init() {
        DriedInkBlockFamily.addToCreativeModeTab(DRIED_INK_FAMILY);

        ItemGroupEvents.modifyEntriesEvent(ResourceKey.create(Registries.CREATIVE_MODE_TAB, Atramentum.id("atramentum"))).register(entries -> {
            entries.accept(DRIED_GLOW_INK);
            entries.accept(DRIED_GLOW_INK_STAIRS);
            entries.accept(DRIED_GLOW_INK_SLAB);
            entries.accept(DRIED_GLOW_INK_WALL);
            entries.accept(DRIED_GLOW_INK_BRICKS);
            entries.accept(DRIED_GLOW_INK_BRICK_STAIRS);
            entries.accept(DRIED_GLOW_INK_BRICK_SLAB);
            entries.accept(DRIED_GLOW_INK_BRICK_WALL);
            entries.accept(DRIED_GLOW_INK_TILES);
            entries.accept(DRIED_GLOW_INK_TILE_STAIRS);
            entries.accept(DRIED_GLOW_INK_TILE_SLAB);
            entries.accept(DRIED_GLOW_INK_TILE_WALL);
        });

        DriedInkBlockFamily.addToCreativeModeTab(DRIED_WHITE_INK_FAMILY);
        DriedInkBlockFamily.addToCreativeModeTab(DRIED_LIGHT_GRAY_INK_FAMILY);
        DriedInkBlockFamily.addToCreativeModeTab(DRIED_GRAY_INK_FAMILY);
        DriedInkBlockFamily.addToCreativeModeTab(DRIED_BROWN_INK_FAMILY);
        DriedInkBlockFamily.addToCreativeModeTab(DRIED_RED_INK_FAMILY);
        DriedInkBlockFamily.addToCreativeModeTab(DRIED_ORANGE_INK_FAMILY);
        DriedInkBlockFamily.addToCreativeModeTab(DRIED_YELLOW_INK_FAMILY);
        DriedInkBlockFamily.addToCreativeModeTab(DRIED_LIME_INK_FAMILY);
        DriedInkBlockFamily.addToCreativeModeTab(DRIED_GREEN_INK_FAMILY);
        DriedInkBlockFamily.addToCreativeModeTab(DRIED_CYAN_INK_FAMILY);
        DriedInkBlockFamily.addToCreativeModeTab(DRIED_LIGHT_BLUE_INK_FAMILY);
        DriedInkBlockFamily.addToCreativeModeTab(DRIED_BLUE_INK_FAMILY);
        DriedInkBlockFamily.addToCreativeModeTab(DRIED_PURPLE_INK_FAMILY);
        DriedInkBlockFamily.addToCreativeModeTab(DRIED_MAGENTA_INK_FAMILY);
        DriedInkBlockFamily.addToCreativeModeTab(DRIED_PINK_INK_FAMILY);
    }
}
