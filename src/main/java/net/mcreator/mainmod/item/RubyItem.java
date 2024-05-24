
package net.mcreator.mainmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class RubyItem extends Item {
	public RubyItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}
}