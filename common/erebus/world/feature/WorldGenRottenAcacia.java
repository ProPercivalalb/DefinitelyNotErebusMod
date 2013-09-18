package erebus.world.feature;

import java.util.Random;

import erebus.ErebusMod;
import erebus.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenRottenAcacia extends WorldGenerator
{
	public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        while (par1World.isAirBlock(par3, par4, par5) && par4 > 2)
        {
            --par4;
        }

        int varA = par1World.getBlockId(par3 + 1, par4, par5);
        int varB = par1World.getBlockId(par3, par4, par5);
        int varC = par1World.getBlockId(par3 - 1, par4, par5);

        if (varA != Block.grass.blockID || varB != Block.grass.blockID ||varC != Block.grass.blockID)
        {
            return false;
        }
        else
        {
        	par1World.setBlock(par3, par4 + 1, par5 + 1, ModBlocks.hollowLogAcacia.blockID);
        	par1World.setBlock(par3, par4 + 1, par5, ModBlocks.hollowLogAcacia.blockID);
        	par1World.setBlock(par3, par4 + 1, par5 - 1, ModBlocks.hollowLogAcacia.blockID);
        	
        	return true;
        }
    }
}
