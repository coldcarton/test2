
package net.mcreator.equipments.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.equipments.item.ItemMagmaIngot;
import net.mcreator.equipments.ElementsEquipments;

@ElementsEquipments.ModElement.Tag
public class RecipeLavaIngotRecipe extends ElementsEquipments.ModElement {
	public RecipeLavaIngotRecipe(ElementsEquipments instance) {
		super(instance, 53);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Blocks.MAGMA, (int) (1)), new ItemStack(ItemMagmaIngot.block, (int) (1)), 1F);
	}
}
