/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raffaele.apuliancraft.blocks;

import com.raffaele.apuliancraft.BasicInfo;
import net.minecraft.block.BlockStoneBrick;

/**
 *
 * @author Raffaele Francesco Mancino
 */
public class Building_Block extends BlockStoneBrick{
    public Building_Block(String UnlocalizedName)
    {
        this.setBlockName(UnlocalizedName);
        this.setBlockTextureName(BasicInfo.ID + ":" + UnlocalizedName);
        this.setHardness(1.5F);
        this.setResistance(10F);
        this.setHarvestLevel("pickaxe", 0);
    }
}
