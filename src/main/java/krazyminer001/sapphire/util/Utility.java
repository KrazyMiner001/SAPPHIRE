package krazyminer001.sapphire.util;

import krazyminer001.sapphire.Sapphire;
import net.minecraft.util.Identifier;

public class Utility {
    public static Identifier of(String path) {
        return Identifier.of(Sapphire.MOD_ID, path);
    }
}
