package io.github.ciph3rj.atramentum.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.particles.ScalableParticleOptionsBase;

@Environment(EnvType.CLIENT)
public class DyedInkFootstepParticleBase<T extends ScalableParticleOptionsBase> extends SingleQuadParticle {
    protected DyedInkFootstepParticleBase(ClientLevel clientLevel, double d, double e, double f, double g, double h, double i, T scalableParticleOptionsBase, TextureAtlasSprite spriteSet) {
        super(clientLevel, d, e, f, 0, 0, 0, spriteSet);
    }

    @Override
    public FacingCameraMode getFacingCameraMode() {
        return (quaternionf, camera, f) -> {
            quaternionf.rotateX((float) -Math.PI / 2);
            quaternionf.rotateY((float) Math.toRadians(camera.rotation().y));
        };
    }

    @Override
    public void setLifetime(int i) {
        this.lifetime = 20;
    }

    protected float randomizeColor(float f, float g) {
        return (this.random.nextFloat() * 0.2F + 0.8F) * f * g;
    }

    public SingleQuadParticle.Layer getLayer() {
        return Layer.OPAQUE;
    }

    @Override
    public void move(double d, double e, double f) {
    }
}
