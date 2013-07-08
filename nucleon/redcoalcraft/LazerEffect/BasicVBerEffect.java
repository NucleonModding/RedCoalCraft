package nucleon.redcoalcraft.LazerEffect;

import java.util.Iterator;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import nucleon.redcoalcraft.entity.EntityLaserBeam;

public class BasicVBerEffect extends LaserEffect{

	public BasicVBerEffect(int ID, int red, int green, int blue,
			String name) {
		super(ID, red, green, blue, name);
		lore.add("This famous and odd laser");
		lore.add("fuel will cause people to");
		lore.add("get blasted very high in");
		lore.add("in the air. Thus probably");
		lore.add("killing the via fall damage.");
	}
	@Override
	public void onImpact(MovingObjectPosition movingobjectposition , EntityLaserBeam laserbeam)
	{
		if(!laserbeam.worldObj.isRemote)
		{
			 AxisAlignedBB axisalignedbb = laserbeam.boundingBox.expand(4.0D, 4.0D, 4.0D);
             List list1 = laserbeam.worldObj.getEntitiesWithinAABB(Entity.class, axisalignedbb);

             if (list1 != null && !list1.isEmpty())
             {
                 Iterator iterator = list1.iterator();

                 while (iterator.hasNext())
                 {
                     Entity entity = (Entity) iterator.next();
                     double d0 = laserbeam.getDistanceSqToEntity(entity);
                     System.out.println(entity.toString());
                     if (d0 < 16.0D)
                     {
                    	 entity.addVelocity(0, 2.5, 0);
                    	 if(entity instanceof EntityPlayerMP)
                    	 {
                    		 ((EntityPlayerMP)entity).velocityChanged = true;
                    	 }
                        
                     }
                 }
		}
		laserbeam.setDead();
	}
	}

}
