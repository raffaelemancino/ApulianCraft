/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raffaele.apuliancraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/**
 *
 * @author Raffaele Francesco Mancino
 */
public class ModBlocks {
    public static Block rural_brick, city_brick, crafting_table;
    
    public static final void init()
    {
        rural_brick = new Building_Block("rural_brick");
        GameRegistry.registerBlock(rural_brick, "rural_brick");
        city_brick = new Building_Block("city_brick");
        GameRegistry.registerBlock(city_brick, "city_brick");
        
        crafting_table = new Crafting_Table("crafting_table");
        GameRegistry.registerBlock(crafting_table, "crafting_table");
        
        
        crafting();
        smelting();
    }
    
    private static void crafting()
    {
        
    }
    
    private static void smelting()
    {
        GameRegistry.addSmelting(new ItemStack(Blocks.gravel), new ItemStack(Blocks.clay), 0.1f);
    }
    
}
