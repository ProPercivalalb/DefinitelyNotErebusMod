package erebus.world;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.WorldTypeEvent;
import erebus.ModBiomes;
import erebus.world.genlayer.GenLayerErebus;

public class WorldChunkManagerErebus extends WorldChunkManager {

	private final float hellTemperature;
	private final List biomesToSpawnIn;
	public static ArrayList<BiomeGenBase> allowedBiomes = new ArrayList<BiomeGenBase>(Arrays.asList(ModBiomes.underjungle, ModBiomes.undersavannah));
	private final BiomeCache biomeCache;
	private final GenLayer biomeIndexLayer;
	private final GenLayer genBiomes;

	private final float rainfall;

	public WorldChunkManagerErebus(float par2, float par3, World world) {
		biomesToSpawnIn = new ArrayList(allowedBiomes);
		hellTemperature = par2;
		rainfall = par3;
		biomeCache = new BiomeCache(this);
		GenLayer[] var4 = GenLayerErebus.initializeAllBiomeGenerators(world.getSeed(), world.getWorldInfo().getTerrainType());
		var4 = getModdedBiomeGenerators(world.getWorldInfo().getTerrainType(), world.getSeed(), var4);
		genBiomes = var4[0];
		biomeIndexLayer = var4[1];
	}

	@Override
	public BiomeGenBase getBiomeGenAt(int par1, int par2) {
		return biomeCache.getBiomeGenAt(par1, par2);
	}

	@Override
	public BiomeGenBase[] getBiomesForGeneration(BiomeGenBase par1ArrayOfBiomeGenBase[], int par2, int par3, int par4, int par5) {
		IntCache.resetIntCache();

		if (par1ArrayOfBiomeGenBase == null || par1ArrayOfBiomeGenBase.length < par4 * par5)
			par1ArrayOfBiomeGenBase = new BiomeGenBase[par4 * par5];

		int[] var6 = genBiomes.getInts(par2, par3, par4, par5);

		for (int var7 = 0; var7 < par4 * par5; ++var7)
			par1ArrayOfBiomeGenBase[var7] = BiomeGenBase.biomeList[var6[var7]];

		return par1ArrayOfBiomeGenBase;
	}

	@Override
	public float[] getTemperatures(float par1ArrayOfFloat[], int par2, int par3, int par4, int par5) {
		if (par1ArrayOfFloat == null || par1ArrayOfFloat.length < par4 * par5)
			par1ArrayOfFloat = new float[par4 * par5];

		Arrays.fill(par1ArrayOfFloat, 0, par4 * par5, hellTemperature);
		return par1ArrayOfFloat;
	}

	@Override
	public float[] getRainfall(float par1ArrayOfFloat[], int par2, int par3, int par4, int par5) {
		if (par1ArrayOfFloat == null || par1ArrayOfFloat.length < par4 * par5)
			par1ArrayOfFloat = new float[par4 * par5];

		Arrays.fill(par1ArrayOfFloat, 0, par4 * par5, rainfall);
		return par1ArrayOfFloat;
	}

	@Override
	public BiomeGenBase[] loadBlockGeneratorData(BiomeGenBase par1ArrayOfBiomeGenBase[], int par2, int par3, int par4, int par5) {
		return this.getBiomeGenAt(par1ArrayOfBiomeGenBase, par2, par3, par4, par5, true);
	}

	@Override
	public BiomeGenBase[] getBiomeGenAt(BiomeGenBase[] par1ArrayOfBiomeGenBase, int par2, int par3, int par4, int par5, boolean par6) {
		IntCache.resetIntCache();

		if (par1ArrayOfBiomeGenBase == null || par1ArrayOfBiomeGenBase.length < par4 * par5)
			par1ArrayOfBiomeGenBase = new BiomeGenBase[par4 * par5];

		if (par6 && par4 == 16 && par5 == 16 && (par2 & 15) == 0 && (par3 & 15) == 0) {
			BiomeGenBase[] var9 = biomeCache.getCachedBiomes(par2, par3);
			System.arraycopy(var9, 0, par1ArrayOfBiomeGenBase, 0, par4 * par5);
			return par1ArrayOfBiomeGenBase;
		} else {
			int[] var7 = biomeIndexLayer.getInts(par2, par3, par4, par5);
			for (int var8 = 0; var8 < par4 * par5; ++var8)
				par1ArrayOfBiomeGenBase[var8] = BiomeGenBase.biomeList[var7[var8]];

			return par1ArrayOfBiomeGenBase;
		}
	}

	@Override
	public ChunkPosition findBiomePosition(int par1, int par2, int par3, List par4List, Random rand) {
		IntCache.resetIntCache();
		int var6 = par1 - par3 >> 2;
		int var7 = par2 - par3 >> 2;
		int var8 = par1 + par3 >> 2;
		int var9 = par2 + par3 >> 2;
		int var10 = var8 - var6 + 1;
		int var11 = var9 - var7 + 1;
		int[] var12 = genBiomes.getInts(var6, var7, var10, var11);
		ChunkPosition var13 = null;
		int var14 = 0;

		for (int var15 = 0; var15 < var10 * var11; ++var15) {
			int var16 = var6 + var15 % var10 << 2;
			int var17 = var7 + var15 / var10 << 2;
			BiomeGenBase var18 = BiomeGenBase.biomeList[var12[var15]];

			if (par4List.contains(var18) && (var13 == null || rand.nextInt(var14 + 1) == 0)) {
				var13 = new ChunkPosition(var16, 0, var17);
				++var14;
			}
		}

		return var13;
	}

	@Override
	public boolean areBiomesViable(int par1, int par2, int par3, List par4List) {
		IntCache.resetIntCache();
		int var5 = par1 - par3 >> 2;
		int var6 = par2 - par3 >> 2;
		int var7 = par1 + par3 >> 2;
		int var8 = par2 + par3 >> 2;
		int var9 = var7 - var5 + 1;
		int var10 = var8 - var6 + 1;
		int[] var11 = genBiomes.getInts(var5, var6, var9, var10);

		for (int var12 = 0; var12 < var9 * var10; ++var12) {
			BiomeGenBase var13 = BiomeGenBase.biomeList[var11[var12]];

			if (!par4List.contains(var13))
				return false;
		}

		return true;
	}

	@Override
	public List getBiomesToSpawnIn() {
		return biomesToSpawnIn;
	}

	@Override
	public void cleanupCache() {
		biomeCache.cleanupCache();
	}

	@Override
	public GenLayer[] getModdedBiomeGenerators(WorldType worldType, long seed, GenLayer[] original) {
		WorldTypeEvent.InitBiomeGens event = new WorldTypeEvent.InitBiomeGens(worldType, seed, original);
		MinecraftForge.TERRAIN_GEN_BUS.post(event);
		return event.newBiomeGens;
	}
}
