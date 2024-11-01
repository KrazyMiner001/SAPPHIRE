package tech.krazyminer001.sapphire.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import tech.krazyminer001.sapphire.block.SapphireBlocks;
import tech.krazyminer001.sapphire.item.SapphireItems;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(SapphireBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(SapphireBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(SapphireBlocks.CRYOLITE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(SapphireItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(SapphireItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(SapphireItems.CRYOLITE, Models.GENERATED);
    }
}
