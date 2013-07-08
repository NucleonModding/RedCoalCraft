package nucleon.redcoalcraft.LazerEffect;

import net.minecraft.util.MovingObjectPosition;
import nucleon.redcoalcraft.entity.EntityLaserBeam;

public class BasicLargeExplosionEffect extends LaserEffect{

	public BasicLargeExplosionEffect(int ID, int red, int green, int blue,
			String name) {
		super(ID, red, green, blue, name);
		lore.add("This capsule contains some");
		lore.add("TNT so it will produce");
		lore.add("a large explosion that");
		lore.add("will damage some blocks.");
	}
	@Override
	public void onImpact(MovingObjectPosition movingobjectposition , EntityLaserBeam laserbeam)
	{
		if(!laserbeam.worldObj.isRemote)
		{
			laserbeam.worldObj.createExplosion(laserbeam, laserbeam.posX, laserbeam.posY, laserbeam.posZ, (float) 4, true);
		}
		laserbeam.setDead();
	}

}
