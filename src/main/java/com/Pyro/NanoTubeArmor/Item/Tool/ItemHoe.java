package com.Pyro.NanoTubeArmor.Item.Tool;

import com.Pyro.NanoTubeArmor.NanoTubeArmor;

public class ItemHoe extends net.minecraft.item.ItemHoe {

	private String name;
	
	public ItemHoe(ToolMaterial material, String name) {
		
		super(material);
		
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		
	}
	
	public void registerItemModel() {
		
		NanoTubeArmor.proxy.registerItemRenderer(this, 0, name);
		
	}
	
}
