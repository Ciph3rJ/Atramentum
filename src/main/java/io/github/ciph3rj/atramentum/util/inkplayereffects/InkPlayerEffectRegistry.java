package io.github.ciph3rj.atramentum.util.inkplayereffects;

import io.github.ciph3rj.atramentum.block.InkCauldronBlock;
import io.github.ciph3rj.atramentum.content.AtramentumBlocks;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InkPlayerEffectRegistry {
    public static Map<Block, InkPlayerEffect> INK_PLAYER_EFFECT_ASSIGNMENTS = new HashMap<>();

    public static void register(Block block, InkPlayerEffect inkPlayerEffect) {
        INK_PLAYER_EFFECT_ASSIGNMENTS.put(block, inkPlayerEffect);
    }

    public static void register(List<Block> blocks, InkPlayerEffect inkPlayerEffect) {
        for (Block block : blocks) INK_PLAYER_EFFECT_ASSIGNMENTS.put(block, inkPlayerEffect);
    }

    public static void register(InkPlayerEffect inkPlayerEffect, Block... blocks) {
        register(List.of(blocks), inkPlayerEffect);
    }

    public static InkPlayerEffect getFromBlock(Block block) {
        return INK_PLAYER_EFFECT_ASSIGNMENTS.get(block);
    }

    public static void loadAtramentumInkEffects() {
        register(AtramentumBlocks.GLOW_INK, AtramentumInkPlayerEffects.GLOW);

        register(AtramentumBlocks.INK, AtramentumInkPlayerEffects.BLACK);
        register(AtramentumBlocks.WHITE_INK, AtramentumInkPlayerEffects.WHITE);
        register(AtramentumBlocks.LIGHT_GRAY_INK, AtramentumInkPlayerEffects.LIGHT_GRAY);
        register(AtramentumBlocks.GRAY_INK, AtramentumInkPlayerEffects.GRAY);
        register(AtramentumBlocks.BROWN_INK, AtramentumInkPlayerEffects.BROWN);
        register(AtramentumBlocks.RED_INK, AtramentumInkPlayerEffects.RED);
        register(AtramentumBlocks.ORANGE_INK, AtramentumInkPlayerEffects.ORANGE);
        register(AtramentumBlocks.YELLOW_INK, AtramentumInkPlayerEffects.YELLOW);
        register(AtramentumBlocks.LIME_INK, AtramentumInkPlayerEffects.LIME);
        register(AtramentumBlocks.GREEN_INK, AtramentumInkPlayerEffects.GREEN);
        register(AtramentumBlocks.CYAN_INK, AtramentumInkPlayerEffects.CYAN);
        register(AtramentumBlocks.LIGHT_BLUE_INK, AtramentumInkPlayerEffects.LIGHT_BLUE);
        register(AtramentumBlocks.BLUE_INK, AtramentumInkPlayerEffects.BLUE);
        register(AtramentumBlocks.PURPLE_INK, AtramentumInkPlayerEffects.PURPLE);
        register(AtramentumBlocks.MAGENTA_INK, AtramentumInkPlayerEffects.MAGENTA);
        register(AtramentumBlocks.PINK_INK, AtramentumInkPlayerEffects.PINK);

        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.GLOW_INK_CAULDRON, AtramentumInkPlayerEffects.GLOW);
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.GLOW_INK_CAULDRON, AtramentumBlocks.DRIED_GLOW_INK);

        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.INK_CAULDRON, AtramentumInkPlayerEffects.BLACK);
        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.WHITE_INK_CAULDRON, AtramentumInkPlayerEffects.WHITE);
        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.LIGHT_GRAY_INK_CAULDRON, AtramentumInkPlayerEffects.LIGHT_GRAY);
        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.GRAY_INK_CAULDRON, AtramentumInkPlayerEffects.GRAY);
        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.BROWN_INK_CAULDRON, AtramentumInkPlayerEffects.BROWN);
        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.RED_INK_CAULDRON, AtramentumInkPlayerEffects.RED);
        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.ORANGE_INK_CAULDRON, AtramentumInkPlayerEffects.ORANGE);
        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.YELLOW_INK_CAULDRON, AtramentumInkPlayerEffects.YELLOW);
        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.LIME_INK_CAULDRON, AtramentumInkPlayerEffects.LIME);
        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.GREEN_INK_CAULDRON, AtramentumInkPlayerEffects.GREEN);
        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.CYAN_INK_CAULDRON, AtramentumInkPlayerEffects.CYAN);
        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.LIGHT_BLUE_INK_CAULDRON, AtramentumInkPlayerEffects.LIGHT_BLUE);
        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.BLUE_INK_CAULDRON, AtramentumInkPlayerEffects.BLUE);
        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.PURPLE_INK_CAULDRON, AtramentumInkPlayerEffects.PURPLE);
        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.MAGENTA_INK_CAULDRON, AtramentumInkPlayerEffects.MAGENTA);
        InkCauldronBlock.INK_EFFECTS.put(AtramentumBlocks.PINK_INK_CAULDRON, AtramentumInkPlayerEffects.PINK);

        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.INK_CAULDRON, AtramentumBlocks.DRIED_INK_FAMILY.driedInk());
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.WHITE_INK_CAULDRON, AtramentumBlocks.DRIED_WHITE_INK_FAMILY.driedInk());
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.LIGHT_GRAY_INK_CAULDRON, AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY.driedInk());
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.GRAY_INK_CAULDRON, AtramentumBlocks.DRIED_GRAY_INK_FAMILY.driedInk());
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.BROWN_INK_CAULDRON, AtramentumBlocks.DRIED_BROWN_INK_FAMILY.driedInk());
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.RED_INK_CAULDRON, AtramentumBlocks.DRIED_RED_INK_FAMILY.driedInk());
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.ORANGE_INK_CAULDRON, AtramentumBlocks.DRIED_ORANGE_INK_FAMILY.driedInk());
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.YELLOW_INK_CAULDRON, AtramentumBlocks.DRIED_YELLOW_INK_FAMILY.driedInk());
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.LIME_INK_CAULDRON, AtramentumBlocks.DRIED_LIME_INK_FAMILY.driedInk());
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.GREEN_INK_CAULDRON, AtramentumBlocks.DRIED_GREEN_INK_FAMILY.driedInk());
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.CYAN_INK_CAULDRON, AtramentumBlocks.DRIED_CYAN_INK_FAMILY.driedInk());
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.LIGHT_BLUE_INK_CAULDRON, AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY.driedInk());
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.BLUE_INK_CAULDRON, AtramentumBlocks.DRIED_BLUE_INK_FAMILY.driedInk());
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.PURPLE_INK_CAULDRON, AtramentumBlocks.DRIED_PURPLE_INK_FAMILY.driedInk());
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.MAGENTA_INK_CAULDRON, AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY.driedInk());
        InkCauldronBlock.DRIED_BLOCKS.put(AtramentumBlocks.PINK_INK_CAULDRON, AtramentumBlocks.DRIED_PINK_INK_FAMILY.driedInk());
    }
}
