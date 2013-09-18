package erebus.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import erebus.ModItems;

public class EntityCentipede extends EntityMob
{

	public int skin = rand.nextInt(2);

	public EntityCentipede(World par1World)
	{
		super(par1World);		
		this.setSize(1.2F, 0.9F);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
		this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	}
	
	@Override
	protected void applyEntityAttributes() {
	    super.applyEntityAttributes();
	    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(10.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(40.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.33000000417232513D);
	    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(2.0D);
	}
	 
	@Override
	public boolean getCanSpawnHere() {
		float f1 = this.getBrightness(1.0F);

		if (f1 > 0.5F) {
			return true;
	    }
	    return super.getCanSpawnHere();
	}
	 
	//TODO attack strenght in new 1.6 system
	public int getAttackStrength(Entity par1Entity) {
		switch(worldObj.difficultySetting) {
		default:
			return 4;
		case 1:
			return 4;
		case 2:
			return 4;
		case 3: 
			return 5;
		}
	}

	@Override
	public boolean isAIEnabled(){
		return true;
	}

	@Override
	public int getTotalArmorValue() {
		return 8;
	}

	@Override
	protected String getLivingSound() {
		return "erebus:CentipedeSound";
	}

	@Override
	protected String getHurtSound() {
		return "erebus:CentipedeHurt";
	}

	@Override
	protected String getDeathSound() {
		return "erebus:squish";
	}

	protected String getTunnelingSound()
	{
		return "erebus:TunnelingSound";
	}

	@Override
	protected void playStepSound(int par1, int par2, int par3, int par4) {
		this.worldObj.playSoundAtEntity(this, "erebus:CentipedeWalk", 0.15F, 1.0F);
	}


	@Override
	protected float getSoundVolume() {
		return 0.4F;
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.ARTHROPOD;
	}
	
	@Override
	protected void dropFewItems(boolean par1, int par2) {
		int var3 = 4 + this.rand.nextInt(3);
		int var4;
		for (var4 = 0; var4 < var3; ++var4)
		{
			this.entityDropItem(new ItemStack(ModItems.erebusMaterials, 1, 0), 0.0F);  
		}
	}
}
