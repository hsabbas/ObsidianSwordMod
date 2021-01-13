package io.github.hsabbas.obsidiansword.setup.moditems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;

public class ObsidianSword extends SwordItem {
  public ObsidianSword() {
    super(ObsidianSwordItemTier.OBSIDIAN_SWORD_ITEM_TIER, 25, 1, new Properties().maxStackSize(1).isImmuneToFire().group(ItemGroup.COMBAT).rarity(Rarity.RARE));
  }
}
