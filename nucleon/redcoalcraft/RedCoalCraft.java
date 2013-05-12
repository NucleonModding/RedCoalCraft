package nucleon.redcoalcraft;



import nucleon.redcoalcraft.common.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "redcoalcraft", name = "Red Coal Craft", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class RedCoalCraft {

	@Instance("redcoalcraft")
    public static RedCoalCraft instance;
	
	@SidedProxy(clientSide="nucleon.redcoalcraft.client.ClientProxy", serverSide="nucleon.redcoalcraft.common.CommonProxy")
	public static CommonProxy proxy;
}