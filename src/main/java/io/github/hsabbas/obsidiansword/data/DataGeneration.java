package io.github.hsabbas.obsidiansword.data;

import io.github.hsabbas.obsidiansword.ObsidianSwordMod;
import io.github.hsabbas.obsidiansword.data.client.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = ObsidianSwordMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration {
  @SubscribeEvent
  public static void gatherData(GatherDataEvent event){
    DataGenerator dataGenerator = event.getGenerator();
    ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

    dataGenerator.addProvider(new ModItemModelProvider(dataGenerator, existingFileHelper));
  }
}
