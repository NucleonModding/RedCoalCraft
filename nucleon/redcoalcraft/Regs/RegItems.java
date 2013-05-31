package nucleon.redcoalcraft.Regs;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;
import nucleon.redcoalcraft.Item.BaseItem;
import nucleon.redcoalcraft.Item.ItemCapsule;
import nucleon.redcoalcraft.Item.ItemLaser;



public class RegItems {

	public static Item rawRedCoal;
	public static Item redCoal;
	public static Item redCoalCapsule;
	public static Item laserGun;
	public static void Register(FMLInitializationEvent event)
	{
		rawRedCoal = new BaseItem(Config.itemIDStartRange + 0 + 0, "rawRedCoal");
		redCoal = new BaseItem(Config.itemIDStartRange + 1 + 0, "redCoal");
		redCoalCapsule = new ItemCapsule(Config.itemIDStartRange + 2 + 0, "redCoalCapsule");
		laserGun = new ItemLaser(Config.itemIDStartRange + 3 + 0 , "laserGun").setMaxStackSize(1);
		
	}

}
