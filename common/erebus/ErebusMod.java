package erebus;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.block.BlockLogErebus;
import erebus.block.BlockPlanksErebus;
import erebus.client.sound.EntityBeetleLarvaNoises;
import erebus.client.sound.EntityBlackWidowNoises;
import erebus.client.sound.EntityCentipedeNoises;
import erebus.client.sound.EntityFlyNoises;
import erebus.client.sound.EntityMosquitoNoises;
import erebus.client.sound.EntityWaspNoises;
import erebus.core.handler.CommonTickHandler;
import erebus.core.handler.ConfigurationHandler;
import erebus.core.handler.ConnectionTeleportHandler;
import erebus.core.handler.LocalizationHandler;
import erebus.core.helper.LogHelper;
import erebus.core.proxy.CommonProxy;
import erebus.creativetab.CreativeTabErebusBlock;
import erebus.creativetab.CreativeTabErebusGear;
import erebus.creativetab.CreativeTabErebusItem;
import erebus.lib.Reference;
import erebus.network.PacketHandler;
import erebus.recipes.RecipePaxel;
import erebus.tileentity.TileEntityBamboo;
import erebus.tileentity.TileEntityCaveSpiderSpawner;
import erebus.tileentity.TileEntityHollowLog;
import erebus.tileentity.TileEntitySpiderSpawner;
import erebus.world.WorldProviderErebus;

/**
 * @author ProPercivalalb, Dylan4Ever, (Others PUT NAMES HERE)
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, dependencies = Reference.MOD_DEPENDENCIES)
@NetworkMod(channels = {Reference.CHANNEL}, clientSideRequired = true, serverSideRequired = true, packetHandler = PacketHandler.class)
public class ErebusMod
{	
	@SidedProxy(clientSide = Reference.SP_CLIENT, serverSide = Reference.SP_SERVER)
	public static CommonProxy proxy; //This object will be populated with the class that you choose for the environment
	@Instance(Reference.MOD_ID)
	public static ErebusMod instance; //The instance of the mod that will be defined, populated, and callable

	public static EnumArmorMaterial armorEXOSKELETON = EnumHelper.addArmorMaterial("EXOSKELETON", 11, new int[] {2, 4, 3, 2}, 15);
	public static EnumArmorMaterial armorJADE = EnumHelper.addArmorMaterial("JADE", 24, new int[] {3, 7, 5, 2}, 15);
	public static EnumToolMaterial toolJADE = EnumHelper.addToolMaterial("JADE", 2, 863, 10.0F, 4.0F, 18);
	public static EnumToolMaterial toolJADEPAXEL = EnumHelper.addToolMaterial("JADEPAXEL", 2, 1079, 8.0F, 4.0F, 14);
    
	public static CreativeTabs tabErebusBlock = new CreativeTabErebusBlock(CreativeTabs.getNextID(), "erebus.block");
	public static CreativeTabs tabErebusItem = new CreativeTabErebusItem(CreativeTabs.getNextID(), "erebus.item");
	public static CreativeTabs tabErebusGear = new CreativeTabErebusGear(CreativeTabs.getNextID(), "erebus.gear");

	public static int erebusDimensionID;

	public static ConnectionTeleportHandler packeterebushandler = new ConnectionTeleportHandler();
	
	// This method is used to add sounds
	@EventHandler
	@SideOnly(Side.CLIENT)
	public void preInitClient(FMLPreInitializationEvent event) {
		// Create an Entity 'sound' class as below and this will add sounds to the pool
		MinecraftForge.EVENT_BUS.register(new EntityBeetleLarvaNoises());
		MinecraftForge.EVENT_BUS.register(new EntityWaspNoises());
		MinecraftForge.EVENT_BUS.register(new EntityFlyNoises());
		MinecraftForge.EVENT_BUS.register(new EntityCentipedeNoises());
		MinecraftForge.EVENT_BUS.register(new EntityMosquitoNoises());
		MinecraftForge.EVENT_BUS.register(new EntityBlackWidowNoises());
	}
	
	@EventHandler
	public void preInitServer(FMLPreInitializationEvent event)  {
		
		/** Loads the configuration file before anything else **/
		ConfigurationHandler.loadConfig(event);
		
		//Loads the Languages into the game
		LocalizationHandler.loadLanguages();
		
		//Sets up the log helper
		LogHelper.init();
		
		//Adds Erebus blocks & items
		ModBlocks.init();
		ModItems.init();
		ModEntities.init();
		
		NetworkRegistry.instance().registerConnectionHandler(packeterebushandler);
		NetworkRegistry.instance().registerGuiHandler(instance, proxy);
		
		DimensionManager.registerProviderType(erebusDimensionID, WorldProviderErebus.class, true);
		DimensionManager.registerDimension(erebusDimensionID, erebusDimensionID);
		//VillagerRegistry.addExtraVillageComponents(ComponentVillageWatchtower.class, 20, MathHelper.getRandomIntegerInRange(par0Random, 0 + par1, 1 + par1));
	}

	@EventHandler  
	public void load(FMLInitializationEvent event) {
		ModBiomes.init();
    
		GameRegistry.addRecipe(new ItemStack(ModItems.erebusMaterials, 1, 5), new Object[] {"GGG", "GEG", "GGG", 'G', new ItemStack(ModBlocks.blockAmber, 1, 1), 'E', new ItemStack(ModItems.erebusMaterials, 1, 4)}); 
		GameRegistry.addRecipe(new ItemStack(ModItems.compoundGoggles, 1), new Object[] {"XXX", "OXO", "   ", 'O', new ItemStack(ModItems.erebusMaterials, 1, 5), 'X', new ItemStack(ModItems.erebusMaterials, 1, 0)});  
		
		GameRegistry.addRecipe(new ItemStack(ModItems.exoskeletonHelmet, 1), new Object[] {"sss", "s s", "   ", 's', new ItemStack(ModItems.erebusMaterials, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(ModItems.exoskeletonBody, 1), new Object[] {"s s", "sss", "sss", 's', new ItemStack(ModItems.erebusMaterials, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(ModItems.exoskeletonLegs, 1), new Object[] {"sss", "s s", "s s", 's', new ItemStack(ModItems.erebusMaterials, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(ModItems.exoskeletonBoots, 1), new Object[] {"   ", "s s", "s s", 's', new ItemStack(ModItems.erebusMaterials, 1, 0)});  
		GameRegistry.addRecipe(new ItemStack(ModItems.bamBucket, 1, 0), new Object[] {"S", "B", 'S', Item.silk, 'B', new ItemStack(ModItems.erebusMaterials, 1, 0)});  
		
		//Jade tools
		GameRegistry.addRecipe(new ItemStack(ModItems.jadePickaxe, 1), new Object[] {"XXX", " # ", " # ", '#', Item.stick, 'X', new ItemStack(ModItems.erebusMaterials, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeShovel, 1), new Object[] {"X", "#", "#", '#', Item.stick, 'X', new ItemStack(ModItems.erebusMaterials, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeAxe, 1), new Object[] {"XX", "X#", " #", '#', Item.stick, 'X', new ItemStack(ModItems.erebusMaterials, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeHoe, 1), new Object[] {"XX", " #", " #", '#', Item.stick, 'X', new ItemStack(ModItems.erebusMaterials, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeSword, 1), new Object[] {"X", "X", "#", '#', Item.stick, 'X', new ItemStack(ModItems.erebusMaterials, 1, 1)});
		GameRegistry.addRecipe(new RecipePaxel());
		
		//Stone tools made from umberstone
		GameRegistry.addRecipe(new ItemStack(Item.pickaxeStone, 1), new Object[] {"XXX", " # ", " # ", '#', Item.stick, 'X', new ItemStack(ModBlocks.umberstone, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(Item.shovelStone, 1), new Object[] {"X", "#", "#", '#', Item.stick, 'X', new ItemStack(ModBlocks.umberstone, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(Item.axeStone, 1), new Object[] {"XX", "X#", " #", '#', Item.stick, 'X', new ItemStack(ModBlocks.umberstone, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(Item.hoeStone, 1), new Object[] {"XX", " #", " #", '#', Item.stick, 'X', new ItemStack(ModBlocks.umberstone, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(Item.swordStone, 1), new Object[] {"X", "X", "#", '#', Item.stick, 'X', new ItemStack(ModBlocks.umberstone, 1, 1)});

		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSilk, 1), new Object[] {"sss", "sss", "sss", 's', Item.silk});  
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockAmber, 4, 2), new Object[] {"ss", "ss", 's', new ItemStack(ModBlocks.blockAmber, 1, 0)});  
		GameRegistry.addRecipe(new ItemStack(ModBlocks.planksErebus, 4, BlockPlanksErebus.dataMahogany), new Object[] { "#", '#', new ItemStack(ModBlocks.logErebusGroup1, 1, BlockLogErebus.dataMahogany) });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.planksErebus, 4, BlockPlanksErebus.dataEucalyptus), new Object[] { "#", '#', new ItemStack(ModBlocks.logErebusGroup1, 1, BlockLogErebus.dataEucalyptus) });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.planksErebus, 4, BlockPlanksErebus.dataAcacia), new Object[] { "#", '#', new ItemStack(ModBlocks.logErebusGroup1, 1, BlockLogErebus.dataAcacia) });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.planksErebus, 4, BlockPlanksErebus.dataBaobab), new Object[] { "#", '#', new ItemStack(ModBlocks.logErebusGroup1, 1, BlockLogErebus.dataBaobab) });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.planksErebus, 4, BlockPlanksErebus.dataMossbark), new Object[] { "#", '#', new ItemStack(ModBlocks.logErebusGroup2, 1, BlockLogErebus.dataMossbark) });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.planksErebus, 4, BlockPlanksErebus.dataPink), new Object[] { "#", '#', new ItemStack(ModBlocks.logErebusGroup2, 1, BlockLogErebus.dataPink) });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.planksErebus, 4, BlockPlanksErebus.dataScorched), new Object[] { "#", '#', new ItemStack(ModBlocks.logErebusGroup2, 1, BlockLogErebus.dataScorched) });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stairsMahogany, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(ModBlocks.planksErebus, 1, BlockLogErebus.dataMahogany) });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stairsEucalyptus, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(ModBlocks.planksErebus, 1, BlockLogErebus.dataEucalyptus) });
		GameRegistry.addRecipe(new ItemStack(ModItems.portalActivator, 1), new Object[] {"  O", " / ", "/  ", 'O', new ItemStack(Item.spiderEye), '/', new ItemStack(Item.stick)});
		GameRegistry.addRecipe(new ItemStack(Item.silk, 9), new Object[] {"#", '#', new ItemStack(ModBlocks.blockSilk)});  
		GameRegistry.addRecipe(new ItemStack(Item.dyePowder, 1, 15), new Object[] {"#", '#', new ItemStack(ModItems.erebusMaterials, 1, 2)});  
		GameRegistry.addRecipe(new ItemStack(Item.dyePowder, 6, 15), new Object[] {"#", '#', new ItemStack(ModItems.fossilClub, 1, 0)});  
		GameRegistry.addRecipe(new ItemStack(Item.arrow, 4), new Object[] {"T", "S", "F", 'F', new ItemStack(Item.feather, 1, 0), 'S', new ItemStack(Item.stick, 1, 0), 'T', new ItemStack(ModItems.erebusMaterials, 1, 2)});  
		GameRegistry.addRecipe(new ItemStack(ModBlocks.screeBricks, 4), new Object[] {"ss", "ss", 's', ModBlocks.dryScree});  
		GameRegistry.addRecipe(new ItemStack(Item.arrow, 4), new Object[] {"T", "S", "F", 'F', new ItemStack(ModItems.erebusMaterials, 1, 6), 'S', new ItemStack(Item.stick, 1, 0), 'T', new ItemStack(ModItems.erebusMaterials, 1, 2)});  
		GameRegistry.addRecipe(new ItemStack(Item.arrow, 4), new Object[] {"T", "S", "F", 'F', new ItemStack(ModItems.erebusMaterials, 1, 6), 'S', new ItemStack(Item.stick, 1, 0), 'T', new ItemStack(Item.flint, 1, 0)});  

		FurnaceRecipes.smelting().addSmelting(ModBlocks.blockAmber.blockID, 0, new ItemStack(ModBlocks.blockAmber, 1, 1), 0.3F);
		FurnaceRecipes.smelting().addSmelting(ModItems.erebusFood.itemID, 0, new ItemStack(ModItems.erebusFood, 1, 1), 0.2F);
		FurnaceRecipes.smelting().addSmelting(ModItems.erebusFood.itemID, 2, new ItemStack(ModItems.erebusFood, 1, 3), 0.2F);
		FurnaceRecipes.smelting().addSmelting(ModItems.erebusFood.itemID, 4, new ItemStack(ModItems.erebusFood, 1, 5), 0.2F);
		FurnaceRecipes.smelting().addSmelting(ModBlocks.umberstone.blockID, 1, new ItemStack(ModBlocks.umberstone, 1), 0.2F);

		OreDictionary.registerOre("blockCobble", new ItemStack(ModBlocks.umberstone, 1, 1));
		OreDictionary.registerOre("logWood", new ItemStack(ModBlocks.logErebusGroup1, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("logWood", new ItemStack(ModBlocks.logErebusGroup2, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("plankWood", new ItemStack(ModBlocks.planksErebus, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("treeSapling", new ItemStack(ModBlocks.erebusSapling, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("treeLeaves",  new ItemStack(ModBlocks.leavesErebus, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("oreGold_U", new ItemStack(ModBlocks.umberOreBlock, 1, 2));
		OreDictionary.registerOre("oreIron_U", new ItemStack(ModBlocks.umberOreBlock, 1, 1));
		OreDictionary.registerOre("oreLapis_U", new ItemStack(ModBlocks.umberOreBlock, 1, 3));
		OreDictionary.registerOre("oreDiamond_U", new ItemStack(ModBlocks.umberOreBlock, 1, 4));
		OreDictionary.registerOre("oreEmerald_U", new ItemStack(ModBlocks.umberOreBlock, 1, 5));

		proxy.registerRenderInformation();
		
		GameRegistry.registerTileEntity(TileEntitySpiderSpawner.class, "Spider Spawner (Erebus)");
		GameRegistry.registerTileEntity(TileEntityCaveSpiderSpawner.class, "Cave Spider Spawner (Erebus)");
		GameRegistry.registerTileEntity(TileEntityHollowLog.class, "Hollow Log (Erebus)");
		GameRegistry.registerTileEntity(TileEntityBamboo.class, "Bamboo Crate (Erebus)");

		TickRegistry.registerTickHandler(new CommonTickHandler(), Side.SERVER);
	}
}


/*
@ForgeSubscribe
public void onUseBonemeal(BonemealEvent event)
{
	  MinecraftForge.EVENT_BUS.post(event);
	  if (event.ID == mod_Erebus.erebusSapling.blockID)
    {
        if (!event.world.isRemote)
        {
            if ((double)event.world.rand.nextFloat() < 0.45D)
            {
                ((BlockSaplingErebus)mod_Erebus.erebusSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
            }
        }
    }
}*/