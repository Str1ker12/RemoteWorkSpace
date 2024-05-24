
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mainmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mainmod.block.RubyoreBlock;
import net.mcreator.mainmod.block.RubyDeepslateoreBlock;
import net.mcreator.mainmod.block.RubyBlockBlock;
import net.mcreator.mainmod.MainModMod;

public class MainModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MainModMod.MODID);
	public static final RegistryObject<Block> RUBY_DEEPSLATEORE = REGISTRY.register("ruby_deepslateore", () -> new RubyDeepslateoreBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> RUBYORE = REGISTRY.register("rubyore", () -> new RubyoreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
