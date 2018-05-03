package com.Pyro.NanoTubeArmor.World;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

import org.lwjgl.util.Dimension;

import com.Pyro.NanoTubeArmor.Block.ModBlocks;
import com.google.common.base.Predicate;

public class ModWorldGen implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		//Overworld
		if(world.provider.getDimension() == 0) {
			
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
			
		}else if (world.provider.getDimension() == -1) {
			
			generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
			
		}
		
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		generateOre(ModBlocks.oreCopper.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(4), 4, BlockMatcher.forBlock(Blocks.STONE));
		generateOre(ModBlocks.oreZinc.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(6), 8, BlockMatcher.forBlock(Blocks.STONE));
		generateOre(ModBlocks.oreChromium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(6), 6, BlockMatcher.forBlock(Blocks.STONE));
		generateOre(ModBlocks.oreFrancium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(1), 2, BlockMatcher.forBlock(Blocks.STONE));
		generateOre(ModBlocks.oreTitanium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(4), 5, BlockMatcher.forBlock(Blocks.STONE));
		generateOre(ModBlocks.oreTungsten.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(3), 5, BlockMatcher.forBlock(Blocks.STONE));
		
	}
	
	private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		generateOre(ModBlocks.oreUKMeU119.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(2), 2, BlockMatcher.forBlock(Blocks.NETHERRACK));
		generateOre(ModBlocks.oreUKMeU120.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(2), 2, BlockMatcher.forBlock(Blocks.NETHERRACK));
		
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances, Predicate<IBlockState> pred) {
		
		int deltaY = maxY - minY;
		
		for(int i = 0; i < chances; i++) {
			
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size, pred);
			generator.generate(world, random, pos);
			
		}
		
	}

}
