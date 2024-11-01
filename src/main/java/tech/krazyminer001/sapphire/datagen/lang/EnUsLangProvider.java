package tech.krazyminer001.sapphire.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import tech.krazyminer001.sapphire.block.SapphireBlocks;
import tech.krazyminer001.sapphire.item.SapphireItems;

import java.util.concurrent.CompletableFuture;

public class EnUsLangProvider extends FabricLanguageProvider {
    public EnUsLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        //Blocks
        translationBuilder.add(SapphireBlocks.RUBY_ORE, "Ruby Ore");
        translationBuilder.add(SapphireBlocks.SAPPHIRE_ORE, "Sapphire Ore");
        translationBuilder.add(SapphireBlocks.CRYOLITE_ORE, "Cryolite Ore");

        translationBuilder.add(SapphireBlocks.STEEL_BLOCK, "Steel Block");

        //Items
        translationBuilder.add(SapphireItems.RUBY, "Ruby");
        translationBuilder.add(SapphireItems.SAPPHIRE, "Sapphire");
        translationBuilder.add(SapphireItems.CRYOLITE, "Cryolite");
        translationBuilder.add(SapphireItems.STEEL_INGOT, "Steel Ingot");
    }
}
