package net.petemc.gildedblackstoneblocks.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.petemc.gildedblackstoneblocks.GildedBlackstoneBlocks;
import net.petemc.gildedblackstoneblocks.block.ModBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, List.of(Blocks.GILDED_BLACKSTONE), RecipeCategory.MISC, Items.GOLD_INGOT, 0.0f, 200, "gold_ingot");
        oreBlasting(pWriter, List.of(Blocks.GILDED_BLACKSTONE), RecipeCategory.MISC, Items.GOLD_INGOT, 0.0f, 100, "gold_ingot");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.GILDED_BLACKSTONE)
                .requires(Blocks.BLACKSTONE,1)
                .requires(Items.GOLD_INGOT,1)
                .unlockedBy(getHasName(Blocks.GILDED_BLACKSTONE), has(Blocks.GILDED_BLACKSTONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_STAIRS.get(), 4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .define('W', Blocks.GILDED_BLACKSTONE)
                .unlockedBy(getHasName(Blocks.GILDED_BLACKSTONE), has(Blocks.GILDED_BLACKSTONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_SLAB.get(), 6)
                .pattern("WWW")
                .define('W', Blocks.GILDED_BLACKSTONE)
                .unlockedBy(getHasName(Blocks.GILDED_BLACKSTONE), has(Blocks.GILDED_BLACKSTONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_WALL.get(), 6)
                .pattern("WWW")
                .pattern("WWW")
                .define('W', Blocks.GILDED_BLACKSTONE)
                .unlockedBy(getHasName(Blocks.GILDED_BLACKSTONE), has(Blocks.GILDED_BLACKSTONE))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_BUTTON.get())
                .requires(Blocks.GILDED_BLACKSTONE,1)
                .unlockedBy(getHasName(Blocks.GILDED_BLACKSTONE), has(Blocks.GILDED_BLACKSTONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_PLATE.get())
                .pattern("WW")
                .define('W', Blocks.GILDED_BLACKSTONE)
                .unlockedBy(getHasName(Blocks.GILDED_BLACKSTONE), has(Blocks.GILDED_BLACKSTONE))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GILDED_BLACKSTONE.get())
                .pattern("WW")
                .pattern("WW")
                .define('W', Blocks.GILDED_BLACKSTONE)
                .unlockedBy(getHasName(Blocks.GILDED_BLACKSTONE), has(Blocks.GILDED_BLACKSTONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GILDED_BLACKSTONE_STAIRS.get(), 4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .define('W', ModBlocks.POLISHED_GILDED_BLACKSTONE.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()), has(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GILDED_BLACKSTONE_SLAB.get(), 6)
                .pattern("WWW")
                .define('W', ModBlocks.POLISHED_GILDED_BLACKSTONE.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()), has(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GILDED_BLACKSTONE_WALL.get(), 6)
                .pattern("WWW")
                .pattern("WWW")
                .define('W', ModBlocks.POLISHED_GILDED_BLACKSTONE.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()), has(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GILDED_BLACKSTONE_BUTTON.get())
                .requires(ModBlocks.POLISHED_GILDED_BLACKSTONE.get(),1)
                .unlockedBy(getHasName(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()), has(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GILDED_BLACKSTONE_PLATE.get())
                .pattern("WW")
                .define('W', ModBlocks.POLISHED_GILDED_BLACKSTONE.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()), has(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_POLISHED_GILDED_BLACKSTONE.get())
                .pattern("W")
                .pattern("W")
                .define('W', ModBlocks.POLISHED_GILDED_BLACKSTONE_SLAB.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()), has(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_BRICKS.get(), 4)
                .pattern("WW")
                .pattern("WW")
                .define('W', ModBlocks.POLISHED_GILDED_BLACKSTONE.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()), has(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_BRICK_STAIRS.get(), 4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .define('W', ModBlocks.GILDED_BLACKSTONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()), has(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_BRICK_SLAB.get(), 6)
                .pattern("WWW")
                .define('W', ModBlocks.GILDED_BLACKSTONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()), has(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_BRICK_WALL.get(), 6)
                .pattern("WWW")
                .pattern("WWW")
                .define('W', ModBlocks.GILDED_BLACKSTONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()), has(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory, @NotNull ItemLike pResult, float pExperience, int pCookingTIme, @NotNull String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory, @NotNull ItemLike pResult, float pExperience, int pCookingTime, @NotNull String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer, @NotNull RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory, @NotNull ItemLike pResult, float pExperience, int pCookingTime, @NotNull String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  GildedBlackstoneBlocks.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
