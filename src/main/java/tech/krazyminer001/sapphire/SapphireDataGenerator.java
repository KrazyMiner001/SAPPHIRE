package tech.krazyminer001.sapphire;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import tech.krazyminer001.sapphire.datagen.BlockLootTableProvider;
import tech.krazyminer001.sapphire.datagen.BlockTagProvider;
import tech.krazyminer001.sapphire.datagen.ItemTagProvider;
import tech.krazyminer001.sapphire.datagen.ModelProvider;
import tech.krazyminer001.sapphire.datagen.lang.EnUsLangProvider;

public class SapphireDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(BlockLootTableProvider::new);
		pack.addProvider(BlockTagProvider::new);
		pack.addProvider(ItemTagProvider::new);
		pack.addProvider(EnUsLangProvider::new);
		pack.addProvider(ModelProvider::new);
	}
}
