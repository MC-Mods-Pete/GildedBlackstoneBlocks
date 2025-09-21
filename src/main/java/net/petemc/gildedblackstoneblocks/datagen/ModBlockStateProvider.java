package net.petemc.gildedblackstoneblocks.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.petemc.gildedblackstoneblocks.GildedBlackstoneBlocks;
import net.petemc.gildedblackstoneblocks.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, GildedBlackstoneBlocks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        stairsBlock(((StairBlock) ModBlocks.GILDED_BLACKSTONE_STAIRS.get()), blockTexture(Blocks.GILDED_BLACKSTONE));
        slabBlock(((SlabBlock) ModBlocks.GILDED_BLACKSTONE_SLAB.get()), blockTexture(Blocks.GILDED_BLACKSTONE), blockTexture(Blocks.GILDED_BLACKSTONE));
        wallBlock((WallBlock) ModBlocks.GILDED_BLACKSTONE_WALL.get(), blockTexture(Blocks.GILDED_BLACKSTONE));
        buttonBlock(((ButtonBlock) ModBlocks.GILDED_BLACKSTONE_BUTTON.get()), blockTexture(Blocks.GILDED_BLACKSTONE));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.GILDED_BLACKSTONE_PLATE.get()), blockTexture(Blocks.GILDED_BLACKSTONE));

        blockWithItem(ModBlocks.POLISHED_GILDED_BLACKSTONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_GILDED_BLACKSTONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_GILDED_BLACKSTONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()), blockTexture(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()));
        wallBlock((WallBlock) ModBlocks.POLISHED_GILDED_BLACKSTONE_WALL.get(), blockTexture(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()));
        buttonBlock(((ButtonBlock) ModBlocks.POLISHED_GILDED_BLACKSTONE_BUTTON.get()), blockTexture(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.POLISHED_GILDED_BLACKSTONE_PLATE.get()), blockTexture(ModBlocks.POLISHED_GILDED_BLACKSTONE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CHISELED_POLISHED_GILDED_BLACKSTONE.get()), blockTexture(ModBlocks.CHISELED_POLISHED_GILDED_BLACKSTONE.get()),
                ResourceLocation.fromNamespaceAndPath(GildedBlackstoneBlocks.MOD_ID, "block/chiseled_polished_gilded_blackstone_top"));
        blockItem(ModBlocks.CHISELED_POLISHED_GILDED_BLACKSTONE);

        blockWithItem(ModBlocks.GILDED_BLACKSTONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.GILDED_BLACKSTONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.GILDED_BLACKSTONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.GILDED_BLACKSTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.GILDED_BLACKSTONE_BRICKS.get()), blockTexture(ModBlocks.GILDED_BLACKSTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.GILDED_BLACKSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.GILDED_BLACKSTONE_BRICKS.get()));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(GildedBlackstoneBlocks.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
