
package net.mcreator.mainmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mainmod.entity.GnomeEntity;
import net.mcreator.mainmod.client.model.ModelGnome;

public class GnomeRenderer extends MobRenderer<GnomeEntity, ModelGnome<GnomeEntity>> {
	public GnomeRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGnome(context.bakeLayer(ModelGnome.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GnomeEntity entity) {
		return new ResourceLocation("main_mod:textures/entities/gnome_texture.png");
	}
}
