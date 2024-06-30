
package net.mcreator.equipments.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.equipments.item.ItemMagmiumIngut;
import net.mcreator.equipments.block.BlockMagmaCreamBlock;
import net.mcreator.equipments.ElementsEquipments;

@ElementsEquipments.ModElement.Tag
public class RecipeMagmiumrECIPE extends ElementsEquipments.ModElement {
	public RecipeMagmiumrECIPE(ElementsEquipments instance) {
		super(instance, 54);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMagmaCreamBlock.block, (int) (1)), new ItemStack(ItemMagmiumIngut.block, (int) (1)), 1F);
	}
}
