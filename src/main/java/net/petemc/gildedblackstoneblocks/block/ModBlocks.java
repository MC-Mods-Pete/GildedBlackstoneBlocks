package net.petemc.gildedblackstoneblocks.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.petemc.gildedblackstoneblocks.GildedBlackstoneBlocks;
import net.petemc.gildedblackstoneblocks.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GildedBlackstoneBlocks.MOD_ID);

    public static final RegistryObject<Block> GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs",
            () -> new StairBlock(Blocks.GILDED_BLACKSTONE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_BUTTON = registerBlock("gilded_blackstone_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_PLATE = registerBlock("gilded_blackstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE),
                    BlockSetType.STONE));

    public static final RegistryObject<Block> POLISHED_GILDED_BLACKSTONE = registerBlock("polished_gilded_blackstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE)));
    public static final RegistryObject<Block> POLISHED_GILDED_BLACKSTONE_STAIRS = registerBlock("polished_gilded_blackstone_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_GILDED_BLACKSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> POLISHED_GILDED_BLACKSTONE_SLAB = registerBlock("polished_gilded_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> POLISHED_GILDED_BLACKSTONE_WALL = registerBlock("polished_gilded_blackstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> POLISHED_GILDED_BLACKSTONE_BUTTON = registerBlock("polished_gilded_blackstone_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> POLISHED_GILDED_BLACKSTONE_PLATE = registerBlock("polished_gilded_blackstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE),
                    BlockSetType.STONE));

    public static final RegistryObject<Block> GILDED_BLACKSTONE_BRICKS = registerBlock("gilded_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_BRICK_STAIRS = registerBlock("gilded_blackstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GILDED_BLACKSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_BRICK_SLAB = registerBlock("gilded_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_BRICK_WALL = registerBlock("gilded_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));


    public static final RegistryObject<Block> POLISHED_CHISELED_GILDED_BLACKSTONE = registerBlock("polished_chiseled_gilded_blackstone",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.STONE)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
