package erebus.client.render.item;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import erebus.client.model.block.ModelBambooCrate;
import erebus.client.render.tileentity.TileEntityRenderBambooCrate;

/**
 * @author ProPercivalalb
 */
public class BambooCrateItemRenderer implements IItemRenderer {

	private final ModelBambooCrate modelBambooCrate;
	private final ResourceLocation resourceBambooCrate;

	public BambooCrateItemRenderer() {
		modelBambooCrate = new ModelBambooCrate();
		resourceBambooCrate = TileEntityRenderBambooCrate.bambooCrateResource;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return type != ItemRenderType.FIRST_PERSON_MAP;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch (type) {
			case ENTITY:
				renderBambooCrate(0.0F, 1.0F, 0.0F, 1.0D);
				break;
			case EQUIPPED:
				renderBambooCrate(0.5F, 1.5F, 0.5F, 1.0D);
				break;
			case EQUIPPED_FIRST_PERSON:
				renderBambooCrate(0.5F, 1.5F, 0.5F, 1.0D);
				break;
			case INVENTORY:
				renderBambooCrate(0.0F, 1.0F, 0.0F, 1.0D);
				break;
			default:
				break;
		}
	}

	private void renderBambooCrate(float x, float y, float z, double size) {
		FMLClientHandler.instance().getClient().getTextureManager().bindTexture(resourceBambooCrate);
		GL11.glPushMatrix(); // Start Rendering
		GL11.glTranslatef(x, y, z); // Position
		GL11.glRotatef(180F, 1F, 0, 0);
		GL11.glRotatef(-90F, 0, 1F, 0);
		GL11.glScaled(size, size, size); // Changes the size (Only really used
		// when reading in the inventory)
		modelBambooCrate.renderModel(0.0625F); // Render the Hollow log
		GL11.glPopMatrix(); // End Rendering
	}
}
