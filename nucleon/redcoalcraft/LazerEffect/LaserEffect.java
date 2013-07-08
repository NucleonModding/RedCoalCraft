package nucleon.redcoalcraft.LazerEffect;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.util.MovingObjectPosition;
import nucleon.redcoalcraft.entity.EntityLaserBeam;

public class LaserEffect {
	
	
	
	public static final LaserEffect[] lazerEffectList = new LaserEffect[512];
	public static final int[] colourRed = new int[512];
	public static final int[] colourGreen = new int[512];
	public static final int[] colourBlue = new int[512];
	
	
	
	public final int lazerEffectId;
	public final List<String> lore = new ArrayList<String>();
	
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * @param ID - The ID of the Lazer Effect (MUST BE UNIQUE)
	 * @param red - Red colour for rendering
	 * @param green - Green colour for rendering
	 * @param blue - Blue colour for rendering
	 * @param name  - The name of the Lazer Effect
	 */
	public LaserEffect(int ID , int red , int green , int blue , String name)
	{
		if(lazerEffectList[ID] != null)	
		{
			throw new IllegalArgumentException("slot " + ID + " in lazerEffectList is already occupied by " + lazerEffectList[ID] + " when adding "+ this);
		}
		else
		{
			lazerEffectList[ID] = this;
			colourRed[ID] = red;
			colourGreen[ID] = green;
			colourBlue[ID] = blue;
			this.lazerEffectId =  ID;
			
			lore.add(name);
		}
	}
	
	
	public void onImpact(MovingObjectPosition movingobjectposition , EntityLaserBeam laserbeam)
	{
		
	}
	public float getGravityVelocity()
	{
		   return 0;
	}
	
	
	
	
	
	
	
	
	
	public static final LaserEffect empty = new LaserEffect(0,0,0,0,"Empty");
	public static final LaserEffect redCoal = new RedCoalLaserEffect(1,255,0,0,"Red Coal");
	public static final LaserEffect basicDamage = new BasicDamgeEffect(2,100,60,60,"Basic Damage");
	public static final LaserEffect basicMiniExplosive = new BasicMiniExplosionEffect(3,80,80,80,"Basic Mini Explosion");
	public static final LaserEffect basicLargeExplosive = new BasicLargeExplosionEffect(4,200,80,80,"Basic Large Explosion");
	public static final LaserEffect basicVBer = new BasicVBerEffect(5,200,80,100,"Basic VB");
	public static final LaserEffect eSlab = new ESlabEffect(6,50,80,255,"E-Slab");
	 
}
