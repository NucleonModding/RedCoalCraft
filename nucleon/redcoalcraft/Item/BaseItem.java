package nucleon.redcoalcraft.Item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
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
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack11, World par2World, EntityPlayer par3EntityPlayer)
    {
		return par1ItemStack11;
		
		
		
    }
}
