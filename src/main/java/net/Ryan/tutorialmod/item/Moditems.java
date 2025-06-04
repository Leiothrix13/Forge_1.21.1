package net.Ryan.tutorialmod.item;

import net.Ryan.tutorialmod.TutorialMod;
import net.Ryan.tutorialmod.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);


    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OCEAN_CRYSTAL = ITEMS.register("ocean_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAVERN_CRYSTAL = ITEMS.register("cavern_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DESERT_CRYSTAL = ITEMS.register("desert_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EARTHEN_CRYSTAL = ITEMS.register("earthen_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOREST_CRYSTAL = ITEMS.register("forest_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CRYSTAL = ITEMS.register("jungle_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SNOW_CRYSTAL = ITEMS.register("snow_crystal", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CANOPY_MUSIC_DISC = ITEMS.register("canopy_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.CANOPY_KEY).stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
