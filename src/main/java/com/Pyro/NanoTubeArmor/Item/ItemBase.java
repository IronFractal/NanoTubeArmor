package com.Pyro.NanoTubeArmor.Item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.Pyro.NanoTubeArmor.NanoTubeArmor;

public class ItemBase extends Item{
	
	protected String name;
	
	public ItemBase(String name) {
		
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(NanoTubeArmor.creativeTab);
		
	}
	
	public void registerItemModel() {
		
		NanoTubeArmor.proxy.registerItemRenderer(this, 0, name);
		
	}
	
	
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		
		super.setCreativeTab(tab);
		return this;
		
	}

}
