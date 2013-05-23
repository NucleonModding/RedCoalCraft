package nucleon.redcoalcraft.Regs;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;
import nucleon.redcoalcraft.Item.BaseItem;



public class RegItems {

	public static Item rawRedCoal;
	public static Item redCoal;
	public static Item redCoalCapsule;
	public static void Register(FMLInitializationEvent event)
	{
		rawRedCoal = new BaseItem(Config.itemIDStartRange + 0 + 0, "rawRedCoal");
		redCoal = new BaseItem(Config.itemIDStartRange + 1 + 0, "redCoal");
		redCoalCapsule = new BaseItem(Config.itemIDStartRange + 2 + 0, "redCoalCapsule");
		
	}

}
