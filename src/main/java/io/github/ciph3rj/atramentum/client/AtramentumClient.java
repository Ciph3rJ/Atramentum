package io.github.ciph3rj.atramentum.client;

import io.github.ciph3rj.atramentum.block.DriedInkBlockFamily;
import io.github.ciph3rj.atramentum.client.particle.DyedInkFootstepParticle;
import io.github.ciph3rj.atramentum.client.particle.GlowInkFootstepParticle;
import io.github.ciph3rj.atramentum.content.AtramentumBlocks;
import io.github.ciph3rj.atramentum.content.AtramentumParticleTypes;
import io.github.ciph3rj.cipherlib.helper.ColorMapHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.world.item.DyeColor;

public class AtramentumClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AtramentumFluidRenderer.init();

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
