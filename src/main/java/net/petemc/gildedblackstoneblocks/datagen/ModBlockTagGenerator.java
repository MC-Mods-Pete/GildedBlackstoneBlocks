package net.petemc.gildedblackstoneblocks.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.petemc.gildedblackstoneblocks.GildedBlackstoneBlocks;
import net.petemc.gildedblackstoneblocks.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, GildedBlackstoneBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.GILDED_BLACKSTONE_STAIRS.get(),
                     ModBlocks.GILDED_BLACKSTONE_SLAB.get(),
                     ModBlocks.GILDED_BLACKSTONE_PLATE.get(),
                     ModBlocks.CHISELED_POLISHED_GILDED_BLACKSTONE.get(),
                     ModBlocks.POLISHED_GILDED_BLACKSTONE.get(),
                     ModBlocks.POLISHED_GILDED_BLACKSTONE_STAIRS.get(),
                     ModBlocks.POLISHED_GILDED_BLACKSTONE_SLAB.get(),
                     ModBlocks.POLISHED_GILDED_BLACKSTONE_PLATE.get(),
                     ModBlocks.GILDED_BLACKSTONE_BRICKS.get(),
                     ModBlocks.GILDED_BLACKSTONE_BRICK_STAIRS.get(),
                     ModBlocks.GILDED_BLACKSTONE_BRICK_SLAB.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.GILDED_BLACKSTONE_WALL.get(),
                     ModBlocks.POLISHED_GILDED_BLACKSTONE_WALL.get(),
                     ModBlocks.GILDED_BLACKSTONE_BRICK_WALL.get());
    }
}
