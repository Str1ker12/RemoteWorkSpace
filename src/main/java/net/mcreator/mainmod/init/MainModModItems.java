
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mainmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mainmod.item.RubyswordItem;
import net.mcreator.mainmod.item.RubypickaxeItem;
import net.mcreator.mainmod.item.RubyItem;
import net.mcreator.mainmod.item.RawRubyOreItem;
import net.mcreator.mainmod.item.GnomeclothItem;
import net.mcreator.mainmod.MainModMod;

public class MainModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MainModMod.MODID);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RAW_RUBY_ORE = REGISTRY.register("raw_ruby_ore", () -> new RawRubyOreItem());
	public static final RegistryObject<Item> RUBY_DEEPSLATEORE = block(MainModModBlocks.RUBY_DEEPSLATEORE);
	public static final RegistryObject<Item> RUBY_BLOCK = block(MainModModBlocks.RUBY_BLOCK);
	public static final RegistryObject<Item> RUBYORE = block(MainModModBlocks.RUBYORE);
	public static final RegistryObject<Item> RUBYSWORD = REGISTRY.register("rubysword", () -> new RubyswordItem());
	public static final RegistryObject<Item> GNOMECLOTH = REGISTRY.register("gnomecloth", () -> new GnomeclothItem());
	public static final RegistryObject<Item> GNOME_SPAWN_EGG = REGISTRY.register("gnome_spawn_egg", () -> new ForgeSpawnEggItem(MainModModEntities.GNOME, -10079488, -1, new Item.Properties()));
	public static final RegistryObject<Item> RUBYPICKAXE = REGISTRY.register("rubypickaxe", () -> new RubypickaxeItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
