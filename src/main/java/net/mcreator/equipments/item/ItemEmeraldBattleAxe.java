
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
public class ItemEmeraldBattleAxe extends ElementsEquipments.ModElement {
	@GameRegistry.ObjectHolder("equipments:emeraldbattleaxe")
	public static final Item block = null;
	public ItemEmeraldBattleAxe(ElementsEquipments instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("EMERALDBATTLEAXE", 4, 2273, 5f, 12f, 12)) {
			{
				this.attackSpeed = -2.8f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("emeraldbattleaxe").setRegistryName("emeraldbattleaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("equipments:emeraldbattleaxe", "inventory"));
	}
}
