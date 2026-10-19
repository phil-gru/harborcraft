package de.philipp.harborcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("harborcraft")
public class Harborcraft {
    public Harborcraft() {
        // Mod Initialisierung
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
