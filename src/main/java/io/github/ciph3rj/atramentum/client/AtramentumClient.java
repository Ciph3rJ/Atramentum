package io.github.ciph3rj.atramentum.client;

import io.github.ciph3rj.atramentum.Atramentum;
import io.github.ciph3rj.atramentum.block.DriedInkBlockFamily;
import io.github.ciph3rj.atramentum.client.particle.DyedInkFootstepParticle;
import io.github.ciph3rj.atramentum.client.particle.GlowInkFootstepParticle;
import io.github.ciph3rj.atramentum.content.AtramentumBlocks;
import io.github.ciph3rj.atramentum.content.AtramentumFluids;
import io.github.ciph3rj.atramentum.content.AtramentumParticleTypes;
import io.github.ciph3rj.cipherlib.helper.ColorMapHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.world.item.DyeColor;

public class AtramentumClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
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

        ParticleFactoryRegistry.getInstance().register(AtramentumParticleTypes.DYED_INK_FOOTSTEPS, DyedInkFootstepParticle.Provider::new);
        ParticleFactoryRegistry.getInstance().register(AtramentumParticleTypes.GLOW_INK_FOOTSTEPS, GlowInkFootstepParticle.Provider::new);

        ColorMapHelper.assignBlockColor(AtramentumBlocks.INK_CAULDRON, DyeColor.BLACK.getTextureDiffuseColor());
        ColorMapHelper.assignBlockColor(AtramentumBlocks.WHITE_INK_CAULDRON, DyeColor.WHITE.getTextureDiffuseColor());
        ColorMapHelper.assignBlockColor(AtramentumBlocks.LIGHT_GRAY_INK_CAULDRON, DyeColor.LIGHT_GRAY.getTextureDiffuseColor());
        ColorMapHelper.assignBlockColor(AtramentumBlocks.GRAY_INK_CAULDRON, DyeColor.GRAY.getTextureDiffuseColor());
        ColorMapHelper.assignBlockColor(AtramentumBlocks.BROWN_INK_CAULDRON, DyeColor.BROWN.getTextureDiffuseColor());
        ColorMapHelper.assignBlockColor(AtramentumBlocks.RED_INK_CAULDRON, DyeColor.RED.getTextureDiffuseColor());
        ColorMapHelper.assignBlockColor(AtramentumBlocks.ORANGE_INK_CAULDRON, DyeColor.ORANGE.getTextureDiffuseColor());
        ColorMapHelper.assignBlockColor(AtramentumBlocks.YELLOW_INK_CAULDRON, DyeColor.YELLOW.getTextureDiffuseColor());
        ColorMapHelper.assignBlockColor(AtramentumBlocks.LIME_INK_CAULDRON, DyeColor.LIME.getTextureDiffuseColor());
        ColorMapHelper.assignBlockColor(AtramentumBlocks.GREEN_INK_CAULDRON, DyeColor.GREEN.getTextureDiffuseColor());
        ColorMapHelper.assignBlockColor(AtramentumBlocks.CYAN_INK_CAULDRON, DyeColor.CYAN.getTextureDiffuseColor());
        ColorMapHelper.assignBlockColor(AtramentumBlocks.LIGHT_BLUE_INK_CAULDRON, DyeColor.LIGHT_BLUE.getTextureDiffuseColor());
        ColorMapHelper.assignBlockColor(AtramentumBlocks.BLUE_INK_CAULDRON, DyeColor.BLUE.getTextureDiffuseColor());
        ColorMapHelper.assignBlockColor(AtramentumBlocks.PURPLE_INK_CAULDRON, DyeColor.PURPLE.getTextureDiffuseColor());
        ColorMapHelper.assignBlockColor(AtramentumBlocks.MAGENTA_INK_CAULDRON, DyeColor.MAGENTA.getTextureDiffuseColor());
        ColorMapHelper.assignBlockColor(AtramentumBlocks.PINK_INK_CAULDRON, DyeColor.PINK.getTextureDiffuseColor());

        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_WHITE_INK_FAMILY, DyeColor.WHITE.getTextureDiffuseColor());
        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY, DyeColor.LIGHT_GRAY.getTextureDiffuseColor());
        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_GRAY_INK_FAMILY, DyeColor.GRAY.getTextureDiffuseColor());
        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_INK_FAMILY, DyeColor.BLACK.getTextureDiffuseColor());
        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_BROWN_INK_FAMILY, DyeColor.BROWN.getTextureDiffuseColor());
        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_RED_INK_FAMILY, DyeColor.RED.getTextureDiffuseColor());
        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_ORANGE_INK_FAMILY, DyeColor.ORANGE.getTextureDiffuseColor());
        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_YELLOW_INK_FAMILY, DyeColor.YELLOW.getTextureDiffuseColor());
        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_LIME_INK_FAMILY, DyeColor.LIME.getTextureDiffuseColor());
        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_GREEN_INK_FAMILY, DyeColor.GREEN.getTextureDiffuseColor());
        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_CYAN_INK_FAMILY, DyeColor.CYAN.getTextureDiffuseColor());
        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY, DyeColor.LIGHT_BLUE.getTextureDiffuseColor());
        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_BLUE_INK_FAMILY, DyeColor.BLUE.getTextureDiffuseColor());
        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_PURPLE_INK_FAMILY, DyeColor.PURPLE.getTextureDiffuseColor());
        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY, DyeColor.MAGENTA.getTextureDiffuseColor());
        DriedInkBlockFamily.assignColors(AtramentumBlocks.DRIED_PINK_INK_FAMILY, DyeColor.PINK.getTextureDiffuseColor());
    }
}
