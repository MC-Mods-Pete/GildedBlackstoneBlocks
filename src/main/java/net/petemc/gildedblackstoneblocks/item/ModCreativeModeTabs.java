package net.petemc.gildedblackstoneblocks.item;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.petemc.gildedblackstoneblocks.GildedBlackstoneBlocks;
import net.petemc.gildedblackstoneblocks.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final CreativeModeTab GILDED_BLACKSTONE_BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(GildedBlackstoneBlocks.MOD_ID, "gilded_blackstone_blocks_tab"),
            FabricCreativeModeTab.builder().title(Component.translatable("creativetab.gildedblackstoneblocks_tab"))
                    .icon(() -> new ItemStack(Blocks.GILDED_BLACKSTONE)).displayItems((parameters, output) -> {
                        output.accept(ModBlocks.GILDED_BLACKSTONE_STAIRS);
                        output.accept(ModBlocks.GILDED_BLACKSTONE_SLAB);
                        output.accept(ModBlocks.GILDED_BLACKSTONE_WALL);
                        output.accept(ModBlocks.GILDED_BLACKSTONE_BUTTON);
                        output.accept(ModBlocks.GILDED_BLACKSTONE_PLATE);

                        output.accept(ModBlocks.POLISHED_GILDED_BLACKSTONE);
                        output.accept(ModBlocks.POLISHED_GILDED_BLACKSTONE_STAIRS);
                        output.accept(ModBlocks.POLISHED_GILDED_BLACKSTONE_SLAB);
                        output.accept(ModBlocks.POLISHED_GILDED_BLACKSTONE_WALL);
                        output.accept(ModBlocks.POLISHED_GILDED_BLACKSTONE_BUTTON);
                        output.accept(ModBlocks.POLISHED_GILDED_BLACKSTONE_PLATE);
                        output.accept(ModBlocks.CHISELED_POLISHED_GILDED_BLACKSTONE);

                        output.accept(ModBlocks.GILDED_BLACKSTONE_BRICKS);
                        output.accept(ModBlocks.GILDED_BLACKSTONE_BRICK_STAIRS);
                        output.accept(ModBlocks.GILDED_BLACKSTONE_BRICK_SLAB);
                        output.accept(ModBlocks.GILDED_BLACKSTONE_BRICK_WALL);
                    }).build());

    public static void registerItemGroups() {
        GildedBlackstoneBlocks.LOGGER.info("Registering Item Groups for " + GildedBlackstoneBlocks.MOD_ID);
    }
}
