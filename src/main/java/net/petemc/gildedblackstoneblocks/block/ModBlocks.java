package net.petemc.gildedblackstoneblocks.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.petemc.gildedblackstoneblocks.GildedBlackstoneBlocks;

public class ModBlocks {

    public static final Block GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs",
            new StairsBlock(Blocks.GILDED_BLACKSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)
                    .sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_BUTTON = registerBlock("gilded_blackstone_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_PLATE = registerBlock("gilded_blackstone_pressure_plate",
            new PressurePlateBlock(new BlockSetType("gilded_blackstone", true, true, false, BlockSetType.ActivationRule.EVERYTHING, BlockSoundGroup.GILDED_BLACKSTONE, SoundEvents.BLOCK_NETHER_WOOD_DOOR_CLOSE, SoundEvents.BLOCK_NETHER_WOOD_DOOR_OPEN, SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_OPEN, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON),
                    AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));


    public static final Block POLISHED_GILDED_BLACKSTONE = registerBlock("polished_gilded_blackstone",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block POLISHED_GILDED_BLACKSTONE_STAIRS = registerBlock("polished_gilded_blackstone_stairs",
            new StairsBlock(ModBlocks.POLISHED_GILDED_BLACKSTONE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)
                    .sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block POLISHED_GILDED_BLACKSTONE_SLAB = registerBlock("polished_gilded_blackstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_SLAB).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block POLISHED_GILDED_BLACKSTONE_WALL = registerBlock("polished_gilded_blackstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_WALL).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block POLISHED_GILDED_BLACKSTONE_BUTTON = registerBlock("polished_gilded_blackstone_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.STONE_BUTTON).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block POLISHED_GILDED_BLACKSTONE_PLATE = registerBlock("polished_gilded_blackstone_pressure_plate",
            new PressurePlateBlock(new BlockSetType("polished_gilded_blackstone", true, true, false, BlockSetType.ActivationRule.EVERYTHING, BlockSoundGroup.GILDED_BLACKSTONE, SoundEvents.BLOCK_NETHER_WOOD_DOOR_CLOSE, SoundEvents.BLOCK_NETHER_WOOD_DOOR_OPEN, SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_OPEN, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON),
                    AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block CHISELED_POLISHED_GILDED_BLACKSTONE = registerBlock("chiseled_polished_gilded_blackstone",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_POLISHED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));

    public static final Block GILDED_BLACKSTONE_BRICKS = registerBlock("gilded_blackstone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_BRICK_STAIRS = registerBlock("gilded_blackstone_brick_stairs",
            new StairsBlock(ModBlocks.GILDED_BLACKSTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_BRICK_SLAB = registerBlock("gilded_blackstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_BRICK_WALL = registerBlock("gilded_blackstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_WALL).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));


    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(GildedBlackstoneBlocks.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GildedBlackstoneBlocks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GildedBlackstoneBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        GildedBlackstoneBlocks.LOGGER.info("Registering Mod Blocks for " + GildedBlackstoneBlocks.MOD_ID);
    }
}
