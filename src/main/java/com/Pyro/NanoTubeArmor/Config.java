package com.Pyro.NanoTubeArmor;

import org.apache.logging.log4j.Level;

import net.minecraftforge.common.config.Configuration;

public class Config {
	
	private static final String CATEGORY_GENERAL = "general";
	private static final String CATEGORY_DIMENSIONS = "dimensions";
	
	//Values accessible elsewhere in the mod
	public static boolean exampleval = true;
	
	//create the config
	public static void readConfig() {
		
		Configuration cfg = CommonProxy.config;
		try {
			
			cfg.load();
			initGeneralConfig(cfg);
			initDimensionConfig(cfg);
			
		}catch(Exception e) {
			
			NanoTubeArmor.logger.log(Level.ERROR, "Problem loading config file!", e);
			
		}finally {
			
			if(cfg.hasChanged()) {
				
				cfg.save();
				
			}
			
		}
		
	}
		
	private static void initGeneralConfig(Configuration cfg) {
			
		cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General Configuration");
		exampleval = cfg.getBoolean("ExampleValue:", CATEGORY_GENERAL, exampleval, "This is an example config option (Changes Nothing)!");
			
	}
	
	private static void initDimensionConfig(Configuration cfg) {
		
		cfg.addCustomCategoryComment(CATEGORY_DIMENSIONS, "Dimension Configuration");
		
	}

}
