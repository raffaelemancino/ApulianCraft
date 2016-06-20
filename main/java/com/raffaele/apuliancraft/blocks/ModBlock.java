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
public class ModBlock {
    public static Block rural_brick, rural_brick_carved, city_brick, crafting_table;
    
    public static final void preInit()
    {
        rural_brick = new Building_Block("brick_rural");
        GameRegistry.registerBlock(rural_brick, "brick_rural");
        rural_brick_carved = new Building_Block("brick_rural_carved");
        GameRegistry.registerBlock(rural_brick_carved, "brick_rural_carved");
        city_brick = new Building_Block("brick_city");
        GameRegistry.registerBlock(city_brick, "brick_city");
        
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
