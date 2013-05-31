package nucleon.redcoalcraft.Regs;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegCrafting {
	public static void Register(FMLInitializationEvent event)
	{
		
		//General Crafting
		GameRegistry.addRecipe(new ItemStack(RegItems.rawRedCoal), "rcr", "crc", "rcr",
    	        'r', Item.redstone, 'c', Item.coal);
		GameRegistry.addRecipe(new ItemStack(RegItems.redCoalCapsule,1,0), "igi", "rlr", "igi",
    	        'r', RegItems.redCoal, 'i', Item.ingotIron, 'g', Item.goldNugget , 'l', Block.thinGlass);
		
		
		// Capsule Crafting
		
		GameRegistry.addRecipe(new ItemStack(RegItems.redCoalCapsule,1,1), " r ", " c ", " r ",
    	        'r', RegItems.redCoal, 'c', RegItems.redCoalCapsule);
	}
}
