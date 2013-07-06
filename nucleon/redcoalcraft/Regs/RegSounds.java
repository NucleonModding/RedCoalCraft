package nucleon.redcoalcraft.Regs;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import nucleon.redcoalcraft.RedCoalCraft;

public class RegSounds {
	 @ForgeSubscribe
	   public void onSound(SoundLoadEvent event)
	   {
	       try
	       {
	       		String [] soundFiles = {
	       				"lasershot.wav"
	       		};
	       		for (int i = 0; i < soundFiles.length; i++){
	       			event.manager.soundPoolSounds.addSound(soundFiles[i], RedCoalCraft.class.getResource("/mods/redcoalcraft/sounds/" + soundFiles[i]));
	       		}
	      
	       }
	       catch (Exception e)
	       {
	           System.err.println("Space Marine Mod: Failed to register one or more sounds.");
	       }
	   }

}
