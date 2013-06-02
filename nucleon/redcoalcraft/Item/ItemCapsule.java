package nucleon.redcoalcraft.Item;

import java.util.List;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import nucleon.redcoalcraft.LazerEffect.LaserEffect;
import nucleon.redcoalcraft.Regs.RegItems;

public class ItemCapsule extends BaseItem{

	public ItemCapsule(int ID, String name) {
		super(ID, name);
		setHasSubtypes(true);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	 {
		par3List.addAll(LaserEffect.lazerEffectList[par1ItemStack.getItemDamage()].lore);
	 }
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		
			ItemStack[] inv =par3EntityPlayer.inventory.mainInventory;
			boolean done = false;
			if(par1ItemStack.getItemDamage() != 0)
			{
			for( int n = 0; n <= inv.length -1 ; n++)
			{
				System.out.println("Looking");
				if(inv[n] != null)
				{
				if(inv[n].itemID == RegItems.laserGun.itemID && !done)
				{
					done = true;
					inv[n].stackTagCompound.setInteger("laserFuelType", par1ItemStack.getItemDamage());
					inv[n].setItemDamage(0);
					--par1ItemStack.stackSize;

                    if (par1ItemStack.stackSize <= 0)
                    {
                        return new ItemStack(RegItems.redCoalCapsule);
                    }
	                    else if(!par2World.isRemote)
					{
						
						
						if (!par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RegItems.redCoalCapsule)))
	                    {
	                        par3EntityPlayer.dropPlayerItem(new ItemStack(RegItems.redCoalCapsule.itemID, 1, 0));
	                    }
						
						
					}
				}
				}
			
		}
		}
		return par1ItemStack;
    
    }
}
