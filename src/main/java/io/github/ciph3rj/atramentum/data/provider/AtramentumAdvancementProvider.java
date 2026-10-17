package io.github.ciph3rj.atramentum.data.provider;

import io.github.ciph3rj.atramentum.Atramentum;
import io.github.ciph3rj.atramentum.content.AtramentumBlocks;
import io.github.ciph3rj.atramentum.content.AtramentumItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class AtramentumAdvancementProvider extends FabricAdvancementProvider {
    public AtramentumAdvancementProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateAdvancement(HolderLookup.Provider registryLookup, Consumer<AdvancementHolder> consumer) {
        AdvancementHolder atramentum = new Advancement.Builder()
                .display(
                        AtramentumItems.INK_BUCKET,
                        Component.translatable("advancement.atramentum.root.title"),
                        Component.translatable("advancement.atramentum.root.desc"),
                        Atramentum.id("gui/advancements/backgrounds/atramentum"),
                        AdvancementType.TASK,
                        false,
                        false,
                        false
                )
                .addCriterion("root", InventoryChangeTrigger.TriggerInstance.hasItems(AtramentumItems.INK_BUCKET))
                .save(consumer, ":root");

        AdvancementHolder whyIsMyMilkBlack = new Advancement.Builder()
                .parent(atramentum)
                .display(
                        AtramentumItems.INK_BUCKET,
                        Component.translatable("advancement.atramentum.why_is_my_milk_black.title"),
                        Component.translatable("advancement.atramentum.why_is_my_milk_black.desc"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("milked_squid", InventoryChangeTrigger.TriggerInstance.hasItems(AtramentumItems.INK_BUCKET))
                .save(consumer,  Atramentum.MOD_ID + ":milked_squid");

        AdvancementHolder nowItsGlowing = new Advancement.Builder()
                .parent(whyIsMyMilkBlack)
                .display(
                        AtramentumItems.GLOW_INK_BUCKET,
                        Component.translatable("advancement.atramentum.now_its_glowing.title"),
                        Component.translatable("advancement.atramentum.now_its_glowing.desc"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("milked_glow_squid", InventoryChangeTrigger.TriggerInstance.hasItems(AtramentumItems.GLOW_INK_BUCKET))
                .save(consumer,  Atramentum.MOD_ID + ":milked_glow_squid");

        AdvancementHolder worldOfInk = new Advancement.Builder()
                .parent(whyIsMyMilkBlack)
                .display(
                        AtramentumBlocks.DRIED_INK_FAMILY.driedInkTiles(),
                        Component.translatable("advancement.atramentum.world_of_ink.title"),
                        Component.translatable("advancement.atramentum.world_of_ink.desc"),
                        null,
                        AdvancementType.CHALLENGE,
                        true,
                        true,
                        false
                )
                .addCriterion("got_buckets", InventoryChangeTrigger.TriggerInstance.hasItems(
                        AtramentumItems.INK_BUCKET,
                        AtramentumItems.GLOW_INK_BUCKET,
                        AtramentumItems.WHITE_INK_BUCKET,
                        AtramentumItems.LIGHT_GRAY_INK_BUCKET,
                        AtramentumItems.GRAY_INK_BUCKET,
                        AtramentumItems.BROWN_INK_BUCKET,
                        AtramentumItems.RED_INK_BUCKET,
                        AtramentumItems.ORANGE_INK_BUCKET,
                        AtramentumItems.YELLOW_INK_BUCKET,
                        AtramentumItems.LIME_INK_BUCKET,
                        AtramentumItems.GREEN_INK_BUCKET,
                        AtramentumItems.CYAN_INK_BUCKET,
                        AtramentumItems.LIGHT_BLUE_INK_BUCKET,
                        AtramentumItems.BLUE_INK_BUCKET,
                        AtramentumItems.PURPLE_INK_BUCKET,
                        AtramentumItems.MAGENTA_INK_BUCKET,
                        AtramentumItems.PINK_INK_BUCKET
                ))/*
                .addCriterion("got_dried_glow_ink", InventoryChangeTrigger.TriggerInstance.hasItems(
                        AtramentumBlocks.DRIED_GLOW_INK,
                        AtramentumBlocks.DRIED_GLOW_INK_STAIRS,
                        AtramentumBlocks.DRIED_GLOW_INK_SLAB,
                        AtramentumBlocks.DRIED_GLOW_INK_WALL,
                        AtramentumBlocks.DRIED_GLOW_INK_BRICKS,
                        AtramentumBlocks.DRIED_GLOW_INK_BRICK_STAIRS,
                        AtramentumBlocks.DRIED_GLOW_INK_BRICK_SLAB,
                        AtramentumBlocks.DRIED_GLOW_INK_BRICK_WALL,
                        AtramentumBlocks.DRIED_GLOW_INK_TILES,
                        AtramentumBlocks.DRIED_GLOW_INK_TILE_STAIRS,
                        AtramentumBlocks.DRIED_GLOW_INK_TILE_SLAB,
                        AtramentumBlocks.DRIED_GLOW_INK_TILE_WALL
                ))
                .addCriterion("got_dried_ink", InventoryChangeTrigger.TriggerInstance.hasItems(
                        AtramentumBlocks.DRIED_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_INK_FAMILY.driedInkTileWall()
                ))
                .addCriterion("got_dried_white_ink", InventoryChangeTrigger.TriggerInstance.hasItems(
                        AtramentumBlocks.DRIED_WHITE_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_WHITE_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_WHITE_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_WHITE_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_WHITE_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_WHITE_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_WHITE_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_WHITE_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_WHITE_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_WHITE_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_WHITE_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_WHITE_INK_FAMILY.driedInkTileWall()
                ))
                .addCriterion("got_dried_grays_ink", InventoryChangeTrigger.TriggerInstance.hasItems(
                        AtramentumBlocks.DRIED_GRAY_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_GRAY_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_GRAY_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_GRAY_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_GRAY_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_GRAY_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_GRAY_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_GRAY_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_GRAY_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_GRAY_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_GRAY_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_GRAY_INK_FAMILY.driedInkTileWall(),
                        AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY.driedInkTileWall()
                ))
                .addCriterion("got_dried_fall_color_ink", InventoryChangeTrigger.TriggerInstance.hasItems(
                        AtramentumBlocks.DRIED_BROWN_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_BROWN_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_BROWN_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_BROWN_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_BROWN_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_BROWN_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_BROWN_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_BROWN_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_BROWN_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_BROWN_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_BROWN_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_BROWN_INK_FAMILY.driedInkTileWall(),
                        AtramentumBlocks.DRIED_RED_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_RED_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_RED_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_RED_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_RED_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_RED_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_RED_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_RED_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_RED_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_RED_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_RED_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_RED_INK_FAMILY.driedInkTileWall(),
                        AtramentumBlocks.DRIED_ORANGE_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_ORANGE_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_ORANGE_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_ORANGE_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_ORANGE_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_ORANGE_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_ORANGE_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_ORANGE_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_ORANGE_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_ORANGE_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_ORANGE_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_ORANGE_INK_FAMILY.driedInkTileWall(),
                        AtramentumBlocks.DRIED_YELLOW_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_YELLOW_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_YELLOW_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_YELLOW_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_YELLOW_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_YELLOW_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_YELLOW_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_YELLOW_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_YELLOW_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_YELLOW_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_YELLOW_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_YELLOW_INK_FAMILY.driedInkTileWall()
                ))
                .addCriterion("got_dried_greens_ink", InventoryChangeTrigger.TriggerInstance.hasItems(
                        AtramentumBlocks.DRIED_LIME_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_LIME_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_LIME_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_LIME_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_LIME_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_LIME_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_LIME_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_LIME_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_LIME_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_LIME_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_LIME_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_LIME_INK_FAMILY.driedInkTileWall(),
                        AtramentumBlocks.DRIED_GREEN_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_GREEN_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_GREEN_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_GREEN_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_GREEN_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_GREEN_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_GREEN_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_GREEN_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_GREEN_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_GREEN_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_GREEN_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_GREEN_INK_FAMILY.driedInkTileWall()
                ))
                .addCriterion("got_dried_blues_ink", InventoryChangeTrigger.TriggerInstance.hasItems(
                        AtramentumBlocks.DRIED_CYAN_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_CYAN_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_CYAN_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_CYAN_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_CYAN_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_CYAN_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_CYAN_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_CYAN_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_CYAN_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_CYAN_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_CYAN_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_CYAN_INK_FAMILY.driedInkTileWall(),
                        AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY.driedInkTileWall(),
                        AtramentumBlocks.DRIED_BLUE_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_BLUE_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_BLUE_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_BLUE_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_BLUE_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_BLUE_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_BLUE_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_BLUE_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_BLUE_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_BLUE_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_BLUE_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_BLUE_INK_FAMILY.driedInkTileWall()
                ))
                .addCriterion("got_dried_purples_ink", InventoryChangeTrigger.TriggerInstance.hasItems(
                        AtramentumBlocks.DRIED_PURPLE_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_PURPLE_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_PURPLE_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_PURPLE_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_PURPLE_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_PURPLE_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_PURPLE_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_PURPLE_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_PURPLE_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_PURPLE_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_PURPLE_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_PURPLE_INK_FAMILY.driedInkTileWall(),
                        AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY.driedInkTileWall(),
                        AtramentumBlocks.DRIED_PINK_INK_FAMILY.driedInk(),
                        AtramentumBlocks.DRIED_PINK_INK_FAMILY.driedInkStairs(),
                        AtramentumBlocks.DRIED_PINK_INK_FAMILY.driedInkSlab(),
                        AtramentumBlocks.DRIED_PINK_INK_FAMILY.driedInkWall(),
                        AtramentumBlocks.DRIED_PINK_INK_FAMILY.driedInkBricks(),
                        AtramentumBlocks.DRIED_PINK_INK_FAMILY.driedInkBrickStairs(),
                        AtramentumBlocks.DRIED_PINK_INK_FAMILY.driedInkBrickSlab(),
                        AtramentumBlocks.DRIED_PINK_INK_FAMILY.driedInkBrickWall(),
                        AtramentumBlocks.DRIED_PINK_INK_FAMILY.driedInkTiles(),
                        AtramentumBlocks.DRIED_PINK_INK_FAMILY.driedInkTileStairs(),
                        AtramentumBlocks.DRIED_PINK_INK_FAMILY.driedInkTileSlab(),
                        AtramentumBlocks.DRIED_PINK_INK_FAMILY.driedInkTileWall()
                ))*/
                .save(consumer,  Atramentum.MOD_ID + ":got_every_addition");
    }
}
