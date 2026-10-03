package io.github.ciph3rj.atramentum.client.particle;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.github.ciph3rj.atramentum.content.AtramentumParticleTypes;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.ScalableParticleOptionsBase;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.util.ARGB;
import net.minecraft.util.ExtraCodecs;
import org.joml.Vector3f;

public class DyedInkFootstepParticleOptions extends ScalableParticleOptionsBase {
    public static final MapCodec<DyedInkFootstepParticleOptions> CODEC = RecordCodecBuilder.mapCodec((instance) -> instance.group(ExtraCodecs.RGB_COLOR_CODEC.fieldOf("color").forGetter((dustParticleOptions) -> dustParticleOptions.color), SCALE.fieldOf("scale").forGetter(ScalableParticleOptionsBase::getScale)).apply(instance, DyedInkFootstepParticleOptions::new));
    public static final StreamCodec<RegistryFriendlyByteBuf, DyedInkFootstepParticleOptions> STREAM_CODEC = StreamCodec.composite(ByteBufCodecs.INT, (dustParticleOptions) -> dustParticleOptions.color, ByteBufCodecs.FLOAT, ScalableParticleOptionsBase::getScale, DyedInkFootstepParticleOptions::new);
    private final int color;

    public DyedInkFootstepParticleOptions(int color, float f) {
        super(f);
        this.color = color;
    }

    public Vector3f getColor() {
        return ARGB.vector3fFromRGB24(this.color);
    }

    @Override
    public ParticleType<?> getType() {
        return AtramentumParticleTypes.DYED_INK_FOOTSTEPS;
    }
}
