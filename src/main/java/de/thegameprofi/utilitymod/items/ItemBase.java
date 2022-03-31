package de.thegameprofi.utilitymod.items;

import de.thegameprofi.utilitymod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item
{
	public ItemBase(String name, CreativeTabs tab) 
	{
		setUnlocalizedName(name);
		setCreativeTab(tab);
		setTextureName("ut:" + name);
		
		ItemInit.ITEMS.add(this);
		ItemInit.ITEMS_NAMES.add(name);
		
	}
	
	
}