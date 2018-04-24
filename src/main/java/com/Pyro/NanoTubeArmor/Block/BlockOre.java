package com.Pyro.NanoTubeArmor.Block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOre extends BlockBase {
	
	private String oreName;
	
	public BlockOre(String name, String oreName) {
		
		super(Material.ROCK, name);
		
		this.oreName = oreName;
		
		setHardness(3f);
		setResistance(5f);
		
	}
	
	public BlockOre(String name, String oreName, float hardness, float resistance) {
		
		super(Material.ROCK, name);
		
		this.oreName = oreName;
		
		setHardness(hardness);
		setResistance(resistance);
		
	}
	

	public void initOreDict() {
		
		OreDictionary.registerOre(oreName, this);
		
	}
	
	@Override
	public BlockOre setCreativeTab(CreativeTabs tab) {
		
		super.setCreativeTab(tab);
		return this;
		
	}

}
