package io.github.ciph3rj.atramentum.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.RandomSource;
import org.joml.Vector3f;

public class DyedInkFootstepParticle extends DyedInkFootstepParticleBase<DyedInkFootstepParticleOptions> {
    public DyedInkFootstepParticle(ClientLevel clientLevel, double d, double e, double f, double g, double h, double i, DyedInkFootstepParticleOptions scalableParticleOptionsBase, TextureAtlasSprite spriteSet) {
        super(clientLevel, d, e, f, g, h, i, scalableParticleOptionsBase, spriteSet);
        float j = this.random.nextFloat() * 0.4F + 0.6F;
        Vector3f vector3f = scalableParticleOptionsBase.getColor();
        this.rCol = this.randomizeColor(vector3f.x(), j);
        this.gCol = this.randomizeColor(vector3f.y(), j);
        this.bCol = this.randomizeColor(vector3f.z(), j);
        this.hasPhysics = false;
    }

    @Environment(EnvType.CLIENT)
    public static class Provider implements ParticleProvider<DyedInkFootstepParticleOptions> {
        private final SpriteSet sprites;

        public Provider(SpriteSet spriteSet) {
            this.sprites = spriteSet;
        }

        public Particle createParticle(DyedInkFootstepParticleOptions dustParticleOptions, ClientLevel clientLevel, double d, double e, double f, double g, double h, double i, RandomSource randomSource) {
            return new DyedInkFootstepParticle(clientLevel, d, e, f, g, h, i, dustParticleOptions, sprites.get(randomSource));
        }
    }
}