package nucleon.redcoalcraft.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.util.Icon;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import nucleon.redcoalcraft.LazerEffect.LazerEffect;

public class CapsuleRenderer implements IItemRenderer {
	
	private static RenderItem renderItem = new RenderItem();
	
	
	
    @Override
    public boolean handleRenderType(ItemStack itemStack, ItemRenderType type) {
            return type == ItemRenderType.INVENTORY  ;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
            return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack itemStack, Object... data) {
    	
    	FontRenderer fontRenderer = Minecraft.getMinecraft().fontRenderer;
    	 Icon icon = itemStack.getIconIndex();
         renderItem.renderIcon(0, 0, icon, 16, 16);
         
         int itemDamge = itemStack.getItemDamage();
         int red = LazerEffect.colourRed[itemDamge];
         int green = LazerEffect.colourGreen[itemDamge];
         int blue = LazerEffect.colourBlue[itemDamge];
         GL11.glDisable(GL11.GL_TEXTURE_2D);
         GL11.glEnable(GL11.GL_BLEND);
         GL11.glDepthMask(false);
         GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
         
         Tessellator tessellator = Tessellator.instance;
         tessellator.startDrawing(GL11.GL_QUADS);
         tessellator.setColorRGBA(red, green, blue, 128);
         tessellator.addVertex(5, 7, 0);
         tessellator.addVertex(5, 9, 0);
         tessellator.addVertex(11, 9, 0);
         tessellator.addVertex(11, 7, 0);
         tessellator.draw();
         
         tessellator.startDrawing(GL11.GL_QUADS);
         tessellator.setColorRGBA(red, green, blue, 128);
         tessellator.addVertex(7, 6, 0);
         tessellator.addVertex(7, 7, 0);
         tessellator.addVertex(9, 7, 0);
         tessellator.addVertex(9, 6, 0);
         tessellator.draw();
         
         tessellator.startDrawing(GL11.GL_QUADS);
         tessellator.setColorRGBA(red, green, blue, 128);
         tessellator.addVertex(7, 9, 0);
         tessellator.addVertex(7, 10, 0);
         tessellator.addVertex(9, 10, 0);
         tessellator.addVertex(9, 9, 0);
         tessellator.draw();
         GL11.glDepthMask(true);
         GL11.glDisable(GL11.GL_BLEND);
         
         GL11.glEnable(GL11.GL_TEXTURE_2D);
         
         
    }
}


