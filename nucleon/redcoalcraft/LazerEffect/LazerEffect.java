package nucleon.redcoalcraft.LazerEffect;

import java.util.ArrayList;
import java.util.List;

public class LazerEffect {
	
	
	public static final LazerEffect[] lazerEffectList = new LazerEffect[512];
	public static final int[] colourRed = new int[512];
	public static final int[] colourGreen = new int[512];
	public static final int[] colourBlue = new int[512];
	
	
	
	
	public final List<String> lore = new ArrayList();
	
	public LazerEffect(int ID , int red , int green , int blue , String name)
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
			
			lore.add(name);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static final LazerEffect empty = new LazerEffect(0,0,0,0,"Empty");
	public static final LazerEffect redCoal = new LazerEffect(0,255,0,0,"Empty");
 
}
