package net.petemc.gildedblackstoneblocks.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.petemc.gildedblackstoneblocks.GildedBlackstoneBlocks;
import net.petemc.gildedblackstoneblocks.item.ModItems;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(GildedBlackstoneBlocks.MOD_ID);

    public static final DeferredBlock<Block> GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs",
            p -> new StairBlock(Blocks.GILDED_BLACKSTONE.defaultBlockState(), p),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab",
            SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall",
            WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE_BUTTON = registerBlock("gilded_blackstone_button",
            p -> new ButtonBlock(BlockSetType.STONE, 10, p),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE_PLATE = registerBlock("gilded_blackstone_pressure_plate",
            p -> new PressurePlateBlock(pressurePlateSet("gilded_blackstone"), p),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE));
    public static final DeferredBlock<Block> POLISHED_GILDED_BLACKSTONE = registerBlock("polished_gilded_blackstone",
            Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE));
    public static final DeferredBlock<Block> POLISHED_GILDED_BLACKSTONE_STAIRS = registerBlock("polished_gilded_blackstone_stairs",
            p -> new StairBlock(POLISHED_GILDED_BLACKSTONE.get().defaultBlockState(), p),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_STAIRS).sound(SoundType.GILDED_BLACKSTONE));
    public static final DeferredBlock<Block> POLISHED_GILDED_BLACKSTONE_SLAB = registerBlock("polished_gilded_blackstone_slab",
            SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_SLAB).sound(SoundType.GILDED_BLACKSTONE));
    public static final DeferredBlock<Block> POLISHED_GILDED_BLACKSTONE_WALL = registerBlock("polished_gilded_blackstone_wall",
            WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_WALL).sound(SoundType.GILDED_BLACKSTONE));
    public static final DeferredBlock<Block> POLISHED_GILDED_BLACKSTONE_BUTTON = registerBlock("polished_gilded_blackstone_button",
            p -> new ButtonBlock(BlockSetType.STONE, 10, p),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).sound(SoundType.GILDED_BLACKSTONE));
    public static final DeferredBlock<Block> POLISHED_GILDED_BLACKSTONE_PLATE = registerBlock("polished_gilded_blackstone_pressure_plate",
            p -> new PressurePlateBlock(pressurePlateSet("polished_gilded_blackstone"), p),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE).sound(SoundType.GILDED_BLACKSTONE));
    public static final DeferredBlock<Block> CHISELED_POLISHED_GILDED_BLACKSTONE = registerBlock("chiseled_polished_gilded_blackstone",
            RotatedPillarBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_POLISHED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE_BRICKS = registerBlock("gilded_blackstone_bricks",
            Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS).sound(SoundType.GILDED_BLACKSTONE));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE_BRICK_STAIRS = registerBlock("gilded_blackstone_brick_stairs",
            p -> new StairBlock(GILDED_BLACKSTONE_BRICKS.get().defaultBlockState(), p),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS).sound(SoundType.GILDED_BLACKSTONE));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE_BRICK_SLAB = registerBlock("gilded_blackstone_brick_slab",
            SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB).sound(SoundType.GILDED_BLACKSTONE));
    public static final DeferredBlock<Block> GILDED_BLACKSTONE_BRICK_WALL = registerBlock("gilded_blackstone_brick_wall",
            WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICK_WALL).sound(SoundType.GILDED_BLACKSTONE));

    /** Pressure plate type that reacts to every entity, with the gilded blackstone sounds. */
    private static BlockSetType pressurePlateSet(String name) {
        return new BlockSetType(name, true, true, false, BlockSetType.PressurePlateSensitivity.EVERYTHING,
                SoundType.GILDED_BLACKSTONE, SoundEvents.NETHER_WOOD_DOOR_CLOSE, SoundEvents.NETHER_WOOD_DOOR_OPEN,
                SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN,
                SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON,
                SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON);
    }

    private static DeferredBlock<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory,
                                                      Supplier<BlockBehaviour.Properties> properties) {
        DeferredBlock<Block> toReturn = BLOCKS.registerBlock(name, factory, properties);
        ModItems.ITEMS.registerSimpleBlockItem(name, toReturn);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
