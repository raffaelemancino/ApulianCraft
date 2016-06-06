/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raffaele.apuliancraft.items;

import com.raffaele.apuliancraft.BasicInfo;
import net.minecraft.item.ItemAxe;

/**
 *
 * @author Raffaele Francesco Mancino
 */
public class Axe extends ItemAxe
{
    public Axe(String UnlocalizedName, ToolMaterial material)
    {
        super(material);
        this.setUnlocalizedName(UnlocalizedName);
        this.setTextureName(BasicInfo.ID + ":" + UnlocalizedName);
    }
}
