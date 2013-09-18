package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBeetleLarva extends ModelBase
{
	//fields
    ModelRenderer torso1;
    ModelRenderer torso2;
    ModelRenderer torso3;
    ModelRenderer torso4;
    ModelRenderer torso5;
    ModelRenderer torso6;
    ModelRenderer torso7;
    ModelRenderer torso8;
    ModelRenderer legleft1;
    ModelRenderer legright1;
    ModelRenderer legleft2;
    ModelRenderer legright2;
    ModelRenderer legleft3;
    ModelRenderer legright3;
    ModelRenderer head;
    ModelRenderer jawleft;
    ModelRenderer jawright;
    ModelRenderer mouthjaw;
    ModelRenderer sensorleft;
    ModelRenderer sensorright;
  
  public ModelBeetleLarva()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      torso1 = new ModelRenderer(this, 0, 0);
      torso1.addBox(-3F, -2F, 0F, 6, 5, 2);
      torso1.setRotationPoint(0F, 20F, -10F);
      torso1.setTextureSize(128, 64);
      torso1.mirror = true;
      setRotation(torso1, 0.1487144F, 0F, 0F);
      torso2 = new ModelRenderer(this, 0, 8);
      torso2.addBox(-3.5F, -2.5F, 1F, 7, 6, 2);
      torso2.setRotationPoint(0F, 20F, -10F);
      torso2.setTextureSize(128, 64);
      torso2.mirror = true;
      setRotation(torso2, 0.0743572F, 0F, 0F);
      torso3 = new ModelRenderer(this, 0, 17);
      torso3.addBox(-3.5F, -3.5F, 2.5F, 7, 7, 6);
      torso3.setRotationPoint(0F, 20F, -10F);
      torso3.setTextureSize(128, 64);
      torso3.mirror = true;
      setRotation(torso3, -0.0546319F, 0F, 0F);
      torso4 = new ModelRenderer(this, 0, 31);
      torso4.addBox(-3.5F, -3.1F, 8F, 7, 7, 5);
      torso4.setRotationPoint(0F, 20F, -10F);
      torso4.setTextureSize(128, 64);
      torso4.mirror = true;
      setRotation(torso4, 0F, 0F, 0F);
      torso5 = new ModelRenderer(this, 0, 44);
      torso5.addBox(-3.5F, -3.5F, 12.5F, 7, 6, 3);
      torso5.setRotationPoint(0F, 20F, -10F);
      torso5.setTextureSize(128, 64);
      torso5.mirror = true;
      setRotation(torso5, -0.0766292F, 0F, 0F);
      torso6 = new ModelRenderer(this, 0, 54);
      torso6.addBox(-3F, -3.5F, 15.5F, 6, 6, 2);
      torso6.setRotationPoint(0F, 20F, -10F);
      torso6.setTextureSize(128, 64);
      torso6.mirror = true;
      setRotation(torso6, -0.0766374F, 0F, 0F);
      torso7 = new ModelRenderer(this, 17, 54);
      torso7.addBox(-2.5F, -6F, 16.5F, 5, 5, 2);
      torso7.setRotationPoint(0F, 20F, -10F);
      torso7.setTextureSize(128, 64);
      torso7.mirror = true;
      setRotation(torso7, -0.2602503F, 0F, 0F);
      torso8 = new ModelRenderer(this, 32, 54);
      torso8.addBox(-2F, -6.5F, 18F, 4, 4, 1);
      torso8.setRotationPoint(0F, 20F, -10F);
      torso8.setTextureSize(128, 64);
      torso8.mirror = true;
      setRotation(torso8, -0.3346075F, 0F, 0F);
      legleft1 = new ModelRenderer(this, 65, 0);
      legleft1.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      legleft1.setRotationPoint(3F, 21.5F, -7F);
      legleft1.setTextureSize(128, 64);
      legleft1.mirror = true;
      setRotation(legleft1, -0.2230717F, 0.1115358F, -0.1858931F);
      legright1 = new ModelRenderer(this, 70, 0);
      legright1.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      legright1.setRotationPoint(-3F, 21.5F, -7F);
      legright1.setTextureSize(128, 64);
      legright1.mirror = true;
      setRotation(legright1, -0.2230705F, -0.111544F, 0.185895F);
      legleft2 = new ModelRenderer(this, 65, 5);
      legleft2.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      legleft2.setRotationPoint(3F, 21.5F, -6F);
      legleft2.setTextureSize(128, 64);
      legleft2.mirror = true;
      setRotation(legleft2, 0F, 0F, -0.3346075F);
      legright2 = new ModelRenderer(this, 70, 5);
      legright2.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      legright2.setRotationPoint(-3F, 21.5F, -6F);
      legright2.setTextureSize(128, 64);
      legright2.mirror = true;
      setRotation(legright2, 0F, 0F, 0.3346145F);
      legleft3 = new ModelRenderer(this, 65, 10);
      legleft3.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      legleft3.setRotationPoint(3F, 21.5F, -5F);
      legleft3.setTextureSize(128, 64);
      legleft3.mirror = true;
      setRotation(legleft3, 0.1858931F, -0.2230717F, -0.3346075F);
      legright3 = new ModelRenderer(this, 70, 10);
      legright3.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      legright3.setRotationPoint(-3F, 21.5F, -5F);
      legright3.setTextureSize(128, 64);
      legright3.mirror = true;
      setRotation(legright3, 0.1858931F, 0.2230705F, 0.3346145F);
      head = new ModelRenderer(this, 40, 0);
      head.addBox(-2F, -1F, -3F, 4, 3, 4);
      head.setRotationPoint(0F, 20F, -10F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 1.226894F, 0F, 0F);
      jawleft = new ModelRenderer(this, 40, 8);
      jawleft.addBox(1.8F, 0F, -0.5F, 1, 3, 1);
      jawleft.setRotationPoint(0F, 20F, -10F);
      jawleft.setTextureSize(128, 64);
      jawleft.mirror = true;
      setRotation(jawleft, -0.2602503F, 0F, 0.1858931F);
      jawright = new ModelRenderer(this, 45, 8);
      jawright.addBox(-2.8F, 0F, -0.5F, 1, 3, 1);
      jawright.setRotationPoint(0F, 20F, -10F);
      jawright.setTextureSize(128, 64);
      jawright.mirror = true;
      setRotation(jawright, -0.260246F, 0F, -0.185895F);
      mouthjaw = new ModelRenderer(this, 40, 13);
      mouthjaw.addBox(-1.5F, 2.3F, 1F, 3, 2, 0);
      mouthjaw.setRotationPoint(0F, 20F, -10F);
      mouthjaw.setTextureSize(128, 64);
      mouthjaw.mirror = true;
      setRotation(mouthjaw, -0.6320364F, 0F, 0F);
      sensorleft = new ModelRenderer(this, 40, 16);
      sensorleft.addBox(1F, 0F, -1F, 1, 4, 0);
      sensorleft.setRotationPoint(0F, 20F, -10F);
      sensorleft.setTextureSize(128, 64);
      sensorleft.mirror = true;
      setRotation(sensorleft, -0.7063936F, -0.1487144F, 0F);
      sensorright = new ModelRenderer(this, 43, 16);
      sensorright.addBox(-2F, 0F, -1F, 1, 4, 0);
      sensorright.setRotationPoint(0F, 20F, -10F);
      sensorright.setTextureSize(128, 64);
      sensorright.mirror = true;
      setRotation(sensorright, -0.7063936F, 0.1487195F, 0F);
	  }
  
  @Override
public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
	super.render(par1Entity, par2, par3, par4, par5, par6, par7);
	setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
	
	torso1.render(par7);
    torso2.render(par7);
    torso3.render(par7);
    torso4.render(par7);
    torso5.render(par7);
    torso6.render(par7);
    torso7.render(par7);
    torso8.render(par7);
    legleft1.render(par7);
    legright1.render(par7);
    legleft2.render(par7);
    legright2.render(par7);
    legleft3.render(par7);
    legright3.render(par7);
    head.render(par7);
    jawleft.render(par7);
    jawright.render(par7);
    mouthjaw.render(par7);
    sensorleft.render(par7);
    sensorright.render(par7);
    

  }

  
  private void setRotation(ModelRenderer model, float  x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  @Override
public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
	  	float ba = MathHelper.cos(par1 * 1.0F) * 1.5F * par2;
	  	float bb = MathHelper.cos(par1 + 1.0F * 1.0F) * 2.25F * par2;
	  	float bc = MathHelper.cos(par1 + 2.0F* 1.0F) * 3.F * par2;
	  	float bd = MathHelper.cos(par1 + 3.0F* 1.0F) * 2.5F * par2;
	  	float be = MathHelper.cos(par1 + 4.0F* 1.0F) * 1.5F * par2;
	  	float bf = MathHelper.cos(par1 + 5.0F * 1.0F) * 0.75F * par2;
	  	
	      this.head.rotationPointX = bf;
	      this.jawleft.rotationPointX = bf;
	      this.jawright.rotationPointX = bf;
	      this.mouthjaw.rotationPointX = bf;
	      this.sensorleft.rotationPointX = bf;
	      this.sensorright.rotationPointX = bf;
	      
	      	this.torso1.rotationPointY = ba +20F;
	      
	     	this.torso2.rotationPointY = bb +20F;
	     	
	     	this.torso3.rotationPointY = bc +20F;
	      
	     	this.torso4.rotationPointY = bd +20F;
	     	
	     	this.torso5.rotationPointY = be +20F;
	     	
	     	this.torso6.rotationPointY = bf +20F;
	     	

	       this.legright1.rotationPointY = bc +21F;
	        this.legleft1.rotationPointY = bc  +21F;


	        this.legright2.rotationPointY = bc +21F;
	        this.legleft2.rotationPointY = bc  +21F;


	        this.legright3.rotationPointY = bc +21F;
	        this.legleft3.rotationPointY = bc  +21F;



	     this.legright1.rotateAngleX = -MathHelper.cos(par1 * 1.0F) * 1.3F * par2;
	     this.legleft1.rotateAngleX = MathHelper.cos(par1 * 1.0F) * 1.3F * par2;

	      
	     this.legright1.rotateAngleY = -MathHelper.cos(par1 * 1.0F) * 0.5F * par2;
	     this.legleft1.rotateAngleY = MathHelper.cos(par1 * 1.0F) * 0.5F * par2;
	
	      
	     this.legright2.rotateAngleX = -MathHelper.cos(par1 * 1.0F + (float)Math.PI) * 1.3F * par2;
	     this.legleft2.rotateAngleX = MathHelper.cos(par1 * 1.0F + (float)Math.PI) * 1.3F * par2;

	      
	     this.legright2.rotateAngleY = -MathHelper.cos(par1 +0.5F * 1.0F + (float)Math.PI) * 0.5F * par2;
	     this.legleft2.rotateAngleY = MathHelper.cos(par1 +0.5F * 1.0F + (float)Math.PI) * 0.5F * par2;
	      
	     this.legright3.rotateAngleX = -MathHelper.cos(par1 * 1.0F) * 1.3F * par2;
	     this.legleft3.rotateAngleX = MathHelper.cos(par1 * 1.0F) * 1.3F * par2;
	     
	     this.legright3.rotateAngleY = -MathHelper.cos(par1 +1.0F * 1.0F) * 0.5F * par2; 
	     this.legleft3.rotateAngleY = MathHelper.cos(par1 +1.0F * 1.0F) * 0.5F * par2; 
  }
  
}