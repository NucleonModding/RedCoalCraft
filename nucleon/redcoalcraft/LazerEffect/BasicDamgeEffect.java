package nucleon.redcoalcraft.LazerEffect;

import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import nucleon.redcoalcraft.entity.EntityLaserBeam;

public class BasicDamgeEffect extends LaserEffect{

	public BasicDamgeEffect(int ID, int red, int green, int blue, String name) {
		super(ID, red, green, blue, name);
		lore.add("This particular laser fuel");
		lore.add("is the modt basic laser");
		lore.add("fuel when it come to damage.");
		lore.add("It will do 1 heart of damage.");
		lore.add("It is affected by gravity.");
		
	}
	@Override
	public void onImpact(MovingObjectPosition movingobjectposition , EntityLaserBeam laserbeam)
	{
		if(movingobjectposition.entityHit != null)
		{
			movingobjectposition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(null, laserbeam.getThrower()), 2);
		}
		
		laserbeam.setDead();
		
	}
	@Override
	public float getGravityVelocity()
	{
		   return 0.01f;
	}

}
