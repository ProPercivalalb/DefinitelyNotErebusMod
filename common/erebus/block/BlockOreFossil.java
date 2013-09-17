package erebus.block;

import java.util.ArrayList;
import java.util.Random;

import erebus.core.proxy.CommonProxy;
import erebus.ErebusMod;
import erebus.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockOreFossil extends Block {
   
	public BlockOreFossil(int par1) {
        super(par1, Material.rock);
    }

    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
    	return Item.bone.itemID;
    }
    
    @Override
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        
        if (world.rand.nextInt(50-Math.min(6,fortune*2))==0){
        	ret.add(new ItemStack(ModItems.fossilClub,1));
        	return ret;
        }
        
		int count = 1+world.rand.nextInt(3);
        
        for(int i = 0; i < count; i++)
        {
            int id = -1;
            int damage = 0;
            
            if (world.rand.nextInt(3) == 0) {
        		id = Item.bone.itemID;
        	}
        	else {
        		id = ModItems.erebusMaterials.itemID;
        		damage = 2;
        	}
            
            if (id > 0) {
                ret.add(new ItemStack(id, 1, damage));
            }
        }
        return ret;
    }
}
