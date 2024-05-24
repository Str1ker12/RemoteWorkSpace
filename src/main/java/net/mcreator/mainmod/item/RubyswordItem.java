
package net.mcreator.mainmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class RubyswordItem extends SwordItem {
	public RubyswordItem() {
		super(new Tier() {
			public int getUses() {
				return 2300;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MainModModItems.RUBY.get()));
			}
		}, 3, -3f, new Item.Properties().fireResistant());
	}
}
