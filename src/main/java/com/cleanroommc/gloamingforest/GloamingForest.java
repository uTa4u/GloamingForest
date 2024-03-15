package com.cleanroommc.gloamingforest;

import com.cleanroommc.gloamingforest.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GloamingForest.MODID,
	name = GloamingForest.MODNAME,
	version = GloamingForest.MODVERSION,
	dependencies = "required-after:twilightforest@[3.11.1021,)")
public class GloamingForest {

	public static final String MODID = "gloamingforest";
	public static final String MODNAME = "The Gloaming Forest";
    public static final String MODVERSION= "0.0.1";
    
    @Mod.Instance
    public static GloamingForest inst;
    
    @SidedProxy(clientSide = "com.cleanroommc.gloamingforest.proxy.ClientProxy",
    			serverSide = "com.cleanroommc.gloamingforest.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.preInit(event);
//    	Регистрация блоков и предметов.
//    	Регистрация Tile Entity
//    	Регистрация сущностей
//    	Присвоение имен в Ore Dictionary
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init(event);
//    	Регистрация генераторов структур
//    	Регистрация рецептов
//    	Регистрация обработчиков действий
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event);
//		Действия, связанные с другими модами
    }
}
