package com.raffaele.apuliancraft;

//event and mod control
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
//initialization phase
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

//apuliancraft lib
//items
import com.raffaele.apuliancraft.items.ModItems;
//blocks
import com.raffaele.apuliancraft.blocks.ModBlocks;
//food
import com.raffaele.apuliancraft.food.ModFood;

@Mod(modid = BasicInfo.ID, name = BasicInfo.NAME , version = BasicInfo.VERSION)
public class ApulianCraft
{
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModItems.init();
        ModBlocks.init();
        ModFood.init();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
