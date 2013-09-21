package erebus.client.sound;

import java.net.URL;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.common.IScheduledTickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.ErebusMod;
import erebus.core.helper.LogHelper;
import erebus.lib.Reference;

@SideOnly(Side.CLIENT)
public class AmbientMusicManager implements IScheduledTickHandler{
	private static AmbientMusicManager instance;
	
	public static void register(){
		instance = new AmbientMusicManager();
		
		MinecraftForge.EVENT_BUS.register(instance);
		TickRegistry.registerScheduledTickHandler(instance,Side.CLIENT);
	}
	
	private SoundManager sndMan;
	private Random rand = new Random();
	private Map<String,URL> poolAmbient = new HashMap<String,URL>();
	
	private AmbientMusicManager(){}
	
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event) {
		String[] ambientMusicList = new String[]{
			"bugInTheSystem.ogg"
		};
		
		instance.sndMan = event.manager;
		
		int loaded = 0;
		URL track;
		
		for(String ambient:ambientMusicList){
			track=getClass().getResource("/assets/erebus/music/ambient_"+ambient);
			if (track==null)continue;
			
			poolAmbient.put("erebus:"+ambient,track);
			++loaded;
		}
		
		LogHelper.logInfo("Loaded "+loaded+" music track(s).");
	}

	@Override
	public void tickStart(EnumSet<TickType> type, Object...tickData){
		if (!sndMan.sndSystem.playing("BgMusic") && rand.nextInt(15) == 0 && ((EntityPlayer)tickData[0]).dimension == ErebusMod.erebusDimensionID){
			List<Entry<String,URL>> entries = new ArrayList<Entry<String,URL>>(poolAmbient.entrySet());
			if (entries.size() == 0) return;
			
			Entry<String,URL> pick = entries.get(rand.nextInt(entries.size()));
			sndMan.sndSystem.backgroundMusic("BgMusic", pick.getValue(), pick.getKey(), false);
			sndMan.sndSystem.setVolume("BgMusic", Minecraft.getMinecraft().gameSettings.musicVolume);
			sndMan.sndSystem.play("BgMusic");
		}
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object...tickData){}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.PLAYER);
	}

	@Override
	public String getLabel() {
		return Reference.MOD_NAME + ": " + getClass().getSimpleName();
	}

	@Override
	public int nextTickSpacing(){
		return 200;
	}
}
