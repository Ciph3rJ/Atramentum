package io.github.ciph3rj.atramentum.util.inkplayereffects;

import io.github.ciph3rj.atramentum.client.particle.DyedInkFootstepParticleOptions;
import io.github.ciph3rj.atramentum.content.AtramentumParticleTypes;
import net.minecraft.util.ARGB;
import net.minecraft.world.item.DyeColor;

public interface AtramentumInkPlayerEffects {
    InkPlayerEffect GLOW = new InkPlayerEffect(AtramentumParticleTypes.GLOW_INK_FOOTSTEPS, ARGB.opaque(0x4BDEBA));

    InkPlayerEffect WHITE = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.WHITE.getTextureDiffuseColor(), 1), DyeColor.WHITE.getTextureDiffuseColor());
    InkPlayerEffect LIGHT_GRAY = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.LIGHT_GRAY.getTextureDiffuseColor(), 1), DyeColor.LIGHT_GRAY.getTextureDiffuseColor());
    InkPlayerEffect GRAY = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.GRAY.getTextureDiffuseColor(), 1), DyeColor.GRAY.getTextureDiffuseColor());
    InkPlayerEffect BLACK = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.BLACK.getTextureDiffuseColor(), 1), DyeColor.BLACK.getTextureDiffuseColor());
    InkPlayerEffect BROWN = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.BROWN.getTextureDiffuseColor(), 1), DyeColor.BROWN.getTextureDiffuseColor());
    InkPlayerEffect RED = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.RED.getTextureDiffuseColor(), 1), DyeColor.RED.getTextureDiffuseColor());
    InkPlayerEffect ORANGE = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.ORANGE.getTextureDiffuseColor(), 1), DyeColor.ORANGE.getTextureDiffuseColor());
    InkPlayerEffect YELLOW = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.YELLOW.getTextureDiffuseColor(), 1), DyeColor.YELLOW.getTextureDiffuseColor());
    InkPlayerEffect LIME = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.LIME.getTextureDiffuseColor(), 1), DyeColor.LIME.getTextureDiffuseColor());
    InkPlayerEffect GREEN = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.GREEN.getTextureDiffuseColor(), 1), DyeColor.GREEN.getTextureDiffuseColor());
    InkPlayerEffect CYAN = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.CYAN.getTextureDiffuseColor(), 1), DyeColor.CYAN.getTextureDiffuseColor());
    InkPlayerEffect LIGHT_BLUE = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.LIGHT_BLUE.getTextureDiffuseColor(), 1), DyeColor.LIGHT_BLUE.getTextureDiffuseColor());
    InkPlayerEffect BLUE = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.BLUE.getTextureDiffuseColor(), 1), DyeColor.BLUE.getTextureDiffuseColor());
    InkPlayerEffect PURPLE = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.PURPLE.getTextureDiffuseColor(), 1), DyeColor.PURPLE.getTextureDiffuseColor());
    InkPlayerEffect MAGENTA = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.MAGENTA.getTextureDiffuseColor(), 1), DyeColor.MAGENTA.getTextureDiffuseColor());
    InkPlayerEffect PINK = new InkPlayerEffect(new DyedInkFootstepParticleOptions(DyeColor.PINK.getTextureDiffuseColor(), 1), DyeColor.PINK.getTextureDiffuseColor());
}
