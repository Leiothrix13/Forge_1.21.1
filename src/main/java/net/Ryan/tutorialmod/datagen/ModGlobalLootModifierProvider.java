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

        this.add("cavern_crystal_from_mineshaft",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/abandoned_mineshaft")).build()
                }, Moditems.CAVERN_CRYSTAL.get()));

        this.add("desert_crystal_from_desert_temple",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/desert_pyramid")).build()
                }, Moditems.DESERT_CRYSTAL.get()));

        this.add("earthen_crystal_from_blacksmith",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/village/village_weaponsmith")).build()
                }, Moditems.EARTHEN_CRYSTAL.get()));

        this.add("forest_crystal_from_mansion",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/woodland_mansion")).build()
                }, Moditems.FOREST_CRYSTAL.get()));

        this.add("jungle_crystal_from_jungle_temple",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/jungle_temple")).build()
                }, Moditems.JUNGLE_CRYSTAL.get()));

        this.add("ocean_crystal_from_treasure",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/buried_treasure")).build()
                }, Moditems.OCEAN_CRYSTAL.get()));

        this.add("snow_crystal_from_igloo",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/igloo_chest")).build()
                }, Moditems.SNOW_CRYSTAL.get()));
    }


}
