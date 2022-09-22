package me.s1lent.testplugin;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;
import static me.s1lent.testplugin.Utils.*;
public class Main extends JavaPlugin {
    private static Logger logger;

    @Override
    public void onEnable() {
        logger = getLogger();

        log( "Plugin Ativado");
    }

    @Override
    public void onDisable() {

        log( "Plugin Desativado");
    }

    public static Logger getPluginLogger() {
        return logger;
        //return Logger;

    }




}
