package tech.krazyminer001.sapphire;

import net.fabricmc.api.ClientModInitializer;
import tech.krazyminer001.sapphire.screen.SapphireScreens;

public class SapphireClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		SapphireScreens.registerScreens();
	}
}