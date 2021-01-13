package io.github.hsabbas.obsidiansword.data.client;

import io.github.hsabbas.obsidiansword.ObsidianSwordMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
  public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
    super(generator, ObsidianSwordMod.MODID, existingFileHelper);
  }

  @Override
  protected void registerModels() {
    ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
    ModelFile handheld = getExistingFile(mcLoc("item/handheld"));


    builder("obsidian_shard", itemGenerated);
    builder("refined_obsidian_shard", itemGenerated);
    builder("obsidian_sword", handheld);
  }

  private void builder(String name, ModelFile modelFile) {
    getBuilder(name).parent(modelFile).texture("layer0", "item/" + name);
  }
}
