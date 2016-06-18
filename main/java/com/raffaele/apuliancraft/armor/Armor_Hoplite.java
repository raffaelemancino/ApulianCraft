/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raffaele.apuliancraft.armor;

import com.raffaele.apuliancraft.BasicInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 *
 * @author Raffaele Francesco Mancino
 */
public class Armor_Hoplite extends ItemArmor {
    private String textureName;
    
    public Armor_Hoplite(String name, String texture, ArmorMaterial material, int type)
    {
        super(material,0,type);
        textureName = texture;
        this.setUnlocalizedName(name);
        this.setTextureName(BasicInfo.ID + ":" + name);   
    }
    
    @Override
    public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type)
    {
        
        return BasicInfo.ID + ":textures/armor/" + "armor_hoplite" + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
    }
    
    /*@Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        if(player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ModArmor.helmet_hoplite))
        {
            player.addPotionEffect(new PotionEffect(Potion.resistance.id,1000000000));
        }
    }*/
}
