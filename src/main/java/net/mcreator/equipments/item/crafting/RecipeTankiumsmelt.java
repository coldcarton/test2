
package net.mcreator.equipments.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.equipments.item.ItemTankiumingot;
import net.mcreator.equipments.block.BlockTankium;
import net.mcreator.equipments.ElementsEquipments;

@ElementsEquipments.ModElement.Tag
public class RecipeTankiumsmelt extends ElementsEquipments.ModElement {
	public RecipeTankiumsmelt(ElementsEquipments instance) {
		super(instance, 8);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTankium.block, (int) (1)), new ItemStack(ItemTankiumingot.block, (int) (1)), 1F);
	}
}
