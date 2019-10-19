package net.illager.sorcery.tetrad;

/**
 * A tetrad of air {@link org.bukkit.block.Block blocks}.
 */
public class AirTetrad extends Tetrad {
    
    /**
     * Check that all resolved {@link org.bukkit.block.Block blocks} are air
     * @return Whether all {@link org.bukkit.block.Block blocks} are air
     * @see Tetrad#check
     */
    @Override
    public boolean check(Block origin) {
        for(Block block : this.resolve(origin))
            if(!block.isAir())
                return false;
        return true;
    }
}
