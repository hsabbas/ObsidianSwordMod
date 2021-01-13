package io.github.hsabbas.obsidiansword.setup.moditems;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class ObsidianSwordItemTier implements IItemTier {
  private int maxUses;
  private float efficiency;
  private float attackDamage;
  private int harestLevel;
  private int enchantability;

  public static final ObsidianSwordItemTier OBSIDIAN_SWORD_ITEM_TIER = new ObsidianSwordItemTier(1, 8.0F, 25.0F, 3, 0);

  public ObsidianSwordItemTier(int maxUses, float efficiency, float attackDamage, int harestLevel, int enchantability){
    this.maxUses = maxUses;
    this.efficiency = efficiency;
    this.attackDamage = attackDamage;
    this.harestLevel = harestLevel;
    this.enchantability = enchantability;
  }

  @Override
  public int getMaxUses() {
    return maxUses;
  }

  @Override
  public float getEfficiency() {
    return efficiency;
  }

  @Override
  public float getAttackDamage() {
    return attackDamage;
  }

  @Override
  public int getHarvestLevel() {
    return harestLevel;
  }

  @Override
  public int getEnchantability() {
    return enchantability;
  }

  @Override
  public Ingredient getRepairMaterial() {
    return null;
  }
}
