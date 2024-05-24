
package net.mcreator.mainmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FirestarItem extends Item {
	public FirestarItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
