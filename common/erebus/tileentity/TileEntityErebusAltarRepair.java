package erebus.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.ModBlocks;

public class TileEntityErebusAltarRepair extends TileEntity {

	public int animationTicks;
	public boolean active;
	public int spawnTicks;
	public boolean notUsed = true;
	@Override
	public void updateEntity() {
		if (active) {
			if (animationTicks == 0)
				worldObj.playSoundEffect(xCoord, yCoord, zCoord, "erebus:altarchangestate", 1.0F, 1.3F);
			if (animationTicks <= 24)
				animationTicks++;
		}
		if (!active) {
			if (animationTicks == 25)
				worldObj.playSoundEffect(xCoord, yCoord, zCoord, "erebus:altarchangestate", 1.0F, 1.3F);
			if (animationTicks >= 1)
				animationTicks--;
			if (animationTicks == 1)
				worldObj.setBlock(xCoord, yCoord, zCoord, ModBlocks.erebusAltar.blockID);
		}
		if (animationTicks == 6)
			cloudBurst(worldObj, xCoord, yCoord, zCoord);

		if (spawnTicks == 200)
			setcanBeUsed(false);
		if (spawnTicks == 0)
			setActive(false);
		spawnTicks--;
	}

	@SideOnly(Side.CLIENT)
	public void cloudBurst(World world, int x, int y, int z) {
		double d0 = x + 0.53125F;
		double d1 = y + 1.25F;
		double d2 = z + 0.53125F;

		world.spawnParticle("cloud", d0, d1, d2, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("cloud", d0, d1, d2 - 0.265625, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("cloud", d0, d1, d2 + 0.265625, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("cloud", d0 - 0.265625, d1, d2, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("cloud", d0 + 0.265625, d1, d2, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("cloud", d0, d1 + 0.25, d2, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("cloud", d0, d1 + 0.5, d2, 0.0D, 0.0D, 0.0D);
	}

	public void setActive(boolean par1) {
		active = par1;
	}

	public void setSpawnTicks(int i) {
		spawnTicks = i;
	}

	public void setcanBeUsed(boolean canBeUsed) {
		notUsed = canBeUsed;
	}

	@Override
	public void writeToNBT(NBTTagCompound state) {
		super.writeToNBT(state);
		state.setInteger("animationTicks", animationTicks);
		state.setBoolean("active", active);
	}

	@Override
	public void readFromNBT(NBTTagCompound state) {
		super.readFromNBT(state);
		animationTicks = state.getInteger("animationTicks");
		active = state.getBoolean("active");
	}

	@SideOnly(Side.CLIENT)
	public void sparky(World world, int x, int y, int z) {
		double d0 = x + 0.53125F;
		double d1 = y + 1.0F;
		double d2 = z + 0.53125F;
		world.spawnParticle("smoke", d0, d1, d2, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("lava", d0, d1, d2, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("smoke", d0, d1, d2 - 0.265625, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("lava", d0, d1, d2 - 0.265625, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("smoke", d0, d1, d2 + 0.265625, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("lava", d0, d1, d2 + 0.265625, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("smoke", d0 - 0.265625, d1, d2, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("lava", d0 - 0.265625, d1, d2, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("smoke", d0 + 0.265625, d1, d2, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("lava", d0 + 0.265625, d1, d2, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("smoke", d0, d1 + 0.25, d2, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("lava", d0, d1 + 0.25, d2, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("smoke", d0, d1 + 0.5, d2, 0.0D, 0.0D, 0.0D);
		world.spawnParticle("lava", d0, d1 + 0.5, d2, 0.0D, 0.0D, 0.0D);

	}
}
