package net.illager.sorcery;

import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.author.Author;
import org.bukkit.plugin.java.annotation.plugin.Website;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.JavaPlugin;
import net.illager.sorcery.altar.Altar;

@Plugin(name = "Sorcery", version = "1.0.0-beta")
@Description("Welcome new players. Gives them a kit and reminds all other online players to welcome them.")
@Author("Illager Net")
@Website("https://illager.net")
@ApiVersion(ApiVersion.Target.v1_13)
public class SorceryPlugin extends JavaPlugin {
    
    private Altar[] altars;
    
    @Override
    public void onEnable() {
        // not used
    }
    
    @Override
    public void onDisable() {
        // not used
    }
}
