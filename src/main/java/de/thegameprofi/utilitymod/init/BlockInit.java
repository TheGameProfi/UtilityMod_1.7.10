package de.thegameprofi.utilitymod.init;

import java.util.ArrayList;
import java.util.List;

import de.thegameprofi.utilitymod.UtilityMod;
import de.thegameprofi.utilitymod.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final List<String> BLOCKS_NAMES = new ArrayList<String>();
	
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.rock,  UtilityMod.UTILITYTAB, "Pickaxe", 2, Block.soundTypeAnvil);

}
