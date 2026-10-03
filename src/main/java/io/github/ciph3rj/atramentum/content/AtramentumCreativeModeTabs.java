package io.github.ciph3rj.atramentum.content;

import io.github.ciph3rj.atramentum.Atramentum;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

public interface AtramentumCreativeModeTabs {
    CreativeModeTab ATRAMENTUM = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Atramentum.id("atramentum"), FabricItemGroup.builder()
            .title(Component.translatable("creativemodetab.atramentum"))
            .icon(AtramentumItems.INK_BUCKET::getDefaultInstance)
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(AtramentumItems.INK_BUCKET);
                output.accept(AtramentumItems.GLOW_INK_BUCKET);
                output.accept(AtramentumItems.WHITE_INK_BUCKET);
                output.accept(AtramentumItems.LIGHT_GRAY_INK_BUCKET);
                output.accept(AtramentumItems.GRAY_INK_BUCKET);
                output.accept(AtramentumItems.BROWN_INK_BUCKET);
                output.accept(AtramentumItems.RED_INK_BUCKET);
                output.accept(AtramentumItems.ORANGE_INK_BUCKET);
                output.accept(AtramentumItems.YELLOW_INK_BUCKET);
                output.accept(AtramentumItems.LIME_INK_BUCKET);
                output.accept(AtramentumItems.GREEN_INK_BUCKET);
                output.accept(AtramentumItems.CYAN_INK_BUCKET);
                output.accept(AtramentumItems.LIGHT_BLUE_INK_BUCKET);
                output.accept(AtramentumItems.BLUE_INK_BUCKET);
                output.accept(AtramentumItems.PURPLE_INK_BUCKET);
                output.accept(AtramentumItems.MAGENTA_INK_BUCKET);
                output.accept(AtramentumItems.PINK_INK_BUCKET);
            }))
            .build());

    static void init() {}
}
