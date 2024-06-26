package tech.krazyminer001.sapphire.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryWrapper;
import tech.krazyminer001.sapphire.block.ModBlocks;
import tech.krazyminer001.sapphire.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class BlockLootTableProvider extends FabricBlockLootTableProvider {
    public BlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        oreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.SAPPHIRE);
        oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY);
        oreDrops(ModBlocks.CRYOLITE_ORE, ModItems.CRYOLITE);

        drops(ModBlocks.STEEL_BLOCK);
    }
}
