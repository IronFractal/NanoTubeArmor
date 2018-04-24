package com.Pyro.NanoTubeArmor;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
	
	public static Configuration config;

	public void preInit(FMLPreInitializationEvent e) {
		
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "NTA001.cfg"));
		Config.readConfig();
		
	}
	
	public void init(FMLInitializationEvent e) {
		
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
		if(config.hasChanged()) {
			
			config.save();
			
		}
		
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		
		
		
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		
		
		
	}
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
		
		
	}
	
	public String localize(String unlocalized, Object... args) {
		
		return I18n.translateToLocalFormatted(unlocalized, args);
		
	}
	
	public void registerRenderers() {
		
		
		
	}
	
}
