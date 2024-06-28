
package net.mcreator.equipments.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.equipments.ElementsEquipments;

@ElementsEquipments.ModElement.Tag
public class BlockTankiumblock extends ElementsEquipments.ModElement {
	@GameRegistry.ObjectHolder("equipments:tankiumblock")
	public static final Block block = null;
	public BlockTankiumblock(ElementsEquipments instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("tankiumblock"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("equipments:tankiumblock", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("tankiumblock");
			setSoundType(SoundType.GROUND);
			setHarvestLevel("pickaxe", 1);
			setHardness(5F);
			setResistance(50F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		}
	}
}
