package io.github.ciph3rj.atramentum.util.cauldron;

import io.github.ciph3rj.atramentum.content.AtramentumBlocks;
import io.github.ciph3rj.atramentum.content.AtramentumItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.FluidState;

import java.util.Map;
import java.util.function.Predicate;

public interface AtramentumCauldronInteraction {
    CauldronInteraction.InteractionMap inkBehavior = CauldronInteraction.newInteractionMap("ink_behavior");
    CauldronInteraction.InteractionMap glowInkBehavior = CauldronInteraction.newInteractionMap("glow_ink_behavior");
    CauldronInteraction.InteractionMap whiteInkBehavior = CauldronInteraction.newInteractionMap("white_ink_behavior");
    CauldronInteraction.InteractionMap lightGrayInkBehavior = CauldronInteraction.newInteractionMap("light_gray_ink_behavior");
    CauldronInteraction.InteractionMap grayInkBehavior = CauldronInteraction.newInteractionMap("gray_ink_behavior");
    CauldronInteraction.InteractionMap brownInkBehavior = CauldronInteraction.newInteractionMap("brown_ink_behavior");
    CauldronInteraction.InteractionMap redInkBehavior = CauldronInteraction.newInteractionMap("red_ink_behavior");
    CauldronInteraction.InteractionMap orangeInkBehavior = CauldronInteraction.newInteractionMap("orange_ink_behavior");
    CauldronInteraction.InteractionMap yellowInkBehavior = CauldronInteraction.newInteractionMap("yellow_ink_behavior");
    CauldronInteraction.InteractionMap greenInkBehavior = CauldronInteraction.newInteractionMap("green_ink_behavior");
    CauldronInteraction.InteractionMap limeInkBehavior = CauldronInteraction.newInteractionMap("lime_ink_behavior");
    CauldronInteraction.InteractionMap blueInkBehavior = CauldronInteraction.newInteractionMap("blue_ink_behavior");
    CauldronInteraction.InteractionMap cyanInkBehavior = CauldronInteraction.newInteractionMap("cyan_ink_behavior");
    CauldronInteraction.InteractionMap lightBlueInkBehavior = CauldronInteraction.newInteractionMap("light_blue_ink_behavior");
    CauldronInteraction.InteractionMap purpleInkBehavior = CauldronInteraction.newInteractionMap("purple_ink_behavior");
    CauldronInteraction.InteractionMap magentaInkBehavior = CauldronInteraction.newInteractionMap("magenta_ink_behavior");
    CauldronInteraction.InteractionMap pinkInkBehavior = CauldronInteraction.newInteractionMap("pink_ink_behavior");

    CauldronInteraction.InteractionMap maroonInkBehavior = CauldronInteraction.newInteractionMap("maroon_ink_behavior");
    CauldronInteraction.InteractionMap scarletInkBehavior = CauldronInteraction.newInteractionMap("scarlet_ink_behavior");
    CauldronInteraction.InteractionMap amberInkBehavior = CauldronInteraction.newInteractionMap("amber_ink_behavior");
    CauldronInteraction.InteractionMap pearInkBehavior = CauldronInteraction.newInteractionMap("pear_ink_behavior");
    CauldronInteraction.InteractionMap pineInkBehavior = CauldronInteraction.newInteractionMap("pine_ink_behavior");
    CauldronInteraction.InteractionMap slateInkBehavior = CauldronInteraction.newInteractionMap("slate_ink_behavior");
    CauldronInteraction.InteractionMap lavenderInkBehavior = CauldronInteraction.newInteractionMap("lavender_ink_behavior");
    CauldronInteraction.InteractionMap salmonInkBehavior = CauldronInteraction.newInteractionMap("salmon_ink_behavior");

    static void registerBehavior() {
        inkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        glowInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.GLOW_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        whiteInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.WHITE_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        lightGrayInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.LIGHT_GRAY_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        grayInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.GRAY_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        brownInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.BROWN_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        redInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.RED_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        orangeInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.ORANGE_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        yellowInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.YELLOW_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        limeInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.LIME_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        greenInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.GREEN_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        cyanInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.CYAN_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        lightBlueInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.LIGHT_BLUE_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        blueInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.BLUE_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        purpleInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.PURPLE_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        magentaInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.MAGENTA_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        pinkInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(AtramentumItems.PINK_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));

/*        if (Metallum.checkForMortar) {
            maroonInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                    emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(MMCompatItems.MAROON_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
            scarletInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                    emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(MMCompatItems.SCARLET_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
            amberInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                    emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(MMCompatItems.AMBER_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
            pearInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                    emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(MMCompatItems.PEAR_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
            pineInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                    emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(MMCompatItems.PINE_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
            slateInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                    emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(MMCompatItems.SLATE_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
            lavenderInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                    emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(MMCompatItems.LAVENDER_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
            salmonInkBehavior.map().put(Items.BUCKET, (state, world, pos, player, hand, stack) ->
                    emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(MMCompatItems.SALMON_INK_BUCKET), (statex) -> true, SoundEvents.BUCKET_FILL_LAVA));
        }*/

        registerBucketBehavior(CauldronInteraction.EMPTY.map());
    }

    private static boolean isUnderwater(Level world, BlockPos pos) {
        FluidState fluidState = world.getFluidState(pos.above());
        return fluidState.is(FluidTags.WATER);
    }

    static InteractionResult emptyCauldron(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack, ItemStack output, Predicate<BlockState> fullPredicate, SoundEvent soundEvent) {
        /*if (!world.getBlockState(pos).getValue(AtramentumBlockProperties.DRIED)) {
            */if (!fullPredicate.test(state)) {
                return InteractionResult.TRY_WITH_EMPTY_HAND;
            } else {
                if (!world.isClientSide()) {
                    Item item = stack.getItem();
                    player.setItemInHand(hand, ItemUtils.createFilledResult(stack, player, output));
                    player.awardStat(Stats.USE_CAULDRON);
                    player.awardStat(Stats.ITEM_USED.get(item));
                    world.setBlockAndUpdate(pos, Blocks.CAULDRON.defaultBlockState());
                    world.playSound(null, pos, soundEvent, SoundSource.BLOCKS, 1.0F, 1.0F);
                    world.gameEvent(null, GameEvent.FLUID_PICKUP, pos);
                }

                return InteractionResult.SUCCESS;
            }
//        }
    }

    static InteractionResult fillCauldron(Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack, BlockState state, SoundEvent soundEvent) {
        if (!world.isClientSide()) {
            Item item = stack.getItem();
            player.setItemInHand(hand, ItemUtils.createFilledResult(stack, player, new ItemStack(Items.BUCKET)));
            player.awardStat(Stats.FILL_CAULDRON);
            player.awardStat(Stats.ITEM_USED.get(item));
            world.setBlockAndUpdate(pos, state);
            world.playSound(null, pos, soundEvent, SoundSource.BLOCKS, 1.0F, 1.0F);
            world.gameEvent(null, GameEvent.FLUID_PLACE, pos);
        }
        return InteractionResult.SUCCESS;
    }

    static void registerBucketBehavior(Map<Item, CauldronInteraction> behavior) {
        behavior.put(AtramentumItems.INK_BUCKET, AtramentumCauldronInteraction::tryFillWithInk);
        behavior.put(AtramentumItems.GLOW_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithGlowInk);
        behavior.put(AtramentumItems.WHITE_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithWhiteInk);
        behavior.put(AtramentumItems.LIGHT_GRAY_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithLightGrayInk);
        behavior.put(AtramentumItems.GRAY_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithGrayInk);
        behavior.put(AtramentumItems.BROWN_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithBrownInk);
        behavior.put(AtramentumItems.RED_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithRedInk);
        behavior.put(AtramentumItems.ORANGE_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithOrangeInk);
        behavior.put(AtramentumItems.YELLOW_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithYellowInk);
        behavior.put(AtramentumItems.LIME_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithLimeInk);
        behavior.put(AtramentumItems.GREEN_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithGreenInk);
        behavior.put(AtramentumItems.CYAN_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithCyanInk);
        behavior.put(AtramentumItems.LIGHT_BLUE_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithLightBlueInk);
        behavior.put(AtramentumItems.BLUE_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithBlueInk);
        behavior.put(AtramentumItems.PURPLE_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithPurpleInk);
        behavior.put(AtramentumItems.MAGENTA_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithMagentaInk);
        behavior.put(AtramentumItems.PINK_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithPinkInk);

/*        if (Metallum.checkForMortar) {
            behavior.put(MMCompatItems.MAROON_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithMaroonInk);
            behavior.put(MMCompatItems.SCARLET_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithScarletInk);
            behavior.put(MMCompatItems.AMBER_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithAmberInk);
            behavior.put(MMCompatItems.PEAR_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithPearInk);
            behavior.put(MMCompatItems.PINE_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithPineInk);
            behavior.put(MMCompatItems.SLATE_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithSlateInk);
            behavior.put(MMCompatItems.LAVENDER_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithLavenderInk);
            behavior.put(MMCompatItems.SALMON_INK_BUCKET, AtramentumCauldronInteraction::tryFillWithSalmonInk);
        }*/
    }

    private static InteractionResult tryFillWith(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return (isUnderwater(level, pos) ? InteractionResult.CONSUME : fillCauldron(level, pos, player, hand, stack, state, SoundEvents.BUCKET_EMPTY_LAVA));
    }

    private static InteractionResult tryFillWithInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithGlowInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.GLOW_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithWhiteInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.WHITE_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithLightGrayInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.LIGHT_GRAY_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithGrayInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.GRAY_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithBrownInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.BROWN_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithRedInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.RED_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithOrangeInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.ORANGE_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithYellowInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.YELLOW_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithLimeInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.LIME_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithGreenInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.GREEN_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithCyanInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.CYAN_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithLightBlueInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.LIGHT_BLUE_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithBlueInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.BLUE_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithPurpleInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.PURPLE_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithMagentaInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.MAGENTA_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithPinkInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(AtramentumBlocks.PINK_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }

    /*private static InteractionResult tryFillWithMaroonInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(MMCompatBlocks.MAROON_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithScarletInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(MMCompatBlocks.SCARLET_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithAmberInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(MMCompatBlocks.AMBER_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithPearInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(MMCompatBlocks.PEAR_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithPineInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(MMCompatBlocks.PINE_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithSlateInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(MMCompatBlocks.SLATE_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithLavenderInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(MMCompatBlocks.LAVENDER_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }
    private static InteractionResult tryFillWithSalmonInk(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        return tryFillWith(MMCompatBlocks.SALMON_INK_CAULDRON.defaultBlockState(), world, pos, player, hand, stack);
    }*/
}
