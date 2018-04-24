package com.Pyro.NanoTubeArmor.Recipe;

import com.Pyro.NanoTubeArmor.Block.ModBlocks;
import com.Pyro.NanoTubeArmor.Item.ModItems;

import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModRecipes {
	
	private static RebornCraftingHelper recipeHelper = new RebornCraftingHelper();

	public static void init() {
		
		ModBlocks.oreCopper.initOreDict();
		ModBlocks.oreZinc.initOreDict();
		ModBlocks.oreTitanium.initOreDict();
		ModBlocks.oreTungsten.initOreDict();
		ModBlocks.oreChromium.initOreDict();
		ModBlocks.oreFrancium.initOreDict();
		ModBlocks.oreUKMeU119.initOreDict();
		ModBlocks.oreUKMeU120.initOreDict();
		
		ModItems.ingotCopper.initOreDict();
		ModItems.ingotZinc.initOreDict();
		ModItems.ingotTungsten.initOreDict();
		ModItems.ingotTitanium.initOreDict();
		ModItems.ingotChromium.initOreDict();
		ModItems.ingotFrancium.initOreDict();
		ModItems.ingotUKMeU119.initOreDict();
		ModItems.ingotUKMeU120.initOreDict();
		
		ModItems.plateCopper.initOreDict();
		ModItems.plateZinc.initOreDict();
		ModItems.plateTungsten.initOreDict();
		ModItems.plateTitanium.initOreDict();
		ModItems.plateChromium.initOreDict();
		ModItems.plateFrancium.initOreDict();
		ModItems.plateUKMeU119.initOreDict();
		ModItems.plateUKMeU120.initOreDict();
		
		ModItems.dustCarbon.initOreDict();
		
		recipeHelper.addShapelessOreRecipe(new ItemStack(ModItems.dustCarbon, 9), Items.COAL, "cobblestone");
		//recipeHelper.addShapelessOreRecipe(new ItemStack(ModItems.dustCarbon, 9), Items.COAL, "stoneGranite");
		
		recipeHelper.addShapelessOreRecipe(new ItemStack(ModItems.tape), "slimeball", "paper");
		
		
		
		GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7f);
		GameRegistry.addSmelting(ModBlocks.oreTitanium, new ItemStack(ModItems.ingotTungsten), 0.7f);
		GameRegistry.addSmelting(ModBlocks.oreTungsten, new ItemStack(ModItems.ingotTitanium), 0.7f);
		GameRegistry.addSmelting(ModBlocks.oreChromium, new ItemStack(ModItems.ingotChromium), 0.7f);
		GameRegistry.addSmelting(ModBlocks.oreFrancium, new ItemStack(ModItems.ingotFrancium), 0.7f);
		GameRegistry.addSmelting(ModBlocks.oreUKMeU119, new ItemStack(ModItems.ingotUKMeU119), 0.7f);
		GameRegistry.addSmelting(ModBlocks.oreUKMeU120, new ItemStack(ModItems.ingotUKMeU120), 0.7f);
		
	}
	
}
