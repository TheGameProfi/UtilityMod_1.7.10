package de.thegameprofi.utilitymod.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class recipes {

	public recipes(ItemStack output, ItemStack block){
		GameRegistry.addShapelessRecipe(output, block);
	}
	
}
