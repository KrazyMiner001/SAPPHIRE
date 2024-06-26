package tech.krazyminer001.sapphire.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import tech.krazyminer001.sapphire.block.ModBlocks;
import tech.krazyminer001.sapphire.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class EnUsLangProvider extends FabricLanguageProvider {
    public EnUsLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        //Blocks
        translationBuilder.add(ModBlocks.RUBY_ORE, "Ruby Ore");
        translationBuilder.add(ModBlocks.SAPPHIRE_ORE, "Sapphire Ore");
        translationBuilder.add(ModBlocks.CRYOLITE_ORE, "Cryolite Ore");

        translationBuilder.add(ModBlocks.STEEL_BLOCK, "Steel Block");

        //Items
        translationBuilder.add(ModItems.RUBY, "Ruby");
        translationBuilder.add(ModItems.SAPPHIRE, "Sapphire");
        translationBuilder.add(ModItems.CRYOLITE, "Cryolite");
        translationBuilder.add(ModItems.STEEL_INGOT, "Steel Ingot");
    }
}
