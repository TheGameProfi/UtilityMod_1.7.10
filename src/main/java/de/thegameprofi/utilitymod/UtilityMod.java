package de.thegameprofi.utilitymod;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import de.thegameprofi.utilitymod.creativetabs.UtilityTab;
import de.thegameprofi.utilitymod.init.BlockInit;
import de.thegameprofi.utilitymod.init.ItemInit;
import de.thegameprofi.utilitymod.recipes.Nice;
import de.thegameprofi.utilitymod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
public class UtilityMod
{	
	
		
	public static final CreativeTabs UTILITYTAB = new UtilityTab();
	
	public static final List<String> ES = new ArrayList<String>();
	
	public static Object ruby = "\"WWW\",\"WWW\",\"WWW\",'W', ItemInit.RUBY"; 
	
   @Metadata
   public static ModMetadata meta;
   
   
   @EventHandler
   public void preinit(FMLPreInitializationEvent event)
   {	
	   Nice.reciped();
	   
	   for(int i = 0; i < ItemInit.ITEMS.size(); i++){
		   GameRegistry.registerItem(ItemInit.ITEMS.get(i), ItemInit.ITEMS_NAMES.get(i));
	   }
	   for(int i = 0; i < BlockInit.BLOCKS.size(); i++){
		   GameRegistry.registerBlock(BlockInit.BLOCKS.get(i), BlockInit.BLOCKS_NAMES.get(i));
	   }
		//GameRegistry.registerItem(ItemInit.RUBY, "ruby");
   }
   
   @EventHandler
   public void init(FMLInitializationEvent event)
   {
		
   }
   @EventHandler
   public void postinit(FMLPostInitializationEvent event)
   {
		
   }
}
