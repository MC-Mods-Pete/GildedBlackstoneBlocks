package net.petemc.gildedblackstoneblocks;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.petemc.gildedblackstoneblocks.block.ModBlocks;
import net.petemc.gildedblackstoneblocks.item.ModCreativeModeTabs;
import net.petemc.gildedblackstoneblocks.item.ModItems;
import org.slf4j.Logger;

@Mod(GildedBlackstoneBlocks.MOD_ID)
public class GildedBlackstoneBlocks {
    public static final String MOD_ID = "gildedblackstoneblocks";
    public static final Logger LOGGER = LogUtils.getLogger();

    public GildedBlackstoneBlocks(IEventBus modEventBus) {
        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
    }
}
