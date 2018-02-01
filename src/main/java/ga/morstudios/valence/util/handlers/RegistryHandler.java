package ga.morstudios.valence.util.handlers;

import ga.morstudios.valence.util.Utils;
import ga.morstudios.valence.init.ItemInit;
import ga.morstudios.valence.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
		
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Item item : ItemInit.ITEMS) {
			
			if (item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
			
			Utils.getLogger().info("Registering Item Model " + item.getUnlocalizedName().substring(5));
			
		}
	}

}
