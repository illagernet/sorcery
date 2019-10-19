package net.illager.sorcery.component;

import org.bukkit.block.Block;
import net.illager.sorcery.tetrad.Tetrad;

public abstract class Component {
    
    /**
     * {@link net.illager.sorcery.tetrad.Tetrads Tetrads} composing this component
     */
    private Tetrad[] tetrads = {};
    
    /**
     * Check for a component of {@link net.illager.sorcery.tetrad.Tetrad tetrads} meeting their respective criteria relative to an origin {@link org.bukkit.block.Block block}.
     * @param origin An origin {@link org.bukkit.block.Block block}.
     * @return Whether all {@link net.illager.sorcery.tetrad.Tetrad tetrads} meet their criteria.
     */
    public boolean check(Block origin) {
        for(Tetrad tetrad : this.tetrads)
            if(!tetrad.check(origin))
                return false;
        return true;
    }
}
