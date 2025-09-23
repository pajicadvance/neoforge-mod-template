package me.pajic.modid;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;

@Mod(value = Main.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = Main.MOD_ID, value = Dist.CLIENT)
public class ClientMain {

    public ClientMain(ModContainer container) {
    }
}
