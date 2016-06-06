/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raffaele.apuliancraft.food;

import com.raffaele.apuliancraft.BasicInfo;
import net.minecraft.block.BlockCake;
import net.minecraft.creativetab.CreativeTabs;

/**
 *
 * @author Raffaele Francesco Mancino
 */
public class BlockCheesecake extends BlockCake{
    public BlockCheesecake(String UnlocalizedName)
    {
        this.setBlockName(UnlocalizedName);
        this.setBlockTextureName(BasicInfo.ID + ":" + UnlocalizedName);
        this.setCreativeTab(CreativeTabs.tabFood);
    }
    
    
    /*@SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister icon)
    {
        this.blockIcon = icon.registerIcon(this.getTextureName());
    }*/
}
