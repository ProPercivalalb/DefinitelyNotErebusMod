package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelScorpion extends ModelBase {
	// fields
	ModelRenderer RMand;
	ModelRenderer LMand;
	ModelRenderer Head;
	ModelRenderer EyeL;
	ModelRenderer EyeR;
	ModelRenderer Body1;
	ModelRenderer Body2;
	ModelRenderer RBL1;
	ModelRenderer RBL2;
	ModelRenderer RBL3;
	ModelRenderer RBL4;
	ModelRenderer RML1;
	ModelRenderer RML2;
	ModelRenderer RML3;
	ModelRenderer RML4;
	ModelRenderer RFL1;
	ModelRenderer RFL2;
	ModelRenderer RFL3;
	ModelRenderer RFL4;
	ModelRenderer RFFL1;
	ModelRenderer RFFL2;
	ModelRenderer RFFL3;
	ModelRenderer RFFL4;
	ModelRenderer LFFL1;
	ModelRenderer LFFL2;
	ModelRenderer LFFL3;
	ModelRenderer LFFL4;
	ModelRenderer LFL1;
	ModelRenderer LFL2;
	ModelRenderer LFL3;
	ModelRenderer LFL4;
	ModelRenderer LML1;
	ModelRenderer LML2;
	ModelRenderer LML3;
	ModelRenderer LML4;
	ModelRenderer LBL1;
	ModelRenderer LBL2;
	ModelRenderer LBL3;
	ModelRenderer LBL4;
	ModelRenderer ClawR1;
	ModelRenderer ClawR2;
	ModelRenderer ClawR3;
	ModelRenderer ClawR4;
	ModelRenderer ClawR5Top;
	ModelRenderer ClawR5Bot;
	ModelRenderer ClawL1;
	ModelRenderer ClawL2;
	ModelRenderer ClawL3;
	ModelRenderer ClawL4;
	ModelRenderer ClawL5Top;
	ModelRenderer ClawL5Bot;
	ModelRenderer Tail1;
	ModelRenderer Tail2;
	ModelRenderer Tail3;
	ModelRenderer Tail4;
	ModelRenderer Tail5;
	ModelRenderer Tail6;
	ModelRenderer Sting1;
	ModelRenderer Sting2;

	public ModelScorpion() {
		textureWidth = 64;
		textureHeight = 128;

		RMand = new ModelRenderer(this, 33, 0);
		RMand.addBox(0F, -0.5F, -0.5F, 3, 2, 1);
		RMand.setRotationPoint(-1F, 18F, -5F);
		RMand.setTextureSize(64, 128);
		RMand.mirror = true;
		setRotation(RMand, 0F, 1.570796F, 0F);
		LMand = new ModelRenderer(this, 25, 0);
		LMand.addBox(0F, -0.5F, -0.5F, 3, 2, 1);
		LMand.setRotationPoint(1F, 18F, -5F);
		LMand.setTextureSize(64, 128);
		LMand.mirror = true;
		setRotation(LMand, 0F, 1.570796F, 0F);
		Head = new ModelRenderer(this, 22, 6);
		Head.addBox(-3F, -1F, -6F, 6, 3, 4);
		Head.setRotationPoint(0F, 17F, 0F);
		Head.setTextureSize(64, 128);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		EyeL = new ModelRenderer(this, 18, 3);
		EyeL.addBox(-1F, -1.5F, -5.5F, 1, 1, 2);
		EyeL.setRotationPoint(1.5F, 17F, 0F);
		EyeL.setTextureSize(64, 128);
		EyeL.mirror = true;
		setRotation(EyeL, 0F, 0F, 0F);
		EyeR = new ModelRenderer(this, 40, 3);
		EyeR.addBox(-1F, -1.5F, -5.5F, 1, 1, 2);
		EyeR.setRotationPoint(-0.5F, 17F, 0F);
		EyeR.setTextureSize(64, 128);
		EyeR.mirror = true;
		setRotation(EyeR, 0F, 0F, 0F);
		Body1 = new ModelRenderer(this, 7, 15);
		Body1.addBox(-5.5F, -1.5F, -4.5F, 11, 3, 14);
		Body1.setRotationPoint(0F, 17F, 4F);
		Body1.setTextureSize(64, 128);
		Body1.mirror = true;
		setRotation(Body1, 0F, 0F, 0F);
		Body2 = new ModelRenderer(this, 9, 33);
		Body2.addBox(-3.5F, -2F, -2F, 7, 4, 17);
		Body2.setRotationPoint(0F, 17F, 0F);
		Body2.setTextureSize(64, 128);
		Body2.mirror = true;
		setRotation(Body2, 0F, 0F, 0F);
		RBL1 = new ModelRenderer(this, 0, 95);
		RBL1.addBox(0F, -1F, -1F, 5, 2, 2);
		RBL1.setRotationPoint(-5F, 17F, 11F);
		RBL1.setTextureSize(64, 128);
		RBL1.mirror = true;
		setRotation(RBL1, 0F, -2.443461F, -0.83490659F);
		RBL2 = new ModelRenderer(this, 0, 88);
		RBL2.addBox(1F, -5.5F, -1F, 4, 2, 2);
		// RBL2.setRotationPoint(-5F, 17F, 11F);
		RBL2.setTextureSize(64, 128);
		RBL2.mirror = true;
		setRotation(RBL2, 0F, -0F, 1.151917F);
		RBL3 = new ModelRenderer(this, 0, 82);
		RBL3.addBox(5F, -4F, -0.5F, 4, 2, 1);
		// RBL3.setRotationPoint(-5F, 17F, 11F);
		RBL3.setTextureSize(64, 128);
		RBL3.mirror = true;
		setRotation(RBL3, 0F, -0F, 0.8203047F);
		RBL4 = new ModelRenderer(this, 0, 76);
		RBL4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
		// RBL4.setRotationPoint(-5F, 17F, 11F);
		RBL4.setTextureSize(64, 128);
		RBL4.mirror = true;
		setRotation(RBL4, 0F, -0F, 0.6981317F);
		RML1 = new ModelRenderer(this, 0, 95);
		RML1.addBox(0F, -1F, -1F, 5, 2, 2);
		RML1.setRotationPoint(-5F, 17F, 8F);
		RML1.setTextureSize(64, 128);
		RML1.mirror = true;
		setRotation(RML1, 0F, -2.879793F, -0.83490659F);
		RML2 = new ModelRenderer(this, 0, 88);
		RML2.addBox(1F, -5.5F, -1F, 4, 2, 2);
		// RML2.setRotationPoint(-5F, 17F, 8F);
		RML2.setTextureSize(64, 128);
		RML2.mirror = true;
		setRotation(RML2, 0F, -0F, 1.151917F);
		RML3 = new ModelRenderer(this, 0, 82);
		RML3.addBox(5F, -4F, -0.5F, 4, 2, 1);
		// RML3.setRotationPoint(-5F, 17F, 8F);
		RML3.setTextureSize(64, 128);
		RML3.mirror = true;
		setRotation(RML3, 0F, -0F, 0.8203047F);
		RML4 = new ModelRenderer(this, 0, 76);
		RML4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
		// RML4.setRotationPoint(-5F, 17F, 8F);
		RML4.setTextureSize(64, 128);
		RML4.mirror = true;
		setRotation(RML4, 0F, -0F, 0.6981317F);
		RFL1 = new ModelRenderer(this, 0, 95);
		RFL1.addBox(0F, -1F, -1F, 5, 2, 2);
		RFL1.setRotationPoint(-5F, 17F, 5F);
		RFL1.setTextureSize(64, 128);
		RFL1.mirror = true;
		setRotation(RFL1, 0F, 2.879793F, -0.83490659F);
		RFL2 = new ModelRenderer(this, 0, 88);
		RFL2.addBox(1F, -5.5F, -1F, 4, 2, 2);
		// RFL2.setRotationPoint(-5F, 17F, 5F);
		RFL2.setTextureSize(64, 128);
		RFL2.mirror = true;
		setRotation(RFL2, 0F, 0F, 1.151917F);
		RFL3 = new ModelRenderer(this, 0, 82);
		RFL3.addBox(5F, -4F, -0.5F, 4, 2, 1);
		// RFL3.setRotationPoint(-5F, 17F, 5F);
		RFL3.setTextureSize(64, 128);
		RFL3.mirror = true;
		setRotation(RFL3, 0F, 0F, 0.8203047F);
		RFL4 = new ModelRenderer(this, 0, 76);
		RFL4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
		// RFL4.setRotationPoint(-5F, 17F, 5F);
		RFL4.setTextureSize(64, 128);
		RFL4.mirror = true;
		setRotation(RFL4, 0F, 0F, 0.6981317F);
		RFFL1 = new ModelRenderer(this, 0, 95);
		RFFL1.addBox(0F, -1F, -1F, 5, 2, 2);
		RFFL1.setRotationPoint(-5F, 17F, 2F);
		RFFL1.setTextureSize(64, 128);
		RFFL1.mirror = true;
		setRotation(RFFL1, 0F, 2.443461F, -0.83490659F);
		RFFL2 = new ModelRenderer(this, 0, 88);
		RFFL2.addBox(1F, -5.5F, -1F, 4, 2, 2);
		// RFFL2.setRotationPoint(-5F, 17F, 2F);
		RFFL2.setTextureSize(64, 128);
		RFFL2.mirror = true;
		setRotation(RFFL2, 0F, 0F, 1.151917F);
		RFFL3 = new ModelRenderer(this, 0, 82);
		RFFL3.addBox(5F, -4F, -0.5F, 4, 2, 1);
		// RFFL3.setRotationPoint(-5F, 17F, 2F);
		RFFL3.setTextureSize(64, 128);
		RFFL3.mirror = true;
		setRotation(RFFL3, 0F, 0F, 0.8203047F);
		RFFL4 = new ModelRenderer(this, 0, 76);
		RFFL4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
		// RFFL4.setRotationPoint(-5F, 17F, 2F);
		RFFL4.setTextureSize(64, 128);
		RFFL4.mirror = true;
		setRotation(RFFL4, 0F, 0F, 0.6981317F);
		LFFL1 = new ModelRenderer(this, 0, 95);
		LFFL1.addBox(0F, -1F, -1F, 5, 2, 2);
		LFFL1.setRotationPoint(5F, 17F, 2F);
		LFFL1.setTextureSize(64, 128);
		LFFL1.mirror = true;
		setRotation(LFFL1, 0F, 0.6981317F, 0.3490659F);
		LFFL2 = new ModelRenderer(this, 0, 88);
		LFFL2.addBox(1F, -5.5F, -1F, 4, 2, 2);
		// LFFL2.setRotationPoint(5F, 17F, 2F);
		LFFL2.setTextureSize(64, 128);
		LFFL2.mirror = true;
		setRotation(LFFL2, 0F, 0F, 1.151917F);
		LFFL3 = new ModelRenderer(this, 0, 82);
		LFFL3.addBox(5F, -4F, -0.5F, 4, 2, 1);
		// LFFL3.setRotationPoint(5F, 17F, 2F);
		LFFL3.setTextureSize(64, 128);
		LFFL3.mirror = true;
		setRotation(LFFL3, 0F, 0F, 0.8203047F);
		LFFL4 = new ModelRenderer(this, 0, 76);
		LFFL4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
		// LFFL4.setRotationPoint(5F, 17F, 2F);
		LFFL4.setTextureSize(64, 128);
		LFFL4.mirror = true;
		setRotation(LFFL4, 0F, 0F, 0.6981317F);
		LFL1 = new ModelRenderer(this, 0, 95);
		LFL1.addBox(0F, -1F, -1F, 5, 2, 2);
		LFL1.setRotationPoint(5F, 17F, 5F);
		LFL1.setTextureSize(64, 128);
		LFL1.mirror = true;
		setRotation(LFL1, 0F, 0.2617994F, 0.3490659F);
		LFL2 = new ModelRenderer(this, 0, 88);
		LFL2.addBox(1F, -5.5F, -1F, 4, 2, 2);
		// LFL2.setRotationPoint(5F, 17F, 5F);
		LFL2.setTextureSize(64, 128);
		LFL2.mirror = true;
		setRotation(LFL2, 0F, 0F, 1.151917F);
		LFL3 = new ModelRenderer(this, 0, 82);
		LFL3.addBox(5F, -4F, -0.5F, 4, 2, 1);
		// LFL3.setRotationPoint(5F, 17F, 5F);
		LFL3.setTextureSize(64, 128);
		LFL3.mirror = true;
		setRotation(LFL3, 0F, 0F, 0.8203047F);
		LFL4 = new ModelRenderer(this, 0, 76);
		LFL4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
		// LFL4.setRotationPoint(5F, 17F, 5F);
		LFL4.setTextureSize(64, 128);
		LFL4.mirror = true;
		setRotation(LFL4, 0F, 0F, 0.6981317F);
		LML1 = new ModelRenderer(this, 0, 95);
		LML1.addBox(0F, -1F, -1F, 5, 2, 2);
		LML1.setRotationPoint(5F, 17F, 8F);
		LML1.setTextureSize(64, 128);
		LML1.mirror = true;
		setRotation(LML1, 0F, -0.2617994F, 0.3490659F);
		LML2 = new ModelRenderer(this, 0, 88);
		LML2.addBox(1F, -5.5F, -1F, 4, 2, 2);
		// LML2.setRotationPoint(5F, 17F, 8F);
		LML2.setTextureSize(64, 128);
		LML2.mirror = true;
		setRotation(LML2, 0F, -0F, 1.151917F);
		LML3 = new ModelRenderer(this, 0, 82);
		LML3.addBox(5F, -4F, -0.5F, 4, 2, 1);
		// LML3.setRotationPoint(5F, 17F, 8F);
		LML3.setTextureSize(64, 128);
		LML3.mirror = true;
		setRotation(LML3, 0F, -0F, 0.8203047F);
		LML4 = new ModelRenderer(this, 0, 76);
		LML4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
		// LML4.setRotationPoint(5F, 17F, 8F);
		LML4.setTextureSize(64, 128);
		LML4.mirror = true;
		setRotation(LML4, 0F, -0F, 0.6981317F);
		LBL1 = new ModelRenderer(this, 0, 95);
		LBL1.addBox(0F, -1F, -1F, 5, 2, 2);
		LBL1.setRotationPoint(5F, 17F, 11F);
		LBL1.setTextureSize(64, 128);
		LBL1.mirror = true;
		setRotation(LBL1, 0F, -0.6981317F, 0.3490659F);
		LBL2 = new ModelRenderer(this, 0, 88);
		LBL2.addBox(1F, -5.5F, -1F, 4, 2, 2);
		// LBL2.setRotationPoint(5F, 17F, 11F);
		LBL2.setTextureSize(64, 128);
		LBL2.mirror = true;
		setRotation(LBL2, 0F, -0F, 1.151917F);
		LBL3 = new ModelRenderer(this, 0, 82);
		LBL3.addBox(5F, -4F, -0.5F, 4, 2, 1);
		// LBL3.setRotationPoint(5F, 17F, 11F);
		LBL3.setTextureSize(64, 128);
		LBL3.mirror = true;
		setRotation(LBL3, 0F, -0F, 0.8203047F);
		LBL4 = new ModelRenderer(this, 0, 76);
		LBL4.addBox(8F, -2.5F, -0.5F, 4, 1, 1);
		// LBL4.setRotationPoint(5F, 17F, 11F);
		LBL4.setTextureSize(64, 128);
		LBL4.mirror = true;
		setRotation(LBL4, 0F, -0F, 0.6981317F);
		ClawR1 = new ModelRenderer(this, 44, 24);
		ClawR1.addBox(-2F, -1F, -1F, 4, 2, 2);
		ClawR1.setRotationPoint(-3F, 18F, -5F);
		ClawR1.setTextureSize(64, 128);
		ClawR1.mirror = true;
		setRotation(ClawR1, 0F, -1.047198F, 0F);
		ClawR2 = new ModelRenderer(this, 44, 19);
		ClawR2.addBox(-5F, -1F, -4F, 6, 2, 2);
		ClawR2.setRotationPoint(-3F, 18F, -5F);
		ClawR2.setTextureSize(64, 128);
		ClawR2.mirror = true;
		setRotation(ClawR2, 0F, 0.523599F, 0F);
		ClawR3 = new ModelRenderer(this, 44, 12);
		ClawR3.addBox(-6F, -1.5F, 3F, 4, 3, 3);
		ClawR3.setRotationPoint(-3F, 18F, -5F);
		ClawR3.setTextureSize(64, 128);
		ClawR3.mirror = true;
		setRotation(ClawR3, 0F, -1.396263F, 0F);
		ClawR4 = new ModelRenderer(this, 44, 3);
		ClawR4.addBox(-9.5F, -2F, 4F, 6, 4, 4);
		ClawR4.setRotationPoint(-3F, 18F, -5F);
		ClawR4.setTextureSize(64, 128);
		ClawR4.mirror = true;
		setRotation(ClawR4, 0F, -1.745329F, 0F);
		ClawR5Top = new ModelRenderer(this, 43, 0);
		ClawR5Top.addBox(-8.5F, -1.5F, 10F, 4, 1, 1);
		ClawR5Top.setRotationPoint(-3F, 18F, -5F);
		ClawR5Top.setTextureSize(64, 128);
		ClawR5Top.mirror = true;
		setRotation(ClawR5Top, 0F, -2.268928F, 0F);
		ClawR5Bot = new ModelRenderer(this, 54, 0);
		ClawR5Bot.addBox(-8.5F, 0.5F, 10F, 4, 1, 1);
		ClawR5Bot.setRotationPoint(-3F, 18F, -5F);
		ClawR5Bot.setTextureSize(64, 128);
		ClawR5Bot.mirror = true;
		setRotation(ClawR5Bot, 0F, -2.268928F, 0F);
		ClawL1 = new ModelRenderer(this, 8, 24);
		ClawL1.addBox(-2F, -1F, -1F, 4, 2, 2);
		ClawL1.setRotationPoint(3F, 18F, -5F);
		ClawL1.setTextureSize(64, 128);
		ClawL1.mirror = true;
		setRotation(ClawL1, 0F, -2.094395F, 0F);
		ClawL2 = new ModelRenderer(this, 4, 19);
		ClawL2.addBox(-5F, -1F, 2F, 6, 2, 2);
		ClawL2.setRotationPoint(3F, 18F, -5F);
		ClawL2.setTextureSize(64, 128);
		ClawL2.mirror = true;
		setRotation(ClawL2, 0F, 2.617994F, 0F);
		ClawL3 = new ModelRenderer(this, 6, 12);
		ClawL3.addBox(-6F, -1.5F, -6F, 4, 3, 3);
		ClawL3.setRotationPoint(3F, 18F, -5F);
		ClawL3.setTextureSize(64, 128);
		ClawL3.mirror = true;
		setRotation(ClawL3, 0F, -1.745329F, 0F);
		ClawL4 = new ModelRenderer(this, 0, 3);
		ClawL4.addBox(-9.5F, -2F, -8F, 6, 4, 4);
		ClawL4.setRotationPoint(3F, 18F, -5F);
		ClawL4.setTextureSize(64, 128);
		ClawL4.mirror = true;
		setRotation(ClawL4, 0F, -1.396263F, 0F);
		ClawL5Top = new ModelRenderer(this, 0, 0);
		ClawL5Top.addBox(-8.5F, -1.5F, -11F, 4, 1, 1);
		ClawL5Top.setRotationPoint(3F, 18F, -5F);
		ClawL5Top.setTextureSize(64, 128);
		ClawL5Top.mirror = true;
		setRotation(ClawL5Top, 0F, -0.8726646F, 0F);
		ClawL5Bot = new ModelRenderer(this, 11, 0);
		ClawL5Bot.addBox(-8.5F, 0.5F, -11F, 4, 1, 1);
		ClawL5Bot.setRotationPoint(3F, 18F, -5F);
		ClawL5Bot.setTextureSize(64, 128);
		ClawL5Bot.mirror = true;
		setRotation(ClawL5Bot, 0F, -0.8726646F, 0F);
		Tail1 = new ModelRenderer(this, 23, 55);
		Tail1.addBox(-3F, -0.5F, -2.5F, 6, 3, 4);
		Tail1.setRotationPoint(0F, 16F, 17.5F);
		Tail1.setTextureSize(64, 128);
		Tail1.mirror = true;
		setRotation(Tail1, 0F, 0F, 0F);
		Tail2 = new ModelRenderer(this, 24, 63);
		Tail2.addBox(-2.5F, -1.5F, 0F, 5, 3, 5);
		Tail2.setRotationPoint(0F, 17F, 17.5F);
		Tail2.setTextureSize(64, 128);
		Tail2.mirror = true;
		setRotation(Tail2, 0.8726646F, 0F, 0F);
		Tail3 = new ModelRenderer(this, 24, 72);
		Tail3.addBox(-2F, -0.3F, 4F, 4, 3, 5);
		Tail3.setRotationPoint(0F, 17F, 17.5F);
		Tail3.setTextureSize(64, 128);
		Tail3.mirror = true;
		setRotation(Tail3, 1.22173F, 0F, 0F);
		Tail4 = new ModelRenderer(this, 24, 81);
		Tail4.addBox(-1.5F, 2.5F, 7.5F, 3, 3, 6);
		Tail4.setRotationPoint(0F, 17F, 17.5F);
		Tail4.setTextureSize(64, 128);
		Tail4.mirror = true;
		setRotation(Tail4, 1.570796F, 0F, 0F);
		Tail5 = new ModelRenderer(this, 25, 91);
		Tail5.addBox(-1F, 7F, 11F, 2, 2, 6);
		Tail5.setRotationPoint(0F, 17F, 17.5F);
		Tail5.setTextureSize(64, 128);
		Tail5.mirror = true;
		setRotation(Tail5, 1.919862F, 0F, 0F);
		Tail6 = new ModelRenderer(this, 25, 100);
		Tail6.addBox(-1F, 12F, 13F, 2, 2, 6);
		Tail6.setRotationPoint(0F, 17F, 17.5F);
		Tail6.setTextureSize(64, 128);
		Tail6.mirror = true;
		setRotation(Tail6, 2.268928F, 0F, 0F);
		Sting1 = new ModelRenderer(this, 24, 109);
		Sting1.addBox(-2F, 16F, 13F, 4, 4, 5);
		Sting1.setRotationPoint(0F, 17F, 17.5F);
		Sting1.setTextureSize(64, 128);
		Sting1.mirror = true;
		setRotation(Sting1, 2.617994F, 0F, 0F);
		Sting2 = new ModelRenderer(this, 27, 119);
		Sting2.addBox(-0.5F, -6.5F, 18F, 1, 1, 5);
		Sting2.setRotationPoint(0F, 17F, 17.5F);
		Sting2.setTextureSize(64, 128);
		Sting2.mirror = true;
		setRotation(Sting2, 1.570796F, 0F, 0F);

		LFFL1.addChild(LFFL2);
		LFFL1.addChild(LFFL3);
		LFFL1.addChild(LFFL4);

		LFL1.addChild(LFL2);
		LFL1.addChild(LFL3);
		LFL1.addChild(LFL4);

		LML1.addChild(LML2);
		LML1.addChild(LML3);
		LML1.addChild(LML4);

		LBL1.addChild(LBL2);
		LBL1.addChild(LBL3);
		LBL1.addChild(LBL4);

		RFFL1.addChild(RFFL2);
		RFFL1.addChild(RFFL3);
		RFFL1.addChild(RFFL4);

		RFL1.addChild(RFL2);
		RFL1.addChild(RFL3);
		RFL1.addChild(RFL4);

		RML1.addChild(RML2);
		RML1.addChild(RML3);
		RML1.addChild(RML4);

		RBL1.addChild(RBL2);
		RBL1.addChild(RBL3);
		RBL1.addChild(RBL4);

	}
	
@Override
	public void render(Entity par1Entity, float par2, float par3, float par4,
			float par5, float par6, float par7) {
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		RMand.render(par7);
		LMand.render(par7);
		Head.render(par7);
		EyeL.render(par7);
		EyeR.render(par7);
		Body1.render(par7);
		Body2.render(par7);
		RBL1.render(par7);
		// RBL2.render(par7);
		// RBL3.render(par7);
		// RBL4.render(par7);
		RML1.render(par7);
		// RML2.render(par7);
		// RML3.render(par7);
		// RML4.render(par7);
		RFL1.render(par7);
		// RFL2.render(par7);
		// RFL3.render(par7);
		// RFL4.render(par7);
		RFFL1.render(par7);
		// RFFL2.render(par7);
		// RFFL3.render(par7);
		// RFFL4.render(par7);
		LFFL1.render(par7);
		// LFFL2.render(par7);
		// LFFL3.render(par7);
		// LFFL4.render(par7);
		LFL1.render(par7);
		// LFL2.render(par7);
		// LFL3.render(par7);
		// LFL4.render(par7);
		LML1.render(par7);
		// LML2.render(par7);
		// LML3.render(par7);
		// LML4.render(par7);
		LBL1.render(par7);
		// LBL2.render(par7);
		// LBL3.render(par7);
		// LBL4.render(par7);
		ClawR1.render(par7);
		ClawR2.render(par7);
		ClawR3.render(par7);
		ClawR4.render(par7);
		ClawR5Top.render(par7);
		ClawR5Bot.render(par7);
		ClawL1.render(par7);
		ClawL2.render(par7);
		ClawL3.render(par7);
		ClawL4.render(par7);
		ClawL5Top.render(par7);
		ClawL5Bot.render(par7);
		Tail1.render(par7);
		Tail2.render(par7);
		Tail3.render(par7);
		Tail4.render(par7);
		Tail5.render(par7);
		Tail6.render(par7);
		Sting1.render(par7);
		Sting2.render(par7);
	}


	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
@Override
	public void setRotationAngles(float par1, float par2, float par3,
			float par4, float par5, float par6, Entity par7Entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);

		float cosz1 = MathHelper.cos(par1 * 1.0F + (float) Math.PI) * 0.3F
				* par2;
		float cosz2 = MathHelper.cos(par1 * 1.0F) * 0.3F * par2;

		float cozy1 = MathHelper.cos(par1 * 1.0F + (float) Math.PI) * 0.4F
				* par2;
		float cozy2 = MathHelper.cos(par1 * 1.0F) * 0.4F * par2;

		float cosxnz1 = MathHelper.cos(par1 / 3.0F + (float) Math.PI) * 0.1F
				* par2;
		float cosxnz2 = MathHelper.cos(par1 / 3.0F + (float) Math.PI) * 0.05F
				* par2;

		this.LBL1.rotateAngleZ = cosz1 - 0.3F;
		this.LML1.rotateAngleZ = cosz2 - 0.3F;
		this.LFL1.rotateAngleZ = cosz1 - 0.3F;
		this.LFFL1.rotateAngleZ = cosz2 - 0.3F;
		this.RBL1.rotateAngleZ = -cosz2 + 0.3F;
		this.RML1.rotateAngleZ = -cosz1 + 0.3F;
		this.RFL1.rotateAngleZ = -cosz2 + 0.3F;
		this.RFFL1.rotateAngleZ = -cosz1 + 0.3F;

		this.LBL1.rotateAngleY = cozy1 - 0.6981317F;
		this.LML1.rotateAngleY = cozy2 - 0.2617994F;
		this.LFL1.rotateAngleY = cozy1 + 0.2617994F;
		this.LFFL1.rotateAngleY = cozy2 + 0.6981317F;
		this.RBL1.rotateAngleY = -cozy2 - 2.443461F;
		this.RML1.rotateAngleY = -cozy1 - 2.879793F;
		this.RFL1.rotateAngleY = -cozy2 + 2.879793F;
		this.RFFL1.rotateAngleY = -cozy1 + 2.443461F;

		this.ClawR1.rotateAngleX = -cosxnz1;
		this.ClawR1.rotateAngleZ = cosxnz1;
		this.ClawR2.rotateAngleX = -cosxnz1;
		this.ClawR3.rotateAngleX = cosxnz1;
		this.ClawR4.rotateAngleX = cosxnz1;

		this.ClawR5Bot.rotateAngleX = cosxnz2;
		this.ClawR5Top.rotateAngleX = cosxnz2;

		this.ClawR5Bot.rotateAngleZ = cosxnz2;
		this.ClawR5Top.rotateAngleZ = cosxnz2;

		this.ClawL1.rotateAngleX = -cosxnz1;
		this.ClawL1.rotateAngleZ = cosxnz1;
		this.ClawL2.rotateAngleX = -cosxnz1;
		this.ClawL3.rotateAngleX = cosxnz1;
		this.ClawL4.rotateAngleX = cosxnz1;

		this.ClawL5Bot.rotateAngleX = cosxnz2;
		this.ClawL5Top.rotateAngleX = cosxnz2;

		this.ClawL5Bot.rotateAngleZ = cosxnz2;
		this.ClawL5Top.rotateAngleZ = cosxnz2;

		this.Tail1.rotateAngleZ = -cosxnz1;
		this.Tail2.rotateAngleZ = -cosxnz1;
		this.Tail3.rotateAngleZ = -cosxnz1;
		this.Tail4.rotateAngleZ = -cosxnz1;
		this.Tail5.rotateAngleZ = -cosxnz1;
		this.Tail6.rotateAngleZ = -cosxnz1;
		this.Sting1.rotateAngleZ = -cosxnz1;
		this.Sting2.rotateAngleZ = -cosxnz1;
		// rotateAngleX for tail sting

		this.RMand.rotateAngleY = -MathHelper.cos(par1 * 0.5F) * 0.2F * par2
				+ 1.570796F;
		this.LMand.rotateAngleY = -MathHelper
				.cos(par1 * 0.5F + (float) Math.PI) * 0.2F * par2 + 1.570796F;
	}

}
