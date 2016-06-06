/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raffaele.apuliancraft.blocks;

import com.raffaele.apuliancraft.BasicInfo;
import net.minecraft.block.BlockWorkbench;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 *
 * @author Raffaele Francesco Mancino
 */
public class Crafting_Table extends BlockWorkbench{
    public Crafting_Table(String UnlocalizedName)
    {
        this.setBlockName(UnlocalizedName);
        this.setBlockTextureName(BasicInfo.ID + ":" + UnlocalizedName);
        this.setHardness(2.5F);
        this.setResistance(4.5F);
    }
    
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c)
    {
        if (world.isRemote)
        {
            return true;
        } else {
            player.displayGUIWorkbench(x, y, z);
            return true;            
        }
    }
}
