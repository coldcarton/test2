
package net.mcreator.equipments.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.equipments.item.ItemMagmaIngot;
import net.mcreator.equipments.ElementsEquipments;

@ElementsEquipments.ModElement.Tag
public class FuelLavaingot extends ElementsEquipments.ModElement {
	public FuelLavaingot(ElementsEquipments instance) {
		super(instance, 74);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemMagmaIngot.block, (int) (1)).getItem())
			return 1000;
		return 0;
	}
}
