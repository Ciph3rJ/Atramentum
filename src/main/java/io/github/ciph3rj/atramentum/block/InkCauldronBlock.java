package io.github.ciph3rj.atramentum.block;

import com.mojang.serialization.MapCodec;
import io.github.ciph3rj.atramentum.Atramentum;
import io.github.ciph3rj.atramentum.content.AtramentumMobEffects;
import io.github.ciph3rj.atramentum.util.AtramentumCauldronInteraction;
import io.github.ciph3rj.atramentum.util.AtramentumTags;
import io.github.ciph3rj.atramentum.util.LivingEntityAccessor;
import io.github.ciph3rj.atramentum.util.inkplayereffects.InkPlayerEffect;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.AbstractCauldronBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.HashMap;
import java.util.Map;

public class InkCauldronBlock extends AbstractCauldronBlock implements CauldronInteraction {
    public static final BooleanProperty DRIED = Atramentum.DRIED;
    private final InteractionMap cauldronBehaviorMap;
    public static Map<Block, InkPlayerEffect> INK_EFFECTS = new HashMap<>();
    public static Map<Block, Block> DRIED_BLOCKS = new HashMap<>();

    public InkCauldronBlock(Properties settings, InteractionMap cauldronBehavior) {
        super(settings, cauldronBehavior);
        cauldronBehaviorMap = cauldronBehavior;
        this.registerDefaultState(this.defaultBlockState().setValue(DRIED, false));
    }

    @Override
    protected MapCodec<? extends AbstractCauldronBlock> codec() {
        return simpleCodec(settings1 -> new InkCauldronBlock(settings1, cauldronBehaviorMap));
    }

    public VoxelShape makeDriedShape(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0, 0, 0, 0.125, 0.1875, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0.125, 0.125, 0.1875, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0, 0.25, 0.1875, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.8125, 0, 0, 0.9375, 0.1875, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.9375, 0, 0.125, 1.0625, 0.1875, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.9375, 0, 0, 1.0625, 0.1875, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.9375, 0, 0.875, 1.0625, 0.1875, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.9375, 0, 0.75, 1.0625, 0.1875, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.8125, 0, 0.875, 0.9375, 0.1875, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.875, 0.25, 0.1875, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0.75, 0.125, 0.1875, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0.875, 0.125, 0.1875, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.1875, 0, 1.0625, 0.25, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.25, 0, 0.125, 1.0625, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.9375, 0.25, 0, 1.0625, 1.0625, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.25, 0, 0.9375, 1.0625, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.25, 0.875, 0.9375, 1.0625, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.25, 0.125, 0.9375, 1, 0.875), BooleanOp.OR);

        return shape;
    }

    @Override
    protected VoxelShape getCollisionShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        if (blockState.getValue(DRIED)) return makeDriedShape();
        return super.getCollisionShape(blockState, blockGetter, blockPos, collisionContext);
    }

    @Override
    protected boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    @Override
    protected int getAnalogOutputSignal(BlockState state, Level world, BlockPos pos, Direction direction) {
        return world.getBlockState(pos).getValue(DRIED) ? 4 : 2;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(DRIED);
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return !state.getValue(DRIED);
    }

    protected void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if ((world.getBlockState(pos.below()).is(AtramentumTags.BlockTags.CAULDRON_HEAT_SOURCES)) && !world.getBlockState(pos).getValue(DRIED))
            world.setBlockAndUpdate(pos, state.setValue(DRIED, true));
        super.randomTick(state, world, pos, random);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState blockState, Level level, BlockPos pos, Player player, BlockHitResult blockHitResult) {
        if (level.getBlockState(pos).getValue(DRIED)) {
            if (DRIED_BLOCKS.containsKey(this)) {
                player.handleExtraItemsCreatedOnUse(new ItemStack(getDriedFromBlock(this)));
                level.setBlockAndUpdate(pos, Blocks.CAULDRON.defaultBlockState());
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }

    @Override
    protected ItemStack getCloneItemStack(LevelReader world, BlockPos pos, BlockState state, boolean includeData) {
        return new ItemStack(Items.CAULDRON);
    }

    @Override
    public boolean isFull(BlockState state) {
        return true;
    }

    public static InkPlayerEffect getFromBlock(Block ink) {
        return INK_EFFECTS.get(ink);
    }

    public static Block getDriedFromBlock(Block cauldron) {
        return DRIED_BLOCKS.get(cauldron);
    }

    @Override
    protected void entityInside(BlockState blockState, Level level, BlockPos blockPos, Entity entity, InsideBlockEffectApplier insideBlockEffectApplier, boolean bl) {
        if (entity instanceof LivingEntityAccessor livingEntityAccessor && !blockState.getValue(DRIED)) {
            if (INK_EFFECTS.containsKey(this)) livingEntityAccessor.setInkEffect(getFromBlock(this));
            if (entity instanceof LivingEntity livingEntity && !livingEntity.getType().is(AtramentumTags.EntityTypeTags.IMMUNE_TO_INKED))
                livingEntity.addEffect(new MobEffectInstance(AtramentumMobEffects.INKED, 200, 0));
        }
        super.entityInside(blockState, level, blockPos, entity, insideBlockEffectApplier, bl);
    }

    @Override
    public InteractionResult interact(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
        ItemStack itemStack = player.getItemInHand(hand);
        CauldronInteraction cauldronBehavior = AtramentumCauldronInteraction.inkBehavior.map().get(itemStack.getItem());
        return cauldronBehavior.interact(state, world, pos, player, hand, itemStack);
    }
}
