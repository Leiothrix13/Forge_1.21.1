package net.Ryan.tutorialmod.datagen;

import net.Ryan.tutorialmod.TutorialMod;
import net.Ryan.tutorialmod.item.Moditems;
import net.Ryan.tutorialmod.loot.AddItemModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, TutorialMod.MOD_ID, registries);
    }

    @Override
    protected void start(HolderLookup.Provider registries) {
        this.add("canopy_from_buried_treasure",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/buried_treasure")).build()
                }, Moditems.CANOPY_MUSIC_DISC.get()));
    }
}
