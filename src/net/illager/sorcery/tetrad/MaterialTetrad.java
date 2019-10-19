package net.illager.sorcery.tetrad;

import org.bukkit.block.Block;
import org.bukkit.Material;

/**
 * A {@link Tetrad tetrad} of matching {@link org.bukkit.Material material} types.
 */
public class MaterialTetrad extends Tetrad {
    
    /**
     * The {@link org.bukkit.Material material} type of the tetrad.
     */
    private Material type;
    
    /**
     * Constructor
     * @param lateralOffset {@link Tetrad#lateralOffset lateral offset}
     * @param normalOffset {@link Tetrad#normalOffset normal offset}
     * @param longitudinalOffset {@link Tetrad#longitudinalOffset longitudinal offset}
     * @param type {@link #type}
     */
    public MaterialTetrad(int lateralOffset, int normalOffset, int longitudinalOffset, Material type) {
        super(lateralOffset, normalOffset, longitudinalOffset);
        this.type = type;
    }
    
    /**
     * @see Tetrad#check
     */
    @Override
    public boolean check(Block origin) {
        for(Block block : this.resolve(origin))
            if(!block.getType().equals(this.type))
                return false;
        return true;
    }
}
