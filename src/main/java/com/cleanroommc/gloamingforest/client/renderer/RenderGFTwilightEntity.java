package com.cleanroommc.gloamingforest.client.renderer;

import com.cleanroommc.gloamingforest.GloamingForest;
import com.cleanroommc.gloamingforest.entity.boss.EntityGFTwilightEntity;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderGFTwilightEntity extends RenderLiving<EntityGFTwilightEntity> {

	private ResourceLocation baseTexture = new ResourceLocation(GloamingForest.MODID, "textures/entity/twilightentitybase.png");
	
	public static final Factory FACTORY = new Factory();
	
	public RenderGFTwilightEntity(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelZombie(), 0.5f);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityGFTwilightEntity entity) {
		return baseTexture;
	}
	
	public static class Factory implements IRenderFactory<EntityGFTwilightEntity> {

        @Override
        public Render<? super EntityGFTwilightEntity> createRenderFor(RenderManager manager) {
            return new RenderGFTwilightEntity(manager);
        }
    }
}
