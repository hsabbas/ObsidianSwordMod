package io.github.hsabbas.obsidiansword;

import io.github.hsabbas.obsidiansword.setup.Registration;
import net.minecraftforge.fml.common.Mod;

@Mod(ObsidianSwordMod.MODID)
public class ObsidianSwordMod {
  public static final String MODID = "obsidiansword";

  public ObsidianSwordMod(){
    Registration.register();
  }
}
