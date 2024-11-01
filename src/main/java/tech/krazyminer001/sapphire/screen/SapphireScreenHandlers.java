package tech.krazyminer001.sapphire.screen;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import tech.krazyminer001.sapphire.Sapphire;

import static tech.krazyminer001.sapphire.util.Utility.of;

public class SapphireScreenHandlers {
    private static <T extends ScreenHandler> ScreenHandlerType<T> registerScreenHandlerType(String name, ScreenHandlerType<T> screenHandlerType) {
        return Registry.register(Registries.SCREEN_HANDLER, of(name), screenHandlerType);
    }

    public static void registerScreenHandlers() {
        Sapphire.LOGGER.info("Registering screen handlers for " + Sapphire.MOD_ID);
    }
}
