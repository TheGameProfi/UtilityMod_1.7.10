package de.thegameprofi.utilitymod.init;

import java.util.ArrayList;
import java.util.List;

import de.thegameprofi.utilitymod.UtilityMod;
import de.thegameprofi.utilitymod.items.ItemBase;
import net.minecraft.item.Item;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final List<String> ITEMS_NAMES = new ArrayList<String>();
	
	public static Item RUBY = new ItemBase("ruby", UtilityMod.UTILITYTAB);
	public static Item STEAL = new ItemBase("steal", UtilityMod.UTILITYTAB);
	
}
