package erebus.core.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.Icon;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.ForgeSubscribe;
import org.lwjgl.opengl.GL11;
import erebus.ModBlocks;
import erebus.core.teleport.TeleportClient;

/**
 * @author ProPercivalalb
 **/
public class PortalOverlayHandler {
	
	@ForgeSubscribe
	public void onPreRenderGameOverlay(RenderGameOverlayEvent.Pre event) {
	    Minecraft mc = Minecraft.getMinecraft();
	    if (mc.thePlayer != null) {
	    	if (event.type == RenderGameOverlayEvent.ElementType.HELMET) {
	    		ScaledResolution var5 = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
	            int width = var5.getScaledWidth();
	            int height = var5.getScaledHeight();
	    		float time = TeleportClient.prevTimeInPortal + (TeleportClient.timeInPortal - TeleportClient.prevTimeInPortal) * event.partialTicks;
	        	if (time > 0.0F) {
	                this.renderPortalOverlay(time, width, height);
	            }
	    	}
	    }
	}
	
    private void renderPortalOverlay(float par1, int par2, int par3) {
        if (par1 < 1.0F) {
            par1 *= par1;
            par1 *= par1;
            par1 = par1 * 0.8F + 0.2F;
        }

        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, par1);
        Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
        Icon icon = ModBlocks.portalErebus.getBlockTextureFromSide(0);
        float f1 = icon.getMinU();
        float f2 = icon.getMinV();
        float f3 = icon.getMaxU();
        float f4 = icon.getMaxV();
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(0.0D, (double)par3, -90.0D, (double)f1, (double)f4);
        tessellator.addVertexWithUV((double)par2, (double)par3, -90.0D, (double)f3, (double)f4);
        tessellator.addVertexWithUV((double)par2, 0.0D, -90.0D, (double)f3, (double)f2);
        tessellator.addVertexWithUV(0.0D, 0.0D, -90.0D, (double)f1, (double)f2);
        tessellator.draw();
        GL11.glDepthMask(true);
        GL11.glEnable(GL11.GL_DEPTH_TEST);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }
}
