package de.thegameprofi.utilitymod.blocks;

import de.thegameprofi.utilitymod.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBase extends Block {

	public BlockBase(String name, Material material, CreativeTabs tab, String tool, int level, Block.SoundType sound){
		super(material);
		setBlockName(name);
		setCreativeTab(tab);
		setStepSound(sound);
		setBlockTextureName("ut:" + name);
		setHarvestLevel(tool, level);
		
		BlockInit.BLOCKS.add(this);
		BlockInit.BLOCKS_NAMES.add(name);
		
	}	
	public BlockBase(String name, Material material, CreativeTabs tab, Block.SoundType sound){
		super(material);
		setBlockName(name);
		setCreativeTab(tab);
		setStepSound(sound);
		setBlockTextureName("ut:" + name);
		
		BlockInit.BLOCKS.add(this);
		BlockInit.BLOCKS_NAMES.add(name);
	}
	
}
