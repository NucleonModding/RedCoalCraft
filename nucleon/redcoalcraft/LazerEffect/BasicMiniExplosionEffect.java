package nucleon.redcoalcraft.LazerEffect;

import net.minecraft.util.MovingObjectPosition;
import nucleon.redcoalcraft.entity.EntityLaserBeam;

public class BasicMiniExplosionEffect extends LaserEffect{

	public BasicMiniExplosionEffect(int ID, int red, int green, int blue,
			String name) {
		super(ID, red, green, blue, name);
		lore.add("This capsule contains some");
		lore.add("gunpowder so it will");
		lore.add("produce a small explosion");
		lore.add("that will damage some blocks.");
	}
	@Override
	public void onImpact(MovingObjectPosition movingobjectposition , EntityLaserBeam laserbeam)
	{
		if(!laserbeam.worldObj.isRemote)
		{
			laserbeam.worldObj.createExplosion(laserbeam, laserbeam.posX, laserbeam.posY, laserbeam.posZ, (float) 0.8, true);
		}
		laserbeam.setDead();
	}

}
