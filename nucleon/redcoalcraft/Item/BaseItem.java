package nucleon.redcoalcraft.Item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import nucleon.redcoalcraft.libs.Resources;
import nucleon.redcoalcraft.RedCoalCraft;

public class BaseItem extends Item{

	String name;
	public BaseItem(int ID , String name) {
		super(ID);
		setUnlocalizedName(name);
		setCreativeTab(RedCoalCraft.tabRedCoalCraft);
		this.name = name;
	}

	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon(Resources.MOD_ID + ":"+ name);
	}
}
