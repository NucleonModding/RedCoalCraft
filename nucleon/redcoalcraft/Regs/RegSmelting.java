package nucleon.redcoalcraft.Regs;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegSmelting {
	public static void Register(FMLInitializationEvent event)
	{
	
		GameRegistry.addSmelting(RegItems.rawRedCoal.itemID, new ItemStack(RegItems.RedCoal , 8), 0.1f);
		
	}
}
