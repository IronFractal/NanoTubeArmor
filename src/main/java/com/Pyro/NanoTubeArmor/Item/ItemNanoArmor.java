package com.Pyro.NanoTubeArmor.Item;

import com.Pyro.NanoTubeArmor.NanoTubeArmor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemNanoArmor extends net.minecraft.item.ItemArmor {
	
	private String name;
	
	private boolean equiped = false;
	
	private static final float SPEED_BONUS = 0.025f;
	
	public ItemNanoArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		
		this.setCreativeTab(NanoTubeArmor.creativeTab);

	}

	public void registerItemModel() {
		
		NanoTubeArmor.proxy.registerItemRenderer(this, 0, name);
		
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        
		if (this.isInCreativeTab(tab))
        {
   
			ItemStack stack = new ItemStack(this);
			stack.addEnchantment(Enchantment.getEnchantmentByID(10), 1);
			
            items.add(stack);
        
        }
    
    }
	
	@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
		
		stack.addEnchantment(Enchantment.getEnchantmentByID(10), 1);
		
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
    {
		
		EntityPlayer player = (EntityPlayer) entityIn;
		
		updateArmorEffects(player);
		
		if(isEquipedAsArmor(player, itemSlot) && equiped == false) {
			
			equiped = true;
			
		}else if (!isEquipedAsArmor(player, itemSlot)){
			
			if(equiped == true) {
				
				equiped = false;
				if(!worldIn.isRemote) {
					
					//killPlayer(player);
				
				}
				
			}
			
		}
		
    }
	
	private void updateArmorEffects(EntityPlayer player) {
		
		if(!player.isCreative() || !player.isSpectator()) {
		
			if(fullSet(player)) {
				
				player.capabilities.disableDamage = true;
				player.capabilities.allowFlying = true;
				
				if(player.moveForward > 0 && player.isSprinting()) {
					
					player.moveRelative(0, 0, 1, player.isInWater() ? SPEED_BONUS / 2f : SPEED_BONUS);
					
				}else if(player.moveForward < 0) {
					
					player.moveRelative(0, 0, -1, player.isInWater() ? SPEED_BONUS / 2.5f : SPEED_BONUS / 1.5f);
					
				}
				
				if(player.getFoodStats().getFoodLevel() < 20) {
					
					player.getFoodStats().setFoodLevel(20);
					
				}
				
			}else {
				
				player.capabilities.disableDamage = false;
				player.capabilities.allowFlying = false;
				
				if(!player.onGround) {
					
					player.capabilities.isFlying = false;
					
				}
				
			}
		
		} else {
			
			player.capabilities.disableDamage = true;
			player.capabilities.allowFlying = true;
			
			
		}
		
	}
	
	private boolean fullSet(EntityPlayer player) {
		
		ItemStack head = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
		ItemStack ches = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
		ItemStack legs = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
		ItemStack feet = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
		
		if(head.getItem() == ModItems.nanoHelmet && ches.getItem() == ModItems.nanoChestplate && legs.getItem() == ModItems.nanoLeggings && feet.getItem() == ModItems.nanoBoots) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}
	
	private void killPlayer(EntityPlayer player) {
		
		if(true) {
			
			player.attackEntityFrom(DamageSource.GENERIC.setDamageBypassesArmor().setDamageIsAbsolute(), 1000);
			
		}
		
	}
	
	private boolean isEquipedAsArmor(EntityPlayer player, int itemSlot) {
		
		if(player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ModItems.nanoChestplate && itemSlot == EntityEquipmentSlot.CHEST.getSlotIndex()) {
			
			return true;
			
		}else if(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.nanoHelmet && itemSlot == EntityEquipmentSlot.HEAD.getSlotIndex()) {
			
			return true;
			
		}else if(player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ModItems.nanoLeggings && itemSlot == EntityEquipmentSlot.LEGS.getSlotIndex()) {
			
			return true;
			
		}else if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.nanoBoots && itemSlot == EntityEquipmentSlot.FEET.getSlotIndex()) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}
	
	
}
