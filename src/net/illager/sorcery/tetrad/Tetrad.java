package net.illager.sorcery.tetrad;

import org.bukkit.block.Block;

/**
 * A fourfold rotationally symmetric group of {@link org.bukkit.block.Block blocks} around an origin {@link org.bukkit.block.Block block}.
 */
public abstract class Tetrad {

    /**
     * Left-right block offset from the origin.
     * Positive values are to the right, and negative values are to the left.
     */
    private int lateralOffset;
    
    /**
     * Up-down block offset from the origin.
     * Positive values are up, and negative values are down.
     */
    private int normalOffset;
    
    /**
     * Forward-backward block offset from the origin.
     * Positive values are forward, and negative values are backward.
     */
    private int longitudinalOffset;
    
    /**
     * Constructor
     * @param lateralOffset {@link #lateralOffset}
     * @param normalOffset {@link #normalOffset}
     * @param longitudinalOffset {@link #longitudinalOffset}
     */
    public Tetrad(int lateralOffset, int normalOffset, int longitudinalOffset) {
        this.lateralOffset = lateralOffset;
        this.normalOffset = normalOffset;
        this.longitudinalOffset = longitudinalOffset;
    }
    
    /**
     * Resolve the tetrad of {@link org.bukkit.block.Block blocks} relative to an origin {@link org.bukkit.block.Block block}.
     * @param origin An origin {@link org.bukkit.block.Block block}.
     * @return A list of resolved blocks. If the lateral and longitudinal offsets are both zero, only one block will be resolved. Otherwise, four blocks will be resolved.
     */
    public Block[] resolve(Block origin) {
        if(this.lateralOffset == 0 && this.longitudinalOffset == 0)
            return new Block[] {
                origin.getRelative(this.lateralOffset, this.normalOffset, this.longitudinalOffset)
            };
        else
            return new Block[] {
                origin.getRelative(this.lateralOffset, this.normalOffset, this.longitudinalOffset),
                origin.getRelative(this.longitudinalOffset, this.normalOffset, -this.lateralOffset),
                origin.getRelative(-this.lateralOffset, this.normalOffset, -this.longitudinalOffset),
                origin.getRelative(-this.longitudinalOffset, this.normalOffset, this.lateralOffset)
            };
    }
    
    /**
     * Check for a tetrad of {@link org.bukkit.block.Block blocks} meeting some criteria relative to an origin {@link org.bukkit.block.Block block}.
     * @param origin An origin {@link org.bukkit.block.Block block}.
     * @return Whether a tetrad meeting some criteria is found.
     */
    public abstract boolean check(Block origin);
}
