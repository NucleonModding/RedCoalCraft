package nucleon.redcoalcraft.Regs;

import net.minecraft.item.Item;
import nucleon.redcoalcraft.Item.BaseItem;



public class RegItems {

	public static Item rawRedCoal;
	public static void Register()
	{
		rawRedCoal = new BaseItem(5000, "rawRedCoal");
	}

}
