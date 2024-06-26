package tech.krazyminer001.sapphire.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import tech.krazyminer001.sapphire.Sapphire;

import static tech.krazyminer001.sapphire.util.Utility.of;

public class ModBlocks {
    public static final Block SAPPHIRE_ORE = register("sapphire_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)), true);

    public static final Block RUBY_ORE = register("ruby_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)), true);

    public static final Block CRYOLITE_ORE = register("cryolite_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)), true);

    private static Block register(String name, Block block, boolean registerItem) {
        if (registerItem) {
            Registry.register(Registries.ITEM, of(name), new BlockItem(block, new Item.Settings()));
        }
        return Registry.register(Registries.BLOCK, of(name), block);
    }

    public static void registerBlocks() {
        Sapphire.LOGGER.info("Registering Blocks...");
    }
}
