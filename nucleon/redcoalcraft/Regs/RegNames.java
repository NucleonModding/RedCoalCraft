package nucleon.redcoalcraft.Regs;

import nucleon.redcoalcraft.RedCoalCraft;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class RegNames {
	public static void Register(FMLInitializationEvent event)
	{
		LanguageRegistry.addName(RegItems.rawRedCoal, "Raw Red Coal");
		LanguageRegistry.addName(RegItems.redCoal, "Red Coal"); 
		LanguageRegistry.addName(RegItems.redCoalCapsule, "Red Coal Capsule"); 
		LanguageRegistry.addName(RegItems.laserGun, "Laser Gun"); 
		LanguageRegistry.addName(RegItems.coreLens, "Core Lens"); 
		LanguageRegistry.addName(RegItems.directiveLens, "Directive Lens"); 
		LanguageRegistry.addName(RegItems.ironFrame, "Iron Frame"); 
		LanguageRegistry.addName(RegItems.lightEmiter, "Light Emiter"); 
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabRedCoalCraft", "en_US", "Red Coal Craft");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabRedCoalCraft", "en_UK", "Red Coal Craft");
		 LanguageRegistry.instance().addStringLocalization("entity.laser.name", "Laser");
	}
}
