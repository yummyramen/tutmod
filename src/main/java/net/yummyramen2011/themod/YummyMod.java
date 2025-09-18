package net.yummyramen2011.themod;

import net.fabricmc.api.ModInitializer;

import net.yummyramen2011.themod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YummyMod implements ModInitializer {
	public static final String MOD_ID = "yummyid";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}