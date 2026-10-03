package io.github.ciph3rj.atramentum.data.generator;

import io.github.ciph3rj.atramentum.block.DriedInkBlockFamily;
import io.github.ciph3rj.atramentum.content.AtramentumBlocks;
import io.github.ciph3rj.atramentum.content.AtramentumItems;
import io.github.ciph3rj.cipherlib.helper.CipherLibRecipeGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class AtramentumRecipeGenerator extends CipherLibRecipeGenerator {
    public AtramentumRecipeGenerator(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        super(provider, recipeOutput);
    }

    @Override
    public void buildRecipes() {
        this.shapeless(RecipeCategory.MISC, AtramentumItems.WHITE_INK_BUCKET).requires(Items.WHITE_DYE).requires(AtramentumItems.INK_BUCKET)
                .unlockedBy(getHasName(AtramentumItems.WHITE_INK_BUCKET), has(AtramentumItems.INK_BUCKET)).save(output);
        this.shapeless(RecipeCategory.MISC, AtramentumItems.LIGHT_GRAY_INK_BUCKET).requires(Items.LIGHT_GRAY_DYE).requires(AtramentumItems.INK_BUCKET)
                .unlockedBy(getHasName(AtramentumItems.LIGHT_GRAY_INK_BUCKET), has(AtramentumItems.INK_BUCKET)).save(output);
        this.shapeless(RecipeCategory.MISC, AtramentumItems.GRAY_INK_BUCKET).requires(Items.GRAY_DYE).requires(AtramentumItems.INK_BUCKET)
                .unlockedBy(getHasName(AtramentumItems.GRAY_INK_BUCKET), has(AtramentumItems.INK_BUCKET)).save(output);
        this.shapeless(RecipeCategory.MISC, AtramentumItems.BROWN_INK_BUCKET).requires(Items.BROWN_DYE).requires(AtramentumItems.INK_BUCKET)
                .unlockedBy(getHasName(AtramentumItems.BROWN_INK_BUCKET), has(AtramentumItems.INK_BUCKET)).save(output);
        this.shapeless(RecipeCategory.MISC, AtramentumItems.RED_INK_BUCKET).requires(Items.RED_DYE).requires(AtramentumItems.INK_BUCKET)
                .unlockedBy(getHasName(AtramentumItems.RED_INK_BUCKET), has(AtramentumItems.INK_BUCKET)).save(output);
        this.shapeless(RecipeCategory.MISC, AtramentumItems.ORANGE_INK_BUCKET).requires(Items.ORANGE_DYE).requires(AtramentumItems.INK_BUCKET)
                .unlockedBy(getHasName(AtramentumItems.ORANGE_INK_BUCKET), has(AtramentumItems.INK_BUCKET)).save(output);
        this.shapeless(RecipeCategory.MISC, AtramentumItems.YELLOW_INK_BUCKET).requires(Items.YELLOW_DYE).requires(AtramentumItems.INK_BUCKET)
                .unlockedBy(getHasName(AtramentumItems.YELLOW_INK_BUCKET), has(AtramentumItems.INK_BUCKET)).save(output);
        this.shapeless(RecipeCategory.MISC, AtramentumItems.LIME_INK_BUCKET).requires(Items.LIME_DYE).requires(AtramentumItems.INK_BUCKET)
                .unlockedBy(getHasName(AtramentumItems.LIME_INK_BUCKET), has(AtramentumItems.INK_BUCKET)).save(output);
        this.shapeless(RecipeCategory.MISC, AtramentumItems.GREEN_INK_BUCKET).requires(Items.GREEN_DYE).requires(AtramentumItems.INK_BUCKET)
                .unlockedBy(getHasName(AtramentumItems.GREEN_INK_BUCKET), has(AtramentumItems.INK_BUCKET)).save(output);
        this.shapeless(RecipeCategory.MISC, AtramentumItems.CYAN_INK_BUCKET).requires(Items.CYAN_DYE).requires(AtramentumItems.INK_BUCKET)
                .unlockedBy(getHasName(AtramentumItems.CYAN_INK_BUCKET), has(AtramentumItems.INK_BUCKET)).save(output);
        this.shapeless(RecipeCategory.MISC, AtramentumItems.LIGHT_BLUE_INK_BUCKET).requires(Items.LIGHT_BLUE_DYE).requires(AtramentumItems.INK_BUCKET)
                .unlockedBy(getHasName(AtramentumItems.LIGHT_BLUE_INK_BUCKET), has(AtramentumItems.INK_BUCKET)).save(output);
        this.shapeless(RecipeCategory.MISC, AtramentumItems.BLUE_INK_BUCKET).requires(Items.BLUE_DYE).requires(AtramentumItems.INK_BUCKET)
                .unlockedBy(getHasName(AtramentumItems.BLUE_INK_BUCKET), has(AtramentumItems.INK_BUCKET)).save(output);
        this.shapeless(RecipeCategory.MISC, AtramentumItems.PURPLE_INK_BUCKET).requires(Items.PURPLE_DYE).requires(AtramentumItems.INK_BUCKET)
                .unlockedBy(getHasName(AtramentumItems.PURPLE_INK_BUCKET), has(AtramentumItems.INK_BUCKET)).save(output);
        this.shapeless(RecipeCategory.MISC, AtramentumItems.MAGENTA_INK_BUCKET).requires(Items.MAGENTA_DYE).requires(AtramentumItems.INK_BUCKET)
                .unlockedBy(getHasName(AtramentumItems.MAGENTA_INK_BUCKET), has(AtramentumItems.INK_BUCKET)).save(output);
        this.shapeless(RecipeCategory.MISC, AtramentumItems.PINK_INK_BUCKET).requires(Items.PINK_DYE).requires(AtramentumItems.INK_BUCKET)
                .unlockedBy(getHasName(AtramentumItems.PINK_INK_BUCKET), has(AtramentumItems.INK_BUCKET)).save(output);

        this.offerStairsRecipeWithStonecutting(AtramentumBlocks.DRIED_GLOW_INK, AtramentumBlocks.DRIED_GLOW_INK_STAIRS);
        this.offerSlabRecipeWithStonecutting(AtramentumBlocks.DRIED_GLOW_INK, AtramentumBlocks.DRIED_GLOW_INK_SLAB);
        this.offerWallRecipeWithStonecutting(AtramentumBlocks.DRIED_GLOW_INK, AtramentumBlocks.DRIED_GLOW_INK_WALL);
        this.shaped(RecipeCategory.BUILDING_BLOCKS, AtramentumBlocks.DRIED_GLOW_INK_BRICKS, 4).define('#', AtramentumBlocks.DRIED_GLOW_INK).pattern("##").pattern("##")
                .unlockedBy(getHasName(AtramentumBlocks.DRIED_GLOW_INK_BRICKS), has(AtramentumBlocks.DRIED_GLOW_INK)).save(output);
        this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, AtramentumBlocks.DRIED_GLOW_INK_BRICKS, AtramentumBlocks.DRIED_GLOW_INK);
        this.offerStairsRecipeWithStonecutting(AtramentumBlocks.DRIED_GLOW_INK, AtramentumBlocks.DRIED_GLOW_INK_BRICK_STAIRS);
        this.offerSlabRecipeWithStonecutting(AtramentumBlocks.DRIED_GLOW_INK, AtramentumBlocks.DRIED_GLOW_INK_BRICK_SLAB);
        this.offerWallRecipeWithStonecutting(AtramentumBlocks.DRIED_GLOW_INK, AtramentumBlocks.DRIED_GLOW_INK_BRICK_WALL);
        this.shaped(RecipeCategory.BUILDING_BLOCKS, AtramentumBlocks.DRIED_GLOW_INK_TILES, 4).define('#', AtramentumBlocks.DRIED_GLOW_INK_BRICKS).pattern("##").pattern("##")
                .unlockedBy(getHasName(AtramentumBlocks.DRIED_GLOW_INK_TILES), has(AtramentumBlocks.DRIED_GLOW_INK_BRICKS)).save(output);
        this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, AtramentumBlocks.DRIED_GLOW_INK_TILES, AtramentumBlocks.DRIED_GLOW_INK_BRICKS);
        this.offerStairsRecipeWithStonecutting(AtramentumBlocks.DRIED_GLOW_INK_BRICKS, AtramentumBlocks.DRIED_GLOW_INK_TILE_STAIRS);
        this.offerSlabRecipeWithStonecutting(AtramentumBlocks.DRIED_GLOW_INK_BRICKS, AtramentumBlocks.DRIED_GLOW_INK_TILE_SLAB);
        this.offerWallRecipeWithStonecutting(AtramentumBlocks.DRIED_GLOW_INK_BRICKS, AtramentumBlocks.DRIED_GLOW_INK_TILE_WALL);
        
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_INK_FAMILY, output);
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_WHITE_INK_FAMILY, output);
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_LIGHT_GRAY_INK_FAMILY, output);
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_GRAY_INK_FAMILY, output);
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_BROWN_INK_FAMILY, output);
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_RED_INK_FAMILY, output);
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_ORANGE_INK_FAMILY, output);
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_YELLOW_INK_FAMILY, output);
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_LIME_INK_FAMILY, output);
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_GREEN_INK_FAMILY, output);
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_CYAN_INK_FAMILY, output);
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_LIGHT_BLUE_INK_FAMILY, output);
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_BLUE_INK_FAMILY, output);
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_PURPLE_INK_FAMILY, output);
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_MAGENTA_INK_FAMILY, output);
        DriedInkBlockFamily.generateRecipes(this, AtramentumBlocks.DRIED_PINK_INK_FAMILY, output);
    }

    public static class Provider extends Runner {
        public Provider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
            super(packOutput, completableFuture);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new AtramentumRecipeGenerator(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "Recipe Provider";
        }
    }
}
