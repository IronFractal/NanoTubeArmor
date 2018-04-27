package com.Pyro.NanoTubeArmor.Item;

import com.Pyro.NanoTubeArmor.NanoTubeArmor;
import com.Pyro.NanoTubeArmor.Item.Tool.ItemAxe;
import com.Pyro.NanoTubeArmor.Item.Tool.ItemHoe;
import com.Pyro.NanoTubeArmor.Item.Tool.ItemPickaxe;
import com.Pyro.NanoTubeArmor.Item.Tool.ItemShovel;
import com.Pyro.NanoTubeArmor.Item.Tool.ItemSword;
import com.Pyro.NanoTubeArmor.Item.Tool.ItemVineKiller;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemOre ingotCopper = new ItemOre("ingot_copper", "ingotCopper");
	public static ItemOre ingotZinc = new ItemOre("ingot_zinc", "ingotZinc");
	public static ItemOre ingotTungsten = new ItemOre("ingot_tungsten", "ingotTungsten");
	public static ItemOre ingotTitanium = new ItemOre("ingot_titanium", "ingotTitanium");
	public static ItemOre ingotChromium = new ItemOre("ingot_chromium", "ingotChromium");
	public static ItemOre ingotFrancium = new ItemOre("ingot_francium", "ingotFrancium");
	public static ItemOre ingotUKMeU119 = new ItemOre("ingot_ukmeu119", "ingotUKMeU119");
	public static ItemOre ingotUKMeU120 = new ItemOre("ingot_ukmeu120", "ingotUKMeU120");
	
	public static ItemOre plateCopper = new ItemOre("plate_copper", "plateCopper");
	public static ItemOre plateZinc = new ItemOre("plate_zinc", "plateZinc");
	public static ItemOre plateTungsten = new ItemOre("plate_tungsten", "plateTungsten");
	public static ItemOre plateTitanium = new ItemOre("plate_titanium", "plateTitanium");
	public static ItemOre plateChromium = new ItemOre("plate_chromium", "plateChromium");
	public static ItemOre plateFrancium = new ItemOre("plate_francium", "plateFrancium");
	public static ItemOre plateUKMeU119 = new ItemOre("plate_ukmeu119", "plateUKMeU119");
	public static ItemOre plateUKMeU120 = new ItemOre("plate_ukmeu120", "plateUKMeU120");
	
	public static ItemOre dustCarbon = new ItemOre("dust_carbon", "dustCoal");
	public static ItemOre silicon = new ItemOre("silicon", "silicon");
	public static ItemOre battery = new ItemOre("battery", "battery");
	
	public static ItemSword copperSword = new ItemSword(NanoTubeArmor.copperToolMaterial, "copper_sword");
	public static ItemPickaxe copperPickaxe = new ItemPickaxe(NanoTubeArmor.copperToolMaterial, "copper_pickaxe");
	public static ItemAxe copperAxe = new ItemAxe(NanoTubeArmor.copperToolMaterial, "copper_axe");
	public static ItemShovel copperShovel = new ItemShovel(NanoTubeArmor.copperToolMaterial, "copper_shovel");
	public static ItemHoe copperHoe = new ItemHoe(NanoTubeArmor.copperToolMaterial, "copper_hoe");
	
	public static ItemArmor copperHelmet = new ItemArmor(NanoTubeArmor.copperArmorMaterial, EntityEquipmentSlot.HEAD, "copper_helmet");
	public static ItemArmor copperChestplate = new ItemArmor(NanoTubeArmor.copperArmorMaterial, EntityEquipmentSlot.CHEST, "copper_chestplate");
	public static ItemArmor copperLeggings = new ItemArmor(NanoTubeArmor.copperArmorMaterial, EntityEquipmentSlot.LEGS, "copper_leggings");
	public static ItemArmor copperBoots = new ItemArmor(NanoTubeArmor.copperArmorMaterial, EntityEquipmentSlot.FEET, "copper_boots");
	
	public static ItemNanoArmor nanoHelmet = new ItemNanoArmor(NanoTubeArmor.nanoArmorMaterial, EntityEquipmentSlot.HEAD, "nano_helmet");
	public static ItemNanoArmor nanoChestplate = new ItemNanoArmor(NanoTubeArmor.nanoArmorMaterial, EntityEquipmentSlot.CHEST, "nano_chestplate");
	public static ItemNanoArmor nanoLeggings = new ItemNanoArmor(NanoTubeArmor.nanoArmorMaterial, EntityEquipmentSlot.LEGS, "nano_leggings");
	public static ItemNanoArmor nanoBoots = new ItemNanoArmor(NanoTubeArmor.nanoArmorMaterial, EntityEquipmentSlot.FEET, "nano_boots");
	
	public static ItemVineKiller vineKiller = new ItemVineKiller("vine_killer");
	public static ItemBase vineGem = new ItemBase("vine_gem");
	
	public static ItemBase graphene = new ItemBase("graphene");
	public static ItemBase tape = new ItemBase("tape");
	public static ItemBase nanoTubes = new ItemBase("nano_tubes");
	public static ItemBase nanoTubeThread = new ItemBase("nano_tube_thread");
	public static ItemBase nanoTubeCloth = new ItemBase("nano_tube_cloth");
	public static ItemBase energizedBall = new ItemBase("energized_ball");
	public static ItemBase armorPlate = new ItemBase("armor_plate");
	public static ItemBase wire = new ItemBase("wire");
	public static ItemBase siliconBoard = new ItemBase("silicon_board");
	public static ItemBase computerBoard = new ItemBase("computer_board");
	public static ItemBase nanoBotSwarm = new ItemBase("nano_bot_swarm");
	public static ItemBase artificialMuscle = new ItemBase("artificial_muscle");
	public static ItemBase nanoArmorPlate = new ItemBase("nano_armor_plate");
	
	public static void register(IForgeRegistry<Item> registry) {
		
		registry.registerAll(ingotCopper);
		registry.registerAll(ingotZinc);
		registry.registerAll(ingotTungsten);
		registry.registerAll(ingotTitanium);
		registry.registerAll(ingotChromium);
		registry.registerAll(ingotFrancium);
		registry.registerAll(ingotUKMeU119);
		registry.registerAll(ingotUKMeU120);
		
		registry.registerAll(plateCopper);
		registry.registerAll(plateZinc);
		registry.registerAll(plateTungsten);
		registry.registerAll(plateTitanium);
		registry.registerAll(plateChromium);
		registry.registerAll(plateFrancium);
		registry.registerAll(plateUKMeU119);
		registry.registerAll(plateUKMeU120);
		
		registry.registerAll(dustCarbon);
		registry.registerAll(silicon);
		registry.registerAll(battery);
		
		//registry.registerAll(copperSword);
		//registry.registerAll(copperPickaxe);
		//registry.registerAll(copperAxe);
		//registry.registerAll(copperShovel);
		//registry.registerAll(copperHoe);
		
		//registry.registerAll(copperHelmet);
		//registry.registerAll(copperChestplate);
		//registry.registerAll(copperLeggings);
		//registry.registerAll(copperBoots);
		
		registry.registerAll(nanoHelmet);
		registry.registerAll(nanoChestplate);
		registry.registerAll(nanoLeggings);
		registry.registerAll(nanoBoots);
		
		registry.registerAll(vineKiller);
		registry.registerAll(vineGem);
		
		registry.registerAll(graphene);
		registry.registerAll(tape);
		registry.registerAll(nanoTubes);
		registry.registerAll(nanoTubeThread);
		registry.registerAll(nanoTubeCloth);
		registry.registerAll(energizedBall);
		registry.registerAll(armorPlate);
		registry.registerAll(wire);
		registry.registerAll(siliconBoard);
		registry.registerAll(computerBoard);
		registry.registerAll(nanoBotSwarm);
		
		registry.registerAll(artificialMuscle);
		registry.registerAll(nanoArmorPlate);
		
	}
	
	public static void registerModels() {
		
		ingotCopper.registerItemModel();
		ingotZinc.registerItemModel();
		ingotTungsten.registerItemModel();
		ingotTitanium.registerItemModel();
		ingotChromium.registerItemModel();
		ingotFrancium.registerItemModel();
		ingotUKMeU119.registerItemModel();
		ingotUKMeU120.registerItemModel();
		
		plateCopper.registerItemModel();
		plateZinc.registerItemModel();
		plateTungsten.registerItemModel();
		plateTitanium.registerItemModel();
		plateChromium.registerItemModel();
		plateFrancium.registerItemModel();
		plateUKMeU119.registerItemModel();
		plateUKMeU120.registerItemModel();
		
		dustCarbon.registerItemModel();
		silicon.registerItemModel();
		battery.registerItemModel();
		
		//copperSword.registerItemModel();
		//copperPickaxe.registerItemModel();
		//copperAxe.registerItemModel();
		//copperShovel.registerItemModel();
		//copperHoe.registerItemModel();
		
		//copperHelmet.registerItemModel();
		//copperChestplate.registerItemModel();
		//copperLeggings.registerItemModel();
		//copperBoots.registerItemModel();
		
		nanoHelmet.registerItemModel();
		nanoChestplate.registerItemModel();
		nanoLeggings.registerItemModel();
		nanoBoots.registerItemModel();
		
		vineKiller.registerItemModel();
		vineGem.registerItemModel();
		
		graphene.registerItemModel();
		tape.registerItemModel();
		nanoTubes.registerItemModel();
		nanoTubeThread.registerItemModel();
		nanoTubeCloth.registerItemModel();
		energizedBall.registerItemModel();
		armorPlate.registerItemModel();
		wire.registerItemModel();
		siliconBoard.registerItemModel();
		computerBoard.registerItemModel();
		nanoBotSwarm.registerItemModel();
		artificialMuscle.registerItemModel();
		nanoArmorPlate.registerItemModel();
		
	}

}
