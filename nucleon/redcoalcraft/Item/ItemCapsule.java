package nucleon.redcoalcraft.Item;

import java.util.List;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import nucleon.redcoalcraft.LazerEffect.LaserEffect;
import nucleon.redcoalcraft.Regs.RegItems;

public class ItemCapsule extends BaseItem{

	public ItemCapsule(int ID, String name) {
		super(ID, name);
		setHasSubtypes(true);
	}

	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	 {
		par3List.addAll(LaserEffect.lazerEffectList[par1ItemStack.getItemDamage()].lore);
	 }
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		
			ItemStack[] inv =par3EntityPlayer.inventory.mainInventory;
			boolean done = false;
			
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
					par1ItemStack.stackSize = par1ItemStack.stackSize -1;
					
					par2World.spawnEntityInWorld(new EntityItem(par2World, par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, new ItemStack(RegItems.redCoalCapsule,1)));
				}
				}
			
		}
		return par1ItemStack;
    
    }
}
