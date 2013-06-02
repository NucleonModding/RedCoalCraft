package nucleon.redcoalcraft.Regs;

import nucleon.redcoalcraft.entity.EntityLaser;
import nucleon.redcoalcraft.libs.Resources;
import nucleon.redcoalcraft.RedCoalCraft;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

public class RegEntity {
	public static void Register(FMLInitializationEvent event)
	{
		EntityRegistry.registerGlobalEntityID(EntityLaser.class, "laser", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityLaser.class, "laser", 0, RedCoalCraft.instance, 128, 1, true);
	}

}
