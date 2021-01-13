package io.github.hsabbas.obsidiansword.setup;

import io.github.hsabbas.obsidiansword.ObsidianSwordMod;
import io.github.hsabbas.obsidiansword.setup.moditems.ObsidianSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ObsidianSwordMod.MODID);

  public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard", () ->
    new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(8)));

  public static final RegistryObject<Item> REFINED_OBSIDIAN_SHARD = ITEMS.register("refined_obsidian_shard", () ->
    new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(4)));

  public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", ObsidianSword::new);

  public static void register() {
    ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
  }
}
