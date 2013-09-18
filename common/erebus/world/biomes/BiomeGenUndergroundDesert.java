package erebus.world.biomes;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenLakes;
import erebus.ModBlocks;

public class BiomeGenUndergroundDesert extends BiomeGenBaseErebus
{
    public BiomeGenUndergroundDesert(int par1)
    {
        super(par1);
        spawnableMonsterList.clear();
        spawnableCreatureList.clear();
        spawnableWaterCreatureList.clear();
        spawnableCaveCreatureList.clear();
        this.topBlock = (byte)Block.sand.blockID;
        this.fillerBlock = (byte)Block.sandStone.blockID;
    }

	@Override
	public void generateTerrain(World worldObj, Random rand, IChunkProvider par1iChunkProvider, int x, int z) 
	{
		for(int c = 40; c > 0; c--)
    	{
    		int posX = x + rand.nextInt(16);
    		int posY = rand.nextInt(120);
        	int posZ = z + rand.nextInt(16);
        	if(worldObj.getBlockId(posX, posY, posZ) == 0 && worldObj.getBlockId(posX, posY - 1, posZ) == Block.sand.blockID)
        	{
        		(new WorldGenLakes(Block.lavaMoving.blockID)).generate(worldObj, worldObj.rand, posX, posY, posZ);
        	}
    	}
		
		for(int c = 10; c > 0; c--)
    	{
    		int posX = x + rand.nextInt(16);
    		int posY = rand.nextInt(120);
        	int posZ = z + rand.nextInt(16);
        	if(worldObj.getBlockId(posX, posY, posZ) == ModBlocks.umberstone.blockID && worldObj.getBlockId(posX, posY - 1, posZ) == 0)
        	{
        		worldObj.setBlock(posX, posY, posZ, Block.lavaMoving.blockID);
        		/**Makes lava fall instantly
        		 * Avoids a lot of block update lag
        		**/
        		worldObj.scheduledUpdatesAreImmediate = true;
                Block.blocksList[Block.lavaMoving.blockID].updateTick(worldObj, posX, posY, posZ, rand);
                worldObj.scheduledUpdatesAreImmediate = false;
        	}
    	}
	}
}