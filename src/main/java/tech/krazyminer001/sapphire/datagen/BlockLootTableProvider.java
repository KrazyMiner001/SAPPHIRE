package tech.krazyminer001.sapphire.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import tech.krazyminer001.sapphire.block.SapphireBlocks;
import tech.krazyminer001.sapphire.item.SapphireItems;

import java.util.concurrent.CompletableFuture;

public class BlockLootTableProvider extends FabricBlockLootTableProvider {
    public BlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        oreDrops(SapphireBlocks.SAPPHIRE_ORE, SapphireItems.SAPPHIRE);
        oreDrops(SapphireBlocks.RUBY_ORE, SapphireItems.RUBY);
        oreDrops(SapphireBlocks.CRYOLITE_ORE, SapphireItems.CRYOLITE);

        drops(SapphireBlocks.STEEL_BLOCK);
    }
}
