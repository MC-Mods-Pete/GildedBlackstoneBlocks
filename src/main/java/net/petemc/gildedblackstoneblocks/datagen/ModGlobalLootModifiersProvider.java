package net.petemc.gildedblackstoneblocks.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.petemc.gildedblackstoneblocks.GildedBlackstoneBlocks;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, GildedBlackstoneBlocks.MOD_ID);
    }

    @Override
    protected void start() {

    }
}
