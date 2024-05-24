
package net.mcreator.mainmod.client.renderer;

public class GnomeRenderer extends HumanoidMobRenderer<GnomeEntity, HumanoidModel<GnomeEntity>> {

	public GnomeRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

		this.addLayer(new RenderLayer<GnomeEntity, HumanoidModel<GnomeEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("main_mod:textures/entities/gnome_texture1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GnomeEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GnomeEntity entity) {
		return new ResourceLocation("main_mod:textures/entities/gnome_texture1.png");
	}

}
