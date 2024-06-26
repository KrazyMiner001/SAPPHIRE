package tech.krazyminer001.sapphire.util;

import net.minecraft.util.Identifier;
import tech.krazyminer001.sapphire.Sapphire;

public abstract class Utility {
    public static Identifier of(String path) {
        return Identifier.of(Sapphire.MOD_ID, path);
    }
}
