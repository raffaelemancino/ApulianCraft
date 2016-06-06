/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raffaele.apuliancraft.items;

/**
 *
 * @author Raffaele Francesco Mancino
 */
import com.raffaele.apuliancraft.BasicInfo;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class Steel extends Item{
    public static Item steel;
    
    public Steel()
    {
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("steel");
        setTextureName(BasicInfo.ID + ":steel");
        
    }
}
