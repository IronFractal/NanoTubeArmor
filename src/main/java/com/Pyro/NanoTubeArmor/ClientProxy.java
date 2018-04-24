package com.Pyro.NanoTubeArmor;

import com.Pyro.NanoTubeArmor.Block.Pedestal.TESRPedestal;
import com.Pyro.NanoTubeArmor.Block.Pedestal.TileEntityPedestal;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy{

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent e) {
		
	}
	
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(NanoTubeArmor.MODID + ":" + id, "inventory"));
		
	}
	
	@Override
	public String localize(String unlocalized, Object... args) {
		
		return I18n.format(unlocalized, args);
		
	}
	
	@Override
	public void registerRenderers() {
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPedestal.class, new TESRPedestal());
		
	}
	
}
