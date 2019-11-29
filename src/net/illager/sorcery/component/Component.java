package net.illager.sorcery.component;

import org.bukkit.block.Block;
import net.illager.sorcery.tetrad.Tetrad;

/**
 * Reusable pieces of {@link net.illager.sorcery.altar.Altar altars} that keeps track of an array of {@link net.illager.sorcery.tetrad.Tetrad tetrads}.
 */
public enum Component {
    
    /**
     * The base component at the center of all {@link net.illager.sorcery.altar.Altar altars}.
     */
    BASE(new Tetrad[] {
        new MaterialTetrad(0, 0, 0, Material.GLASS),
        new MaterialTetrad(0, -1, 0, Material.OBSIDIAN),
        new MaterialTetrad(0, -1, 1, Material.OBSIDIAN)
    }),
    
    /**
     * A capture component attached to a base component
     */
    CAPTURE(new Tetrad[] {
        new DataTetrad()
    });
    
    /**
     * {@link net.illager.sorcery.tetrad.Tetrads Tetrads} composing the component.
     */
    private final Tetrad[] tetrads = {};
    
    /**
     * Constructor
     */
    private Component(Tetrad[] tetrads) {
        this.tetrads = tetrads;
    }
    
    /**
     * Check that all constituent {@link net.illager.sorcery.tetrad.Tetrad tetrads} meet their respective criteria relative to an origin {@link org.bukkit.block.Block block}.
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
