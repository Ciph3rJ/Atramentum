package io.github.ciph3rj.atramentum.content;

import io.github.ciph3rj.cipherlib.effect.BasicStatusEffect;
import io.github.ciph3rj.cipherlib.helper.RegistryHelper;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public interface AtramentumMobEffects {
    Holder<MobEffect> INKED = RegistryHelper.registerEffect("inked", new BasicStatusEffect(MobEffectCategory.NEUTRAL, 0));

    static void init() {}
}
