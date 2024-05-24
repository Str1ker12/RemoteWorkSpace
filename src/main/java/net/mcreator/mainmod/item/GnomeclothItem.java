
package net.mcreator.mainmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GnomeclothItem extends Item {
	public GnomeclothItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
