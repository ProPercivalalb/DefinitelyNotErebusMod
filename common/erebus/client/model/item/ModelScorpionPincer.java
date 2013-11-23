
package erebus.client.model.item;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelScorpionPincer extends ModelBase
{
	ModelRenderer ClawR4;
	ModelRenderer ClawR5Top;
	ModelRenderer ClawR5Bot;

	public ModelScorpionPincer()
	{
		textureWidth = 16;
		textureHeight = 16;

		ClawR4 = new ModelRenderer(this, 0, 6);
		ClawR4.addBox(-2F, 0F, -2F, 4, 6, 4);
		ClawR4.setRotationPoint(0F, 0F, 0F);
		ClawR4.setTextureSize(16, 16);
		ClawR4.mirror = true;
		setRotation(ClawR4, 0F, 0F, 0F);
		ClawR5Top = new ModelRenderer(this, 11, 0);
		ClawR5Top.addBox(-3F, 5F, 0.5F, 1, 4, 1);
		ClawR5Top.setRotationPoint(0F, 0F, 0F);
		ClawR5Top.setTextureSize(16, 16);
		ClawR5Top.mirror = true;
		setRotation(ClawR5Top, 0F, 0F, -0.3490659F);
		ClawR5Bot = new ModelRenderer(this, 0, 0);
		ClawR5Bot.addBox(-3F, 5F, -1.5F, 1, 4, 1);
		ClawR5Bot.setRotationPoint(0F, 0F, 0F);
		ClawR5Bot.setTextureSize(16, 16);
		ClawR5Bot.mirror = true;
		setRotation(ClawR5Bot, 0F, 0F, -0.3490659F);
	}

	public void render(float par7)
	{
		ClawR4.render(par7);
		ClawR5Top.render(par7);
		ClawR5Bot.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par6Entity) {
	}

}
