package tech.krazyminer001.sapphire.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import tech.krazyminer001.sapphire.block.SapphireBlocks;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(SapphireBlocks.SAPPHIRE_ORE)
                .add(SapphireBlocks.CRYOLITE_ORE)
                .add(SapphireBlocks.RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(SapphireBlocks.SAPPHIRE_ORE)
                .add(SapphireBlocks.CRYOLITE_ORE)
                .add(SapphireBlocks.RUBY_ORE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "steel_blocks")))
                .add(SapphireBlocks.STEEL_BLOCK);
    }
}
