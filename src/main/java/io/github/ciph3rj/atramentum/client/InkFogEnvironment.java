package io.github.ciph3rj.atramentum.client;

import io.github.ciph3rj.atramentum.util.AtramentumTags;
import io.github.ciph3rj.atramentum.util.LivingEntityAccessor;
import net.minecraft.client.Camera;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.fog.FogData;
import net.minecraft.client.renderer.fog.environment.AtmosphericFogEnvironment;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.material.FogType;
import org.jspecify.annotations.Nullable;

public class InkFogEnvironment extends AtmosphericFogEnvironment {

    public int getBaseColor(ClientLevel clientLevel, Camera camera, int i, float f) {
        Player player = Minecraft.getInstance().player;

        if (player == null && player.level() == null) return 0;
        if (player instanceof LivingEntityAccessor livingEntityAccessor && livingEntityAccessor.getInkEffect() != null && player.level().getFluidState(BlockPos.containing(player.getEyePosition())).is(AtramentumTags.FluidTags.INK)) {
            return livingEntityAccessor.getInkEffect().color();
        } else return 0;
    }

    public void setupFog(FogData fogData, Camera camera, ClientLevel clientLevel, float f, DeltaTracker deltaTracker) {
        if (camera.entity().isSpectator()) {
            fogData.environmentalStart = -8.0F;
            fogData.environmentalEnd = f * 0.5F;
        } else {
            fogData.environmentalStart = 0.25F;
            fogData.environmentalEnd = 1.0F;
        }

        fogData.skyEnd = fogData.environmentalEnd;
        fogData.cloudEnd = fogData.environmentalEnd;
    }

    @Override
    public boolean isApplicable(@Nullable FogType fogType, Entity entity) {
        assert Minecraft.getInstance().getCameraEntity() != null;
        return entity.level().getFluidState(BlockPos.containing(entity.getEyePosition())).is(AtramentumTags.FluidTags.INK);
    }
}
