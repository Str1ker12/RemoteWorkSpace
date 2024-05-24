
package net.mcreator.mainmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RubyBlockBlock extends Block {
	public RubyBlockBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.METAL).strength(5f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}