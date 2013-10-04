package erebus.client.render.item;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import erebus.client.model.item.ModelWaspDagger;
import erebus.entity.EntityWaspDagger;

public class WaspDaggerItemRenderer extends Render implements IItemRenderer {
	private final ModelWaspDagger ModelWaspDagger;
	public static ResourceLocation texture = new ResourceLocation("erebus:textures/item/ModelWaspSword.png");

	public WaspDaggerItemRenderer(ModelWaspDagger par1ModelBase, float par2) {
		ModelWaspDagger = new ModelWaspDagger();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return type != ItemRenderType.FIRST_PERSON_MAP;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return helper != ItemRendererHelper.BLOCK_3D;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch (type) {
			case ENTITY:
				renderDagger(0.0F, 1.0F, 0.0F, 0.75D);
				break;
			case EQUIPPED:
				renderEquipped(0.3F, 0.5F, 0.4F, 0.75D);
				break;
			case EQUIPPED_FIRST_PERSON:
				renderDaggerFirstPerson(0.5F, 0.9F, 0.5F, 0.75D);
				break;
			case INVENTORY:
				renderDaggerInventory(-0.35F, -0.4F, 0.0F, 0.5D);
				break;
			default:
				break;
		}
	}

	private void renderEquipped(float x, float y, float z, double size) {
		FMLClientHandler.instance().getClient().getTextureManager().bindTexture(texture);
		GL11.glPushMatrix(); // Start Rendering
		GL11.glTranslatef(x, y + 0.6F, z + 0.5F);// Position
		GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
		GL11.glRotatef(225.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
		GL11.glScaled(-size, -size, size); // Changes the size (Only really used
		ModelWaspDagger.render(0.0625F); // Render
		GL11.glPopMatrix(); // End Rendering
	}

	private void renderDagger(float x, float y, float z, double size) {
		FMLClientHandler.instance().getClient().getTextureManager().bindTexture(texture);
		GL11.glPushMatrix(); // Start Rendering
		GL11.glTranslatef(x, y, z); // Position
		GL11.glRotatef(180F, 1F, 0, 0);
		GL11.glRotatef(-135F, 0, 1F, 0);
		GL11.glRotatef(70F, 0, 0, 1F);
		GL11.glScaled(size, size, size); // Changes the size (Only really used
		// when reading in the inventory)
		ModelWaspDagger.render(0.0625F); // Render
		GL11.glPopMatrix(); // End Rendering
	}

	private void renderDaggerFirstPerson(float x, float y, float z, double size) {
		FMLClientHandler.instance().getClient().getTextureManager().bindTexture(texture);
		GL11.glPushMatrix(); // Start Rendering
		GL11.glTranslatef(x, y, z); // Position
		GL11.glRotatef(180F, 1F, 0, 0);
		GL11.glRotatef(-45F, 0, 1F, 0);
		GL11.glScaled(size, size, size); // Changes the size (Only really used
		// when reading in the inventory)
		ModelWaspDagger.render(0.0625F); // Render
		GL11.glPopMatrix(); // End Rendering
	}

	private void renderDaggerInventory(float x, float y, float z, double size) {
		FMLClientHandler.instance().getClient().getTextureManager().bindTexture(texture);
		GL11.glPushMatrix(); // Start Rendering
		GL11.glTranslatef(x, y, z); // Position
		GL11.glRotatef(135F, 1F, 0, 0);
		GL11.glRotatef(135F, 0, 1F, 0);
		GL11.glRotatef(-20F, 0, 0, 1F);
		GL11.glScaled(size, size, size); // Changes the size (Only really used
		// when reading in the inventory)
		ModelWaspDagger.render(0.0625F); // Render
		GL11.glPopMatrix(); // End Rendering
	}

	@Override
	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
		renderWaspDagger((EntityWaspDagger) par1Entity, par2, par4, par6, par8, par9);
	}

	public void renderWaspDagger(EntityWaspDagger par1EntityWaspDagger, double par2, double par4, double par6, float par8, float par9) {
		FMLClientHandler.instance().getClient().getTextureManager().bindTexture(texture);
		GL11.glPushMatrix();
		GL11.glTranslatef((float) par2, (float) par4, (float) par6);
		GL11.glRotatef(par1EntityWaspDagger.prevRotationYaw + (par1EntityWaspDagger.rotationYaw - par1EntityWaspDagger.prevRotationYaw) * par9 - 90.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(par1EntityWaspDagger.prevRotationPitch + (par1EntityWaspDagger.rotationPitch - par1EntityWaspDagger.prevRotationPitch) * par9 - par1EntityWaspDagger.rotationticks, 0.0F, 0.0F, 1.0F);
		GL11.glScaled(0.4F, 0.4F, 0.4F);
		ModelWaspDagger.render(0.0625F);
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
}