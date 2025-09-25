package net.petemc.gildedblackstoneblocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.petemc.gildedblackstoneblocks.GildedBlackstoneBlocks;

public class ModBlocks {

    public static final Block GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs",
            new StairsBlock(Blocks.GILDED_BLACKSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE)
                    .sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_BUTTON = registerBlock("gilded_blackstone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE),
                    BlockSetType.STONE, 10, true));
    public static final Block GILDED_BLACKSTONE_PLATE = registerBlock("gilded_blackstone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE),
                    BlockSetType.STONE));


    public static final Block POLISHED_GILDED_BLACKSTONE = registerBlock("polished_gilded_blackstone",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block POLISHED_GILDED_BLACKSTONE_STAIRS = registerBlock("polished_gilded_blackstone_stairs",
            new StairsBlock(ModBlocks.POLISHED_GILDED_BLACKSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE)
                    .sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block POLISHED_GILDED_BLACKSTONE_SLAB = registerBlock("polished_gilded_blackstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_SLAB).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block POLISHED_GILDED_BLACKSTONE_WALL = registerBlock("polished_gilded_blackstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_WALL).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block POLISHED_GILDED_BLACKSTONE_BUTTON = registerBlock("polished_gilded_blackstone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON).sounds(BlockSoundGroup.GILDED_BLACKSTONE),
                    BlockSetType.STONE, 10, true));
    public static final Block POLISHED_GILDED_BLACKSTONE_PLATE = registerBlock("polished_gilded_blackstone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE).sounds(BlockSoundGroup.GILDED_BLACKSTONE),
                    BlockSetType.STONE));
    public static final Block CHISELED_POLISHED_GILDED_BLACKSTONE = registerBlock("chiseled_polished_gilded_blackstone",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_POLISHED_BLACKSTONE).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));

    public static final Block GILDED_BLACKSTONE_BRICKS = registerBlock("gilded_blackstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_BRICK_STAIRS = registerBlock("gilded_blackstone_brick_stairs",
            new StairsBlock(ModBlocks.GILDED_BLACKSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_BRICK_SLAB = registerBlock("gilded_blackstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_BRICK_WALL = registerBlock("gilded_blackstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICK_WALL).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(GildedBlackstoneBlocks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(GildedBlackstoneBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        GildedBlackstoneBlocks.LOGGER.info("Registering ModBlocks for " + GildedBlackstoneBlocks.MOD_ID);
    }


/*
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

 */
}
