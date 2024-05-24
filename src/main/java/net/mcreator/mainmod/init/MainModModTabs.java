
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mainmod.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.mainmod.MainModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MainModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MainModMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(MainModModBlocks.RUBY_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(MainModModItems.FIRESTAR.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MainModModItems.RUBYSWORD.get());
			tabData.accept(MainModModItems.RUBYARMOR_HELMET.get());
			tabData.accept(MainModModItems.RUBYARMOR_CHESTPLATE.get());
			tabData.accept(MainModModItems.RUBYARMOR_LEGGINGS.get());
			tabData.accept(MainModModItems.RUBYARMOR_BOOTS.get());
			tabData.accept(MainModModItems.GNOME_HAT_HELMET.get());
			tabData.accept(MainModModItems.WAND.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(MainModModItems.GNOME_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MainModModItems.GNOMECLOTH.get());
			tabData.accept(MainModModItems.RAW_RUBY_ORE.get());
			tabData.accept(MainModModItems.RUBY.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(MainModModBlocks.RUBYORE.get().asItem());
			tabData.accept(MainModModBlocks.RUBY_DEEPSLATEORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MainModModItems.RUBYPICKAXE.get());
		}
	}
}
