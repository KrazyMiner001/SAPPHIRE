package tech.krazyminer001.sapphire.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import tech.krazyminer001.sapphire.Sapphire;

import static tech.krazyminer001.sapphire.util.Utility.of;

public class SapphireItems {
    public static final Item SAPPHIRE = register("sapphire", new Item(new Item.Settings()));
    public static final Item RUBY = register("ruby", new Item(new Item.Settings()));
    public static final Item CRYOLITE = register("cryolite", new Item(new Item.Settings()));
    public static final Item STEEL_INGOT = register("steel_ingot", new Item(new Item.Settings()));

    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, of(name), item);
    }

    public static void registerItems() {
        Sapphire.LOGGER.info("Registering Items...");
    }
}
