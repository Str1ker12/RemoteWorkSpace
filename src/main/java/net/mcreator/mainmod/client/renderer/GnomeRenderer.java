
package net.mcreator.mainmod.client.renderer;

public class GnomeRenderer extends MobRenderer<GnomeEntity, ModelGnome<GnomeEntity>> {

	public GnomeRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGnome(context.bakeLayer(ModelGnome.LAYER_LOCATION)), 1f);

		this.addLayer(new RenderLayer<GnomeEntity, ModelGnome<GnomeEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("main_mod:textures/entities/gnome_texture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GnomeEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	protected void scale(GnomeEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(4f, 4f, 4f);
	}

	@Override
	public ResourceLocation getTextureLocation(GnomeEntity entity) {
		return new ResourceLocation("main_mod:textures/entities/gnome_texture.png");
	}

}
