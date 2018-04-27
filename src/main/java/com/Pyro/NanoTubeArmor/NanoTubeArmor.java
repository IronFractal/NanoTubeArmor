package com.Pyro.NanoTubeArmor;

import org.apache.logging.log4j.Logger;

import com.Pyro.NanoTubeArmor.Block.ModBlocks;
import com.Pyro.NanoTubeArmor.Commands.HealCommand;
import com.Pyro.NanoTubeArmor.CreativeTab.NanoTubeArmorTab;
import com.Pyro.NanoTubeArmor.Item.ModItems;
import com.Pyro.NanoTubeArmor.Network.PacketRequestUpdatePedestal;
import com.Pyro.NanoTubeArmor.Network.PacketUpdatePedestal;
import com.Pyro.NanoTubeArmor.Recipe.ModRecipes;
import com.Pyro.NanoTubeArmor.World.ModWorldGen;

import net.minecraft.block.Block;
import net.minecraft.command.CommandBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = NanoTubeArmor.MODID, name = NanoTubeArmor.MODNAME, version = NanoTubeArmor.VERSION, useMetadata = true)
public class NanoTubeArmor {
	
	public static final String MODID = "nanotubearmor";
	public static final String MODNAME = "Nano Tube Armor";
	public static final String VERSION = "0.0.0.1";

	public static SimpleNetworkWrapper network;
	
	public static final NanoTubeArmorTab creativeTab = new NanoTubeArmorTab();
	public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("COPPER", 2, 500, 6, 2, 14);
	public static final ItemArmor.ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("COPPER", MODID + ":copper", 15, new int[] {2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ItemArmor.ArmorMaterial nanoArmorMaterial = EnumHelper.addArmorMaterial("NANOTUBE", MODID + ":nano_tube", 100, new int[] {10, 10, 10, 10}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);
	
	@SidedProxy(clientSide = "com.Pyro.NanoTubeArmor.ClientProxy", serverSide = "com.Pyro.NanoTubeArmor.ServerProxy")
	public static CommonProxy proxy;
	
	@Mod.Instance
	public static NanoTubeArmor instance;
	
	public static Logger logger;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		
		logger = e.getModLog();
		proxy.preInit(e);
		
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new ModGuiHandler());
		
		network = NetworkRegistry.INSTANCE.newSimpleChannel(MODID);
		network.registerMessage(new PacketUpdatePedestal.Handler(), PacketUpdatePedestal.class, 0, Side.CLIENT);
		network.registerMessage(new PacketRequestUpdatePedestal.Handler(), PacketRequestUpdatePedestal.class, 1, Side.SERVER);
		
		proxy.registerRenderers();
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		
		proxy.init(e);
		ModRecipes.init();
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
		proxy.postInit(e);
		
	}
	
	@Mod.EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		
		event.registerServerCommand(new HealCommand());
		
	}
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
			
		}
		
		@SubscribeEvent 
		public static void registerModels(ModelRegistryEvent event) {
			
			ModItems.registerModels();
			ModBlocks.registerModels();
			
		}
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			
			ModBlocks.register(event.getRegistry());
			
		}
		
	}
	
}
