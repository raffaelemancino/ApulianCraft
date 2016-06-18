package com.raffaele.apuliancraft;

//event and mod control
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
//initialization phase
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

//apuliancraft lib
import com.raffaele.apuliancraft.proxy.CommonProxy;
import com.raffaele.apuliancraft.proxy.ClientProxy;
//item
import com.raffaele.apuliancraft.items.ModItem;
//block
import com.raffaele.apuliancraft.blocks.ModBlock;
//food
import com.raffaele.apuliancraft.food.ModFood;
//armor
import com.raffaele.apuliancraft.armor.ModArmor;

@Mod(modid = BasicInfo.ID, name = BasicInfo.NAME , version = BasicInfo.VERSION)
public class ApulianCraft
{
    @SidedProxy(clientSide = BasicInfo.CLIENT_PROXY, serverSide = BasicInfo.SERVER_PROXY)
    public static CommonProxy proxy;
    public static ClientProxy clietProxy;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModItem.preInit();
        ModBlock.preInit();
        ModFood.preInit();
        ModArmor.preInit();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
