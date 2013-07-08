package nucleon.redcoalcraft.LazerEffect;

import net.minecraft.entity.item.EntityFallingSand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovingObjectPosition;
import nucleon.redcoalcraft.entity.EntityLaserBeam;

public class ESlabEffect extends LaserEffect{

	public ESlabEffect(int ID, int red, int green, int blue,
			String name) {
		super(ID, red, green, blue, name);
		lore.add("This capsule contains some");
		lore.add("incredible laser fuel that");
		lore.add("causes an anvil to drop on");
		lore.add("the nearest players head.");
	}
	@Override
	public void onImpact(MovingObjectPosition movingobjectposition , EntityLaserBeam laserbeam)
	{
		
		EntityPlayer player = laserbeam.worldObj.getClosestPlayerToEntity(laserbeam, 32);
		if(player != null)
		{
			laserbeam.worldObj.setBlock((int)(player.posX - 1) , (int)(player.posY + 20.5), (int)(player.posZ), 145);
		}
		
		laserbeam.setDead();
	}

}
