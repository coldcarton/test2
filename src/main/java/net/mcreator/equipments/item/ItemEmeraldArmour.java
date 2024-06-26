
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
public class ItemEmeraldArmour extends ElementsEquipments.ModElement {
	@GameRegistry.ObjectHolder("equipments:emeraldarmourhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("equipments:emeraldarmourbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("equipments:emeraldarmourlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("equipments:emeraldarmourboots")
	public static final Item boots = null;
	public ItemEmeraldArmour(ElementsEquipments instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("EMERALDARMOUR", "equipments:emeraldarmour", 75, new int[]{7, 10, 12, 7}, 13,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("emeraldarmourhelmet")
				.setRegistryName("emeraldarmourhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("emeraldarmourbody")
				.setRegistryName("emeraldarmourbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("emeraldarmourlegs")
				.setRegistryName("emeraldarmourlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("emeraldarmourboots")
				.setRegistryName("emeraldarmourboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("equipments:emeraldarmourhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("equipments:emeraldarmourbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("equipments:emeraldarmourlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("equipments:emeraldarmourboots", "inventory"));
	}
}
