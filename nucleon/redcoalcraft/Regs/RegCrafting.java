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
		
		
		
		GameRegistry.addRecipe(new ItemStack(RegItems.coreLens), "qdq", "ddd", "qdq",
    	        'q', Item.netherQuartz, 'd', Item.diamond);
		GameRegistry.addRecipe(new ItemStack(RegItems.directiveLens), "ldl", "ddd", "ldl",
    	        'l', new ItemStack(Item.dyePowder,1,4), 'd', Item.diamond);
		GameRegistry.addRecipe(new ItemStack(RegItems.ironFrame,1,0), "i  ", " i ", "  i",
				'i', Item.ingotIron);
		GameRegistry.addRecipe(new ItemStack(RegItems.lightEmiter,1,0), "fif", "gli", "fif",
    	        'f', RegItems.ironFrame, 'i', Item.ingotIron, 'g', Block.glass , 'l', Block.redstoneLampIdle);
		GameRegistry.addRecipe(new ItemStack(RegItems.laserGun,1,8), "drf", "rcC", "fbl",
    	        'r', RegItems.redCoal, 'd', RegItems.directiveLens, 'c', RegItems.coreLens , 'b', Block.stoneButton , 'C',RegItems.redCoalCapsule, 'l',RegItems.lightEmiter, 'f',RegItems.ironFrame);
		
		// Capsule Crafting
		
		GameRegistry.addRecipe(new ItemStack(RegItems.redCoalCapsule,1,1), " r ", " c ", " r ",
    	        'r', RegItems.redCoal, 'c', RegItems.redCoalCapsule);
		GameRegistry.addRecipe(new ItemStack(RegItems.redCoalCapsule,1,2), " r ", "rcr", " r ",
    	        'r', Item.flint, 'c', new ItemStack(RegItems.redCoalCapsule,1,1));
		GameRegistry.addRecipe(new ItemStack(RegItems.redCoalCapsule,1,3), "rrr", "rcr", "rrr",
    	        'r', Item.gunpowder, 'c', new ItemStack(RegItems.redCoalCapsule,1,1));
		GameRegistry.addRecipe(new ItemStack(RegItems.redCoalCapsule,1,4), "rrr", "rcr", "rrr",
    	        'r', Block.tnt, 'c', new ItemStack(RegItems.redCoalCapsule,1,1));
		
		GameRegistry.addRecipe(new ItemStack(RegItems.redCoalCapsule,1,5), "rrr", "rcr", "rrr",
    	        'r', new ItemStack(Item.beefCooked,2), 'c', new ItemStack(RegItems.redCoalCapsule,1,4));
		
		GameRegistry.addRecipe(new ItemStack(RegItems.redCoalCapsule,1,6), "rrr", "rcr", "rrr",
    	        'r', Block.anvil, 'c', new ItemStack(RegItems.redCoalCapsule,1,4));
	}
}
