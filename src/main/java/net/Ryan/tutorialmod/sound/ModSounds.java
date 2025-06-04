package net.Ryan.tutorialmod.sound;

import net.Ryan.tutorialmod.TutorialMod;
import net.minecraft.client.sounds.SoundEngine;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TutorialMod.MOD_ID);
    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }


    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        return SOUND_EVENTS.register(name, () ->SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, name)));
    }

    public static final RegistryObject<SoundEvent> CANOPY = registerSoundEvent("canopy");
    public static final ResourceKey<JukeboxSong> CANOPY_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID,"canopy"));
}
