package tech.krazyminer001.sapphire.screen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import tech.krazyminer001.sapphire.screen.hallheroultcontroller.HallHeroultControllerScreen;

@Environment(EnvType.CLIENT)
public class SapphireScreens {
    public static void registerScreens() {
        HandledScreens.register(SapphireScreenHandlers.HALL_HEROULT_CONTROLLER_SCREEN_HANDLER, HallHeroultControllerScreen::new);
    }
}
