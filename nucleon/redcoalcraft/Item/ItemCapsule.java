package nucleon.redcoalcraft.Item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import nucleon.redcoalcraft.LazerEffect.LazerEffect;

public class ItemCapsule extends BaseItem{

	public ItemCapsule(int ID, String name) {
		super(ID, name);
		
	}

	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	 {
		par3List.addAll(LazerEffect.lazerEffectList[par1ItemStack.getItemDamage()].lore);
	 }
}
