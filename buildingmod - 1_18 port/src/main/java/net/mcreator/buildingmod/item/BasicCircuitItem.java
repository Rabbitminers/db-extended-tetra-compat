
package net.mcreator.buildingmod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.buildingmod.init.DavebuildingmodModTabs;

public class BasicCircuitItem extends Item {
	public BasicCircuitItem() {
		super(new Item.Properties().tab(DavebuildingmodModTabs.TAB_DAVES_MOD_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}