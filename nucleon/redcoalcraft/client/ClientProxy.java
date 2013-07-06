package nucleon.redcoalcraft.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.client.MinecraftForgeClient;
import nucleon.redcoalcraft.Regs.RegItems;
import nucleon.redcoalcraft.common.CommonProxy;
import nucleon.redcoalcraft.render.CapsuleRenderer;
import nucleon.redcoalcraft.render.LaserGunRender;
import nucleon.redcoalcraft.render.LaserRender;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void RegisterRender()
	{
		 MinecraftForgeClient.registerItemRenderer(RegItems.redCoalCapsule.itemID, new CapsuleRenderer());
		 MinecraftForgeClient.registerItemRenderer(RegItems.laserGun.itemID, new LaserGunRender());
		}
}
