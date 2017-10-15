package net.insane96mcp.galaxite.item;

import net.insane96mcp.galaxite.Galaxite;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemGalaxiteShovel extends ItemSpade{
	public ItemGalaxiteShovel(String name, ToolMaterial material, CreativeTabs tab) {
		super(material);
		setRegistryName(name);
		setCreativeTab(tab);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + Galaxite.RESOURCE_PREFIX + net.insane96mcp.galaxite.lib.Names.GALAXITE_SHOVEL;
	}
}
