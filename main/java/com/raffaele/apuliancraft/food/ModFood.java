/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raffaele.apuliancraft.food;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemReed;

/**
 *
 * @author Raffaele Francesco Mancino
 */
public class ModFood {
    public static Block cheesecake;
    
    public static final void init()
    {
        cheesecake = new BlockCheesecake("cheesecake");
        GameRegistry.registerBlock(cheesecake, "cheesecake");
        
       crafting();
    }
    
    private static void crafting()
    {
    }
}
