
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
public class ItemTank extends ElementsEquipments.ModElement {
	@GameRegistry.ObjectHolder("equipments:tankhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("equipments:tankbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("equipments:tanklegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("equipments:tankboots")
	public static final Item boots = null;
	public ItemTank(ElementsEquipments instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TANK", "equipments:tankarmour", 100, new int[]{10, 14, 16, 10}, 14,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 3f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("tankhelmet").setRegistryName("tankhelmet")
				.setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("tankbody").setRegistryName("tankbody")
				.setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("tanklegs").setRegistryName("tanklegs")
				.setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("tankboots").setRegistryName("tankboots")
				.setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("equipments:tankhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("equipments:tankbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("equipments:tanklegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("equipments:tankboots", "inventory"));
	}
}
