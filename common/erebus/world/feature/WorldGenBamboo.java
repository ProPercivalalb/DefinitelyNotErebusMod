package erebus.world.feature;

import java.util.Random;
import erebus.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenBamboo extends WorldGenerator {
	private int bambooAmount;
	
	public WorldGenBamboo(int bambooAmount){
		this.bambooAmount=bambooAmount;
	}

	@Override
	public boolean generate(World world, Random rand, int x, int y, int z){
		for(int xx,yy,zz,attempt=0,bambooPlaced=0; attempt<bambooAmount*2&&bambooPlaced<bambooAmount; attempt++){
			xx=x+rand.nextInt(8)-rand.nextInt(8);
			zz=z+rand.nextInt(8)-rand.nextInt(8);
			
			for(yy=y-4; yy<=y+4; yy++){
				if (world.isAirBlock(xx,yy,zz)&&world.getBlockId(xx,yy-1,zz)==Block.grass.blockID){
					world.setBlock(xx,yy,zz,ModBlocks.bambooCrate.blockID);
					
					for(int bambooY=1,bambooHeight=rand.nextInt(6)+4; bambooY<bambooHeight; bambooY++){
						if (world.isAirBlock(xx,yy+bambooY,zz))world.setBlock(xx,yy+bambooY,zz,ModBlocks.bambooCrate.blockID);
					}
					
					++bambooPlaced;
					break;
				}
			}
		}

		return true;
	}
}
