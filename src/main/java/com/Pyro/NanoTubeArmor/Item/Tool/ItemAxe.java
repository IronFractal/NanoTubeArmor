package com.Pyro.NanoTubeArmor.Item.Tool;

import com.Pyro.NanoTubeArmor.NanoTubeArmor;

import net.minecraft.item.Item;

public class ItemAxe extends net.minecraft.item.ItemAxe {

	private String name;
	
	public ItemAxe(ToolMaterial material, String name) {
		
		super(material, 8f, -3.0f);
		
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		
	}
	
	public void registerItemModel() {
		
		NanoTubeArmor.proxy.registerItemRenderer(this, 0, name);
		
	}
	
}
