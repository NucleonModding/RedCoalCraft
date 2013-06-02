package nucleon.redcoalcraft.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityLaser extends EntityArrow implements IProjectile
{

	public EntityLaser(World par1World) {
		super(par1World);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void setThrowableHeading(double d0, double d1, double d2, float f,
			float f1) {
		// TODO Auto-generated method stub
		
	}


	

}
