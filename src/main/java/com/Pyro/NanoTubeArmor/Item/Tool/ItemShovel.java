package com.Pyro.NanoTubeArmor.Item.Tool;

import com.Pyro.NanoTubeArmor.NanoTubeArmor;

import net.minecraft.item.ItemSpade;

public class ItemShovel extends ItemSpade {
	
	private String name;
	
	public ItemShovel(ToolMaterial material, String name) {
		
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		
	}
	
	public void registerItemModel() {
		
		NanoTubeArmor.proxy.registerItemRenderer(this, 0, name);
		
	}

}
