/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raffaele.apuliancraft.food;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 *
 * @author Raffaele Francesco Mancino
 */
public class ModFood {
    public static Item cheesecake;
    
    public static final void preInit()
    {
        cheesecake = new Cheesecake("cheesecake");
        GameRegistry.registerItem(cheesecake, "cheesecake");
                
        crafting();
    }
    
    private static void crafting()
    {
        GameRegistry.addRecipe(new ItemStack(cheesecake),
                "xxx",
                "xyx",
                "zzz",
                'x', new ItemStack(Items.milk_bucket.setContainerItem(Items.bucket)),
                'y', new ItemStack(Items.sugar),
                'z', new ItemStack(Items.cookie));
    }
}
