package nucleon.redcoalcraft.Item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import nucleon.redcoalcraft.entity.EntityLaserBeem;

public class ItemLaser extends BaseItem{

	public ItemLaser(int ID, String name) {
		super(ID, name);
		setMaxDamage(8);
		// TODO Auto-generated constructor stub
	}
	
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        if( par1ItemStack.stackTagCompound == null )
            par1ItemStack.setTagCompound( new NBTTagCompound( ) );
		par1ItemStack.stackTagCompound.setInteger("laserFuelType", 1);
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		if( par1ItemStack.stackTagCompound == null )
		{
            par1ItemStack.setTagCompound( new NBTTagCompound( ) );
            par1ItemStack.stackTagCompound.setInteger("laserFuelType", 1);
		}
		if(par1ItemStack.stackTagCompound.getInteger("laserFuelType") != 0)
		{
		System.out.println("right clicked");
		par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() + 1);
			if(par1ItemStack.getItemDamage() >= 8)
			{
				//par1ItemStack.setItemDamage(0);
				par1ItemStack.stackTagCompound.setInteger("laserFuelType", 0);
			}


          
			
               
			 par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

            if (!par2World.isRemote)
            {
                
                    par2World.spawnEntityInWorld(new EntityLaserBeem(par2World, par3EntityPlayer));
                
            }
				
			
		}
		return par1ItemStack;
		
	}

}
