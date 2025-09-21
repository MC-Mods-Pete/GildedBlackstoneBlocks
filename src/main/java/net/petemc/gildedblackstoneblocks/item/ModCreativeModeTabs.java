package net.petemc.gildedblackstoneblocks.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.petemc.gildedblackstoneblocks.GildedBlackstoneBlocks;
import net.petemc.gildedblackstoneblocks.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GildedBlackstoneBlocks.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GILDED_BLACKSTONE_BLOCK_TAB = CREATIVE_MODE_TABS.register("gilded_blackstone_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blocks.GILDED_BLACKSTONE))
                    .title(Component.translatable("creativetab.gildedblackstoneblocks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.GILDED_BLACKSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.GILDED_BLACKSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.GILDED_BLACKSTONE_WALL.get());
                        pOutput.accept(ModBlocks.GILDED_BLACKSTONE_BUTTON.get());
                        pOutput.accept(ModBlocks.GILDED_BLACKSTONE_PLATE.get());

                        pOutput.accept(ModBlocks.POLISHED_GILDED_BLACKSTONE.get());
                        pOutput.accept(ModBlocks.POLISHED_GILDED_BLACKSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_GILDED_BLACKSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_GILDED_BLACKSTONE_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_GILDED_BLACKSTONE_BUTTON.get());
                        pOutput.accept(ModBlocks.POLISHED_GILDED_BLACKSTONE_PLATE.get());
                        pOutput.accept(ModBlocks.CHISELED_POLISHED_GILDED_BLACKSTONE.get());

                        pOutput.accept(ModBlocks.GILDED_BLACKSTONE_BRICKS.get());
                        pOutput.accept(ModBlocks.GILDED_BLACKSTONE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.GILDED_BLACKSTONE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.GILDED_BLACKSTONE_BRICK_WALL.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
