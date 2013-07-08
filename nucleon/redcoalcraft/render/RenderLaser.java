package nucleon.redcoalcraft.render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import nucleon.redcoalcraft.LazerEffect.LaserEffect;
import nucleon.redcoalcraft.entity.EntityLaserBeam;

public class RenderLaser extends Render{

	@Override
	public void doRender(Entity entity, double d0, double d1, double d2,
			float f, float f1) {

		EntityLaserBeam entityLaser = (EntityLaserBeam) entity;
		int type = entityLaser.getDataWatcher().getWatchableObjectInt(30);
		 GL11.glPushMatrix();
		 
	        GL11.glDisable(GL11.GL_TEXTURE_2D);
	        GL11.glDisable(GL11.GL_LIGHTING);
	        GL11.glEnable(GL11.GL_BLEND);
	        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
	        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		 
		 GL11.glTranslatef((float)d0, (float)d1, (float)d2);
		 GL11.glRotatef(entityLaser.prevRotationYaw + (entityLaser.rotationYaw - entityLaser.prevRotationYaw) * f1 - 90.0F, 0.0F, 1.0F, 0.0F);
		 GL11.glRotatef(entityLaser.prevRotationPitch + (entityLaser.rotationPitch - entityLaser.prevRotationPitch) * f1, 0.0F, 0.0F, 1.0F);
		 Tessellator tessellator = Tessellator.instance;
		 float f10 = 0.05625F;
		 GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		 float f11 = 0 - f1;
		 if (f11 > 0.0F)
		 {
		   float f12 = -MathHelper.sin(f11 * 3.0F) * f11;
		   GL11.glRotatef(f12, 0.0F, 0.0F, 1.0F);
		 }
		 GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
		 GL11.glScalef(f10, f10, f10);
		 GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
		 GL11.glNormal3f(f10, 0.0F, 0.0F);
		
		 for (int i = 0; i < 8; ++i)
		 {
		   GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
		   GL11.glNormal3f(0.0F, 0.0F, f10);
		   tessellator.startDrawingQuads();
		   tessellator.setColorRGBA(LaserEffect.colourRed[type], LaserEffect.colourGreen[type], LaserEffect.colourBlue[type], 255);

		   tessellator.addVertex(-8.0D, -1.0D, 0.0D);
		   tessellator.addVertex(8.0D, -1.0D, 0.0D);
		   tessellator.addVertex(8.0D, 1.0D, 0.0D);
		   tessellator.addVertex(-8.0D, 1.0D, 0.0D);
		   tessellator.draw();
		 }
		 GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		 
		 
		 GL11.glPopMatrix();
		 
		 
		   
	        GL11.glDisable(GL11.GL_BLEND);
	        GL11.glEnable(GL11.GL_LIGHTING);
	        GL11.glEnable(GL11.GL_TEXTURE_2D);
	}

}
