package tech.krazyminer001.sapphire.screen;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import tech.krazyminer001.sapphire.Sapphire;
import tech.krazyminer001.sapphire.screen.hallheroultcontroller.HallHeroultControllerScreenHandler;

import static tech.krazyminer001.sapphire.util.Utility.of;

public class SapphireScreenHandlers {
    public static final ScreenHandlerType<HallHeroultControllerScreenHandler> HALL_HEROULT_CONTROLLER_SCREEN_HANDLER = registerScreenHandlerType("hall_heroult_controller_screen_handler",
            new ScreenHandlerType<HallHeroultControllerScreenHandler>(HallHeroultControllerScreenHandler::new, FeatureFlags.VANILLA_FEATURES));

    private static <T extends ScreenHandler> ScreenHandlerType<T> registerScreenHandlerType(String name, ScreenHandlerType<T> screenHandlerType) {
        return Registry.register(Registries.SCREEN_HANDLER, of(name), screenHandlerType);
    }

    public static void registerScreenHandlers() {
        Sapphire.LOGGER.info("Registering screen handlers for " + Sapphire.MOD_ID);
    }
}
