/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raffaele.apuliancraft.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;

/**
 *
 * @author Raffaele Francesco Mancino
 */
public class Armor_Hoplite extends ItemArmor {
    public Armor_Hoplite(ArmorMaterial material, int render_idx, int type)
    {
        super(material, render_idx, type);
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
    
}
