package de.thegameprofi.utilitymod.recipes;

import de.thegameprofi.utilitymod.init.BlockInit;
import de.thegameprofi.utilitymod.init.ItemInit;
import net.minecraft.item.ItemStack;

public class Nice {

	public static recipes ruby;
	
	public static void reciped(){
		ruby =  new recipes(new ItemStack(BlockInit.RUBY_BLOCK), new ItemStack(ItemInit.RUBY));
	}
	
}
