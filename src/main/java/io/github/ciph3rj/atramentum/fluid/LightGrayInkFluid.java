package io.github.ciph3rj.atramentum.fluid;

import io.github.ciph3rj.atramentum.content.AtramentumBlocks;
import io.github.ciph3rj.atramentum.content.AtramentumFluids;
import io.github.ciph3rj.atramentum.content.AtramentumItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;

public abstract class LightGrayInkFluid extends AbstractInkFluid {
    @Override
    public Fluid getSource() {
        return AtramentumFluids.LIGHT_GRAY_INK;
    }

    @Override
    public Fluid getFlowing() {
        return AtramentumFluids.LIGHT_GRAY_FLOWING_INK;
    }

    @Override
    public Item getBucket() {
        return AtramentumItems.LIGHT_GRAY_INK_BUCKET;
    }

    @Override
    protected BlockState createLegacyBlock(FluidState fluidState) {
        return AtramentumBlocks.LIGHT_GRAY_INK.defaultBlockState().setValue(LiquidBlock.LEVEL, getLegacyLevel(fluidState));
    }

    @Override
    public boolean isSame(Fluid fluid) {
        return fluid == AtramentumFluids.LIGHT_GRAY_INK || fluid == AtramentumFluids.LIGHT_GRAY_FLOWING_INK;
    }

    public static class Flowing extends LightGrayInkFluid {
        @Override
        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        @Override
        public boolean isSource(FluidState fluidState) {
            return false;
        }

        @Override
        public int getAmount(FluidState fluidState) {
            return fluidState.getValue(LEVEL);
        }
    }

    public static class Source extends LightGrayInkFluid {
        @Override
        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        @Override
        public boolean isSource(FluidState fluidState) {
            return true;
        }

        @Override
        public int getAmount(FluidState fluidState) {
            return 6;
        }
    }
}
