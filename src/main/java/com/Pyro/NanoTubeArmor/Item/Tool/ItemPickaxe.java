package com.Pyro.NanoTubeArmor.Item.Tool;

import com.Pyro.NanoTubeArmor.NanoTubeArmor;

import net.minecraft.item.Item;

public class ItemPickaxe extends net.minecraft.item.ItemPickaxe {
	
	private String name;
	
	public ItemPickaxe(ToolMaterial material, String name) {
		
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		
	}
	
	public void registerItemModel() {
		
		NanoTubeArmor.proxy.registerItemRenderer(this, 0, name);
		
	}

}
