package net.illager.sorcery.altar;

import org.bukkit.block.Block;
import org.bukkit.Material;
import net.illager.sorcery.component.Component;

/**
 * Fourfold rotationally symmetric {@link org.bukkit.block.Block block} pattern producing some localized effect
 */
public abstract class Altar {
    
    /**
     * The origin {@link org.bukkit.block.Block block} of the the altar from which all {@link net.illager.sorcery.component.Component components} are anchored
     */
    private final Block origin;
    
    /**
     * The {@link net.illager.sorcery.component.Component components} of the altar
     */
    private final Component[] components;
    
    /**
     * Constructor
     * @param origin @{link #origin the origin block}
     */
    public Altar(Block origin) {
        this.origin = origin;
    }
    
    /**
     * Get the origin {@link org.bukkit.block.Block block} of the the altar
     * @return a {@link org.bukkit.block.Block block}
     */
    public Block getOrigin() {
        return this.origin;
    }
    
    /**
     * Check if all {@link net.illager.sorcery.component.Component components} of the altar pass theirs checks relative to the origin of the altar
     * @return Whether all {@link net.illager.sorcery.component.Component components} pass their checks
     * @see @link net.illager.sorcery.component.Component#check(org.bukkit.block.Block)
     */
    public boolean check() {
        for(Component component : this.components)
            if(!component.check(this.origin))
                return false;
        return true;
    }
}
