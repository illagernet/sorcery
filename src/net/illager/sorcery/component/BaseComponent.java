package net.illager.sorcery.component;

import org.bukkit.Material;
import net.illager.sorcery.tetrad.Tetrad;
import net.illager.sorcery.tetrad.MaterialTetrad;

/**
 * The base component at the center of all {@link net.illager.sorcery.altar.Altar altars}.
 */
public class BaseComponent extends Component {
    
    /**
     * @see Component#tetrads
     */
    private Tetrad[] tetrads = {
        new MaterialTetrad(0, 0, 0, Material.GLASS),
        new MaterialTetrad(0, -1, 0, Material.OBSIDIAN),
        new MaterialTetrad(0, -1, 1, Material.OBSIDIAN)
    };
}
