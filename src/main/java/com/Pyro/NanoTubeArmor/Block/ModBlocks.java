package com.Pyro.NanoTubeArmor.Block;

import com.Pyro.NanoTubeArmor.Block.Pedestal.BlockPedestal;
import com.Pyro.NanoTubeArmor.Counter.BlockCounter;
import com.Pyro.NanoTubeArmor.LeverToggle.BlockLeverToggle;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static BlockOre oreCopper = new BlockOre("ore_copper", "oreCopper");
	public static BlockOre oreZinc = new BlockOre("ore_zinc", "oreZinc");
	public static BlockOre oreTungsten = new BlockOre("ore_tungsten", "oreTungsten");
	public static BlockOre oreTitanium = new BlockOre("ore_titanium", "oreTitanium");
	public static BlockOre oreChromium = new BlockOre("ore_chromium", "oreChromium");
	public static BlockOre oreFrancium = new BlockOre("ore_francium", "oreFrancium");
	public static BlockOre oreUKMeU119 = new BlockOre("ore_ukmeu119", "oreUKMeU119");
	public static BlockOre oreUKMeU120 = new BlockOre("ore_ukmeu120", "oreUKMeU120");
	
	public static BlockLeverToggle leverToggle = new BlockLeverToggle(Material.ROCK, "blockLeverToggle");
	
	public static BlockPedestal pedestal = new BlockPedestal();
	
	public static BlockCounter counter = new BlockCounter();

	public static void register(IForgeRegistry<Block> registry) {
		
		registry.registerAll(oreCopper);
		registry.registerAll(oreZinc);
		registry.registerAll(oreTungsten);
		registry.registerAll(oreTitanium);
		registry.registerAll(oreChromium);
		registry.registerAll(oreFrancium);
		registry.registerAll(oreUKMeU119);
		registry.registerAll(oreUKMeU120);
		
		//registry.registerAll(leverToggle);
		
		//registry.registerAll(pedestal);
		//registry.registerAll(counter);
		
		//GameRegistry.registerTileEntity(counter.getTileEntityClass(), counter.getRegistryName().toString());
		//GameRegistry.registerTileEntity(pedestal.getTileEntityClass(), pedestal.getRegistryName().toString());
		
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		
		registry.registerAll(oreCopper.createItemBlock());
		registry.registerAll(oreZinc.createItemBlock());
		registry.registerAll(oreTungsten.createItemBlock());
		registry.registerAll(oreTitanium.createItemBlock());
		registry.registerAll(oreChromium.createItemBlock());
		registry.registerAll(oreFrancium.createItemBlock());
		registry.registerAll(oreUKMeU119.createItemBlock());
		registry.registerAll(oreUKMeU120.createItemBlock());
		
		//registry.registerAll(leverToggle.createItemBlock());
		
		//registry.registerAll(pedestal.createItemBlock());
		//registry.registerAll(counter.createItemBlock());
		
	}
	
	public static void registerModels() {
		
		oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
		oreZinc.registerItemModel(Item.getItemFromBlock(oreZinc));
		oreTungsten.registerItemModel(Item.getItemFromBlock(oreTungsten));
		oreTitanium.registerItemModel(Item.getItemFromBlock(oreTitanium));
		oreChromium.registerItemModel(Item.getItemFromBlock(oreChromium));
		oreFrancium.registerItemModel(Item.getItemFromBlock(oreFrancium));
		oreUKMeU119.registerItemModel(Item.getItemFromBlock(oreUKMeU119));
		oreUKMeU120.registerItemModel(Item.getItemFromBlock(oreUKMeU120));
		
		//leverToggle.registerItemModel(Item.getItemFromBlock(leverToggle));
		
		//pedestal.registerItemModel(Item.getItemFromBlock(pedestal));
		//counter.registerItemModel(Item.getItemFromBlock(counter));
		
	}
	
}
