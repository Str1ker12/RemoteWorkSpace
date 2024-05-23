
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mainmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mainmod.item.RubyItem;
import net.mcreator.mainmod.MainModMod;

public class MainModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MainModMod.MODID);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	// Start of user code block custom items
	// End of user code block custom items
}
