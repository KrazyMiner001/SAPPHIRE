package tech.krazyminer001.sapphire;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tech.krazyminer001.sapphire.block.SapphireBlocks;
import tech.krazyminer001.sapphire.block.SapphireBlockEntities;
import tech.krazyminer001.sapphire.item.SapphireItems;
import tech.krazyminer001.sapphire.screen.SapphireScreenHandlers;

public class Sapphire implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("sapphire");
	public static final String MOD_ID = "sapphire";

	@Override
	public void onInitialize() {
		LOGGER.info("You can write literally anything in these");

		SapphireBlocks.registerBlocks();
		SapphireScreenHandlers.registerScreenHandlers();
		SapphireBlockEntities.registerBlockEntities();
		SapphireItems.registerItems();
	}
}