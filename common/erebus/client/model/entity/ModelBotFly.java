
package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import erebus.entity.EntityBotFly;

public class ModelBotFly extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer HeadFront;
    ModelRenderer HeadTop;
    ModelRenderer HeadBottom;
    ModelRenderer EyeR;
    ModelRenderer EveL;
    ModelRenderer Thorax1;
    ModelRenderer Thorax2;
    ModelRenderer Thorax3;
    ModelRenderer Ab1;
    ModelRenderer Ab2;
    ModelRenderer Ab3;
    ModelRenderer Ab4;
    ModelRenderer RWing1;
    ModelRenderer RWing2;
    ModelRenderer LWing1;
    ModelRenderer LWing2;
    ModelRenderer LegRF1;
    ModelRenderer LegRF2;
    ModelRenderer LegRF3;
    ModelRenderer LegLF1;
    ModelRenderer LegLF2;
    ModelRenderer LegLF3;
    ModelRenderer LegRM1;
    ModelRenderer LegRM2;
    ModelRenderer LegRM3;
    ModelRenderer LegLM1;
    ModelRenderer LegLM2;
    ModelRenderer LegLM3;
    ModelRenderer LegRB1;
    ModelRenderer LegRB2;
    ModelRenderer LegRB3;
    ModelRenderer LegLB1;
    ModelRenderer LegLB2;
    ModelRenderer LegLB3;
  
  public ModelBotFly()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 24, 0);
      Head.addBox(-3F, -2F, -4F, 6, 4, 4);
      Head.setRotationPoint(0F, 15F, -4F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      HeadFront = new ModelRenderer(this, 15, 0);
      HeadFront.addBox(-2F, -1.5F, -4.5F, 4, 3, 1);
      HeadFront.setRotationPoint(0F, 15F, -4F);
      HeadFront.setTextureSize(64, 32);
      HeadFront.mirror = true;
      setRotation(HeadFront, 0F, 0F, 0F);
      HeadTop = new ModelRenderer(this, 11, 5);
      HeadTop.addBox(-2F, -2.5F, -3F, 4, 1, 3);
      HeadTop.setRotationPoint(0F, 15F, -4F);
      HeadTop.setTextureSize(64, 32);
      HeadTop.mirror = true;
      setRotation(HeadTop, 0F, 0F, 0F);
      HeadBottom = new ModelRenderer(this, 0, 0);
      HeadBottom.addBox(-2F, 1.5F, -3F, 4, 1, 3);
      HeadBottom.setRotationPoint(0F, 15F, -4F);
      HeadBottom.setTextureSize(64, 32);
      HeadBottom.mirror = true;
      setRotation(HeadBottom, 0F, 0F, 0F);
      EyeR = new ModelRenderer(this, 0, 25);
      EyeR.addBox(-4F, -1F, -3F, 1, 3, 2);
      EyeR.setRotationPoint(0F, 15F, -4F);
      EyeR.setTextureSize(64, 32);
      EyeR.mirror = true;
      setRotation(EyeR, -0.296706F, 0F, 0F);
      EveL = new ModelRenderer(this, 0, 25);
      EveL.addBox(3F, -1F, -3F, 1, 3, 2);
      EveL.setRotationPoint(0F, 15F, -4F);
      EveL.setTextureSize(64, 32);
      EveL.mirror = true;
      setRotation(EveL, -0.296706F, 0F, 0F);
      Thorax1 = new ModelRenderer(this, 20, 10);
      Thorax1.addBox(-4F, -4F, 2F, 8, 7, 3);
      Thorax1.setRotationPoint(0F, 15F, -4F);
      Thorax1.setTextureSize(64, 32);
      Thorax1.mirror = true;
      setRotation(Thorax1, -0.2792527F, 0F, 0F);
      Thorax2 = new ModelRenderer(this, 19, 22);
      Thorax2.addBox(-3.5F, -2F, 0F, 7, 5, 3);
      Thorax2.setRotationPoint(0F, 15F, -4F);
      Thorax2.setTextureSize(64, 32);
      Thorax2.mirror = true;
      setRotation(Thorax2, 0F, 0F, 0F);
      Thorax3 = new ModelRenderer(this, 37, 28);
      Thorax3.addBox(-2F, -3F, 0F, 4, 1, 3);
      Thorax3.setRotationPoint(0F, 15F, -4F);
      Thorax3.setTextureSize(64, 32);
      Thorax3.mirror = true;
      setRotation(Thorax3, 0F, 0F, 0F);
      Ab1 = new ModelRenderer(this, 47, 0);
      Ab1.addBox(-3F, -3.5F, 5F, 6, 6, 1);
      Ab1.setRotationPoint(0F, 15F, -4F);
      Ab1.setTextureSize(64, 32);
      Ab1.mirror = true;
      setRotation(Ab1, -0.2792527F, 0F, 0F);
      Ab2 = new ModelRenderer(this, 42, 7);
      Ab2.addBox(-4F, -4F, 6F, 8, 7, 3);
      Ab2.setRotationPoint(0F, 15F, -4F);
      Ab2.setTextureSize(64, 32);
      Ab2.mirror = true;
      setRotation(Ab2, -0.2792527F, 0F, 0F);
      Ab3 = new ModelRenderer(this, 44, 18);
      Ab3.addBox(-3.5F, -3.5F, 9F, 7, 6, 2);
      Ab3.setRotationPoint(0F, 15F, -4F);
      Ab3.setTextureSize(64, 32);
      Ab3.mirror = true;
      setRotation(Ab3, -0.2792527F, 0F, 0F);
      Ab4 = new ModelRenderer(this, 52, 27);
      Ab4.addBox(-2.5F, -2.5F, 11F, 5, 4, 1);
      Ab4.setRotationPoint(0F, 15F, -4F);
      Ab4.setTextureSize(64, 32);
      Ab4.mirror = true;
      setRotation(Ab4, -0.2792527F, 0F, 0F);
      RWing1 = new ModelRenderer(this, 0, 20);
      RWing1.addBox(-1.5F, -0.5F, 0F, 3, 1, 11);
      RWing1.setRotationPoint(-2F, 11.2F, -1F);
      RWing1.setTextureSize(64, 32);
      RWing1.mirror = true;
      setRotation(RWing1, 0F, -1.570796F, 0F);
      RWing2 = new ModelRenderer(this, 0, 9);
      RWing2.addBox(-3.5F, -0.5F, 1F, 2, 1, 8);
      RWing2.setRotationPoint(-2F, 11.2F, -1F);
      RWing2.setTextureSize(64, 32);
      RWing2.mirror = true;
      setRotation(RWing2, 0F, -1.570796F, 0F);
      LWing1 = new ModelRenderer(this, 0, 20);
      LWing1.addBox(-1.5F, -0.5F, 0F, 3, 1, 11);
      LWing1.setRotationPoint(2F, 11.2F, -1F);
      LWing1.setTextureSize(64, 32);
      LWing1.mirror = true;
      setRotation(LWing1, 0F, 1.570796F, 0F);
      LWing2 = new ModelRenderer(this, 0, 9);
      LWing2.addBox(1.5F, -0.5F, 1F, 2, 1, 8);
      LWing2.setRotationPoint(2F, 11.2F, -1F);
      LWing2.setTextureSize(64, 32);
      LWing2.mirror = true;
      setRotation(LWing2, 0F, 1.570796F, 0F);
      LegRF1 = new ModelRenderer(this, 0, 19);
      LegRF1.addBox(-0.5F, -0.5F, -0.5F, 1, 4, 1);
      LegRF1.setRotationPoint(-3F, 18F, -3F);
      LegRF1.setTextureSize(64, 32);
      LegRF1.mirror = true;
      setRotation(LegRF1, -1.396263F, 0F, 0F);
      LegRF2 = new ModelRenderer(this, 5, 19);
      LegRF2.addBox(-0.5F, -1.3F, -3.2F, 1, 3, 1);
      LegRF2.setRotationPoint(-3F, 18F, -3F);
      LegRF2.setTextureSize(64, 32);
      LegRF2.mirror = true;
      setRotation(LegRF2, 0.6981317F, 0F, 0F);
      LegRF3 = new ModelRenderer(this, 0, 19);
      LegRF3.addBox(-0.5F, 2.7F, -0.2F, 1, 4, 1);
      LegRF3.setRotationPoint(-3F, 18F, -3F);
      LegRF3.setTextureSize(64, 32);
      LegRF3.mirror = true;
      setRotation(LegRF3, -0.4363323F, 0F, 0F);
      LegLF1 = new ModelRenderer(this, 0, 19);
      LegLF1.addBox(-0.5F, -0.5F, -0.5F, 1, 4, 1);
      LegLF1.setRotationPoint(3F, 18F, -3F);
      LegLF1.setTextureSize(64, 32);
      LegLF1.mirror = true;
      setRotation(LegLF1, -1.396263F, 0F, 0F);
      LegLF2 = new ModelRenderer(this, 5, 19);
      LegLF2.addBox(-0.5F, -1.3F, -3.2F, 1, 3, 1);
      LegLF2.setRotationPoint(3F, 18F, -3F);
      LegLF2.setTextureSize(64, 32);
      LegLF2.mirror = true;
      setRotation(LegLF2, 0.6981317F, 0F, 0F);
      LegLF3 = new ModelRenderer(this, 0, 19);
      LegLF3.addBox(-0.5F, 2.7F, -0.2F, 1, 4, 1);
      LegLF3.setRotationPoint(3F, 18F, -3F);
      LegLF3.setTextureSize(64, 32);
      LegLF3.mirror = true;
      setRotation(LegLF3, -0.4363323F, 0F, 0F);
      LegRM1 = new ModelRenderer(this, 0, 19);
      LegRM1.addBox(-0.5F, -0.5F, -0.5F, 1, 4, 1);
      LegRM1.setRotationPoint(-3F, 18F, -2F);
      LegRM1.setTextureSize(64, 32);
      LegRM1.mirror = true;
      setRotation(LegRM1, -1.396263F, 1.570796F, 0F);
      LegRM2 = new ModelRenderer(this, 5, 19);
      LegRM2.addBox(-0.5F, -1.3F, -3.2F, 1, 3, 1);
      LegRM2.setRotationPoint(-3F, 18F, -2F);
      LegRM2.setTextureSize(64, 32);
      LegRM2.mirror = true;
      setRotation(LegRM2, 0.6981317F, 1.570796F, 0F);
      LegRM3 = new ModelRenderer(this, 0, 19);
      LegRM3.addBox(-0.5F, 2.7F, -0.2F, 1, 4, 1);
      LegRM3.setRotationPoint(-3F, 18F, -2F);
      LegRM3.setTextureSize(64, 32);
      LegRM3.mirror = true;
      setRotation(LegRM3, -0.4363323F, 1.570796F, 0F);
      LegLM1 = new ModelRenderer(this, 0, 19);
      LegLM1.addBox(-0.5F, -0.5F, -0.5F, 1, 4, 1);
      LegLM1.setRotationPoint(3F, 18F, -2F);
      LegLM1.setTextureSize(64, 32);
      LegLM1.mirror = true;
      setRotation(LegLM1, -1.396263F, -1.570796F, 0F);
      LegLM2 = new ModelRenderer(this, 5, 19);
      LegLM2.addBox(-0.5F, -1.3F, -3.2F, 1, 3, 1);
      LegLM2.setRotationPoint(3F, 18F, -2F);
      LegLM2.setTextureSize(64, 32);
      LegLM2.mirror = true;
      setRotation(LegLM2, 0.6981317F, -1.570796F, 0F);
      LegLM3 = new ModelRenderer(this, 0, 19);
      LegLM3.addBox(-0.5F, 2.7F, -0.2F, 1, 4, 1);
      LegLM3.setRotationPoint(3F, 18F, -2F);
      LegLM3.setTextureSize(64, 32);
      LegLM3.mirror = true;
      setRotation(LegLM3, -0.4363323F, -1.570796F, 0F);
      LegRB1 = new ModelRenderer(this, 0, 10);
      LegRB1.addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1);
      LegRB1.setRotationPoint(-3F, 18F, -1F);
      LegRB1.setTextureSize(64, 32);
      LegRB1.mirror = true;
      setRotation(LegRB1, -1.570796F, 2.617994F, 0F);
      LegRB2 = new ModelRenderer(this, 5, 19);
      LegRB2.addBox(-0.5F, 0.5F, -4.4F, 1, 3, 1);
      LegRB2.setRotationPoint(-3F, 18F, -1F);
      LegRB2.setTextureSize(64, 32);
      LegRB2.mirror = true;
      setRotation(LegRB2, -0.1047198F, 2.617994F, 0F);
      LegRB3 = new ModelRenderer(this, 0, 19);
      LegRB3.addBox(-0.5F, 4.3F, -3.1F, 1, 4, 1);
      LegRB3.setRotationPoint(-3F, 18F, -1F);
      LegRB3.setTextureSize(64, 32);
      LegRB3.mirror = true;
      setRotation(LegRB3, -0.4363323F, 2.617994F, 0F);
      LegLB1 = new ModelRenderer(this, 0, 10);
      LegLB1.addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1);
      LegLB1.setRotationPoint(3F, 18F, -1F);
      LegLB1.setTextureSize(64, 32);
      LegLB1.mirror = true;
      setRotation(LegLB1, -1.570796F, -2.617994F, 0F);
      LegLB2 = new ModelRenderer(this, 5, 19);
      LegLB2.addBox(-0.5F, 0.5F, -4.4F, 1, 3, 1);
      LegLB2.setRotationPoint(3F, 18F, -1F);
      LegLB2.setTextureSize(64, 32);
      LegLB2.mirror = true;
      setRotation(LegLB2, -0.1047198F, -2.617994F, 0F);
      LegLB3 = new ModelRenderer(this, 0, 19);
      LegLB3.addBox(-0.5F, 4.3F, -3.1F, 1, 4, 1);
      LegLB3.setRotationPoint(3F, 18F, -1F);
      LegLB3.setTextureSize(64, 32);
      LegLB3.mirror = true;
      setRotation(LegLB3, -0.4363323F, -2.617994F, 0F);
  }
  
  @Override
public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
	super.render(par1Entity, par2, par3, par4, par5, par6, par7);
	setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    Head.render(par7);
    HeadFront.render(par7);
    HeadTop.render(par7);
    HeadBottom.render(par7);
    EyeR.render(par7);
    EveL.render(par7);
    Thorax1.render(par7);
    Thorax2.render(par7);
    Thorax3.render(par7);
    Ab1.render(par7);
    Ab2.render(par7);
    Ab3.render(par7);
    Ab4.render(par7);
    
    GL11.glPushMatrix();
    GL11.glEnable(3042);
    float transparency = 0.6F;
    GL11.glBlendFunc(770, 771);
    GL11.glColor4f(0.8F, 0.8F, 0.8F, transparency);
    
    RWing1.render(par7);
    RWing2.render(par7);
    LWing1.render(par7);
    LWing2.render(par7);
    
    GL11.glDisable(3042);
    GL11.glPopMatrix();
    
    LegRF1.render(par7);
    LegRF2.render(par7);
    LegRF3.render(par7);
    LegLF1.render(par7);
    LegLF2.render(par7);
    LegLF3.render(par7);
    LegRM1.render(par7);
    LegRM2.render(par7);
    LegRM3.render(par7);
    LegLM1.render(par7);
    LegLM2.render(par7);
    LegLM3.render(par7);
    LegRB1.render(par7);
    LegRB2.render(par7);
    LegRB3.render(par7);
    LegLB1.render(par7);
    LegLB2.render(par7);
    LegLB3.render(par7);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  @Override
public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
	  super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
	  EntityBotFly var8 = (EntityBotFly)par7Entity;
      this.RWing1.rotateAngleX = var8.wingFloat;
      this.RWing2.rotateAngleX = var8.wingFloat;
      this.LWing1.rotateAngleX = var8.wingFloat;
      this.LWing2.rotateAngleX = var8.wingFloat;
  }
  
	public int getFlySize() {
  		return 100;
  	}

}
