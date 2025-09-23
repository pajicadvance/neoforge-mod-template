package me.pajic.modid;

import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.pajic.modid.config.ModConfig;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.loading.FMLLoader;
import org.slf4j.Logger;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import org.slf4j.LoggerFactory;

@Mod(Main.MOD_ID)
public class Main {
    public static final String MOD_ID = "modid";
    private static final Logger LOGGER = LoggerFactory.getLogger("modname");
    private static final boolean DEBUG = !FMLLoader.isProduction();
    public static final ResourceLocation CONFIG_RL = withModNamespace("config");
    public static ModConfig CONFIG = ConfigApiJava.registerAndLoadConfig(ModConfig::new);

    public Main(IEventBus modEventBus, ModContainer modContainer) {
    }

    public static ResourceLocation withModNamespace(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static void debugLog(String message, Object ... args) {
        if (DEBUG) LOGGER.info(message, args);
    }
}
