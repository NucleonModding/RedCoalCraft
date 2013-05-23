package nucleon.redcoalcraft.Regs;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class Config {
	
	private Configuration config;
	public static int blockIDStartRange = 0;
	public static int itemIDStartRange = 0;
	public void Register(FMLPreInitializationEvent event)
	{
		 config = new Configuration(event.getSuggestedConfigurationFile());
		 config.load();
		 blockIDStartRange = config.get(Configuration.CATEGORY_BLOCK, "Block Id Starter", 5000).getInt();
		 itemIDStartRange = config.get(Configuration.CATEGORY_ITEM, "Block Id Starter", 10000).getInt();
         config.save();
	}

}
