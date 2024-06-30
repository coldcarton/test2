
package net.mcreator.equipments.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.equipments.ElementsEquipments;

@ElementsEquipments.ModElement.Tag
public class ItemMagmaArmour extends ElementsEquipments.ModElement {
	@GameRegistry.ObjectHolder("equipments:magmaarmourhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("equipments:magmaarmourbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("equipments:magmaarmourlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("equipments:magmaarmourboots")
	public static final Item boots = null;
	public ItemMagmaArmour(ElementsEquipments instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("MAGMAARMOUR", "equipments:magniumarmor", 75, new int[]{7, 10, 12, 7}, 13,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("magmaarmourhelmet")
				.setRegistryName("magmaarmourhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("magmaarmourbody")
				.setRegistryName("magmaarmourbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("magmaarmourlegs")
				.setRegistryName("magmaarmourlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("magmaarmourboots")
				.setRegistryName("magmaarmourboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("equipments:magmaarmourhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("equipments:magmaarmourbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("equipments:magmaarmourlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("equipments:magmaarmourboots", "inventory"));
	}
}
