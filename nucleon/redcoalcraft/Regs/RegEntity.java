package nucleon.redcoalcraft.Regs;

import nucleon.redcoalcraft.entity.EntityLaserBeam;
import nucleon.redcoalcraft.libs.Resources;
import nucleon.redcoalcraft.RedCoalCraft;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

public class RegEntity {
	public static void Register(FMLInitializationEvent event, Object RedCoalCraft)
	{
		
		EntityRegistry.registerGlobalEntityID(EntityLaserBeam.class, "laser", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityLaserBeam.class, "laser", 0, RedCoalCraft, 1024, 1, true);
		
	}

}
