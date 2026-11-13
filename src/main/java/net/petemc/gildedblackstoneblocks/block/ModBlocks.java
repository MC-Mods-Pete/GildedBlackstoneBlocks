package net.petemc.gildedblackstoneblocks.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.petemc.gildedblackstoneblocks.GildedBlackstoneBlocks;
import net.petemc.gildedblackstoneblocks.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(GildedBlackstoneBlocks.MOD_ID);

    public static final DeferredBlock<Block> GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs",
            () -> new StairBlock(Blocks.GILDED_BLACKSTONE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE)));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE)));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE)));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE_BUTTON = registerBlock("gilded_blackstone_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)
                    .sound(SoundType.GILDED_BLACKSTONE)));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE_PLATE = registerBlock("gilded_blackstone_pressure_plate",
            () -> new PressurePlateBlock(new BlockSetType("gilded_blackstone", true, true, false, BlockSetType.PressurePlateSensitivity.EVERYTHING, SoundType.GILDED_BLACKSTONE, SoundEvents.NETHER_WOOD_DOOR_CLOSE, SoundEvents.NETHER_WOOD_DOOR_OPEN, SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN, SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE)));

    public static final DeferredBlock<Block> POLISHED_GILDED_BLACKSTONE = registerBlock("polished_gilded_blackstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE)));
    public static final DeferredBlock<Block> POLISHED_GILDED_BLACKSTONE_STAIRS = registerBlock("polished_gilded_blackstone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_GILDED_BLACKSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_STAIRS).sound(SoundType.GILDED_BLACKSTONE)));
    public static final DeferredBlock<Block> POLISHED_GILDED_BLACKSTONE_SLAB = registerBlock("polished_gilded_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_SLAB).sound(SoundType.GILDED_BLACKSTONE)));
    public static final DeferredBlock<Block> POLISHED_GILDED_BLACKSTONE_WALL = registerBlock("polished_gilded_blackstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_WALL).sound(SoundType.GILDED_BLACKSTONE)));
    public static final DeferredBlock<Block> POLISHED_GILDED_BLACKSTONE_BUTTON = registerBlock("polished_gilded_blackstone_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).sound(SoundType.GILDED_BLACKSTONE)));
    public static final DeferredBlock<Block> POLISHED_GILDED_BLACKSTONE_PLATE = registerBlock("polished_gilded_blackstone_pressure_plate",
            () -> new PressurePlateBlock(new BlockSetType("polished_gilded_blackstone", true, true, false, BlockSetType.PressurePlateSensitivity.EVERYTHING, SoundType.GILDED_BLACKSTONE, SoundEvents.NETHER_WOOD_DOOR_CLOSE, SoundEvents.NETHER_WOOD_DOOR_OPEN, SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN, SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE).sound(SoundType.GILDED_BLACKSTONE)));
    public static final DeferredBlock<Block> CHISELED_POLISHED_GILDED_BLACKSTONE = registerBlock("chiseled_polished_gilded_blackstone",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_POLISHED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE)));

    public static final DeferredBlock<Block> GILDED_BLACKSTONE_BRICKS = registerBlock("gilded_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS).sound(SoundType.GILDED_BLACKSTONE)));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE_BRICK_STAIRS = registerBlock("gilded_blackstone_brick_stairs",
            () -> new StairBlock(ModBlocks.GILDED_BLACKSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS).sound(SoundType.GILDED_BLACKSTONE)));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE_BRICK_SLAB = registerBlock("gilded_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB).sound(SoundType.GILDED_BLACKSTONE)));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE_BRICK_WALL = registerBlock("gilded_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICK_WALL).sound(SoundType.GILDED_BLACKSTONE)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
