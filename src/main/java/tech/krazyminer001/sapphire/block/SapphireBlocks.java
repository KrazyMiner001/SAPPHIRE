package tech.krazyminer001.sapphire.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import tech.krazyminer001.sapphire.Sapphire;
import tech.krazyminer001.sapphire.block.HallHeroultBlocks.HallHeroultControllerBlock;
import tech.krazyminer001.sapphire.block.HallHeroultBlocks.HallHeroultMultiblock;

import static tech.krazyminer001.sapphire.util.Utility.of;

public class SapphireBlocks {
    public static final Block SAPPHIRE_ORE = register("sapphire_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)), true);

    public static final Block RUBY_ORE = register("ruby_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)), true);

    public static final Block CRYOLITE_ORE = register("cryolite_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)), true);

    public static final Block STEEL_BLOCK = register("steel_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)), true);

    public static final HallHeroultControllerBlock HALL_HEROULT_CONTROLLER_BLOCK = register("hall_heroult_controller",
            new HallHeroultControllerBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)), true);

    public static final HallHeroultMultiblock HALL_HEROULT_MULTIBLOCK = register("hall_heroult_multiblock",
            new HallHeroultMultiblock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)), true);

    private static <T extends Block> T register(String name, T block, boolean registerItem) {
        if (registerItem) {
            Registry.register(Registries.ITEM, of(name), new BlockItem(block, new Item.Settings()));
        }
        return Registry.register(Registries.BLOCK, of(name), block);
    }

    public static void registerBlocks() {
        Sapphire.LOGGER.info("Registering Blocks...");
    }
}
