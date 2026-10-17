package io.github.ciph3rj.atramentum.util.cauldron;

import io.github.ciph3rj.atramentum.content.AtramentumBlocks;
import io.github.ciph3rj.atramentum.util.AtramentumTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Map;

public class ColorDyingUtil {
    public static Map<Block, Item> woolMap = new HashMap<>();
    public static Map<Block, Item> carpetMap = new HashMap<>();
    public static Map<Block, Item> terracottaMap = new HashMap<>();
    public static Map<Block, Item> concreteMap = new HashMap<>();
    public static Map<Block, Item> concretePowderMap = new HashMap<>();
    public static Map<Block, Item> glassMap = new HashMap<>();
    public static Map<Block, Item> glassPaneMap = new HashMap<>();
    public static Map<Block, Item> bedMap = new HashMap<>();
    public static Map<Block, Item> candleMap = new HashMap<>();
    public static Map<Block, Item> harnessMap = new HashMap<>();

    public static ItemStack convertBase(Block cauldron, ItemStack stack, Map<Block, Item> map) {
        if (map.containsKey(cauldron)) return new ItemStack(map.get(cauldron), stack.getCount());
        return ItemStack.EMPTY;
    }
    
    public static InteractionResult convert(ItemStack stack, Player player, Block block) {
        if (block == AtramentumBlocks.GLOW_INK_CAULDRON) return InteractionResult.PASS;
        if (stack.is(AtramentumTags.ItemTags.WOOL)) {
            ItemStack itemStack = convertBase(block, stack, woolMap);
            stack.setCount(0);
            player.addItem(itemStack);
            return InteractionResult.SUCCESS;
        } else if (stack.is(AtramentumTags.ItemTags.CARPETS)) {
            ItemStack itemStack = convertBase(block, stack, carpetMap);
            stack.setCount(0);
            player.addItem(itemStack);
            return InteractionResult.SUCCESS;
        } else if (stack.is(AtramentumTags.ItemTags.TERRACOTTA)) {
            ItemStack itemStack = convertBase(block, stack, terracottaMap);
            stack.setCount(0);
            player.addItem(itemStack);
            return InteractionResult.SUCCESS;
        } else if (stack.is(AtramentumTags.ItemTags.CONCRETE)) {
            ItemStack itemStack = convertBase(block, stack, concreteMap);
            stack.setCount(0);
            player.addItem(itemStack);
            return InteractionResult.SUCCESS;
        } else if (stack.is(AtramentumTags.ItemTags.CONCRETE_POWDERS)) {
            ItemStack itemStack = convertBase(block, stack, concretePowderMap);
            stack.setCount(0);
            player.addItem(itemStack);
            return InteractionResult.SUCCESS;
        } else if (stack.is(AtramentumTags.ItemTags.GLASS)) {
            ItemStack itemStack = convertBase(block, stack, glassMap);
            stack.setCount(0);
            player.addItem(itemStack);
            return InteractionResult.SUCCESS;
        } else if (stack.is(AtramentumTags.ItemTags.GLASS_PANES)) {
            ItemStack itemStack = convertBase(block, stack, glassPaneMap);
            stack.setCount(0);
            player.addItem(itemStack);
            return InteractionResult.SUCCESS;
        } else if (stack.is(AtramentumTags.ItemTags.BEDS)) {
            ItemStack itemStack = convertBase(block, stack, bedMap);
            stack.setCount(0);
            player.addItem(itemStack);
            return InteractionResult.SUCCESS;
        } else if (stack.is(AtramentumTags.ItemTags.CANDLES)) {
            ItemStack itemStack = convertBase(block, stack, candleMap);
            stack.setCount(0);
            player.addItem(itemStack);
            return InteractionResult.SUCCESS;
        } else if (stack.is(AtramentumTags.ItemTags.HARNESSES)) {
            ItemStack itemStack = convertBase(block, stack, harnessMap);
            stack.setCount(0);
            player.addItem(itemStack);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }
    
    public static void load() {
        woolMap.put(AtramentumBlocks.WHITE_INK_CAULDRON, Items.WHITE_WOOL);
        woolMap.put(AtramentumBlocks.LIGHT_GRAY_INK_CAULDRON, Items.LIGHT_GRAY_WOOL);
        woolMap.put(AtramentumBlocks.GRAY_INK_CAULDRON, Items.GRAY_WOOL);
        woolMap.put(AtramentumBlocks.INK_CAULDRON, Items.BLACK_WOOL);
        woolMap.put(AtramentumBlocks.BROWN_INK_CAULDRON, Items.BROWN_WOOL);
        woolMap.put(AtramentumBlocks.RED_INK_CAULDRON, Items.RED_WOOL);
        woolMap.put(AtramentumBlocks.ORANGE_INK_CAULDRON, Items.ORANGE_WOOL);
        woolMap.put(AtramentumBlocks.YELLOW_INK_CAULDRON, Items.YELLOW_WOOL);
        woolMap.put(AtramentumBlocks.LIME_INK_CAULDRON, Items.LIME_WOOL);
        woolMap.put(AtramentumBlocks.GREEN_INK_CAULDRON, Items.GREEN_WOOL);
        woolMap.put(AtramentumBlocks.CYAN_INK_CAULDRON, Items.CYAN_WOOL);
        woolMap.put(AtramentumBlocks.LIGHT_BLUE_INK_CAULDRON, Items.LIGHT_BLUE_WOOL);
        woolMap.put(AtramentumBlocks.BLUE_INK_CAULDRON, Items.BLUE_WOOL);
        woolMap.put(AtramentumBlocks.PURPLE_INK_CAULDRON, Items.PURPLE_WOOL);
        woolMap.put(AtramentumBlocks.MAGENTA_INK_CAULDRON, Items.MAGENTA_WOOL);
        woolMap.put(AtramentumBlocks.PINK_INK_CAULDRON, Items.PINK_WOOL);
        
        carpetMap.put(AtramentumBlocks.WHITE_INK_CAULDRON, Items.WHITE_CARPET);
        carpetMap.put(AtramentumBlocks.LIGHT_GRAY_INK_CAULDRON, Items.LIGHT_GRAY_CARPET);
        carpetMap.put(AtramentumBlocks.GRAY_INK_CAULDRON, Items.GRAY_CARPET);
        carpetMap.put(AtramentumBlocks.INK_CAULDRON, Items.BLACK_CARPET);
        carpetMap.put(AtramentumBlocks.BROWN_INK_CAULDRON, Items.BROWN_CARPET);
        carpetMap.put(AtramentumBlocks.RED_INK_CAULDRON, Items.RED_CARPET);
        carpetMap.put(AtramentumBlocks.ORANGE_INK_CAULDRON, Items.ORANGE_CARPET);
        carpetMap.put(AtramentumBlocks.YELLOW_INK_CAULDRON, Items.YELLOW_CARPET);
        carpetMap.put(AtramentumBlocks.LIME_INK_CAULDRON, Items.LIME_CARPET);
        carpetMap.put(AtramentumBlocks.GREEN_INK_CAULDRON, Items.GREEN_CARPET);
        carpetMap.put(AtramentumBlocks.CYAN_INK_CAULDRON, Items.CYAN_CARPET);
        carpetMap.put(AtramentumBlocks.LIGHT_BLUE_INK_CAULDRON, Items.LIGHT_BLUE_CARPET);
        carpetMap.put(AtramentumBlocks.BLUE_INK_CAULDRON, Items.BLUE_CARPET);
        carpetMap.put(AtramentumBlocks.PURPLE_INK_CAULDRON, Items.PURPLE_CARPET);
        carpetMap.put(AtramentumBlocks.MAGENTA_INK_CAULDRON, Items.MAGENTA_CARPET);
        carpetMap.put(AtramentumBlocks.PINK_INK_CAULDRON, Items.PINK_CARPET);
        
        terracottaMap.put(AtramentumBlocks.WHITE_INK_CAULDRON, Items.WHITE_TERRACOTTA);
        terracottaMap.put(AtramentumBlocks.LIGHT_GRAY_INK_CAULDRON, Items.LIGHT_GRAY_TERRACOTTA);
        terracottaMap.put(AtramentumBlocks.GRAY_INK_CAULDRON, Items.GRAY_TERRACOTTA);
        terracottaMap.put(AtramentumBlocks.INK_CAULDRON, Items.BLACK_TERRACOTTA);
        terracottaMap.put(AtramentumBlocks.BROWN_INK_CAULDRON, Items.BROWN_TERRACOTTA);
        terracottaMap.put(AtramentumBlocks.RED_INK_CAULDRON, Items.RED_TERRACOTTA);
        terracottaMap.put(AtramentumBlocks.ORANGE_INK_CAULDRON, Items.ORANGE_TERRACOTTA);
        terracottaMap.put(AtramentumBlocks.YELLOW_INK_CAULDRON, Items.YELLOW_TERRACOTTA);
        terracottaMap.put(AtramentumBlocks.LIME_INK_CAULDRON, Items.LIME_TERRACOTTA);
        terracottaMap.put(AtramentumBlocks.GREEN_INK_CAULDRON, Items.GREEN_TERRACOTTA);
        terracottaMap.put(AtramentumBlocks.CYAN_INK_CAULDRON, Items.CYAN_TERRACOTTA);
        terracottaMap.put(AtramentumBlocks.LIGHT_BLUE_INK_CAULDRON, Items.LIGHT_BLUE_TERRACOTTA);
        terracottaMap.put(AtramentumBlocks.BLUE_INK_CAULDRON, Items.BLUE_TERRACOTTA);
        terracottaMap.put(AtramentumBlocks.PURPLE_INK_CAULDRON, Items.PURPLE_TERRACOTTA);
        terracottaMap.put(AtramentumBlocks.MAGENTA_INK_CAULDRON, Items.MAGENTA_TERRACOTTA);
        terracottaMap.put(AtramentumBlocks.PINK_INK_CAULDRON, Items.PINK_TERRACOTTA);

        concreteMap.put(AtramentumBlocks.WHITE_INK_CAULDRON, Items.WHITE_CONCRETE);
        concreteMap.put(AtramentumBlocks.LIGHT_GRAY_INK_CAULDRON, Items.LIGHT_GRAY_CONCRETE);
        concreteMap.put(AtramentumBlocks.GRAY_INK_CAULDRON, Items.GRAY_CONCRETE);
        concreteMap.put(AtramentumBlocks.INK_CAULDRON, Items.BLACK_CONCRETE);
        concreteMap.put(AtramentumBlocks.BROWN_INK_CAULDRON, Items.BROWN_CONCRETE);
        concreteMap.put(AtramentumBlocks.RED_INK_CAULDRON, Items.RED_CONCRETE);
        concreteMap.put(AtramentumBlocks.ORANGE_INK_CAULDRON, Items.ORANGE_CONCRETE);
        concreteMap.put(AtramentumBlocks.YELLOW_INK_CAULDRON, Items.YELLOW_CONCRETE);
        concreteMap.put(AtramentumBlocks.LIME_INK_CAULDRON, Items.LIME_CONCRETE);
        concreteMap.put(AtramentumBlocks.GREEN_INK_CAULDRON, Items.GREEN_CONCRETE);
        concreteMap.put(AtramentumBlocks.CYAN_INK_CAULDRON, Items.CYAN_CONCRETE);
        concreteMap.put(AtramentumBlocks.LIGHT_BLUE_INK_CAULDRON, Items.LIGHT_BLUE_CONCRETE);
        concreteMap.put(AtramentumBlocks.BLUE_INK_CAULDRON, Items.BLUE_CONCRETE);
        concreteMap.put(AtramentumBlocks.PURPLE_INK_CAULDRON, Items.PURPLE_CONCRETE);
        concreteMap.put(AtramentumBlocks.MAGENTA_INK_CAULDRON, Items.MAGENTA_CONCRETE);
        concreteMap.put(AtramentumBlocks.PINK_INK_CAULDRON, Items.PINK_CONCRETE);
        
        concretePowderMap.put(AtramentumBlocks.WHITE_INK_CAULDRON, Items.WHITE_CONCRETE_POWDER);
        concretePowderMap.put(AtramentumBlocks.LIGHT_GRAY_INK_CAULDRON, Items.LIGHT_GRAY_CONCRETE_POWDER);
        concretePowderMap.put(AtramentumBlocks.GRAY_INK_CAULDRON, Items.GRAY_CONCRETE_POWDER);
        concretePowderMap.put(AtramentumBlocks.INK_CAULDRON, Items.BLACK_CONCRETE_POWDER);
        concretePowderMap.put(AtramentumBlocks.BROWN_INK_CAULDRON, Items.BROWN_CONCRETE_POWDER);
        concretePowderMap.put(AtramentumBlocks.RED_INK_CAULDRON, Items.RED_CONCRETE_POWDER);
        concretePowderMap.put(AtramentumBlocks.ORANGE_INK_CAULDRON, Items.ORANGE_CONCRETE_POWDER);
        concretePowderMap.put(AtramentumBlocks.YELLOW_INK_CAULDRON, Items.YELLOW_CONCRETE_POWDER);
        concretePowderMap.put(AtramentumBlocks.LIME_INK_CAULDRON, Items.LIME_CONCRETE_POWDER);
        concretePowderMap.put(AtramentumBlocks.GREEN_INK_CAULDRON, Items.GREEN_CONCRETE_POWDER);
        concretePowderMap.put(AtramentumBlocks.CYAN_INK_CAULDRON, Items.CYAN_CONCRETE_POWDER);
        concretePowderMap.put(AtramentumBlocks.LIGHT_BLUE_INK_CAULDRON, Items.LIGHT_BLUE_CONCRETE_POWDER);
        concretePowderMap.put(AtramentumBlocks.BLUE_INK_CAULDRON, Items.BLUE_CONCRETE_POWDER);
        concretePowderMap.put(AtramentumBlocks.PURPLE_INK_CAULDRON, Items.PURPLE_CONCRETE_POWDER);
        concretePowderMap.put(AtramentumBlocks.MAGENTA_INK_CAULDRON, Items.MAGENTA_CONCRETE_POWDER);
        concretePowderMap.put(AtramentumBlocks.PINK_INK_CAULDRON, Items.PINK_CONCRETE_POWDER);
        
        glassMap.put(AtramentumBlocks.WHITE_INK_CAULDRON, Items.WHITE_STAINED_GLASS);
        glassMap.put(AtramentumBlocks.LIGHT_GRAY_INK_CAULDRON, Items.LIGHT_GRAY_STAINED_GLASS);
        glassMap.put(AtramentumBlocks.GRAY_INK_CAULDRON, Items.GRAY_STAINED_GLASS);
        glassMap.put(AtramentumBlocks.INK_CAULDRON, Items.BLACK_STAINED_GLASS);
        glassMap.put(AtramentumBlocks.BROWN_INK_CAULDRON, Items.BROWN_STAINED_GLASS);
        glassMap.put(AtramentumBlocks.RED_INK_CAULDRON, Items.RED_STAINED_GLASS);
        glassMap.put(AtramentumBlocks.ORANGE_INK_CAULDRON, Items.ORANGE_STAINED_GLASS);
        glassMap.put(AtramentumBlocks.YELLOW_INK_CAULDRON, Items.YELLOW_STAINED_GLASS);
        glassMap.put(AtramentumBlocks.LIME_INK_CAULDRON, Items.LIME_STAINED_GLASS);
        glassMap.put(AtramentumBlocks.GREEN_INK_CAULDRON, Items.GREEN_STAINED_GLASS);
        glassMap.put(AtramentumBlocks.CYAN_INK_CAULDRON, Items.CYAN_STAINED_GLASS);
        glassMap.put(AtramentumBlocks.LIGHT_BLUE_INK_CAULDRON, Items.LIGHT_BLUE_STAINED_GLASS);
        glassMap.put(AtramentumBlocks.BLUE_INK_CAULDRON, Items.BLUE_STAINED_GLASS);
        glassMap.put(AtramentumBlocks.PURPLE_INK_CAULDRON, Items.PURPLE_STAINED_GLASS);
        glassMap.put(AtramentumBlocks.MAGENTA_INK_CAULDRON, Items.MAGENTA_STAINED_GLASS);
        glassMap.put(AtramentumBlocks.PINK_INK_CAULDRON, Items.PINK_STAINED_GLASS);
        
        glassPaneMap.put(AtramentumBlocks.WHITE_INK_CAULDRON, Items.WHITE_STAINED_GLASS_PANE);
        glassPaneMap.put(AtramentumBlocks.LIGHT_GRAY_INK_CAULDRON, Items.LIGHT_GRAY_STAINED_GLASS_PANE);
        glassPaneMap.put(AtramentumBlocks.GRAY_INK_CAULDRON, Items.GRAY_STAINED_GLASS_PANE);
        glassPaneMap.put(AtramentumBlocks.INK_CAULDRON, Items.BLACK_STAINED_GLASS_PANE);
        glassPaneMap.put(AtramentumBlocks.BROWN_INK_CAULDRON, Items.BROWN_STAINED_GLASS_PANE);
        glassPaneMap.put(AtramentumBlocks.RED_INK_CAULDRON, Items.RED_STAINED_GLASS_PANE);
        glassPaneMap.put(AtramentumBlocks.ORANGE_INK_CAULDRON, Items.ORANGE_STAINED_GLASS_PANE);
        glassPaneMap.put(AtramentumBlocks.YELLOW_INK_CAULDRON, Items.YELLOW_STAINED_GLASS_PANE);
        glassPaneMap.put(AtramentumBlocks.LIME_INK_CAULDRON, Items.LIME_STAINED_GLASS_PANE);
        glassPaneMap.put(AtramentumBlocks.GREEN_INK_CAULDRON, Items.GREEN_STAINED_GLASS_PANE);
        glassPaneMap.put(AtramentumBlocks.CYAN_INK_CAULDRON, Items.CYAN_STAINED_GLASS_PANE);
        glassPaneMap.put(AtramentumBlocks.LIGHT_BLUE_INK_CAULDRON, Items.LIGHT_BLUE_STAINED_GLASS_PANE);
        glassPaneMap.put(AtramentumBlocks.BLUE_INK_CAULDRON, Items.BLUE_STAINED_GLASS_PANE);
        glassPaneMap.put(AtramentumBlocks.PURPLE_INK_CAULDRON, Items.PURPLE_STAINED_GLASS_PANE);
        glassPaneMap.put(AtramentumBlocks.MAGENTA_INK_CAULDRON, Items.MAGENTA_STAINED_GLASS_PANE);
        glassPaneMap.put(AtramentumBlocks.PINK_INK_CAULDRON, Items.PINK_STAINED_GLASS_PANE);
        
        bedMap.put(AtramentumBlocks.WHITE_INK_CAULDRON, Items.WHITE_BED);
        bedMap.put(AtramentumBlocks.LIGHT_GRAY_INK_CAULDRON, Items.LIGHT_GRAY_BED);
        bedMap.put(AtramentumBlocks.GRAY_INK_CAULDRON, Items.GRAY_BED);
        bedMap.put(AtramentumBlocks.INK_CAULDRON, Items.BLACK_BED);
        bedMap.put(AtramentumBlocks.BROWN_INK_CAULDRON, Items.BROWN_BED);
        bedMap.put(AtramentumBlocks.RED_INK_CAULDRON, Items.RED_BED);
        bedMap.put(AtramentumBlocks.ORANGE_INK_CAULDRON, Items.ORANGE_BED);
        bedMap.put(AtramentumBlocks.YELLOW_INK_CAULDRON, Items.YELLOW_BED);
        bedMap.put(AtramentumBlocks.LIME_INK_CAULDRON, Items.LIME_BED);
        bedMap.put(AtramentumBlocks.GREEN_INK_CAULDRON, Items.GREEN_BED);
        bedMap.put(AtramentumBlocks.CYAN_INK_CAULDRON, Items.CYAN_BED);
        bedMap.put(AtramentumBlocks.LIGHT_BLUE_INK_CAULDRON, Items.LIGHT_BLUE_BED);
        bedMap.put(AtramentumBlocks.BLUE_INK_CAULDRON, Items.BLUE_BED);
        bedMap.put(AtramentumBlocks.PURPLE_INK_CAULDRON, Items.PURPLE_BED);
        bedMap.put(AtramentumBlocks.MAGENTA_INK_CAULDRON, Items.MAGENTA_BED);
        bedMap.put(AtramentumBlocks.PINK_INK_CAULDRON, Items.PINK_BED);
        
        candleMap.put(AtramentumBlocks.WHITE_INK_CAULDRON, Items.WHITE_CANDLE);
        candleMap.put(AtramentumBlocks.LIGHT_GRAY_INK_CAULDRON, Items.LIGHT_GRAY_CANDLE);
        candleMap.put(AtramentumBlocks.GRAY_INK_CAULDRON, Items.GRAY_CANDLE);
        candleMap.put(AtramentumBlocks.INK_CAULDRON, Items.BLACK_CANDLE);
        candleMap.put(AtramentumBlocks.BROWN_INK_CAULDRON, Items.BROWN_CANDLE);
        candleMap.put(AtramentumBlocks.RED_INK_CAULDRON, Items.RED_CANDLE);
        candleMap.put(AtramentumBlocks.ORANGE_INK_CAULDRON, Items.ORANGE_CANDLE);
        candleMap.put(AtramentumBlocks.YELLOW_INK_CAULDRON, Items.YELLOW_CANDLE);
        candleMap.put(AtramentumBlocks.LIME_INK_CAULDRON, Items.LIME_CANDLE);
        candleMap.put(AtramentumBlocks.GREEN_INK_CAULDRON, Items.GREEN_CANDLE);
        candleMap.put(AtramentumBlocks.CYAN_INK_CAULDRON, Items.CYAN_CANDLE);
        candleMap.put(AtramentumBlocks.LIGHT_BLUE_INK_CAULDRON, Items.LIGHT_BLUE_CANDLE);
        candleMap.put(AtramentumBlocks.BLUE_INK_CAULDRON, Items.BLUE_CANDLE);
        candleMap.put(AtramentumBlocks.PURPLE_INK_CAULDRON, Items.PURPLE_CANDLE);
        candleMap.put(AtramentumBlocks.MAGENTA_INK_CAULDRON, Items.MAGENTA_CANDLE);
        candleMap.put(AtramentumBlocks.PINK_INK_CAULDRON, Items.PINK_CANDLE);

        harnessMap.put(AtramentumBlocks.WHITE_INK_CAULDRON, Items.WHITE_HARNESS);
        harnessMap.put(AtramentumBlocks.LIGHT_GRAY_INK_CAULDRON, Items.LIGHT_GRAY_HARNESS);
        harnessMap.put(AtramentumBlocks.GRAY_INK_CAULDRON, Items.GRAY_HARNESS);
        harnessMap.put(AtramentumBlocks.INK_CAULDRON, Items.BLACK_HARNESS);
        harnessMap.put(AtramentumBlocks.BROWN_INK_CAULDRON, Items.BROWN_HARNESS);
        harnessMap.put(AtramentumBlocks.RED_INK_CAULDRON, Items.RED_HARNESS);
        harnessMap.put(AtramentumBlocks.ORANGE_INK_CAULDRON, Items.ORANGE_HARNESS);
        harnessMap.put(AtramentumBlocks.YELLOW_INK_CAULDRON, Items.YELLOW_HARNESS);
        harnessMap.put(AtramentumBlocks.LIME_INK_CAULDRON, Items.LIME_HARNESS);
        harnessMap.put(AtramentumBlocks.GREEN_INK_CAULDRON, Items.GREEN_HARNESS);
        harnessMap.put(AtramentumBlocks.CYAN_INK_CAULDRON, Items.CYAN_HARNESS);
        harnessMap.put(AtramentumBlocks.LIGHT_BLUE_INK_CAULDRON, Items.LIGHT_BLUE_HARNESS);
        harnessMap.put(AtramentumBlocks.BLUE_INK_CAULDRON, Items.BLUE_HARNESS);
        harnessMap.put(AtramentumBlocks.PURPLE_INK_CAULDRON, Items.PURPLE_HARNESS);
        harnessMap.put(AtramentumBlocks.MAGENTA_INK_CAULDRON, Items.MAGENTA_HARNESS);
        harnessMap.put(AtramentumBlocks.PINK_INK_CAULDRON, Items.PINK_HARNESS);
    }
}
