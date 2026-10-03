package io.github.ciph3rj.atramentum.mixin;

import io.github.ciph3rj.atramentum.content.AtramentumItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.AgeableWaterCreature;
import net.minecraft.world.entity.animal.squid.Squid;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Squid.class)
public abstract class SquidMixin extends AgeableWaterCreature {
    public SquidMixin(EntityType<? extends AgeableWaterCreature> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (itemStack.is(Items.BUCKET) && !this.isBaby()) {
            player.playSound(SoundEvents.COW_MILK, 1.0F, 1.0F);
            if (this.getType() == EntityType.GLOW_SQUID) {
                ItemStack itemStack2 = ItemUtils.createFilledResult(itemStack, player, AtramentumItems.GLOW_INK_BUCKET.getDefaultInstance());
                player.setItemInHand(hand, itemStack2);
            } else {
                ItemStack itemStack2 = ItemUtils.createFilledResult(itemStack, player, AtramentumItems.INK_BUCKET.getDefaultInstance());
                player.setItemInHand(hand, itemStack2);
            }
            return InteractionResult.SUCCESS;
        } else {
            return super.mobInteract(player, hand);
        }
    }
}
