package io.github.ciph3rj.atramentum;

import io.github.ciph3rj.atramentum.client.InkFogEnvironment;
import io.github.ciph3rj.atramentum.content.*;
import io.github.ciph3rj.atramentum.util.AtramentumCauldronInteraction;
import io.github.ciph3rj.atramentum.util.AtramentumTags;
import io.github.ciph3rj.atramentum.util.inkplayereffects.InkPlayerEffectRegistry;
import io.github.ciph3rj.cipherlib.Cipher;
import net.fabricmc.api.ModInitializer;
import net.minecraft.SharedConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.fog.FogRenderer;
import net.minecraft.client.renderer.fog.environment.AtmosphericFogEnvironment;
import net.minecraft.core.BlockPos;
import net.minecraft.core.dispenser.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.DispensibleContainerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Atramentum implements ModInitializer {
	public static final String MOD_ID = "atramentum";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	DispenseItemBehavior bucketDispenseItemBehavior = new DefaultDispenseItemBehavior() {
		private final DefaultDispenseItemBehavior defaultDispenseItemBehavior = new DefaultDispenseItemBehavior();

		public ItemStack execute(BlockSource blockSource, ItemStack itemStack) {
			DispensibleContainerItem dispensibleContainerItem = (DispensibleContainerItem)itemStack.getItem();
			BlockPos blockPos = blockSource.pos().relative(blockSource.state().getValue(DispenserBlock.FACING));
			Level level = blockSource.level();
			if (dispensibleContainerItem.emptyContents(null, level, blockPos, null)) {
				dispensibleContainerItem.checkExtraContent(null, level, itemStack, blockPos);
				return this.consumeWithRemainder(blockSource, itemStack, new ItemStack(Items.BUCKET));
			} else {
				return this.defaultDispenseItemBehavior.dispense(blockSource, itemStack);
			}
		}
	};

	public static final BooleanProperty DRIED = BooleanProperty.create("dried");

	// TODO: Fix ink effect not saving and/or loading after leaving world

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Atramentum");

		SharedConstants.IS_RUNNING_IN_IDE = true;

		Cipher.addModId(MOD_ID);

		var atmospheric = FogRenderer.FOG_ENVIRONMENTS.stream().filter(i -> i instanceof AtmosphericFogEnvironment).toList();
		if (Minecraft.getInstance().player != null && Minecraft.getInstance().player.level().getFluidState(BlockPos.containing(Minecraft.getInstance().player.getEyePosition())).is(AtramentumTags.FluidTags.INK)) {
			FogRenderer.FOG_ENVIRONMENTS.add(new InkFogEnvironment());
		} else {
			FogRenderer.FOG_ENVIRONMENTS.add(FogRenderer.FOG_ENVIRONMENTS.indexOf(atmospheric.getLast()), new InkFogEnvironment());
		}

		AtramentumBlocks.init();
		AtramentumCauldronInteraction.registerBehavior();
		AtramentumFluids.init();

		AtramentumItems.init();
		AtramentumCreativeModeTabs.init();

		AtramentumMobEffects.init();

		InkPlayerEffectRegistry.loadAtramentumInkEffects();
		AtramentumParticleTypes.init();

		AtramentumTags.BlockTags.init();
		AtramentumTags.ItemTags.init();
		AtramentumTags.EntityTypeTags.init();
		AtramentumTags.FluidTags.init();

		//////////////////////////

		DispenserBlock.registerBehavior(AtramentumItems.INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.GLOW_INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.WHITE_INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.LIGHT_GRAY_INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.GRAY_INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.BROWN_INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.RED_INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.ORANGE_INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.YELLOW_INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.LIME_INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.GREEN_INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.CYAN_INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.LIGHT_BLUE_INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.BLUE_INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.PURPLE_INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.MAGENTA_INK_BUCKET, bucketDispenseItemBehavior);
		DispenserBlock.registerBehavior(AtramentumItems.PINK_INK_BUCKET, bucketDispenseItemBehavior);

/*		HudEvents.SCREEN_OVERLAY.register(player -> {
			if (player instanceof LivingEntityAccessor livingEntityAccessor && livingEntityAccessor.getInkEffect() == AtramentumInkPlayerEffects.GLOW && player.hasEffect(AtramentumMobEffects.INKED)) {
				return Atramentum.id("textures/misc/glow_ink_submerged_overlay.png");
			}
            return null;
        });*/

		LOGGER.info("Finished Initializing Atramentum");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
