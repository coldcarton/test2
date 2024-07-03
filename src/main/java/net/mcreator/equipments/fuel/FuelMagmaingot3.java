
package net.mcreator.equipments.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.equipments.item.ItemMagmiumIngut;
import net.mcreator.equipments.ElementsEquipments;

@ElementsEquipments.ModElement.Tag
public class FuelMagmaingot3 extends ElementsEquipments.ModElement {
	public FuelMagmaingot3(ElementsEquipments instance) {
		super(instance, 75);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemMagmiumIngut.block, (int) (1)).getItem())
			return 1000;
		return 0;
	}
}
