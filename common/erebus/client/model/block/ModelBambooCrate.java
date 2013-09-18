package erebus.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

/**
 * @author ProPercivalalb
 */
public class ModelBambooCrate extends ModelBase {
	
    ModelRenderer BottomBamb1;
    ModelRenderer BottomBamb2;
    ModelRenderer BottomBamb3;
    ModelRenderer BottomBamb4;
    ModelRenderer PillarBamb1;
    ModelRenderer PillarBamb2;
    ModelRenderer PillarBamb3;
    ModelRenderer PillarBamb4;
    ModelRenderer TopBamb1;
    ModelRenderer TopBamb2;
    ModelRenderer TopBamb3;
    ModelRenderer TopBamb4;
    ModelRenderer Core;
  
    public ModelBambooCrate()
    {
    	textureWidth = 128;
    	textureHeight = 64;
    
    	BottomBamb1 = new ModelRenderer(this, 0, 8);
    	BottomBamb1.addBox(-2F, 0F, -8F, 4, 4, 16);
    	BottomBamb1.setRotationPoint(-5F, 19F, 0F);
    	BottomBamb1.setTextureSize(128, 64);
    	BottomBamb1.mirror = true;
    	setRotation(BottomBamb1, 0F, 0F, 0F);
    	BottomBamb2 = new ModelRenderer(this, 0, 8);
    	BottomBamb2.addBox(-2F, 0F, -8F, 4, 4, 16);
    	BottomBamb2.setRotationPoint(5F, 19F, 0F);
    	BottomBamb2.setTextureSize(128, 64);
    	BottomBamb2.mirror = true;
    	setRotation(BottomBamb2, 0F, 0F, 0F);
    	BottomBamb3 = new ModelRenderer(this, 0, 0);
    	BottomBamb3.addBox(-8F, 0F, -2F, 16, 4, 4);
    	BottomBamb3.setRotationPoint(0F, 19F, 5F);
    	BottomBamb3.setTextureSize(128, 64);
    	BottomBamb3.mirror = true;
    	setRotation(BottomBamb3, 0F, 0F, 0F);
    	BottomBamb4 = new ModelRenderer(this, 0, 0);
    	BottomBamb4.addBox(-8F, 0F, -2F, 16, 4, 4);
    	BottomBamb4.setRotationPoint(0F, 19F, -5F);
    	BottomBamb4.setTextureSize(128, 64);
    	BottomBamb4.mirror = true;
    	setRotation(BottomBamb4, 0F, 0F, 0F);
    	PillarBamb1 = new ModelRenderer(this, 0, 28);
    	PillarBamb1.addBox(-2F, 0F, -2F, 4, 16, 4);
    	PillarBamb1.setRotationPoint(-5F, 8F, -5F);
    	PillarBamb1.setTextureSize(128, 64);
    	PillarBamb1.mirror = true;
    	setRotation(PillarBamb1, 0F, 0F, 0F);
    	PillarBamb2 = new ModelRenderer(this, 0, 28);
    	PillarBamb2.addBox(-2F, 0F, -2F, 4, 16, 4);
    	PillarBamb2.setRotationPoint(5F, 8F, -5F);
    	PillarBamb2.setTextureSize(128, 64);
    	PillarBamb2.mirror = true;
    	setRotation(PillarBamb2, 0F, 0F, 0F);
    	PillarBamb3 = new ModelRenderer(this, 0, 28);
    	PillarBamb3.addBox(-2F, 0F, -2F, 4, 16, 4);
    	PillarBamb3.setRotationPoint(5F, 8F, 5F);
    	PillarBamb3.setTextureSize(128, 64);
    	PillarBamb3.mirror = true;
    	setRotation(PillarBamb3, 0F, 0F, 0F);
    	PillarBamb4 = new ModelRenderer(this, 0, 28);
    	PillarBamb4.addBox(-2F, 0F, -2F, 4, 16, 4);
    	PillarBamb4.setRotationPoint(-5F, 8F, 5F);
    	PillarBamb4.setTextureSize(128, 64);
      	PillarBamb4.mirror = true;
      	setRotation(PillarBamb4, 0F, 0F, 0F);
      	TopBamb1 = new ModelRenderer(this, 0, 8);
      	TopBamb1.addBox(-2F, -2F, 0F, 4, 4, 16);
      	TopBamb1.setRotationPoint(5F, 11F, -8F);
      	TopBamb1.setTextureSize(128, 64);
      	TopBamb1.mirror = true;
      	setRotation(TopBamb1, 0F, 0F, 0F);
     	TopBamb2 = new ModelRenderer(this, 0, 8);
     	TopBamb2.addBox(-2F, -2F, 0F, 4, 4, 16);
     	TopBamb2.setRotationPoint(-5F, 11F, -8F);
     	TopBamb2.setTextureSize(128, 64);
     	TopBamb2.mirror = true;
     	setRotation(TopBamb2, 0F, 0F, 0F);
     	TopBamb3 = new ModelRenderer(this, 0, 0);
     	TopBamb3.addBox(0F, -2F, -2F, 16, 4, 4);
      	TopBamb3.setRotationPoint(-8F, 11F, -5F);
      	TopBamb3.setTextureSize(128, 64);
      	TopBamb3.mirror = true;
      	setRotation(TopBamb3, 0F, 0F, 0F);
      	TopBamb4 = new ModelRenderer(this, 0, 0);
      	TopBamb4.addBox(0F, -2F, -2F, 16, 4, 4);
      	TopBamb4.setRotationPoint(-8F, 11F, 5F);
      	TopBamb4.setTextureSize(128, 64);
      	TopBamb4.mirror = true;
      	setRotation(TopBamb4, 0F, 0F, 0F);
      	Core = new ModelRenderer(this, 40, 0);
      	Core.addBox(0F, 0F, 0F, 13, 13, 13);
      	Core.setRotationPoint(-6.5F, 9.5F, -6.5F);
      	Core.setTextureSize(128, 64);
      	Core.mirror = true;
      	setRotation(Core, 0F, 0F, 0F);
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z) {
    	model.rotateAngleX = x;
    	model.rotateAngleY = y;
    	model.rotateAngleZ = z;
    }
    
    public void renderModel(float f5) {
    	BottomBamb1.render(f5);
    	BottomBamb2.render(f5);
    	BottomBamb3.render(f5);
    	BottomBamb4.render(f5);
    	PillarBamb1.render(f5);
    	PillarBamb2.render(f5);
    	PillarBamb3.render(f5);
    	PillarBamb4.render(f5);
    	TopBamb1.render(f5);
    	TopBamb2.render(f5);
    	TopBamb3.render(f5);
    	TopBamb4.render(f5);
    	Core.render(f5);
    }
}
