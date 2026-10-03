package io.github.ciph3rj.atramentum.util.inkplayereffects;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;

public record InkPlayerEffect(ParticleOptions particle, int color) {
    public static final Codec<InkPlayerEffect> CODEC = RecordCodecBuilder.create(instance -> instance.group(ParticleTypes.CODEC.fieldOf("particle")
            .forGetter(InkPlayerEffect::particle), Codec.INT.fieldOf("color").forGetter(InkPlayerEffect::color)).apply(instance, InkPlayerEffect::new));
}
