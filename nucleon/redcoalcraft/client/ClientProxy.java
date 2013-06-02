package nucleon.redcoalcraft.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import nucleon.redcoalcraft.common.CommonProxy;
import nucleon.redcoalcraft.entity.EntityLaser;
import nucleon.redcoalcraft.render.RenderLaser;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void RegisterRender()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityLaser.class, new RenderLaser());
	}
}
