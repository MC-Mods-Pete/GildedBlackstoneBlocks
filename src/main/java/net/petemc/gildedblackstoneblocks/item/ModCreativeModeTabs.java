package net.petemc.gildedblackstoneblocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.petemc.gildedblackstoneblocks.GildedBlackstoneBlocks;
import net.petemc.gildedblackstoneblocks.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GildedBlackstoneBlocks.MOD_ID, "gilded_blackstone_blocks_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("creativetab.gildedblackstoneblocks_tab"))
                    .icon(() -> new ItemStack(Blocks.GILDED_BLACKSTONE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.GILDED_BLACKSTONE_STAIRS);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_SLAB);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_WALL);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_BUTTON);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_PLATE);

                        entries.add(ModBlocks.POLISHED_GILDED_BLACKSTONE);
                        entries.add(ModBlocks.POLISHED_GILDED_BLACKSTONE_STAIRS);
                        entries.add(ModBlocks.POLISHED_GILDED_BLACKSTONE_SLAB);
                        entries.add(ModBlocks.POLISHED_GILDED_BLACKSTONE_WALL);
                        entries.add(ModBlocks.POLISHED_GILDED_BLACKSTONE_BUTTON);
                        entries.add(ModBlocks.POLISHED_GILDED_BLACKSTONE_PLATE);
                        entries.add(ModBlocks.CHISELED_POLISHED_GILDED_BLACKSTONE);

                        entries.add(ModBlocks.GILDED_BLACKSTONE_BRICKS);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_BRICK_STAIRS);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_BRICK_SLAB);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_BRICK_WALL);

                    }).build());


    public static void registerItemGroups() {
        GildedBlackstoneBlocks.LOGGER.info("Registering Item Groups for " + GildedBlackstoneBlocks.MOD_ID);
    }
}
