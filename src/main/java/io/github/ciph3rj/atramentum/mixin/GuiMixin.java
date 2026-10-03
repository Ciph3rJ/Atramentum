package io.github.ciph3rj.atramentum.mixin;

import io.github.ciph3rj.atramentum.Atramentum;
import io.github.ciph3rj.atramentum.content.AtramentumMobEffects;
import io.github.ciph3rj.atramentum.util.LivingEntityAccessor;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.RenderPipelines;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Gui.class)
public abstract class GuiMixin {
    @Inject(method = "renderCameraOverlays", at = @At("HEAD"))
    private void renderCameraOverlays(GuiGraphics guiGraphics, DeltaTracker deltaTracker, CallbackInfo ci) {
        if (Minecraft.getInstance().player != null && Minecraft.getInstance().player instanceof LivingEntityAccessor livingEntityAccessor && Minecraft.getInstance().player.hasEffect(AtramentumMobEffects.INKED) &&
            livingEntityAccessor.getInkEffect() != null) {
                guiGraphics.blit(RenderPipelines.GUI_TEXTURED, Atramentum.id("textures/misc/ink_submerged_overlay.png"), 0, 0, 0.0F, 0.0F, guiGraphics.guiWidth(),
                    guiGraphics.guiHeight(), guiGraphics.guiWidth(), guiGraphics.guiHeight(), livingEntityAccessor.getInkEffect().color());
        }
    }
}
