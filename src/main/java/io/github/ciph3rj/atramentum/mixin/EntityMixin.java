package io.github.ciph3rj.atramentum.mixin;

import io.github.ciph3rj.atramentum.fluid.Ink;
import io.github.ciph3rj.atramentum.util.AtramentumTags;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityMixin {
    @Shadow
    public abstract Level level();

    @Shadow
    private BlockPos blockPosition;

    @Shadow
    public abstract void resetFallDistance();

    @Shadow
    public abstract boolean updateFluidHeightAndDoFluidPushing(TagKey<Fluid> tagKey, double d);

    @Shadow
    public abstract EntityType<?> getType();

    @Shadow
    public abstract BlockPos blockPosition();

    @Unique
    public boolean isInInk;

    @Unique
    public void updateIsInInk() {
        if (this.level().getFluidState(this.blockPosition).is(AtramentumTags.FluidTags.INK) ||
                this.level().getFluidState(this.blockPosition).getType() instanceof Ink) {
            isInInk = true;
        }
    }

    @Inject(method = "getBlockSpeedFactor", at = @At("HEAD"), cancellable = true)
    public void getBlockSpeedFactor(CallbackInfoReturnable<Float> cir) {
        if (this.level().getFluidState(this.blockPosition()).is(AtramentumTags.FluidTags.INK)) cir.setReturnValue(0.09f);
    }

    @Inject(method = "baseTick", at = @At("HEAD"))
    public void baseTick(CallbackInfo ci) {
        this.updateIsInInk();
        this.updateFluidHeightAndDoFluidPushing(AtramentumTags.FluidTags.INK, 0.025);
    }

    @Inject(method = "checkFallDamage", at = @At("HEAD"))
    public void checkFallDamage(double d, boolean bl, BlockState blockState, BlockPos blockPos, CallbackInfo ci) {
        if (this.isInInk) {
            this.resetFallDistance();
        }
    }
}
