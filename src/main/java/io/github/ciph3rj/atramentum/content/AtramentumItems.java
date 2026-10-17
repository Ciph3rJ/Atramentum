package io.github.ciph3rj.atramentum.content;

import io.github.ciph3rj.atramentum.Atramentum;
import io.github.ciph3rj.cipherlib.helper.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;

public interface AtramentumItems {
    Item INK_BUCKET = RegistryHelper.registerItem("ink_bucket", properties -> new BucketItem(AtramentumFluids.INK, properties), new Item.Properties().stacksTo(1));
    Item GLOW_INK_BUCKET = RegistryHelper.registerItem("glow_ink_bucket", properties -> new BucketItem(AtramentumFluids.GLOW_INK, properties), new Item.Properties().stacksTo(1));
    Item WHITE_INK_BUCKET = RegistryHelper.registerItem("white_ink_bucket", properties -> new BucketItem(AtramentumFluids.WHITE_INK, properties), new Item.Properties().stacksTo(1));
    Item LIGHT_GRAY_INK_BUCKET = RegistryHelper.registerItem("light_gray_ink_bucket", properties -> new BucketItem(AtramentumFluids.LIGHT_GRAY_INK, properties), new Item.Properties().stacksTo(1));
    Item GRAY_INK_BUCKET = RegistryHelper.registerItem("gray_ink_bucket", properties -> new BucketItem(AtramentumFluids.GRAY_INK, properties), new Item.Properties().stacksTo(1));
    Item BROWN_INK_BUCKET = RegistryHelper.registerItem("brown_ink_bucket", properties -> new BucketItem(AtramentumFluids.BROWN_INK, properties), new Item.Properties().stacksTo(1));
    Item RED_INK_BUCKET = RegistryHelper.registerItem("red_ink_bucket", properties -> new BucketItem(AtramentumFluids.RED_INK, properties), new Item.Properties().stacksTo(1));
    Item ORANGE_INK_BUCKET = RegistryHelper.registerItem("orange_ink_bucket", properties -> new BucketItem(AtramentumFluids.ORANGE_INK, properties), new Item.Properties().stacksTo(1));
    Item YELLOW_INK_BUCKET = RegistryHelper.registerItem("yellow_ink_bucket", properties -> new BucketItem(AtramentumFluids.YELLOW_INK, properties), new Item.Properties().stacksTo(1));
    Item LIME_INK_BUCKET = RegistryHelper.registerItem("lime_ink_bucket", properties -> new BucketItem(AtramentumFluids.LIME_INK, properties), new Item.Properties().stacksTo(1));
    Item GREEN_INK_BUCKET = RegistryHelper.registerItem("green_ink_bucket", properties -> new BucketItem(AtramentumFluids.GREEN_INK, properties), new Item.Properties().stacksTo(1));
    Item CYAN_INK_BUCKET = RegistryHelper.registerItem("cyan_ink_bucket", properties -> new BucketItem(AtramentumFluids.CYAN_INK, properties), new Item.Properties().stacksTo(1));
    Item LIGHT_BLUE_INK_BUCKET = RegistryHelper.registerItem("light_blue_ink_bucket", properties -> new BucketItem(AtramentumFluids.LIGHT_BLUE_INK, properties), new Item.Properties().stacksTo(1));
    Item BLUE_INK_BUCKET = RegistryHelper.registerItem("blue_ink_bucket", properties -> new BucketItem(AtramentumFluids.BLUE_INK, properties), new Item.Properties().stacksTo(1));
    Item PURPLE_INK_BUCKET = RegistryHelper.registerItem("purple_ink_bucket", properties -> new BucketItem(AtramentumFluids.PURPLE_INK, properties), new Item.Properties().stacksTo(1));
    Item MAGENTA_INK_BUCKET = RegistryHelper.registerItem("magenta_ink_bucket", properties -> new BucketItem(AtramentumFluids.MAGENTA_INK, properties), new Item.Properties().stacksTo(1));
    Item PINK_INK_BUCKET = RegistryHelper.registerItem("pink_ink_bucket", properties -> new BucketItem(AtramentumFluids.PINK_INK, properties), new Item.Properties().stacksTo(1));

    static void init() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Atramentum.id("atramentum"), FabricItemGroup.builder()
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
    }
}
