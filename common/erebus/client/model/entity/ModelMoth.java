package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import erebus.entity.EntityMoth;

public class ModelMoth extends ModelBase
{
	//fields
	ModelRenderer body;
	ModelRenderer head;
	ModelRenderer rearend;
	ModelRenderer head2;
	ModelRenderer rightwing;
	ModelRenderer leftwing;

	public ModelMoth()
	{
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this, 0, 0);
		body.addBox(-4F, -4F, 0F, 8, 7, 10);
		body.setRotationPoint(0F, 7F, 0F);
		body.setTextureSize(128, 128);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		head = new ModelRenderer(this, 70, 0);
		head.addBox(-3F, -3F, -5F, 6, 5, 5);
		head.setRotationPoint(0F, 7F, 0F);
		head.setTextureSize(128, 128);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		rearend = new ModelRenderer(this, 37, 0);
		rearend.addBox(-3F, -3F, 0F, 6, 6, 10);
		rearend.setRotationPoint(0F, 7F, 10F);
		rearend.setTextureSize(128, 128);
		rearend.mirror = true;
		setRotation(rearend, 0F, 0F, 0.7853982F);
		head2 = new ModelRenderer(this, -4, 18);
		head2.addBox(-7F, -2F, -15F, 14, 0, 11);
		head2.setRotationPoint(0F, 7F, 0F);
		head2.setTextureSize(128, 128);
		head2.mirror = true;
		setRotation(head2, -0.2602503F, 0F, 0F);
		rightwing = new ModelRenderer(this, -28, 30);
		rightwing.addBox(-32F, 0F, -15F, 33, 0, 37);
		rightwing.setRotationPoint(-4F, 4F, 3F);
		rightwing.setTextureSize(128, 128);
		rightwing.mirror = true;
		setRotation(rightwing, 0F, 0F, 0F);
		leftwing = new ModelRenderer(this, -28, 70);
		leftwing.addBox(0F, 0F, -15F, 33, 0, 37);
		leftwing.setRotationPoint(4F, 4F, 3F);
		leftwing.setTextureSize(128, 128);
		leftwing.mirror = true;
		setRotation(leftwing, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		body.render(par7);
		head.render(par7);
		rearend.render(par7);
		head2.render(par7);
		rightwing.render(par7);
		leftwing.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
		EntityMoth var8 = (EntityMoth) par7Entity;
		rightwing.rotateAngleZ = var8.wingFloat;
		leftwing.rotateAngleZ = -var8.wingFloat;
	}
}