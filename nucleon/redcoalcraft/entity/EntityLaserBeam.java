package nucleon.redcoalcraft.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import nucleon.redcoalcraft.LazerEffect.LaserEffect;

public class EntityLaserBeam extends EntityThrowable{
	public int type;
	  private int lifeTime;

	public EntityLaserBeam(World par1World)
	   {
	       super(par1World);
	       lifeTime = 0;
	   }
	   public EntityLaserBeam(World par1World, EntityLiving par2EntityLiving )
	   {
	       super(par1World, par2EntityLiving );
	       lifeTime = 0;
	   }
	   public EntityLaserBeam(World par1World, EntityLiving par2EntityLiving , int type )
	   {
		   
	       super(par1World, par2EntityLiving );
	       this.type = type;
	       lifeTime = 0;
		   this.dataWatcher.updateObject(30,this.type);

	   }
	   public EntityLaserBeam(World par1World, double par2, double par4, double par6)
	   {
	       super(par1World, par2, par4, par6);
	   }
	   public int getType()
	   {
		   return type;
	   }
	   @Override
	   public void onUpdate()
	   {

			  super.onUpdate();
		  if(!this.worldObj.isRemote)
		  {
			  lifeTime++;
			  if(lifeTime > 500)
			  {
				  this.setDead();
			  }
		  }
		  
	   }

	   @Override
	    protected void entityInit()
	    {
	    super.entityInit();
	       this.dataWatcher.addObject(30,this.type);
	    
	    }

		   
	   
	   @Override
	   protected void onImpact(MovingObjectPosition movingobjectposition)
	   {
		  LaserEffect.lazerEffectList[type].onImpact(movingobjectposition, this);
		   
	   }
	   @Override
	   protected float getGravityVelocity()
	   {
		   return LaserEffect.lazerEffectList[type].getGravityVelocity();
	   }
	   @Override
	   public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	   {

		   super.writeEntityToNBT(par1NBTTagCompound);
		   par1NBTTagCompound.setInteger("laserType", type);
		   par1NBTTagCompound.setInteger("lifeTime", lifeTime);
	   }
	   @Override
	   public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	   {

		   super.readEntityFromNBT(par1NBTTagCompound);
		   this.type = par1NBTTagCompound.getInteger("laserType");
		   this.lifeTime = par1NBTTagCompound.getInteger("lifeTime");
		   this.dataWatcher.updateObject(30,this.type);

	   }
	   
}
