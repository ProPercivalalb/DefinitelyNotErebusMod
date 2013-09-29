package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBlackWidow extends ModelBase {

	ModelRenderer Rant1;
	ModelRenderer Rant2;
	ModelRenderer Lant1;
	ModelRenderer Lant2;
	ModelRenderer MandibleR;
	ModelRenderer MandibleL;
	ModelRenderer Head;
	ModelRenderer Thorax1;
	ModelRenderer Thorax2;
	ModelRenderer Ab1;
	ModelRenderer Ab2;
	ModelRenderer Ab3;
	ModelRenderer Ab4;
	ModelRenderer Ab5;
	ModelRenderer Ab6;
	ModelRenderer LegFR1;
	ModelRenderer LegFR2;
	ModelRenderer LegFR3;
	ModelRenderer LegFR4;
	ModelRenderer LegFR5;
	ModelRenderer LegFR6;
	ModelRenderer LegFL1;
	ModelRenderer LegFL2;
	ModelRenderer LegFL3;
	ModelRenderer LegFL4;
	ModelRenderer LegFL5;
	ModelRenderer LegFL6;
	ModelRenderer LegMFR1;
	ModelRenderer LegMFR2;
	ModelRenderer LegMFR3;
	ModelRenderer LegMFR4;
	ModelRenderer LegMFR5;
	ModelRenderer LegMFR6;
	ModelRenderer LegMFL1;
	ModelRenderer LegMFL2;
	ModelRenderer LegMFL3;
	ModelRenderer LegMFL4;
	ModelRenderer LegMFL5;
	ModelRenderer LegMFL6;
	ModelRenderer LegMBR1;
	ModelRenderer LegMBR2;
	ModelRenderer LegMBR3;
	ModelRenderer LegMBR4;
	ModelRenderer LegMBR5;
	ModelRenderer LegMBR6;
	ModelRenderer LegMBL1;
	ModelRenderer LegMBL2;
	ModelRenderer LegMBL3;
	ModelRenderer LegMBL4;
	ModelRenderer LegMBL5;
	ModelRenderer LegMBL6;
	ModelRenderer LegBR1;
	ModelRenderer LegBR2;
	ModelRenderer LegBR3;
	ModelRenderer LegBR4;
	ModelRenderer LegBR5;
	ModelRenderer LegBR6;
	ModelRenderer LegBL1;
	ModelRenderer LegBL2;
	ModelRenderer LegBL3;
	ModelRenderer LegBL4;
	ModelRenderer LegBL5;
	ModelRenderer LegBL6;

	public ModelBlackWidow() {
		textureWidth = 128;
		textureHeight = 64;

		Rant1 = new ModelRenderer(this, 29, 15);
		Rant1.addBox(1.5F, 0.5F, -4.5F, 1, 1, 4);
		Rant1.setRotationPoint(0F, 15F, -8F);
		Rant1.setTextureSize(128, 64);
		Rant1.mirror = true;
		setRotation(Rant1, 0F, -0.3490659F, 0F);
		Rant2 = new ModelRenderer(this, 29, 15);
		Rant2.addBox(4F, 0.5F, -6.5F, 1, 1, 4);
		Rant2.setRotationPoint(0F, 15F, -8F);
		Rant2.setTextureSize(128, 64);
		Rant2.mirror = true;
		setRotation(Rant2, 0F, 0.3490659F, 0F);
		Lant1 = new ModelRenderer(this, 29, 15);
		Lant1.addBox(-2.5F, 0.5F, -4.5F, 1, 1, 4);
		Lant1.setRotationPoint(0F, 15F, -8F);
		Lant1.setTextureSize(128, 64);
		Lant1.mirror = true;
		setRotation(Lant1, 0F, 0.3490659F, 0F);
		Lant2 = new ModelRenderer(this, 29, 15);
		Lant2.addBox(-5F, 0.5F, -6.5F, 1, 1, 4);
		Lant2.setRotationPoint(0F, 15F, -8F);
		Lant2.setTextureSize(128, 64);
		Lant2.mirror = true;
		setRotation(Lant2, 0F, -0.3141593F, 0F);
		MandibleR = new ModelRenderer(this, 23, 0);
		MandibleR.addBox(0.5F, -0.5F, -5F, 1, 1, 3);
		MandibleR.setRotationPoint(0F, 15F, -8F);
		MandibleR.setTextureSize(128, 64);
		MandibleR.mirror = true;
		setRotation(MandibleR, 0.6981317F, 0F, 0F);
		MandibleL = new ModelRenderer(this, 23, 0);
		MandibleL.addBox(-1.5F, -0.5F, -5F, 1, 1, 3);
		MandibleL.setRotationPoint(0F, 15F, -8F);
		MandibleL.setTextureSize(128, 64);
		MandibleL.mirror = true;
		setRotation(MandibleL, 0.6981317F, 0F, 0F);
		Head = new ModelRenderer(this, 12, 8);
		Head.addBox(-2F, -1F, -2F, 4, 3, 2);
		Head.setRotationPoint(0F, 15F, -8F);
		Head.setTextureSize(128, 64);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		Thorax1 = new ModelRenderer(this, 32, 0);
		Thorax1.addBox(-4.5F, -2F, -9F, 9, 4, 9);
		Thorax1.setRotationPoint(0F, 15F, 1F);
		Thorax1.setTextureSize(128, 64);
		Thorax1.mirror = true;
		setRotation(Thorax1, 0F, 0F, 0F);
		Thorax2 = new ModelRenderer(this, 70, 0);
		Thorax2.addBox(-2.5F, -3F, -8F, 5, 2, 8);
		Thorax2.setRotationPoint(0F, 15F, 1F);
		Thorax2.setTextureSize(128, 64);
		Thorax2.mirror = true;
		setRotation(Thorax2, 0.1047198F, 0F, 0F);
		Ab1 = new ModelRenderer(this, 82, 11);
		Ab1.addBox(-3F, -5F, 1F, 8, 1, 10);
		Ab1.setRotationPoint(-1F, 13F, 2F);
		Ab1.setTextureSize(128, 64);
		Ab1.mirror = true;
		setRotation(Ab1, 0F, 0F, 0F);
		Ab2 = new ModelRenderer(this, 41, 29);
		Ab2.addBox(-4F, -4F, 0F, 8, 8, 12);
		Ab2.setRotationPoint(0F, 13F, 2F);
		Ab2.setTextureSize(128, 64);
		Ab2.mirror = true;
		setRotation(Ab2, 0F, 0F, 0F);
		Ab3 = new ModelRenderer(this, 82, 23);
		Ab3.addBox(-3F, -3F, -1F, 6, 6, 14);
		Ab3.setRotationPoint(0F, 13F, 2F);
		Ab3.setTextureSize(128, 64);
		Ab3.mirror = true;
		setRotation(Ab3, 0F, 0F, 0F);
		Ab4 = new ModelRenderer(this, 41, 14);
		Ab4.addBox(-6F, -3F, 2F, 12, 6, 8);
		Ab4.setRotationPoint(0F, 13F, 2F);
		Ab4.setTextureSize(128, 64);
		Ab4.mirror = true;
		setRotation(Ab4, 0F, 0F, 0F);
		Ab5 = new ModelRenderer(this, 0, 25);
		Ab5.addBox(-5F, -4.999F, 1F, 10, 8, 10);
		Ab5.setRotationPoint(0F, 14F, 2F);
		Ab5.setTextureSize(128, 64);
		Ab5.mirror = true;
		setRotation(Ab5, 0F, 0F, 0F);
		Ab6 = new ModelRenderer(this, 0, 15);
		Ab6.addBox(-3F, -6F, 2F, 6, 1, 8);
		Ab6.setRotationPoint(0F, 13F, 2F);
		Ab6.setTextureSize(128, 64);
		Ab6.mirror = true;
		setRotation(Ab6, 0F, 0F, 0F);
		LegFR1 = new ModelRenderer(this, 0, 0);
		LegFR1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
		LegFR1.setRotationPoint(4F, 15F, -7F);
		LegFR1.setTextureSize(128, 64);
		LegFR1.mirror = true;
		setRotation(LegFR1, 0F, 3.141593F, 0.7853982F);
		LegFR2 = new ModelRenderer(this, 0, 8);
		LegFR2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
		// LegFR2.setRotationPoint(4F, 15F, -7F);
		LegFR2.setTextureSize(128, 64);
		LegFR2.mirror = true;
		setRotation(LegFR2, 0F, 3.141593F, 0F);
		LegFR3 = new ModelRenderer(this, 0, 0);
		LegFR3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
		// LegFR3.setRotationPoint(4F, 15F, -7F);
		LegFR3.setTextureSize(128, 64);
		LegFR3.mirror = true;
		setRotation(LegFR3, 0F, 3.141593F, -0.2617994F);
		LegFR4 = new ModelRenderer(this, 0, 8);
		LegFR4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
		// LegFR4.setRotationPoint(4F, 15F, -7F);
		LegFR4.setTextureSize(128, 64);
		LegFR4.mirror = true;
		setRotation(LegFR4, 0F, 3.141593F, -0.2617994F);
		LegFR5 = new ModelRenderer(this, 0, 0);
		LegFR5.addBox(-15F, -11F, -1F, 9, 2, 2);
		// LegFR5.setRotationPoint(4F, 15F, -7F);
		LegFR5.setTextureSize(128, 64);
		LegFR5.mirror = true;
		setRotation(LegFR5, 0F, 3.141593F, -0.7853982F);
		LegFR6 = new ModelRenderer(this, 0, 5);
		LegFR6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
		// LegFR6.setRotationPoint(4F, 15F, -7F);
		LegFR6.setTextureSize(128, 64);
		LegFR6.mirror = true;
		setRotation(LegFR6, 0F, 3.141593F, -1.186824F);
		LegFL1 = new ModelRenderer(this, 0, 0);
		LegFL1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
		LegFL1.setRotationPoint(-4F, 15F, -7F);
		LegFL1.setTextureSize(128, 64);
		LegFL1.mirror = true;
		setRotation(LegFL1, 0F, 0F, 0.7853982F);
		LegFL2 = new ModelRenderer(this, 0, 8);
		LegFL2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
		// LegFL2.setRotationPoint(-4F, 15F, -7F);
		LegFL2.setTextureSize(128, 64);
		LegFL2.mirror = true;
		setRotation(LegFL2, 0F, 0F, 0F);
		LegFL3 = new ModelRenderer(this, 0, 0);
		LegFL3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
		// LegFL3.setRotationPoint(-4F, 15F, -7F);
		LegFL3.setTextureSize(128, 64);
		LegFL3.mirror = true;
		setRotation(LegFL3, 0F, 0F, -0.2617994F);
		LegFL4 = new ModelRenderer(this, 0, 8);
		LegFL4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
		// LegFL4.setRotationPoint(-4F, 15F, -7F);
		LegFL4.setTextureSize(128, 64);
		LegFL4.mirror = true;
		setRotation(LegFL4, 0F, 0F, -0.2617994F);
		LegFL5 = new ModelRenderer(this, 0, 0);
		LegFL5.addBox(-15F, -11F, -1F, 9, 2, 2);
		// LegFL5.setRotationPoint(-4F, 15F, -7F);
		LegFL5.setTextureSize(128, 64);
		LegFL5.mirror = true;
		setRotation(LegFL5, 0F, 0F, -0.7853982F);
		LegFL6 = new ModelRenderer(this, 0, 5);
		LegFL6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
		// LegFL6.setRotationPoint(-4F, 15F, -7F);
		LegFL6.setTextureSize(128, 64);
		LegFL6.mirror = true;
		setRotation(LegFL6, 0F, 0F, -1.186824F);
		LegMFR1 = new ModelRenderer(this, 0, 0);
		LegMFR1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
		LegMFR1.setRotationPoint(4F, 15F, -5F);
		LegMFR1.setTextureSize(128, 64);
		LegMFR1.mirror = true;
		setRotation(LegMFR1, 0F, 3.141593F, 0.7853982F);
		LegMFR2 = new ModelRenderer(this, 0, 8);
		LegMFR2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
		// LegMFR2.setRotationPoint(4F, 15F, -5F);
		LegMFR2.setTextureSize(128, 64);
		LegMFR2.mirror = true;
		setRotation(LegMFR2, 0F, 3.141593F, 0F);
		LegMFR3 = new ModelRenderer(this, 0, 0);
		LegMFR3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
		// LegMFR3.setRotationPoint(4F, 15F, -5F);
		LegMFR3.setTextureSize(128, 64);
		LegMFR3.mirror = true;
		setRotation(LegMFR3, 0F, 3.141593F, -0.2617994F);
		LegMFR4 = new ModelRenderer(this, 0, 8);
		LegMFR4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
		// LegMFR4.setRotationPoint(4F, 15F, -5F);
		LegMFR4.setTextureSize(128, 64);
		LegMFR4.mirror = true;
		setRotation(LegMFR4, 0F, 3.141593F, -0.2617994F);
		LegMFR5 = new ModelRenderer(this, 0, 0);
		LegMFR5.addBox(-15F, -11F, -1F, 9, 2, 2);
		// LegMFR5.setRotationPoint(4F, 15F, -5F);
		LegMFR5.setTextureSize(128, 64);
		LegMFR5.mirror = true;
		setRotation(LegMFR5, 0F, 3.141593F, -0.7853982F);
		LegMFR6 = new ModelRenderer(this, 0, 5);
		LegMFR6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
		// LegMFR6.setRotationPoint(4F, 15F, -5F);
		LegMFR6.setTextureSize(128, 64);
		LegMFR6.mirror = true;
		setRotation(LegMFR6, 0F, 3.141593F, -1.186824F);
		LegMFL1 = new ModelRenderer(this, 0, 0);
		LegMFL1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
		LegMFL1.setRotationPoint(-4F, 15F, -5F);
		LegMFL1.setTextureSize(128, 64);
		LegMFL1.mirror = true;
		setRotation(LegMFL1, 0F, 0F, 0.7853982F);
		LegMFL2 = new ModelRenderer(this, 0, 8);
		LegMFL2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
		// LegMFL2.setRotationPoint(-4F, 15F, -5F);
		LegMFL2.setTextureSize(128, 64);
		LegMFL2.mirror = true;
		setRotation(LegMFL2, 0F, 0F, 0F);
		LegMFL3 = new ModelRenderer(this, 0, 0);
		LegMFL3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
		// LegMFL3.setRotationPoint(-4F, 15F, -5F);
		LegMFL3.setTextureSize(128, 64);
		LegMFL3.mirror = true;
		setRotation(LegMFL3, 0F, 0F, -0.2617994F);
		LegMFL4 = new ModelRenderer(this, 0, 8);
		LegMFL4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
		// LegMFL4.setRotationPoint(-4F, 15F, -5F);
		LegMFL4.setTextureSize(128, 64);
		LegMFL4.mirror = true;
		setRotation(LegMFL4, 0F, 0F, -0.2617994F);
		LegMFL5 = new ModelRenderer(this, 0, 0);
		LegMFL5.addBox(-15F, -11F, -1F, 9, 2, 2);
		// LegMFL5.setRotationPoint(-4F, 15F, -5F);
		LegMFL5.setTextureSize(128, 64);
		LegMFL5.mirror = true;
		setRotation(LegMFL5, 0F, 0F, -0.7853982F);
		LegMFL6 = new ModelRenderer(this, 0, 5);
		LegMFL6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
		// LegMFL6.setRotationPoint(-4F, 15F, -5F);
		LegMFL6.setTextureSize(128, 64);
		LegMFL6.mirror = true;
		setRotation(LegMFL6, 0F, 0F, -1.186824F);
		LegMBR1 = new ModelRenderer(this, 0, 0);
		LegMBR1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
		LegMBR1.setRotationPoint(4F, 15F, -2F);
		LegMBR1.setTextureSize(128, 64);
		LegMBR1.mirror = true;
		setRotation(LegMBR1, 0F, 3.141593F, 0.7853982F);
		LegMBR2 = new ModelRenderer(this, 0, 8);
		LegMBR2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
		// LegMBR2.setRotationPoint(4F, 15F, -2F);
		LegMBR2.setTextureSize(128, 64);
		LegMBR2.mirror = true;
		setRotation(LegMBR2, 0F, 3.141593F, 0F);
		LegMBR3 = new ModelRenderer(this, 0, 0);
		LegMBR3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
		// LegMBR3.setRotationPoint(4F, 15F, -2F);
		LegMBR3.setTextureSize(128, 64);
		LegMBR3.mirror = true;
		setRotation(LegMBR3, 0F, 3.141593F, -0.2617994F);
		LegMBR4 = new ModelRenderer(this, 0, 8);
		LegMBR4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
		// LegMBR4.setRotationPoint(4F, 15F, -2F);
		LegMBR4.setTextureSize(128, 64);
		LegMBR4.mirror = true;
		setRotation(LegMBR4, 0F, 3.141593F, -0.2617994F);
		LegMBR5 = new ModelRenderer(this, 0, 0);
		LegMBR5.addBox(-15F, -11F, -1F, 9, 2, 2);
		// LegMBR5.setRotationPoint(4F, 15F, -2F);
		LegMBR5.setTextureSize(128, 64);
		LegMBR5.mirror = true;
		setRotation(LegMBR5, 0F, 3.141593F, -0.7853982F);
		LegMBR6 = new ModelRenderer(this, 0, 5);
		LegMBR6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
		// LegMBR6.setRotationPoint(4F, 15F, -2F);
		LegMBR6.setTextureSize(128, 64);
		LegMBR6.mirror = true;
		setRotation(LegMBR6, 0F, 3.141593F, -1.186824F);
		LegMBL1 = new ModelRenderer(this, 0, 0);
		LegMBL1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
		LegMBL1.setRotationPoint(-4F, 15F, -2F);
		LegMBL1.setTextureSize(128, 64);
		LegMBL1.mirror = true;
		setRotation(LegMBL1, 0F, 0F, 0.7853982F);
		LegMBL2 = new ModelRenderer(this, 0, 8);
		LegMBL2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
		// LegMBL2.setRotationPoint(-4F, 15F, -2F);
		LegMBL2.setTextureSize(128, 64);
		LegMBL2.mirror = true;
		setRotation(LegMBL2, 0F, 0F, 0F);
		LegMBL3 = new ModelRenderer(this, 0, 0);
		LegMBL3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
		// LegMBL3.setRotationPoint(-4F, 15F, -2F);
		LegMBL3.setTextureSize(128, 64);
		LegMBL3.mirror = true;
		setRotation(LegMBL3, 0F, 0F, -0.2617994F);
		LegMBL4 = new ModelRenderer(this, 0, 8);
		LegMBL4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
		// LegMBL4.setRotationPoint(-4F, 15F, -2F);
		LegMBL4.setTextureSize(128, 64);
		LegMBL4.mirror = true;
		setRotation(LegMBL4, 0F, 0F, -0.2617994F);
		LegMBL5 = new ModelRenderer(this, 0, 0);
		LegMBL5.addBox(-15F, -11F, -1F, 9, 2, 2);
		// LegMBL5.setRotationPoint(-4F, 15F, -2F);
		LegMBL5.setTextureSize(128, 64);
		LegMBL5.mirror = true;
		setRotation(LegMBL5, 0F, 0F, -0.7853982F);
		LegMBL6 = new ModelRenderer(this, 0, 5);
		LegMBL6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
		// LegMBL6.setRotationPoint(-4F, 15F, -2F);
		LegMBL6.setTextureSize(128, 64);
		LegMBL6.mirror = true;
		setRotation(LegMBL6, 0F, 0F, -1.186824F);
		LegBR1 = new ModelRenderer(this, 0, 0);
		LegBR1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
		LegBR1.setRotationPoint(4F, 15F, 0F);
		LegBR1.setTextureSize(128, 64);
		LegBR1.mirror = true;
		setRotation(LegBR1, 0F, 3.141593F, 0.7853982F);
		LegBR2 = new ModelRenderer(this, 0, 8);
		LegBR2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
		// LegBR2.setRotationPoint(4F, 15F, 0F);
		LegBR2.setTextureSize(128, 64);
		LegBR2.mirror = true;
		setRotation(LegBR2, 0F, 3.141593F, 0F);
		LegBR3 = new ModelRenderer(this, 0, 0);
		LegBR3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
		// LegBR3.setRotationPoint(4F, 15F, 0F);
		LegBR3.setTextureSize(128, 64);
		LegBR3.mirror = true;
		setRotation(LegBR3, 0F, 3.141593F, -0.2617994F);
		LegBR4 = new ModelRenderer(this, 0, 8);
		LegBR4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
		// LegBR4.setRotationPoint(4F, 15F, 0F);
		LegBR4.setTextureSize(128, 64);
		LegBR4.mirror = true;
		setRotation(LegBR4, 0F, 3.141593F, -0.2617994F);
		LegBR5 = new ModelRenderer(this, 0, 0);
		LegBR5.addBox(-15F, -11F, -1F, 9, 2, 2);
		// LegBR5.setRotationPoint(4F, 15F, 0F);
		LegBR5.setTextureSize(128, 64);
		LegBR5.mirror = true;
		setRotation(LegBR5, 0F, 3.141593F, -0.7853982F);
		LegBR6 = new ModelRenderer(this, 0, 5);
		LegBR6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
		// LegBR6.setRotationPoint(4F, 15F, 0F);
		LegBR6.setTextureSize(128, 64);
		LegBR6.mirror = true;
		setRotation(LegBR6, 0F, 3.141593F, -1.186824F);
		LegBL1 = new ModelRenderer(this, 0, 0);
		LegBL1.addBox(-6.5F, -1F, -1F, 8, 2, 2);
		LegBL1.setRotationPoint(-4F, 15F, 0F);
		LegBL1.setTextureSize(128, 64);
		LegBL1.mirror = true;
		setRotation(LegBL1, 0F, 0F, 0.7853982F);
		LegBL2 = new ModelRenderer(this, 0, 8);
		LegBL2.addBox(-5.95F, -5.5F, -1.5F, 2, 3, 3);
		// LegBL2.setRotationPoint(-4F, 15F, 0F);
		LegBL2.setTextureSize(128, 64);
		LegBL2.mirror = true;
		setRotation(LegBL2, 0F, 0F, 0F);
		LegBL3 = new ModelRenderer(this, 0, 0);
		LegBL3.addBox(-9.5F, -6.5F, -1F, 5, 2, 2);
		// LegBL3.setRotationPoint(-4F, 15F, 0F);
		LegBL3.setTextureSize(128, 64);
		LegBL3.mirror = true;
		setRotation(LegBL3, 0F, 0F, -0.2617994F);
		LegBL4 = new ModelRenderer(this, 0, 8);
		LegBL4.addBox(-11F, -7F, -1.5F, 2, 3, 3);
		// LegBL4.setRotationPoint(-4F, 15F, 0F);
		LegBL4.setTextureSize(128, 64);
		LegBL4.mirror = true;
		setRotation(LegBL4, 0F, 0F, -0.2617994F);
		LegBL5 = new ModelRenderer(this, 0, 0);
		LegBL5.addBox(-15F, -11F, -1F, 9, 2, 2);
		// LegBL5.setRotationPoint(-4F, 15F, 0F);
		LegBL5.setTextureSize(128, 64);
		LegBL5.mirror = true;
		setRotation(LegBL5, 0F, 0F, -0.7853982F);
		LegBL6 = new ModelRenderer(this, 0, 5);
		LegBL6.addBox(-16F, -15F, -0.5F, 7, 1, 1);
		// LegBL6.setRotationPoint(-4F, 15F, 0F);
		LegBL6.setTextureSize(128, 64);
		LegBL6.mirror = true;
		setRotation(LegBL6, 0F, 0F, -1.186824F);

		LegFL1.addChild(LegFL2);
		LegFL1.addChild(LegFL3);
		LegFL1.addChild(LegFL4);
		LegFL1.addChild(LegFL5);
		LegFL1.addChild(LegFL6);

		LegMFL1.addChild(LegMFL2);
		LegMFL1.addChild(LegMFL3);
		LegMFL1.addChild(LegMFL4);
		LegMFL1.addChild(LegMFL5);
		LegMFL1.addChild(LegMFL6);

		LegMBL1.addChild(LegMBL2);
		LegMBL1.addChild(LegMBL3);
		LegMBL1.addChild(LegMBL4);
		LegMBL1.addChild(LegMBL5);
		LegMBL1.addChild(LegMBL6);

		LegBL1.addChild(LegBL2);
		LegBL1.addChild(LegBL3);
		LegBL1.addChild(LegBL4);
		LegBL1.addChild(LegBL5);
		LegBL1.addChild(LegBL6);

		LegFR1.addChild(LegFR2);
		LegFR1.addChild(LegFR3);
		LegFR1.addChild(LegFR4);
		LegFR1.addChild(LegFR5);
		LegFR1.addChild(LegFR6);

		LegMFR1.addChild(LegMFR2);
		LegMFR1.addChild(LegMFR3);
		LegMFR1.addChild(LegMFR4);
		LegMFR1.addChild(LegMFR5);
		LegMFR1.addChild(LegMFR6);

		LegMBR1.addChild(LegMBR2);
		LegMBR1.addChild(LegMBR3);
		LegMBR1.addChild(LegMBR4);
		LegMBR1.addChild(LegMBR5);
		LegMBR1.addChild(LegMBR6);

		LegBR1.addChild(LegBR2);
		LegBR1.addChild(LegBR3);
		LegBR1.addChild(LegBR4);
		LegBR1.addChild(LegBR5);
		LegBR1.addChild(LegBR6);
	}

	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		Rant1.render(par7);
		Rant2.render(par7);
		Lant1.render(par7);
		Lant2.render(par7);
		MandibleR.render(par7);
		MandibleL.render(par7);
		Head.render(par7);
		Thorax1.render(par7);
		Thorax2.render(par7);
		Ab1.render(par7);
		Ab2.render(par7);
		Ab3.render(par7);
		Ab4.render(par7);
		Ab5.render(par7);
		Ab6.render(par7);
		LegFR1.render(par7);
		LegFL1.render(par7);
		LegMFR1.render(par7);
		LegMFL1.render(par7);
		LegMBR1.render(par7);
		LegMBL1.render(par7);
		LegBR1.render(par7);
		LegBL1.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);

		Head.rotateAngleY = par4 / (180F / (float) Math.PI);
		MandibleR.rotateAngleY = par4 / (180F / (float) Math.PI);
		MandibleL.rotateAngleY = par4 / (180F / (float) Math.PI);
		Rant1.rotateAngleY = par4 / (180F / (float) Math.PI) - 0.349F;
		Rant2.rotateAngleY = par4 / (180F / (float) Math.PI) + 0.349F;
		Lant1.rotateAngleY = par4 / (180F / (float) Math.PI) + 0.349F;
		Lant2.rotateAngleY = par4 / (180F / (float) Math.PI) - 0.349F;

		Head.rotateAngleX = par5 / (180F / (float) Math.PI);
		MandibleR.rotateAngleX = par5 / (180F / (float) Math.PI) + 0.698F;
		MandibleL.rotateAngleX = par5 / (180F / (float) Math.PI) + 0.698F;
		Rant1.rotateAngleX = par5 / (180F / (float) Math.PI);
		Rant2.rotateAngleX = par5 / (180F / (float) Math.PI);
		Lant1.rotateAngleX = par5 / (180F / (float) Math.PI);
		Lant2.rotateAngleX = par5 / (180F / (float) Math.PI);

		float x = 0.7853982F;
		float b = 1.2F;
		float x2 = -2.3561946F;
		// float b2= -1.9853982F; << unnecessary

		float movcos1 = MathHelper.cos(par1 * 0.7F) * 0.4F * par2;
		float movsin1 = MathHelper.sin(par1 * 0.7F) * 0.4F * par2;
		float movcos2 = MathHelper.cos(par1 * 0.7F) * 0.5F * par2;
		float movcos3 = MathHelper.cos(par1 * 0.0F) * 0.0F * par2;

		LegFL1.rotateAngleY = -0.698F + movcos1;
		LegFL1.rotateAngleX = -0.698F - movsin1;
		LegFL1.rotateAngleZ = b + movcos2;
		LegFL2.rotateAngleZ = -x + movcos3;
		LegFL3.rotateAngleZ = -0.2617994F - x + movcos3;
		LegFL4.rotateAngleZ = -0.2617994F - x + movcos3;
		LegFL5.rotateAngleZ = -0.7853982F - x + movcos3;
		LegFL6.rotateAngleZ = -1.186824F - x + movcos3;

		LegMFL1.rotateAngleY = -0.175F - movcos1;
		LegMFL1.rotateAngleX = -0.175F + movsin1;
		LegMFL1.rotateAngleZ = x - movcos2;
		LegMFL2.rotateAngleZ = -x - movcos3;
		LegMFL3.rotateAngleZ = -0.2617994F - x - movcos3;
		LegMFL4.rotateAngleZ = -0.2617994F - x - movcos3;
		LegMFL5.rotateAngleZ = -0.7853982F - x - movcos3;
		LegMFL6.rotateAngleZ = -1.186824F - x - movcos3;

		LegMBL1.rotateAngleY = 0.175F + movcos1;
		LegMBL1.rotateAngleX = 0.175F - movsin1;
		LegMBL1.rotateAngleZ = x + movcos2;
		LegMBL2.rotateAngleZ = -x + movcos3;
		LegMBL3.rotateAngleZ = -0.2617994F - x + movcos3;
		LegMBL4.rotateAngleZ = -0.2617994F - x + movcos3;
		LegMBL5.rotateAngleZ = -0.7853982F - x + movcos3;
		LegMBL6.rotateAngleZ = -1.186824F - x + movcos3;

		LegBL1.rotateAngleY = 0.698F - movcos1;
		LegBL1.rotateAngleX = 0.698F + movsin1;
		LegBL1.rotateAngleZ = b - movcos2;
		LegBL2.rotateAngleZ = -x - movcos3;
		LegBL3.rotateAngleZ = -0.2617994F - x - movcos3;
		LegBL4.rotateAngleZ = -0.2617994F - x - movcos3;
		LegBL5.rotateAngleZ = -0.7853982F - x - movcos3;
		LegBL6.rotateAngleZ = -1.186824F - x - movcos3;

		LegFR1.rotateAngleY = 3.84F + movcos1;
		LegFR1.rotateAngleX = 3.84F - movsin1;
		LegFR1.rotateAngleZ = -b + movcos2;
		LegFR2.rotateAngleZ = x2 + movcos3;
		LegFR3.rotateAngleZ = 0.2617994F + x2 + movcos3;
		LegFR4.rotateAngleZ = 0.2617994F + x2 + movcos3;
		LegFR5.rotateAngleZ = 0.7853982F + x2 + movcos3;
		LegFR6.rotateAngleZ = 1.186824F + x2 + movcos3;

		LegMFR1.rotateAngleY = 3.317F - movcos1;
		LegMFR1.rotateAngleX = 3.317F + movsin1;
		LegMFR1.rotateAngleZ = -x - movcos2;
		LegMFR2.rotateAngleZ = x2 - movcos3;
		LegMFR3.rotateAngleZ = 0.2617994F + x2 - movcos3;
		LegMFR4.rotateAngleZ = 0.2617994F + x2 - movcos3;
		LegMFR5.rotateAngleZ = 0.7853982F + x2 - movcos3;
		LegMFR6.rotateAngleZ = 1.186824F + x2 - movcos3;

		LegMBR1.rotateAngleY = 2.967F + movcos1;
		LegMBR1.rotateAngleX = 2.967F - movsin1;
		LegMBR1.rotateAngleZ = -x + movcos2;
		LegMBR2.rotateAngleZ = x2 + movcos3;
		LegMBR3.rotateAngleZ = 0.2617994F + x2 + movcos3;
		LegMBR4.rotateAngleZ = 0.2617994F + x2 + movcos3;
		LegMBR5.rotateAngleZ = 0.7853982F + x2 + movcos3;
		LegMBR6.rotateAngleZ = 1.186824F + x2 + movcos3;

		LegBR1.rotateAngleY = 2.443F - movcos1;
		LegBR1.rotateAngleX = 2.443F + movsin1;
		LegBR1.rotateAngleZ = -b - movcos2;
		LegBR2.rotateAngleZ = x2 - movcos3;
		LegBR3.rotateAngleZ = 0.2617994F + x2 - movcos3;
		LegBR4.rotateAngleZ = 0.2617994F + x2 - movcos3;
		LegBR5.rotateAngleZ = 0.7853982F + x2 - movcos3;
		LegBR6.rotateAngleZ = 1.186824F + x2 - movcos3;
	}

}
