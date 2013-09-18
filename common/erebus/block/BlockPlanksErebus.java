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

public class BlockPlanksErebus extends Block{
	public static final String[] plankTypes = new String[]{
		"acacia", "eucalyptus", "mahogany", "baobab", "mossbark", "pink", "scorched"
	};
	
	public static final byte dataAcacia = 0, dataEucalyptus = 1, dataMahogany = 2, dataBaobab = 3, dataMossbark = 4,
			 			     dataPink = 5, dataScorched = 6;
	
	@SideOnly(Side.CLIENT)
    private Icon[] iconArray;
	
	public BlockPlanksErebus(int id){
		super(id,Material.wood);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta){
		if (meta<0||meta>=iconArray.length)meta=0;
		return iconArray[meta];
	}

	@Override
	public int damageDropped(int meta){
		return meta;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int id, CreativeTabs creativeTabs, List list){
		for(int a=0; a<iconArray.length; a++){
			list.add(new ItemStack(id,1,a));
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		iconArray=new Icon[plankTypes.length];

		for(int i=0; i<iconArray.length; i++){
			iconArray[i]=par1IconRegister.registerIcon("erebus:wood_"+plankTypes[i]);
		}
	}
}
