package nucleon.redcoalcraft;



import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;
import nucleon.redcoalcraft.Regs.Config;
import nucleon.redcoalcraft.Regs.RegBlocks;
import nucleon.redcoalcraft.Regs.RegCrafting;
import nucleon.redcoalcraft.Regs.RegEntity;
import nucleon.redcoalcraft.Regs.RegItems;
import nucleon.redcoalcraft.Regs.RegNames;
import nucleon.redcoalcraft.Regs.RegSmelting;
import nucleon.redcoalcraft.common.CommonProxy;
import nucleon.redcoalcraft.entity.EntityLaser;
import nucleon.redcoalcraft.libs.Resources;
import nucleon.redcoalcraft.render.CapsuleRenderer;
import nucleon.redcoalcraft.render.LaserGunRender;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Resources.MOD_ID, name = "Red Coal Craft", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class RedCoalCraft {

	@Instance(Resources.MOD_ID)
    public static RedCoalCraft instance;
	
	@SidedProxy(clientSide="nucleon.redcoalcraft.client.ClientProxy", serverSide="nucleon.redcoalcraft.common.CommonProxy")
	public static CommonProxy proxy;
	
	
	 @PreInit
	 public void preInit(FMLPreInitializationEvent event) {
		 Config.Register(event);
         // Stub Method
	 }
 
	 @Init
	 public void load(FMLInitializationEvent event) {
		 
         RegBlocks.Register(event);
		 RegItems.Register(event);
		 RegNames.Register(event);
		 RegSmelting.Register(event);
		 RegCrafting.Register(event);
		 RegEntity.Register(event , this);
		 
		 
		 EntityRegistry.registerGlobalEntityID(EntityLaser.class, "laser", EntityRegistry.findGlobalUniqueEntityId());
		 EntityRegistry.registerModEntity(EntityLaser.class, "laser", 0, this, 128, 1, true);
		
		 
		 
		 
		 proxy.RegisterRender();
		 
		 MinecraftForgeClient.registerItemRenderer(RegItems.redCoalCapsule.itemID, new CapsuleRenderer());
		 MinecraftForgeClient.registerItemRenderer(RegItems.laserGun.itemID, new LaserGunRender());
	 }
 
	 @PostInit
	 public void postInit(FMLPostInitializationEvent event) {
         // Stub Method
	 }
	
	
	 
	 
	 public static CreativeTabs tabRedCoalCraft = new CreativeTabs("tabRedCoalCraft") {
           public ItemStack getIconItemStack() {
                   return new ItemStack(RegItems.rawRedCoal, 1, 0);
       }
   };
	
	
}

 
