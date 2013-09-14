package erebus;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import erebus.block.BlockAmber;
import erebus.block.BlockBambooCrate;
import erebus.block.BlockCaveSpiderSpawner;
import erebus.block.BlockCobbleWebbed;
import erebus.block.BlockMirBrick;
import erebus.block.BlockErebusBrick;
import erebus.block.BlockErebusGrass;
import erebus.block.BlockErebusOre;
import erebus.block.BlockFern;
import erebus.block.BlockHollowLog;
import erebus.block.BlockLeavesErebus;
import erebus.block.BlockLogErebus;
import erebus.block.BlockMaggot;
import erebus.block.BlockOreFossil;
import erebus.block.BlockPlanksErebus;
import erebus.block.BlockPortalErebus;
import erebus.block.BlockQuickSand;
import erebus.block.BlockRedGem;
import erebus.block.BlockSaplingErebus;
import erebus.block.BlockScree;
import erebus.block.BlockSilk;
import erebus.block.BlockSpiderSilk;
import erebus.block.BlockSpiderSpawner;
import erebus.block.BlockStairsErebus;
import erebus.block.BlockThorns;
import erebus.block.BlockTurnip;
import erebus.block.BlockUmberstone;
import erebus.item.ItemMultiBlock;
import erebus.item.ItemSapling;
import erebus.tileentity.TileEntityHollowLog;

/**
 * @author ProPercivalalb
 */
public class ModBlocks {

	//public static Block mud;
	public static Block blockAmber;						public static int blockAmberID;
	public static BlockPortalErebus portalErebus;		public static int portalErebusID;
	public static Block logErebus;           			public static int logErebusID;
	public static Block planksErebus;           		public static int planksErebusID;
	public static BlockLeavesErebus leavesMahogany;		public static int leavesMahoganyID;
	public static BlockLeavesErebus leavesEucalyptus;	public static int leavesEucalyptusID;
	public static Block cobbleWebbed;					public static int cobbleWebbedID;
	public static Block oreFossil;						public static int oreFossilID;
	public static Block blockSilk;						public static int blockSilkID;
	public static Block stairsMahogany;					//public static int blockAmberID;
	public static Block stairsEucalyptus;				//public static int blockAmberID;
	public static Block mirBrick;						public static int mirBrickID;
	public static Block spiderSpawner;					public static int spiderSpawnerID;
	public static Block caveSpiderSpawner;				public static int caveSpiderSpawnerID;
	public static Block blockSpiderSilk;				public static int blockSpiderSilkID;
	public static Block thorns;							public static int thornsID;
	public static BlockFern fern;						public static int fernID;
	public static BlockLeavesErebus leavesAcacia;		public static int leavesAcaciaID;
	public static Block erebusSapling;					public static int erebusSaplingID;
	public static Block erebusGrass;					public static int erebusGrassID;
	public static Block quickSand;						public static int quickSandID;
	public static Block blockTurnip;					public static int blockTurnipID;
	public static Block dryScree;						//public static int blockAmberID;
	public static Block screeBricks;					//public static int blockAmberID;
	public static Block hollowLogAcacia;				public static int hollowLogAcaciaID;
	public static Block maggotLogAcacia;				//public static int blockAmberID;
	public static Block umberstone;					    public static int umberstoneID;
	public static Block umberOreBlock;					public static int umberOreBlockID;
	public static Block bambooCrate;			  	    public static int bambooCrateID;
	public static Block redGem;							public static int redGemID;
	
	public static void init() {
		// constructor, hardness, resistance, light value, light opacity, step sound, creative tab, unlocalized name, texture name
		
		//mud = new BlockMud(2501, 0).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("mud");
		portalErebus = (BlockPortalErebus)(new BlockPortalErebus(portalErebusID, 221)).setHardness(-1F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("portalErebus");
		blockAmber = new BlockAmber(blockAmberID).setHardness(1.5F).setResistance(10.0F).setLightOpacity(3).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("blockAmber").setCreativeTab(ErebusMod.tabErebusBlock);
		leavesMahogany = (BlockLeavesErebus)(new BlockLeavesErebus(leavesMahoganyID, 0)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("leaves_mahogany").setTextureName("erebus:leaves_mahogany");
		leavesEucalyptus = (BlockLeavesErebus)(new BlockLeavesErebus(leavesEucalyptusID, 1)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("leaves_eucalyptus").setTextureName("erebus:leaves_eucalyptus");
		cobbleWebbed = new BlockCobbleWebbed(cobbleWebbedID).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundClothFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("cobbleWebbed").setTextureName("erebus:cobbleWebbed");
		oreFossil = new BlockOreFossil(oreFossilID).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("oreFossil_U").setTextureName("erebus:oreFossil_U");
		blockSilk = new BlockSilk(blockSilkID, 70).setHardness(0.2F).setStepSound(Block.soundClothFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("blockSilk").setTextureName("erebus:blockSilk");
		mirBrick = new BlockMirBrick(mirBrickID, Material.rock).setHardness(1.5F).setResistance(100.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("mirbrick").setTextureName("erebus:mirbrick");
		spiderSpawner = new BlockSpiderSpawner(spiderSpawnerID, 96).setHardness(1.5F).setResistance(100.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("spiderSpawner").setTextureName("erebus:spiderSpawner");
		caveSpiderSpawner = new BlockCaveSpiderSpawner(caveSpiderSpawnerID, 96).setHardness(1.5F).setResistance(100.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("spiderSpawner").setTextureName("erebus:spiderSpawner");
		blockSpiderSilk = new BlockSpiderSilk(blockSpiderSilkID).setHardness(0.2F).setStepSound(Block.soundClothFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("blockSpiderSilk").setTextureName("erebus:blockSpiderSilk");
		thorns = new BlockThorns(thornsID).setHardness(0.2F).setStepSound(Block.soundGrassFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("thorns").setTextureName("erebus:thorns");
		fern = (BlockFern)(new BlockFern(fernID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("erebusFern").setCreativeTab(ErebusMod.tabErebusBlock);
		leavesAcacia = (BlockLeavesErebus)(new BlockLeavesErebus(leavesAcaciaID, 2)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("leaves_acacia").setTextureName("erebus:leaves_acacia");
		erebusSapling = new BlockSaplingErebus(erebusSaplingID).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("sapling_mahogany");
		erebusGrass = new BlockErebusGrass(erebusGrassID).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("tallgrass").setTextureName("erebus:tallgrass");
		quickSand = new BlockQuickSand(quickSandID).setHardness(0.5F).setStepSound(Block.soundGrassFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("quickSand");
		blockTurnip = (new BlockTurnip(blockTurnipID)).setUnlocalizedName("turnips");
		umberOreBlock = new BlockErebusOre(umberOreBlockID).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("oreBlockU");
		umberstone = new BlockUmberstone(umberstoneID, Material.rock).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("umberstone");
		bambooCrate = new BlockBambooCrate(bambooCrateID).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("bamboo");
		redGem = new BlockRedGem(redGemID).setUnlocalizedName("redGem").setHardness(0.3F).setLightValue(1F).setStepSound(Block.soundGlassFootstep);
		
		dryScree = (new BlockScree(2550)).setHardness(0.5F).setStepSound(Block.soundSandFootstep).setUnlocalizedName("blockScree").setCreativeTab(ErebusMod.tabErebusBlock).setTextureName("erebus:blockScree");  
		screeBricks = (new BlockErebusBrick(2551)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("brickScree").setTextureName("erebus:brickScree");
		hollowLogAcacia = new BlockHollowLog(2552, TileEntityHollowLog.class).setHardness(0.4F).setStepSound(Block.soundWoodFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("log_acacia").setTextureName("erebus:log_acacia");
		maggotLogAcacia = new BlockMaggot(2553, 164).setHardness(0.4F).setStepSound(Block.soundWoodFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("log_acacia").setTextureName("erebus:log_acacia");
    
		logErebus = new BlockLogErebus(logErebusID).setUnlocalizedName("logErebus").setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(ErebusMod.tabErebusBlock);
		planksErebus = new BlockPlanksErebus(planksErebusID).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("planksErebus").setCreativeTab(ErebusMod.tabErebusBlock);

		stairsMahogany = new BlockStairsErebus(2554, planksErebus, BlockLogErebus.dataMahogany).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("stairsMahogany");
		stairsEucalyptus = new BlockStairsErebus(2555, planksErebus, BlockLogErebus.dataEucalyptus).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(ErebusMod.tabErebusBlock).setUnlocalizedName("stairsEucalyptus");
	
		//GameRegistry.registerBlock(mud);		  
		GameRegistry.registerBlock(portalErebus, "erebus.portal");
		GameRegistry.registerBlock(blockAmber, ItemMultiBlock.class, "erebus.blockAmber");		    
		GameRegistry.registerBlock(leavesMahogany, "erebus.leavesMahogany");
		GameRegistry.registerBlock(leavesEucalyptus, "erebus.leavesEucalyptus");		  
		GameRegistry.registerBlock(cobbleWebbed, "erebus.cobbleWebbed");		  
		GameRegistry.registerBlock(oreFossil, "erebus.oreFossil");		  
		GameRegistry.registerBlock(blockSilk, "erebus.blockSilk");
		GameRegistry.registerBlock(mirBrick, "erebus.mirBrick");		  
		GameRegistry.registerBlock(spiderSpawner, "erebus.spiderSpawner");		  
		GameRegistry.registerBlock(caveSpiderSpawner, "erebus.caveSpiderSpawner");		  
		GameRegistry.registerBlock(blockSpiderSilk, "erebus.blockSpiderSilk");		  
		GameRegistry.registerBlock(thorns, "erebus.thorns");		  
		GameRegistry.registerBlock(fern, "erebus.fern");  
		GameRegistry.registerBlock(leavesAcacia, "erebus.leavesAcacia");	  
		GameRegistry.registerBlock(erebusSapling, ItemSapling.class, "erebus.erebusSapling");		  
		GameRegistry.registerBlock(erebusGrass, "erebus.erebusGrass");		  
		GameRegistry.registerBlock(quickSand, "erebus.quickSand");
		GameRegistry.registerBlock(blockTurnip, "erebus.blockTurnip");
		//GameRegistry.registerBlock(dryScree, "erebus.dryScree");		  
		//GameRegistry.registerBlock(screeBricks, "erebus.screeBricks");		  
		GameRegistry.registerBlock(hollowLogAcacia, "erebus.hollowLogAcacia");		  
		//GameRegistry.registerBlock(maggotLogAcacia, "erebus.maggotLogAcacia");		  
		//GameRegistry.registerBlock(stairsMahogany);		  
		//GameRegistry.registerBlock(stairsEucalyptus);
		GameRegistry.registerBlock(umberstone, ItemMultiBlock.class, "erebus.umberstone");		  
		GameRegistry.registerBlock(umberOreBlock, ItemMultiBlock.class, "erebus.oreBlockU");		  	  
		GameRegistry.registerBlock(bambooCrate, ItemMultiBlock.class, "erebus.bamboo");
		GameRegistry.registerBlock(redGem, ItemMultiBlock.class, "erebus.redGem");
		GameRegistry.registerBlock(logErebus, ItemMultiBlock.class, "erebus.logErebus");
		GameRegistry.registerBlock(planksErebus, ItemMultiBlock.class, "erebus.planksErebus");
		
		//Block Mining Levels
		MinecraftForge.setBlockHarvestLevel(blockAmber, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(cobbleWebbed, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(oreFossil, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(mirBrick, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(screeBricks, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(umberOreBlock, 0, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(umberOreBlock, 3, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(umberOreBlock, 4, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(umberOreBlock, 5, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(umberOreBlock, 1, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(umberOreBlock, 2, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(umberOreBlock, 5, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(quickSand, "shovel", 1);
		MinecraftForge.setBlockHarvestLevel(dryScree, "shovel", 0);
	}
}
