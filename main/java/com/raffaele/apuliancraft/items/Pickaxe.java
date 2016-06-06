/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raffaele.apuliancraft.items;

import com.raffaele.apuliancraft.BasicInfo;
import net.minecraft.item.ItemPickaxe;

/**
 *
 * @author Raffaele Francesco Mancino
 */

public class Pickaxe extends ItemPickaxe
{
    public Pickaxe(String UnlocalizedName, ToolMaterial material)
    {
        super(material);
        this.setUnlocalizedName(UnlocalizedName);
        this.setTextureName(BasicInfo.ID + ":" + UnlocalizedName);
    }
}
