/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raffaele.apuliancraft.food;

import com.raffaele.apuliancraft.BasicInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemReed;

/**
 *
 * @author Raffaele Francesco Mancino
 */
public class Cheesecake extends ItemReed {
    public Cheesecake(String UnlocalizedName)
    {
        super(Blocks.cake.setBlockTextureName(BasicInfo.ID + ":" + UnlocalizedName));
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setUnlocalizedName(UnlocalizedName);
        this.setTextureName(BasicInfo.ID + ":" + UnlocalizedName);
        this.setMaxStackSize(1);
    }
}
