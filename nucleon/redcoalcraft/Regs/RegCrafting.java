package nucleon.redcoalcraft.Regs;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegCrafting {
	public static void Register(FMLInitializationEvent event)
	{
		GameRegistry.addRecipe(new ItemStack(RegItems.rawRedCoal), "rcr", "crc", "rcr",
    	        'r', Item.redstone, 'c', Item.coal);
		GameRegistry.addRecipe(new ItemStack(RegItems.redCoalCapsule), "igi", "rlr", "igi",
    	        'r', RegItems.redCoal, 'i', Item.ingotIron, 'g', Item.goldNugget , 'l', Block.thinGlass);
	}
}
