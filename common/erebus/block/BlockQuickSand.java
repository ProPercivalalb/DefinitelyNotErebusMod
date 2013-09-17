package erebus.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;

public class BlockQuickSand extends Block{

	public BlockQuickSand(int id){
		super(id,Material.sand);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z){
		return world.getBlockId(x,y-1,z)==blockID?null:AxisAlignedBB.getAABBPool().getAABB(x,y,z,x+1,y+0.001F,z+1);
	}

	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity){
		entity.isAirBorne=false;
		entity.setInWeb();
	}
	
	@ForgeSubscribe
	public void onEntityJump(LivingJumpEvent e){
		if (e.entity.worldObj.getBlockId((int)Math.floor(e.entity.posX),(int)Math.floor(e.entity.posY)-1,(int)Math.floor(e.entity.posZ))==blockID){
			e.entityLiving.motionY=0D;
		}
	}
}