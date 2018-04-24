package com.Pyro.NanoTubeArmor.CreativeTab;

import com.Pyro.NanoTubeArmor.NanoTubeArmor;
import com.Pyro.NanoTubeArmor.Item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NanoTubeArmorTab extends CreativeTabs{

	public NanoTubeArmorTab() {
		
		super(NanoTubeArmor.MODID);
		//setBackgroundImageName("item_search.png");
		
	}
	
	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ModItems.ingotCopper);
		
	}
	
	/*@Override
	public boolean hasSearchBar() {
		
		return true;
		
	}*/
	
}
