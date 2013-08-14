package erebus.client.render.tileentity;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Calendar;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import erebus.ErebusMod;
import erebus.ModBlocks;
import erebus.block.BlockBambooCrate;
import erebus.client.model.block.ModelBamboo;
import erebus.core.helper.LogHelper;
import erebus.tileentity.TileEntityBamboo;
import erebus.tileentity.TileEntityBambooCrate;

@SideOnly(Side.CLIENT)
public class TileEntityRenderBamboo extends TileEntitySpecialRenderer
{
    /** The hollow log chest model. */
    private ModelBamboo bambooModel = new ModelBamboo();
    public static ResourceLocation bambooResource = new ResourceLocation("erebus:textures/item/bamboo.png");
    
    public void renderTileEntityChestAt(TileEntityBamboo bamboo, double par2, double par4, double par6, float par8){ 	
    	int x = bamboo.xCoord;
    	int y = bamboo.yCoord;
    	int z = bamboo.zCoord;
    	
    	
    	this.func_110628_a(bambooResource);
        
        GL11.glPushMatrix(); //start
        GL11.glTranslatef((float)par2 + 0.5F, (float)par4 + 1.5F, (float)par6 + 0.5F); //size
        
        GL11.glRotatef(0, 0.0F, 1.0F, 0.0F); //change the first 0 in like 90 to make it rotate 90 degrees.
        GL11.glScalef(1.0F, -1F, -1F); // to make your block have a normal positioning. comment out to see what happens
        bambooModel.renderModel(0.0625F); //renders and 0.0625F is exactly 1/16. every block has 16 entitys/pixels. if you make the number 1, every pixel will be as big as a block. make it 0.03125 and your block will be half as big as a normal one.
        GL11.glPopMatrix(); //end
    }

    @Override
    public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8) {
        this.renderTileEntityChestAt((TileEntityBamboo)par1TileEntity, par2, par4, par6, par8);
    }
}
