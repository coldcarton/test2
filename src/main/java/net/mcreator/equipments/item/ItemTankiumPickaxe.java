
package net.mcreator.equipments.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.equipments.ElementsEquipments;

import java.util.Set;
import java.util.HashMap;

@ElementsEquipments.ModElement.Tag
public class ItemTankiumPickaxe extends ElementsEquipments.ModElement {
	@GameRegistry.ObjectHolder("equipments:tankiumpickaxe")
	public static final Item block = null;
	public ItemTankiumPickaxe(ElementsEquipments instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("TANKIUMPICKAXE", 4, 2014, 3.9f, 4f, 10)) {
			{
				this.attackSpeed = -3.1f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("tankiumpickaxe").setRegistryName("tankiumpickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("equipments:tankiumpickaxe", "inventory"));
	}
}
