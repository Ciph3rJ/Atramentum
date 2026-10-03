package io.github.ciph3rj.atramentum.client;

import io.github.ciph3rj.atramentum.Atramentum;
import io.github.ciph3rj.atramentum.content.AtramentumFluids;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.world.item.DyeColor;

public class AtramentumFluidRenderer {
    public static void init() {
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.INK, AtramentumFluids.FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.BLACK.getTextureDiffuseColor()));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.GLOW_INK, AtramentumFluids.GLOW_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/glow_ink_still"), Atramentum.id("block/glow_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.WHITE_INK, AtramentumFluids.WHITE_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.WHITE.getTextureDiffuseColor()));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.LIGHT_GRAY_INK, AtramentumFluids.LIGHT_GRAY_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.LIGHT_GRAY.getTextureDiffuseColor()));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.GRAY_INK, AtramentumFluids.GRAY_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.GRAY.getTextureDiffuseColor()));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.BROWN_INK, AtramentumFluids.BROWN_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.BROWN.getTextureDiffuseColor()));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.RED_INK, AtramentumFluids.RED_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.RED.getTextureDiffuseColor()));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.ORANGE_INK, AtramentumFluids.ORANGE_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.ORANGE.getTextureDiffuseColor()));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.YELLOW_INK, AtramentumFluids.YELLOW_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.YELLOW.getTextureDiffuseColor()));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.LIME_INK, AtramentumFluids.LIME_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.LIME.getTextureDiffuseColor()));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.GREEN_INK, AtramentumFluids.GREEN_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.GREEN.getTextureDiffuseColor()));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.CYAN_INK, AtramentumFluids.CYAN_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.CYAN.getTextureDiffuseColor()));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.LIGHT_BLUE_INK, AtramentumFluids.LIGHT_BLUE_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.LIGHT_BLUE.getTextureDiffuseColor()));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.BLUE_INK, AtramentumFluids.BLUE_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.BLUE.getTextureDiffuseColor()));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.PURPLE_INK, AtramentumFluids.PURPLE_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.PURPLE.getTextureDiffuseColor()));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.MAGENTA_INK, AtramentumFluids.MAGENTA_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.MAGENTA.getTextureDiffuseColor()));
        FluidRenderHandlerRegistry.INSTANCE.register(AtramentumFluids.PINK_INK, AtramentumFluids.PINK_FLOWING_INK,
                new SimpleFluidRenderHandler(Atramentum.id("block/dyed_ink_still"), Atramentum.id("block/dyed_ink_flow"), SimpleFluidRenderHandler.WATER_OVERLAY, DyeColor.PINK.getTextureDiffuseColor()));
    }
}
