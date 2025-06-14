package net.Ryan.tutorialmod;

import com.mojang.logging.LogUtils;
import net.Ryan.tutorialmod.block.ModBlocks;
import net.Ryan.tutorialmod.item.Moditems;
import net.Ryan.tutorialmod.loot.ModLootModifiers;
import net.Ryan.tutorialmod.sound.ModSounds;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TutorialMod.MOD_ID)
public class TutorialMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "tutorialmod";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();



    public TutorialMod(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        Moditems.register(modEventBus);
        ModSounds.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModLootModifiers.register(modEventBus);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(Moditems.ALEXANDRITE);
            event.accept(Moditems.RAW_ALEXANDRITE);
            event.accept(Moditems.OCEAN_CRYSTAL);
            event.accept(Moditems.CAVERN_CRYSTAL);
            event.accept(Moditems.DESERT_CRYSTAL);
            event.accept(Moditems.EARTHEN_CRYSTAL);
            event.accept(Moditems.FOREST_CRYSTAL);
            event.accept(Moditems.JUNGLE_CRYSTAL);
            event.accept(Moditems.SNOW_CRYSTAL);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
        {
            event.accept(ModBlocks.ALEXANDRITE_BLOCK);
        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES)
        {
            event.accept(Moditems.CANOPY_MUSIC_DISC);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
