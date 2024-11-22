package krazyminer001.sapphire.blocks;

import krazyminer001.sapphire.blocks.hallheroult.HallHeroultControllerBlock;
import krazyminer001.sapphire.blocks.hallheroult.HallHeroultControllerMultiblockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static krazyminer001.sapphire.util.Utility.of;

import java.util.function.Function;

public class SapphireBlocks {
    public static final HallHeroultControllerBlock HALL_HEROULT_CONTROLLER_BLOCK = register("hall_heroult_controller",
            HallHeroultControllerBlock::new,
            AbstractBlock.Settings.create(),
            true
            );

    public static final BlockEntityType<HallHeroultControllerMultiblockEntity> HALL_HEROULT_CONTROLLER_MULTIBLOCK_ENTITY_TYPE = register(
            "hall_heroult_controller",
            FabricBlockEntityTypeBuilder.create(HallHeroultControllerMultiblockEntity::new, HALL_HEROULT_CONTROLLER_BLOCK).build()
    );

    private static <T extends BlockEntity> BlockEntityType<T> register(String id, BlockEntityType<T> type) {
        BlockEntityType<T> blockEntity = Registry.register(Registries.BLOCK_ENTITY_TYPE, of(id), type);
        return blockEntity;
    }

    private static <T extends Block> T register(String name, Function<AbstractBlock.Settings, T> blockFunction, AbstractBlock.Settings blockSettings, boolean registerItem) {
        Identifier identifier = of(name);
        RegistryKey<Block> blockRegistryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);
        T block = Registry.register(Registries.BLOCK, identifier, blockFunction.apply(blockSettings.registryKey(blockRegistryKey)));
        if (registerItem) {
            RegistryKey<Item> itemRegistryKey = RegistryKey.of(RegistryKeys.ITEM, identifier);
            Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(itemRegistryKey)));
        }
        return block;
    }

    public static void init() {}
}
