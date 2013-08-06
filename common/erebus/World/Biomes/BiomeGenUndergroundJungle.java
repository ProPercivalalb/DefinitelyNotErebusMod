package erebus.World.Biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.world.World;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenBigMushroom;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenTrees;
import erebus.mod_Erebus;
import erebus.Entity.EntityBeetle;
import erebus.Entity.EntityBeetleLarva;
import erebus.Entity.EntityFly;
import erebus.Entity.EntityTarantula;
import erebus.Entity.EntityWasp;
import erebus.World.Gen.WorldGenErebusHugeTree;
import erebus.World.Gen.WorldGenErebusTrees;
import erebus.World.Gen.WorldGenEucalyptus;
import erebus.World.Gen.WorldGenGlowStoneErebus1;
import erebus.World.Gen.WorldGenGlowStoneErebus2;
import erebus.World.Gen.WorldGenMelonErebus;
import erebus.World.Gen.WorldGenMossbarkTree;
import erebus.World.Gen.WorldGenPonds;
import erebus.World.Gen.WorldGenQuickSand;
import erebus.World.Gen.WorldGenTurnips;

public class BiomeGenUndergroundJungle extends BiomeGenBaseErebus
{
	public BiomeGenUndergroundJungle(int par1)
	{
		super(par1);
		spawnableMonsterList.clear();
		spawnableCreatureList.clear();
		spawnableWaterCreatureList.clear();
		spawnableCaveCreatureList.clear();
		spawnableMonsterList.add(new SpawnListEntry(EntityBeetleLarva.class, 150, 1, 4));
		spawnableMonsterList.add(new SpawnListEntry(EntityBeetle.class, 30, 1, 3));
		spawnableMonsterList.add(new SpawnListEntry(EntitySpider.class, 35, 1, 4));
		spawnableMonsterList.add(new SpawnListEntry(EntityCaveSpider.class, 10, 1, 4));
		spawnableMonsterList.add(new SpawnListEntry(EntityTarantula.class, 5, 1, 4));
		spawnableCaveCreatureList.add(new SpawnListEntry(EntityFly.class, 10, 8, 8));
		spawnableMonsterList.add(new SpawnListEntry(EntityWasp.class, 30, 1, 4));
		
		this.topBlock = (byte)Block.grass.blockID;
		this.fillerBlock = (byte)Block.dirt.blockID;
	}

	public int getRandomXZOffset(Random rand) {
		return 8 + rand.nextInt(9) - rand.nextInt(9);
	}
	
	@Override
	public void generateTerrain(World worldObj, Random rand, IChunkProvider par1iChunkProvider, int x, int z)
	{
		/**Generating big lakes first to avoid complications**/
		/**TODO: Currently broken, generates into other chunks and causes floating trees**/
		/*for(int c = 5; c > 0; c--)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(64);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenBigLake(Block.waterMoving.blockID, Block.sand.blockID, Block.blockClay.blockID, 8D)).generate(worldObj, rand, j2, l3, j5);
			}
		}*/
		
		/**Generating lakes first to avoid complications**/
		for(int c = 20; c > 0; c--)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(120);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenPonds(Block.waterMoving.blockID, Block.blockClay.blockID, (rand.nextDouble() + 1.0D) * 2D)).generate(worldObj, rand, j2, l3, j5);
			}
		}
		
		if (rand.nextInt(1) == 0)
		{
			int i2 = x + getRandomXZOffset(rand);
			int k3 = rand.nextInt(128);
			int i5 = z + getRandomXZOffset(rand);
			(new WorldGenFlowers(Block.mushroomBrown.blockID)).generate(worldObj, rand, i2, k3, i5);
		}

		if (rand.nextInt(1) == 0)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(128);
			int j5 = z + getRandomXZOffset(rand);
			(new WorldGenFlowers(Block.mushroomRed.blockID)).generate(worldObj, rand, j2, l3, j5);
		}

		for(int c = 10; c > 0; c--)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(120);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenQuickSand()).generate(worldObj, rand, j2, l3, j5);
			}
		}

		//Trees
		for(int c = 300; c > 0; c--)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(120);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenHugeTrees(true, 4 + rand.nextInt(40), 3, 3)).generate(worldObj, rand, j2, l3, j5);
			}
		}

		for(int c = 300; c > 0; c--)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(120);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenMossbarkTree()).generate(worldObj, rand, j2, l3, j5);
			}
		}

		for(int c = 300; c > 0; c--)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(120);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenTrees(true, 6, 3, 3, true)).generate(worldObj, rand, j2, l3, j5);
			}
		}

		for(int c = 300; c > 0; c--)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(120);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenErebusHugeTree(true, 20 + rand.nextInt(5), 0, 0, true, mod_Erebus.woodMahogany.blockID, mod_Erebus.leavesMahogany.blockID)).generate(worldObj, rand, j2, l3, j5);
			}
		}

		for(int c = 300; c > 0; c--)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(120);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenErebusTrees(true, 5, 0, 0, true, mod_Erebus.woodMahogany.blockID, mod_Erebus.leavesMahogany.blockID, mod_Erebus.thorns.blockID)).generate(worldObj, rand, j2, l3, j5);
			}
		}

		for(int c = 300; c > 0; c--)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(120);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenEucalyptus(mod_Erebus.woodEucalyptus.blockID, 2, mod_Erebus.leavesEucalyptus.blockID, 2, 8 + rand.nextInt(4), 5, 8, Block.grass.blockID)).generate(worldObj, rand, j2, l3, j5);
			}
		}

		//Glowstone
		for(int c = 10; c > 0; c--)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(128);
			int j5 = z + getRandomXZOffset(rand);
			(new WorldGenGlowStoneErebus1()).generate(worldObj, rand, j2, l3, j5);
		}

		for(int c = 10; c > 0; c--)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(128);
			int j5 = z + getRandomXZOffset(rand);
			(new WorldGenGlowStoneErebus2()).generate(worldObj, rand, j2, l3, j5);
		}

		for(int c = 15; c > 0; c--)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(120);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenBigMushroom(0)).generate(worldObj, rand, j2, l3, j5);
			}
		}  

		for(int c = 25; c > 0; c--)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(120);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenBigMushroom(1)).generate(worldObj, rand, j2, l3, j5);
			}
		} 

		for (int var5 = 0; var5 < 2; ++var5)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(120);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenMelonErebus()).generate(worldObj, rand, j2, l3, j5);
			}
		}  

		for(int c = 0; c < 200; c++)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(120);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenTallGrass(mod_Erebus.fern.blockID, 1)).generate(worldObj, rand, j2, l3, j5);
			}
		}

		for(int c = 0; c < 1000; c++)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(120);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenTallGrass(mod_Erebus.erebusGrass.blockID, 1)).generate(worldObj, rand, j2, l3, j5);
			}
		}

		/**Generating jungle vines**/
		for(int i1 = 0; i1 < 250; i1++)
		{
			int posX3 = x + getRandomXZOffset(rand);
			int posY3 = 6 + rand.nextInt(120);
			int posZ3 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(posX3, posY3, posZ3) == 0)
			{
				if(Block.isNormalCube(worldObj.getBlockId(posX3, posY3, posZ3 + 1)))
				{ 
					for(int c = rand.nextInt(30); c > 0; c--)
					{
						if(worldObj.getBlockId(posX3, posY3 - c, posZ3) == 0)
						{
							worldObj.setBlock(posX3, posY3 - c, posZ3, Block.vine.blockID, 1, 3);
						}
					}
				}
				if(Block.isNormalCube(worldObj.getBlockId(posX3 - 1, posY3, posZ3)))
				{
					for(int c = rand.nextInt(30); c > 0; c--)
					{
						if(worldObj.getBlockId(posX3, posY3 - c, posZ3) == 0)
						{
							worldObj.setBlock(posX3, posY3 - c, posZ3, Block.vine.blockID, 2, 3);
						}
					}
				}
				if(Block.isNormalCube(worldObj.getBlockId(posX3, posY3, posZ3 - 1)))
				{ 
					for(int c = rand.nextInt(30); c > 0; c--)
					{
						if(worldObj.getBlockId(posX3, posY3 - c, posZ3) == 0)
						{
							worldObj.setBlock(posX3, posY3 - c, posZ3, Block.vine.blockID, 4, 3);
						}
					}
				}
				if(Block.isNormalCube(worldObj.getBlockId(posX3 + 1, posY3, posZ3)))
				{ 
					for(int c = rand.nextInt(30); c > 0; c--)
					{
						if(worldObj.getBlockId(posX3, posY3 - c, posZ3) == 0)
						{
							worldObj.setBlock(posX3, posY3 - c, posZ3, Block.vine.blockID, 0, 3);
						}
					}
				}
			}
		}

		/**Generating thorns**/
		for(int i1 = 0; i1 < 250; i1++)
		{
			int posX3 = x + getRandomXZOffset(rand);
			int posY3 = 6 + rand.nextInt(120);
			int posZ3 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(posX3, posY3, posZ3) == 0)
			{
				if(Block.isNormalCube(worldObj.getBlockId(posX3, posY3, posZ3 + 1)))
				{ 
					for(int c = rand.nextInt(30); c > 0; c--)
					{
						if(worldObj.getBlockId(posX3, posY3 - c, posZ3) == 0)
						{
							worldObj.setBlock(posX3, posY3 - c, posZ3, mod_Erebus.thorns.blockID, 1, 3);
						}
					}
				}
				if(Block.isNormalCube(worldObj.getBlockId(posX3 - 1, posY3, posZ3)))
				{
					for(int c = rand.nextInt(30); c > 0; c--)
					{
						if(worldObj.getBlockId(posX3, posY3 - c, posZ3) == 0)
						{
							worldObj.setBlock(posX3, posY3 - c, posZ3, mod_Erebus.thorns.blockID, 2, 3);
						}
					}
				}
				if(Block.isNormalCube(worldObj.getBlockId(posX3, posY3, posZ3 - 1)))
				{ 
					for(int c = rand.nextInt(30); c > 0; c--)
					{
						if(worldObj.getBlockId(posX3, posY3 - c, posZ3) == 0)
						{
							worldObj.setBlock(posX3, posY3 - c, posZ3, mod_Erebus.thorns.blockID, 4, 3);
						}
					}
				}
				if(Block.isNormalCube(worldObj.getBlockId(posX3 + 1, posY3, posZ3)))
				{ 
					for(int c = rand.nextInt(30); c > 0; c--)
					{
						if(worldObj.getBlockId(posX3, posY3 - c, posZ3) == 0)
						{
							worldObj.setBlock(posX3, posY3 - c, posZ3, mod_Erebus.thorns.blockID, 0, 3);
						}
					}
				}
			}
		}

		for (int var5 = 0; var5 < 5; ++var5)
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(120);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenMelonErebus()).generate(worldObj, rand, j2, l3, j5);
			}
		}  

		for (int var5 = 0; var5 < 10; ++var5) //10
		{
			int j2 = x + getRandomXZOffset(rand);
			int l3 = rand.nextInt(120);
			int j5 = z + getRandomXZOffset(rand);
			if(worldObj.getBlockId(j2, l3, j5) == 0 && worldObj.getBlockId(j2, l3 - 1, j5) == Block.grass.blockID)
			{
				(new WorldGenTurnips()).generate(worldObj, rand, j2, l3, j5);
			}
		}
	}
}