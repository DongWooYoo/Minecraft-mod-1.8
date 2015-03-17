package com.dwy.block.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Items {
	
	public static Item obsidian_sword;
	
	public static void Init() {
		obsidian_sword = new Item().setUnlocalizedName("Obsidian Sword");
		}
	/**
	When you get an Unlocalized item "tile.obsidian_sword" add "tile." 5 strings return the rest
	*/
	
	public static void register()
	{
		GameRegistry.registerItem(obsidian_sword, obsidian_sword.getUnlocalizedName().substring(5));  
	}
	public static void registerRenders()
	{
		
	}

}
