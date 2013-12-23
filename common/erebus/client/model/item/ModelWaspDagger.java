package erebus.client.model.item;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWaspDagger extends ModelBase {

	ModelRenderer Point;
	ModelRenderer Blade;
	ModelRenderer Tang;
	ModelRenderer Hilt;
	ModelRenderer Pommel;
	ModelRenderer Jewel;

	public ModelWaspDagger() {
		textureWidth = 32;
		textureHeight = 64;
		Point = new ModelRenderer(this, 23, 0);
		Point.addBox(-1.5F, -1.5F, -0.5F, 3, 3, 1);
		Point.setRotationPoint(0F, -12F, 0F);
		Point.setTextureSize(32, 64);
		Point.mirror = true;
		setRotation(Point, 0F, 0F, 0.7853982F);
		Blade = new ModelRenderer(this, 0, 0);
		Blade.addBox(-2F, -36F, -0.5F, 4, 16, 1);
		Blade.setRotationPoint(0F, 24F, 0F);
		Blade.setTextureSize(32, 64);
		Blade.mirror = true;
		setRotation(Blade, 0F, 0F, 0F);
		Tang = new ModelRenderer(this, 10, 46);
		Tang.addBox(-4F, -20F, -1.5F, 8, 2, 3);
		Tang.setRotationPoint(0F, 24F, 0F);
		Tang.setTextureSize(32, 64);
		Tang.mirror = true;
		setRotation(Tang, 0F, 0F, 0F);
		Hilt = new ModelRenderer(this, 0, 49);
		Hilt.addBox(-1.5F, -18F, -1F, 3, 13, 2);
		Hilt.setRotationPoint(0F, 24F, 0F);
		Hilt.setTextureSize(32, 64);
		Hilt.mirror = true;
		setRotation(Hilt, 0F, 0F, 0F);
		Pommel = new ModelRenderer(this, 13, 56);
		Pommel.addBox(-5F, -5F, -2F, 4, 4, 4);
		Pommel.setRotationPoint(0F, 24F, 0F);
		Pommel.setTextureSize(32, 64);
		Pommel.mirror = true;
		setRotation(Pommel, 0F, 0F, 0.7853982F);
		Jewel = new ModelRenderer(this, 13, 56);
		Jewel.addBox(-5F, -5F, -2F, 4, 4, 4);
		Jewel.setRotationPoint(0F, 10F, 0F);
		Jewel.setTextureSize(32, 64);
		Jewel.mirror = true;
		setRotation(Jewel, 0F, 0F, 0.7853982F);
	}

	public void render(float par7) {
		Point.render(par7);
		Blade.render(par7);
		Tang.render(par7);
		Hilt.render(par7);
		Pommel.render(par7);
		Jewel.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity) {
	}

}
