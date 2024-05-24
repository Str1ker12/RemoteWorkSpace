// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGnome<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gnome"), "main");
	private final ModelPart linkervoet;
	private final ModelPart rechtervoet;
	private final ModelPart lichaam;
	private final ModelPart hoed;
	private final ModelPart linkerarm;
	private final ModelPart rechterarm;

	public ModelGnome(ModelPart root) {
		this.linkervoet = root.getChild("linkervoet");
		this.rechtervoet = root.getChild("rechtervoet");
		this.lichaam = root.getChild("lichaam");
		this.hoed = root.getChild("hoed");
		this.linkerarm = root.getChild("linkerarm");
		this.rechterarm = root.getChild("rechterarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition linkervoet = partdefinition.addOrReplaceChild("linkervoet", CubeListBuilder.create(),
				PartPose.offset(1.0F, 22.0F, 2.0F));

		PartDefinition cube_r1 = linkervoet.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(8, 3).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition rechtervoet = partdefinition.addOrReplaceChild("rechtervoet", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 22.0F, 2.0F));

		PartDefinition cube_r2 = rechtervoet
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 2.0F, -2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition lichaam = partdefinition.addOrReplaceChild("lichaam",
				CubeListBuilder.create().texOffs(6, 7)
						.addBox(0.0F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.0F, 0.0F));

		PartDefinition hoed = partdefinition.addOrReplaceChild("hoed", CubeListBuilder.create(),
				PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition cube_r3 = hoed.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3244F, -0.1313F, -0.3712F));

		PartDefinition cube_r4 = hoed.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 5).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 1.0F, 0.0F, -0.0718F, 0.3864F, -0.1886F));

		PartDefinition linkerarm = partdefinition.addOrReplaceChild("linkerarm", CubeListBuilder.create(),
				PartPose.offset(1.9365F, 21.3925F, 0.0F));

		PartDefinition cube_r5 = linkerarm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(5, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, -0.4363F));

		PartDefinition rechterarm = partdefinition.addOrReplaceChild("rechterarm", CubeListBuilder.create(),
				PartPose.offset(-1.0635F, 21.3925F, 0.0F));

		PartDefinition cube_r6 = rechterarm.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(10, 6).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.4363F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		linkervoet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rechtervoet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lichaam.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hoed.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		linkerarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rechterarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.rechterarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.linkerarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rechtervoet.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.linkervoet.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}