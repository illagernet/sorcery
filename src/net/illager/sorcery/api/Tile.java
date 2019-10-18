package net.illager.sorcery.api;

import org.bukkit.block.Block;

public class Tile {
    
    private int dx;
    private int dy;
    private int dz;
    private Block block;
    
    public Tile(int dx, int dy, int dz) {
        this.dx = dx;
        this.dy = dy;
        this.dz = dz;
    }
    
    public int getOffsetX() {
        return this.dx;
    }
    
    public int getOffsetY() {
        return this.dy;
    }
    
    public int getOffsetZ() {
        return this.dz;
    }
    
    public Block getBlock() {
        return this.block;
    }
}
