package erebus.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockErebusOreExtras extends Block {

	private final String[] types = { "oreAluminiumU", "oreCopperU", "oreLeadU", "oreSilverU", "oreTinU" };
	@SideOnly(Side.CLIENT)
	private Icon[] blockIcon;

	public BlockErebusOreExtras(int id) {
		super(id, Material.rock);
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int id, CreativeTabs tab, List list) {
		for (int i = 0; i < blockIcon.length; ++i)
			list.add(new ItemStack(id, 1, i));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return blockIcon[meta];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		blockIcon = new Icon[types.length];
		for (int i = 0; i < blockIcon.length; i++){
			blockIcon[i] = reg.registerIcon("erebus:" + types[i]);
		}
	}
}
