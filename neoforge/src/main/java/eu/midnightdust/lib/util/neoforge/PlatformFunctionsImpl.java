package eu.midnightdust.lib.util.neoforge;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import eu.midnightdust.lib.util.PlatformFunctions;
import net.minecraft.server.command.ServerCommandSource;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.fml.loading.FMLPaths;

import java.nio.file.Path;

import static eu.midnightdust.neoforge.MidnightLibNeoForge.commands;

public class PlatformFunctionsImpl {
    public static String getPlatformName() {
        return "neoforge";
    }
    /**
     * This is our actual method to {@link PlatformFunctions#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
    public static boolean isClientEnv() {
        return FMLEnvironment.dist.isClient();
    }
    public static boolean isModLoaded(String modid) {
        return ModList.get().isLoaded(modid);
    }
    public static void registerCommand(LiteralArgumentBuilder<ServerCommandSource> command) {
        commands.add(command);
    }
}
