package nucleon.redcoalcraft.Regs;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;
import nucleon.redcoalcraft.Item.BaseItem;



public class RegBlocks {

	public static Item rawRedCoal;
	public static void Register(FMLInitializationEvent event)
	{
		rawRedCoal = new BaseItem(5000, "rawRedCoal");
	}

}
