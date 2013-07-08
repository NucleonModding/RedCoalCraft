package nucleon.redcoalcraft.LazerEffect;

import net.minecraft.util.MovingObjectPosition;
import nucleon.redcoalcraft.entity.EntityLaserBeam;

public class RedCoalLaserEffect extends LaserEffect {

	public RedCoalLaserEffect(int ID, int red, int green, int blue, String name) {
		super(ID, red, green, blue, name);
		lore.add("This capsule does contain");
		lore.add("laser fuel however it has");
		lore.add("no effect. To make it");
		lore.add("have an effect craft it");
		lore.add("with more matirials.");
		
	}
	@Override
	public void onImpact(MovingObjectPosition movingobjectposition , EntityLaserBeam laserbeam)
	{
		laserbeam.setDead();
	}

}
