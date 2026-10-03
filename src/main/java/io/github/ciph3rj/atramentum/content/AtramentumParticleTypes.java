package io.github.ciph3rj.atramentum.content;

import com.mojang.serialization.MapCodec;
import io.github.ciph3rj.atramentum.client.particle.DyedInkFootstepParticleOptions;
import io.github.ciph3rj.cipherlib.helper.RegistryHelper;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;

import java.util.function.Function;

public interface AtramentumParticleTypes {
    ParticleType<DyedInkFootstepParticleOptions> DYED_INK_FOOTSTEPS = register("dyed_ink_footsteps", true,
            particle -> DyedInkFootstepParticleOptions.CODEC, particle -> DyedInkFootstepParticleOptions.STREAM_CODEC);
    SimpleParticleType GLOW_INK_FOOTSTEPS = RegistryHelper.registerParticleType("glow_ink_footsteps", FabricParticleTypes.simple(true));

    private static <T extends ParticleOptions> ParticleType<T> register(String string, boolean bl, final Function<ParticleType<T>, MapCodec<T>> function, final Function<ParticleType<T>, StreamCodec<? super RegistryFriendlyByteBuf, T>> function2) {
        return Registry.register(BuiltInRegistries.PARTICLE_TYPE, string, new ParticleType<T>(bl) {
            public MapCodec<T> codec() {
                return function.apply(this);
            }

            public StreamCodec<? super RegistryFriendlyByteBuf, T> streamCodec() {
                return function2.apply(this);
            }
        });
    }

    static void init() {}
}
