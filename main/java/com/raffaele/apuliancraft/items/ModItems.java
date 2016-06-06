/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raffaele.apuliancraft.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.init.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 *
 * @author Raffaele Francesco Mancino
 */
public class ModItems {
    
    public static Item steel; //ingot
    public static Item sword, pickaxe, axe, spade, hoe; //tolls
    public static Item.ToolMaterial tool = EnumHelper.addToolMaterial("ApulianTools", 3, 2000, 15.0F, 4.0F, 14);
    
    public static final void init()
    {
        steel = new Steel();
        GameRegistry.registerItem(steel, "steel");
        sword = new Sword("sword", tool);
        GameRegistry.registerItem(sword, "sword");
        pickaxe = new Pickaxe("pickaxe", tool);
        GameRegistry.registerItem(pickaxe, "pickaxe");
        axe = new Axe("axe", tool);
        GameRegistry.registerItem(axe, "axe");
        hoe = new Hoe("hoe", tool);
        GameRegistry.registerItem(hoe, "hoe");
        spade = new Spade("spade", tool);
        GameRegistry.registerItem(spade, "spade");
        
        crafting();
        smelting();
    }
    
    private static void crafting()
    {
        GameRegistry.addRecipe(new ItemStack(steel , 1),
                "x",
                "y",
                'x', new ItemStack(Items.iron_ingot),
                'y', new ItemStack(Items.coal));
        
        GameRegistry.addRecipe(new ItemStack(sword, 1),
                " x ",
                " x ",
                " y ",
                'x', new ItemStack(steel),
                'y', new ItemStack(Items.stick));
        
        GameRegistry.addRecipe(new ItemStack(pickaxe, 1),
                "xxx",
                " y ",
                " y ",
                'x', new ItemStack(steel),
                'y', new ItemStack(Items.stick));
        
        GameRegistry.addRecipe(new ItemStack(axe, 1),
                " xx",
                " yx",
                " y ",
                'x', new ItemStack(steel),
                'y', new ItemStack(Items.stick));
        
        GameRegistry.addRecipe(new ItemStack(spade, 1),
                " x ",
                " y ",
                " y ",
                'x', new ItemStack(steel),
                'y', new ItemStack(Items.stick));
        
        GameRegistry.addRecipe(new ItemStack(hoe, 1),
                " xx",
                " y ",
                " y ",
                'x', new ItemStack(steel),
                'y', new ItemStack(Items.stick));
    }
    
    private static void smelting()
    {
        
    }
    
}
