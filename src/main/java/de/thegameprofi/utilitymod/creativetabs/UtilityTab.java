package de.thegameprofi.utilitymod.creativetabs;

import de.thegameprofi.utilitymod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class UtilityTab extends CreativeTabs
{
	public UtilityTab() 
	{
		super("utility");
	}

	@Override
	public Item getTabIconItem() {
		return ItemInit.RUBY;
	}

	
}
