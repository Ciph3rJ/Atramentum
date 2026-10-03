package io.github.ciph3rj.atramentum.content;

import io.github.ciph3rj.atramentum.fluid.*;
import io.github.ciph3rj.cipherlib.helper.RegistryHelper;
import net.minecraft.world.level.material.FlowingFluid;

public interface AtramentumFluids {
    FlowingFluid INK = RegistryHelper.registerFluid("ink", new InkFluid.Source());
    FlowingFluid FLOWING_INK = RegistryHelper.registerFluid("flowing_ink", new InkFluid.Flowing());
    FlowingFluid GLOW_INK = RegistryHelper.registerFluid("glow_ink", new GlowInkFluid.Source());
    FlowingFluid GLOW_FLOWING_INK = RegistryHelper.registerFluid("glow_flowing_ink", new GlowInkFluid.Flowing());
    FlowingFluid WHITE_INK = RegistryHelper.registerFluid("white_ink", new WhiteInkFluid.Source());
    FlowingFluid WHITE_FLOWING_INK = RegistryHelper.registerFluid("white_flowing_ink", new WhiteInkFluid.Flowing());
    FlowingFluid LIGHT_GRAY_INK = RegistryHelper.registerFluid("light_gray_ink", new LightGrayInkFluid.Source());
    FlowingFluid LIGHT_GRAY_FLOWING_INK = RegistryHelper.registerFluid("light_gray_flowing_ink", new LightGrayInkFluid.Flowing());
    FlowingFluid GRAY_INK = RegistryHelper.registerFluid("gray_ink", new GrayInkFluid.Source());
    FlowingFluid GRAY_FLOWING_INK = RegistryHelper.registerFluid("gray_flowing_ink", new GrayInkFluid.Flowing());
    FlowingFluid BROWN_INK = RegistryHelper.registerFluid("brown_ink", new BrownInkFluid.Source());
    FlowingFluid BROWN_FLOWING_INK = RegistryHelper.registerFluid("brown_flowing_ink", new BrownInkFluid.Flowing());
    FlowingFluid RED_INK = RegistryHelper.registerFluid("red_ink", new RedInkFluid.Source());
    FlowingFluid RED_FLOWING_INK = RegistryHelper.registerFluid("red_flowing_ink", new RedInkFluid.Flowing());
    FlowingFluid ORANGE_INK = RegistryHelper.registerFluid("orange_ink", new OrangeInkFluid.Source());
    FlowingFluid ORANGE_FLOWING_INK = RegistryHelper.registerFluid("orange_flowing_ink", new OrangeInkFluid.Flowing());
    FlowingFluid YELLOW_INK = RegistryHelper.registerFluid("yellow_ink", new YellowInkFluid.Source());
    FlowingFluid YELLOW_FLOWING_INK = RegistryHelper.registerFluid("yellow_flowing_ink", new YellowInkFluid.Flowing());
    FlowingFluid LIME_INK = RegistryHelper.registerFluid("lime_ink", new LimeInkFluid.Source());
    FlowingFluid LIME_FLOWING_INK = RegistryHelper.registerFluid("lime_flowing_ink", new LimeInkFluid.Flowing());
    FlowingFluid GREEN_INK = RegistryHelper.registerFluid("green_ink", new GreenInkFluid.Source());
    FlowingFluid GREEN_FLOWING_INK = RegistryHelper.registerFluid("green_flowing_ink", new GreenInkFluid.Flowing());
    FlowingFluid CYAN_INK = RegistryHelper.registerFluid("cyan_ink", new CyanInkFluid.Source());
    FlowingFluid CYAN_FLOWING_INK = RegistryHelper.registerFluid("cyan_flowing_ink", new CyanInkFluid.Flowing());
    FlowingFluid LIGHT_BLUE_INK = RegistryHelper.registerFluid("light_blue_ink", new LightBlueInkFluid.Source());
    FlowingFluid LIGHT_BLUE_FLOWING_INK = RegistryHelper.registerFluid("light_blue_flowing_ink", new LightBlueInkFluid.Flowing());
    FlowingFluid BLUE_INK = RegistryHelper.registerFluid("blue_ink", new BlueInkFluid.Source());
    FlowingFluid BLUE_FLOWING_INK = RegistryHelper.registerFluid("blue_flowing_ink", new BlueInkFluid.Flowing());
    FlowingFluid PURPLE_INK = RegistryHelper.registerFluid("purple_ink", new PurpleInkFluid.Source());
    FlowingFluid PURPLE_FLOWING_INK = RegistryHelper.registerFluid("purple_flowing_ink", new PurpleInkFluid.Flowing());
    FlowingFluid MAGENTA_INK = RegistryHelper.registerFluid("magenta_ink", new MagentaInkFluid.Source());
    FlowingFluid MAGENTA_FLOWING_INK = RegistryHelper.registerFluid("magenta_flowing_ink", new MagentaInkFluid.Flowing());
    FlowingFluid PINK_INK = RegistryHelper.registerFluid("pink_ink", new PinkInkFluid.Source());
    FlowingFluid PINK_FLOWING_INK = RegistryHelper.registerFluid("pink_flowing_ink", new PinkInkFluid.Flowing());

    static void init() {}
}
