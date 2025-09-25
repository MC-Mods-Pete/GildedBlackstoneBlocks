package net.petemc.gildedblackstoneblocks;

import net.fabricmc.api.ModInitializer;
//import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.petemc.gildedblackstoneblocks.block.ModBlocks;
import net.petemc.gildedblackstoneblocks.item.ModCreativeModeTabs;
import net.petemc.gildedblackstoneblocks.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GildedBlackstoneBlocks implements ModInitializer {
    public static final String MOD_ID = "gildedblackstoneblocks";
    public static final String MOD_NAME = "Gilded Blackstone Blocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static int globalSpawnCounter = 0;

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing the {} Mod", MOD_NAME);
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
        ModCreativeModeTabs.registerItemGroups();
    }
}
/*
// The value here should match an entry in the META-INF/mods.toml file
@Mod(GildedBlackstoneBlocks.MOD_ID)
public class GildedBlackstoneBlocks {
    public static final String MOD_ID = "gildedblackstoneblocks";
    private static final Logger LOGGER = LogUtils.getLogger();


    public GildedBlackstoneBlocks(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        //context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // client setup code

        }

}

 */
