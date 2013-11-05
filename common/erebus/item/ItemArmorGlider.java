package erebus.item;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.ForgeSubscribe;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.ErebusMod;
import erebus.client.model.armor.ModelArmorGlider;

public class ItemArmorGlider extends ItemArmor {
	public static boolean gliding;

	public ItemArmorGlider(int id, int armorType) {
		super(id, ErebusMod.armorEXOSKELETON, 2, armorType);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		return "erebus:textures/armor/ModelArmorGlider.png";
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase player, ItemStack stack, int slot) {
		ModelBiped model = new ModelArmorGlider();
		model.bipedHead.showModel = false;
		model.bipedHeadwear.showModel = false;
		model.bipedBody.showModel = false;
		model.bipedRightArm.showModel = false;
		model.bipedLeftArm.showModel = false;
		model.bipedRightLeg.showModel = false;
		model.bipedLeftLeg.showModel = false;
		return model;
	}

	@Override
	public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemStack) {
		player.fallDistance = 0.0F;
		if (gliding)
			if (!player.onGround) {
				player.motionX *= 1.0D;
				player.motionZ *= 1.0D;
				player.motionY *= 0.5D;
			}
	}

	@ForgeSubscribe
	public void onPlayerRenderPre(RenderPlayerEvent.Pre e){
		GL11.glPushMatrix();

		if (gliding && !e.entityPlayer.onGround) {
			GL11.glTranslated(0D, -e.entityPlayer.height / 2, 0D);
			GL11.glRotated(60D,1F,0F,0F);
			//GL11.glRotated(Math.toRadians(e.entityPlayer.rotationYaw),0F,1F,0F);
			// GL11.glTranslated(0D,e.entityPlayer.height/2,0D);
			//GL11.glRotated(60D*Math.toRadians(e.entityPlayer.rotationYaw),1F,0F,0F);*/

			// umm, just do whatever the fuck you want here, I got no idea
			// dunno, maybe this is a bit weird
		}
	}

	@ForgeSubscribe
	public void onPlayerRenderPost(RenderPlayerEvent.Post e){
		GL11.glPopMatrix();
	}

	public static void setGliding(boolean isGliding) {
		gliding = isGliding;
	}
}