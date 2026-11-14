package net.petemc.gildedblackstoneblocks;

import net.fabricmc.api.ModInitializer;
import net.petemc.gildedblackstoneblocks.block.ModBlocks;
import net.petemc.gildedblackstoneblocks.item.ModCreativeModeTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GildedBlackstoneBlocks implements ModInitializer {
    public static final String MOD_ID = "gildedblackstoneblocks";
    public static final String MOD_NAME = "Gilded Blackstone Blocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing the {} Mod", MOD_NAME);
        ModBlocks.registerModBlocks();
        ModCreativeModeTabs.registerItemGroups();
    }
}
