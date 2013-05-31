package nucleon.redcoalcraft.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Icon;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import nucleon.redcoalcraft.LazerEffect.LaserEffect;

public class LaserGunRender implements IItemRenderer{

	private static RenderItem renderItem = new RenderItem();
	
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return type == ItemRenderType.INVENTORY  ;
	
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack itemStack, Object... data) {
	   	
    	FontRenderer fontRenderer = Minecraft.getMinecraft().fontRenderer;
    	 Icon icon = itemStack.getIconIndex();
         renderItem.renderIcon(0, 0, icon, 16, 16);
         
         if( itemStack.stackTagCompound == null )
 		{
        	 itemStack.setTagCompound( new NBTTagCompound( ) );
        	 itemStack.stackTagCompound.setInteger("laserFuelType", 1);
 		}
         
         int red = LaserEffect.colourRed[itemStack.stackTagCompound.getInteger("laserFuelType")];
         int green = LaserEffect.colourGreen[itemStack.stackTagCompound.getInteger("laserFuelType")];
         int blue = LaserEffect.colourBlue[itemStack.stackTagCompound.getInteger("laserFuelType")];
         GL11.glDisable(GL11.GL_TEXTURE_2D);
         GL11.glEnable(GL11.GL_BLEND);
         GL11.glDepthMask(false);
         GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
         
         Tessellator tessellator = Tessellator.instance;
         tessellator.startDrawing(GL11.GL_QUADS);
         tessellator.setColorRGBA(red, green, blue, 128);
         tessellator.addVertex(12.5, 3.5, 0);
         tessellator.addVertex(12.5, 5, 0);
         tessellator.addVertex(14, 5, 0);
         tessellator.addVertex(14, 3.5, 0);
         tessellator.draw();
         
         GL11.glEnable(GL11.GL_TEXTURE_2D);
	}

}
