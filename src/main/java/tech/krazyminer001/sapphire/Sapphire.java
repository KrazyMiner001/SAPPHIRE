package tech.krazyminer001.sapphire;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tech.krazyminer001.sapphire.block.ModBlocks;
import tech.krazyminer001.sapphire.item.ModItems;

public class Sapphire implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("sapphire");
	public static final String MOD_ID = "sapphire";

	@Override
	public void onInitialize() {
		LOGGER.info("You can write literally anything in these");

		ModBlocks.registerBlocks();
		ModItems.registerItems();
	}
}