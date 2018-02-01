package ga.morstudios.valence.objects.items;

import ga.morstudios.valence.Valence;
import ga.morstudios.valence.init.ItemInit;
import ga.morstudios.valence.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BREWING);
//		setHasSubtypes(true);
		
		
		
		ItemInit.ITEMS.add(this);
	}
	
	public void registerModels() {
		
		Valence.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
