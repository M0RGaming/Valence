package ga.morstudios.valence;

import ga.morstudios.valence.proxy.CommonProxy;
import ga.morstudios.valence.util.Utils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Reference.NAME, modid = Reference.MODID, version = Reference.VERSION)
public class Valence {
	
	@Mod.Instance(Reference.MODID)
	public static Valence instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		Utils.getLogger().info("Preinit Stage");
		
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		Utils.getLogger().info("Init Stage");
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		Utils.getLogger().info("Postinit Stage");
		
	}
	

}
