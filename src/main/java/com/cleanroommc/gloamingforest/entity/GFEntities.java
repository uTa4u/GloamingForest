package com.cleanroommc.gloamingforest.entity;

import com.cleanroommc.gloamingforest.GloamingForest;
import com.cleanroommc.gloamingforest.client.renderer.RenderGFTwilightEntity;
import com.cleanroommc.gloamingforest.entity.boss.EntityGFTwilightEntity;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GFEntities {
	
	public static void init() {
		int id = 0;
		EntityRegistry.registerModEntity(new ResourceLocation(GloamingForest.MODID, "TwilightEntityBase"), EntityGFTwilightEntity.class, "The Twilight Entity", id++, GloamingForest.inst, 64, 3, true, 0x4E518B, 0x000000);
	}
	
	@SideOnly(Side.CLIENT)
	public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityGFTwilightEntity.class, RenderGFTwilightEntity.FACTORY);
    }
}
