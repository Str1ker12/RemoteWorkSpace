
package net.mcreator.mainmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RubyDeepslateoreBlock extends Block {
	public RubyDeepslateoreBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(1f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}