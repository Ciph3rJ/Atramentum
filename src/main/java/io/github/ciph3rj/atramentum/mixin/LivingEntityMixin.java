package io.github.ciph3rj.atramentum.mixin;

import io.github.ciph3rj.atramentum.content.AtramentumBlocks;
import io.github.ciph3rj.atramentum.content.AtramentumMobEffects;
import io.github.ciph3rj.atramentum.fluid.Ink;
import io.github.ciph3rj.atramentum.util.AtramentumTags;
import io.github.ciph3rj.atramentum.util.LivingEntityAccessor;
import io.github.ciph3rj.atramentum.util.inkplayereffects.AtramentumInkPlayerEffects;
import io.github.ciph3rj.atramentum.util.inkplayereffects.InkPlayerEffect;
import io.github.ciph3rj.atramentum.util.inkplayereffects.InkPlayerEffectRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity implements LivingEntityAccessor {
    @Shadow
    public abstract boolean hasEffect(Holder<MobEffect> holder);

    @Shadow
    public abstract boolean removeEffect(Holder<MobEffect> holder);

    @Shadow
    public abstract ItemStack getItemBySlot(EquipmentSlot equipmentSlot);

    @Shadow
    public abstract boolean addEffect(MobEffectInstance mobEffectInstance);

    @Unique
    public boolean isInMotion;
    @Unique
    public Vec3 savedPos = new Vec3(this.getX(), this.getY(), this.getZ());
    @Unique
    public InkPlayerEffect inkEffect = AtramentumInkPlayerEffects.BLACK;

    public LivingEntityMixin(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public InkPlayerEffect getInkEffect() {
        return this.inkEffect;
    }

    @Override
    public void setInkEffect(InkPlayerEffect inkEffect) {
        this.inkEffect = inkEffect;
    }

    @Inject(method = "addAdditionalSaveData", at = @At("HEAD"))
    public void atramentum$addAdditionalSaveData(ValueOutput valueOutput, CallbackInfo ci) {
        if(getInkEffect() != null) valueOutput.store("Ink Effect", InkPlayerEffect.CODEC, getInkEffect());
    }

    @Inject(method = "readAdditionalSaveData", at = @At("HEAD"))
    public void atramentum$readAdditionalSaveData(ValueInput valueInput, CallbackInfo ci) {
        valueInput.read("Ink Effect", InkPlayerEffect.CODEC).ifPresent(this::setInkEffect);
    }

    @Inject(method = "tick", at = @At("HEAD"))
    public void tick(CallbackInfo ci) {
        if (this.level().getBlockState(this.blockPosition()).is(AtramentumTags.BlockTags.INK) || this.level().getFluidState(this.blockPosition()).getType() instanceof Ink && InkPlayerEffectRegistry.INK_PLAYER_EFFECT_ASSIGNMENTS.containsKey(this.level().getFluidState(this.blockPosition()).getType()) && !this.hasEffect(AtramentumMobEffects.INKED))
            this.setInkEffect(InkPlayerEffectRegistry.getFromBlock(this.level().getBlockState(this.blockPosition()).getBlock()));

        if (this.level().getBlockState(BlockPos.containing(this.getEyePosition())).is(AtramentumBlocks.GLOW_INK) && !this.hasEffect(MobEffects.GLOWING)) this.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200, 0));

        if (this.isInMotion && !this.isInWaterOrRain() && !this.isInPowderSnow && this.onGround() && this.hasEffect(AtramentumMobEffects.INKED) &&
                !this.getItemBySlot(EquipmentSlot.FEET).is(AtramentumTags.ItemTags.COVERS_INK_FOOTSTEPS)) {
            float particleOffset = (float) this.random.nextInt(-40, 40) / 100;
            int particleAmount = this.random.nextInt(1, 5);

            for (int particle = 0; particle < particleAmount; particle++) {
                this.level().addParticle(this.getInkEffect().particle(), this.getX() + particleOffset, this.getY() + 0.055, this.getZ() + particleOffset, 0, 0, 0);
            }
            this.level().playSound(this, this.blockPosition(), SoundEvents.HONEY_BLOCK_STEP, SoundSource.BLOCKS, 10, 1);
        }

        if (this.hasEffect(AtramentumMobEffects.INKED) && this.isInWaterOrRain()) this.removeEffect(AtramentumMobEffects.INKED);

        isInMotion = this.getX() != this.savedPos.x() || this.getY() != this.savedPos.y() || this.getZ() != this.savedPos.z();

        this.savedPos = new Vec3(this.getX(), this.getY(), this.getZ());
    }
}
