package com.Pyro.NanoTubeArmor.LeverToggle;

import com.Pyro.NanoTubeArmor.Block.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLever;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class BlockLeverToggle extends BlockBase {

	public BlockLeverToggle(Material material, String name) 
	{
		
		super(material, name);
		
		setHardness(3f);
		setResistance(5f);

	}

	private boolean hasLever = false;
	private boolean isLeverPower = false;
	
	private BlockPos lever = null;
	private BlockLever.EnumOrientation lFacing;
	
	private BlockPos myPos;
	
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
    {
		
		myPos = pos;
		
		if (placer instanceof EntityPlayer)
		{
			
			EntityPlayer player = (EntityPlayer) placer;
			player.sendStatusMessage(new TextComponentString(myPos.toString()), true);
			
		}
		
    }
	
	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
    {
		
		if (!worldIn.isRemote)
		{
			
			if (getLeverNeighbors(worldIn, pos) != null)
			{
			
				if (hasLever == false)
				{
					
					hasLever = true;
					lever = getLeverNeighbors(worldIn, pos);
					isLeverPower = isLeverOn(worldIn, lever);
					updateRS(worldIn, lever);
					
				}
				else
				{
					
					if (isLeverOn(worldIn, lever) && isLeverPower == false)
					{
						
						isLeverPower = isLeverOn(worldIn, lever);
						updateRS(worldIn, lever);
						
					}
					
				}
			
			}
			else
			{
				
				if (hasLever == true)
				{
					
					hasLever = false;
					isLeverPower = false;
					updateRS(worldIn, lever);
					lever = null;
					
				}
				
			}
			
			if (lever != null)
			{
				
				worldIn.destroyBlock(fromPos, true);
				
			}
			
		}
		
    }
	
	private void updateRS(World worldIn, BlockPos pos)
	{
		
		if (lever != null && !worldIn.isRemote)
		{
			
			if (isLeverPower)
			{
				
				IBlockState leverState = Blocks.LEVER.getDefaultState().withProperty(BlockLever.FACING, lFacing);
				
				//worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_ANVIL_BREAK, SoundCategory.BLOCKS, 0.3F, 0.5f);
				//worldIn.destroyBlock(lever, false);
				worldIn.setBlockState(lever, leverState);
				
			}

		}
		
	}

	private BlockPos getLeverNeighbors(World worldIn, BlockPos pos)
	{
		
		if (worldIn.getBlockState(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ())).getBlock() == Blocks.LEVER) 
		{
			
			lFacing = BlockLever.EnumOrientation.EAST;
			return new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ());
			
		}
		else if (worldIn.getBlockState(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ())).getBlock() == Blocks.LEVER)
		{
			
			lFacing = BlockLever.EnumOrientation.WEST;
			return new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ());
			
		}
		else if (worldIn.getBlockState(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ())).getBlock() == Blocks.LEVER)
		{
			
			lFacing = BlockLever.EnumOrientation.UP_X;
			return new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ());
			
		}
		else if (worldIn.getBlockState(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ())).getBlock() == Blocks.LEVER)
		{
			
			lFacing = BlockLever.EnumOrientation.DOWN_X;
			return new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
			
		}
		else if (worldIn.getBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1)).getBlock() == Blocks.LEVER)
		{
			
			lFacing = BlockLever.EnumOrientation.SOUTH;
			return new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1);
			
		}
		else if (worldIn.getBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1)).getBlock() == Blocks.LEVER)
		{
			
			lFacing = BlockLever.EnumOrientation.NORTH;
			return new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1);
			
		}
		else
		{
			
			return null;
			
		}
		
	}
	
	private boolean isLeverOn(World worldIn, BlockPos pos)
	{
		
		if(worldIn.getBlockState(pos).getBlock() instanceof BlockLever)
		{
			
			if (worldIn.isBlockPowered(pos) == true)
			{
				
				return true;
				
			}
			else
			{
				
				return false;
				
			}
			
		}
		else
		{
			
			return false;
			
		}
		
	}
	
}
