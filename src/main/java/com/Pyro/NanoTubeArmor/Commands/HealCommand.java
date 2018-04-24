package com.Pyro.NanoTubeArmor.Commands;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.FoodStats;
import net.minecraft.util.math.BlockPos;

public class HealCommand implements ICommand {

	private final List aliases;
	
	public HealCommand() {
		
		aliases = new ArrayList();
		aliases.add("heal");
		aliases.add("h");
		
	}
	
	@Override
	public int compareTo(ICommand arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "heal";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "/heal or /h to restore full hunger and health bars.";
	}

	@Override
	public List<String> getAliases() {
		// TODO Auto-generated method stub
		return this.aliases;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		// TODO Auto-generated method stub
		
		Entity entitySender = sender.getCommandSenderEntity();
		
		if(entitySender instanceof EntityPlayer) {
			
			EntityPlayer player = (EntityPlayer)entitySender;
			FoodStats food = new FoodStats();
			
			food = player.getFoodStats();
			
			player.setHealth(player.getMaxHealth());
			food.setFoodLevel(20);
			food.setFoodSaturationLevel(20);
			
		}
		
	}

	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
		// TODO Auto-generated method stub
		
		if(sender.canUseCommand(server.getOpPermissionLevel(), "gamemode")) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}

	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args,
			BlockPos targetPos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		// TODO Auto-generated method stub
		return false;
	}

}
