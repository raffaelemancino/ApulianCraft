/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raffaele.apuliancraft.armor;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 *
 * @author Raffaele Francesco Mancino
 */
public class ModArmor {
    
    public static ArmorMaterial iron = EnumHelper.addArmorMaterial("hoplite_material", 20, new int[]{3, 5, 5, 3}, 9);
    
    public static Item helmet_hoplite;
    public static Item chestplate_hoplite;
    public static Item leggings_hoplite;
    public static Item boots_hoplite;
    
    public static final void preInit()
    {
        helmet_hoplite = new Armor_Hoplite("helmet_hoplite", "armor_hoplite", iron, 0).setCreativeTab(CreativeTabs.tabCombat);
        chestplate_hoplite = new Armor_Hoplite("chestplate_hoplite", "armor_hoplite", iron, 1).setCreativeTab(CreativeTabs.tabCombat);
        leggings_hoplite = new Armor_Hoplite("leggings_hoplite", "armor_hoplite", iron, 2).setCreativeTab(CreativeTabs.tabCombat);
        boots_hoplite = new Armor_Hoplite("boots_hoplite", "armor_hoplite", iron, 3).setCreativeTab(CreativeTabs.tabCombat);
        
        GameRegistry.registerItem(helmet_hoplite, "helmet_hoplite");
        GameRegistry.registerItem(chestplate_hoplite, "chestplate_hoplite");
        GameRegistry.registerItem(leggings_hoplite, "leggings_hoplite");
        GameRegistry.registerItem(boots_hoplite, "boots_hoplite");
    }
    
    public static final void init()
    {
    }
}
