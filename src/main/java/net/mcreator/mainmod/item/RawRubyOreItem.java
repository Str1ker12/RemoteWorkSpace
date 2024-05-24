
package net.mcreator.mainmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawRubyOreItem extends Item {
	public RawRubyOreItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}
}
