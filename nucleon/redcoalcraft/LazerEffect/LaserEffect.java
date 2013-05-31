package nucleon.redcoalcraft.LazerEffect;

import java.util.ArrayList;
import java.util.List;

public class LaserEffect {
	
	
	public static final LaserEffect[] lazerEffectList = new LaserEffect[512];
	public static final int[] colourRed = new int[512];
	public static final int[] colourGreen = new int[512];
	public static final int[] colourBlue = new int[512];
	
	
	
	public final int lazerEffectId;
	public final List<String> lore = new ArrayList();
	
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * @param ID - The ID of the Lazer Effect (MUST ME UNIQUE)
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static final LaserEffect empty = new LaserEffect(0,0,0,0,"Empty");
	public static final LaserEffect redCoal = new RedCoalLaserEffect(1,255,0,0,"Red Coal");
 
}
