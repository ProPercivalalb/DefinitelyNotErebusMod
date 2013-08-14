package erebus.core.handler;

import java.util.EnumSet;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import erebus.ErebusMod;
import erebus.world.TeleporterErebus;

public class CommonTickHandler implements ITickHandler
{
	public boolean genLairNextTick = false;
	private int ticksToGo = 5;
	
            public EnumSet ticks()
            {
                return EnumSet.of(TickType.SERVER, TickType.PLAYER, TickType.WORLD);
            }

            public String getLabel()
            {
                return null;
            }
            
        	private int HypothermiaTimer = 0;

            private void onTickInGame() 
            {
            
            }

			@Override
			public void tickStart(EnumSet<TickType> type, Object... tickData) {
				// TODO Auto-generated method stub
				
			}
			
			public void tickEnd(EnumSet<TickType> type, Object... tickData) 
			{
                if(type.equals(EnumSet.of(TickType.SERVER)))
                {
                        onTickInGame();
                }
                if (type.equals(EnumSet.of(TickType.PLAYER)))
		        {
		        	EntityPlayerMP player = (EntityPlayerMP)tickData[0];
		            ErebusMod.instance.packeterebushandler.onTick(player);
		        }
		        else if (type.equals(EnumSet.of(TickType.WORLD)))
		        {
		        	World world = (World)tickData[0];
		        	if(world.provider.dimensionId == ErebusMod.erebusDimensionID) {
		        		TeleporterErebus.TELEPORTER_TO_EREBUS.removeStalePortalLocations(world.getTotalWorldTime());
		        		TeleporterErebus.TELEPORTER_TO_OVERWORLD.removeStalePortalLocations(world.getTotalWorldTime());
		        	}
		        	
		        	if (genLairNextTick) {
		        		ticksToGo--;
		        		if (ticksToGo <= 0) {
		        			
		        		}
		        	}
		        }
			}
}