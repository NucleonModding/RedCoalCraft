package nucleon.redcoalcraft.entity;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentThorns;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet70GameEvent;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityLaser extends EntityThrowable
{
	public EntityLaser(World par1World)
	   {
	       super(par1World);
	   }
	   public EntityLaser(World par1World, EntityLiving par2EntityLiving)
	   {
	       super(par1World, par2EntityLiving);
	   }
	   public EntityLaser(World par1World, double par2, double par4, double par6)
	   {
	       super(par1World, par2, par4, par6);
	   }
	   /**
	    * Called when this EntityThrowable hits a block or entity.
	    */
	   protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
	   {

	       if (!this.worldObj.isRemote)
	       {
	    	   this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)1, true);
	           this.setDead();
	       }
	   }
	   @Override
	   protected float getGravityVelocity()
	    {
	        return 0.00F;
	    }
}
