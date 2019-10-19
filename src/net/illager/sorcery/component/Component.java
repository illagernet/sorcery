package net.illager.sorcery.component;

import org.bukkit.Material;

public class Component {
    
    public static final Tiles[] BASE = {
        new MaterialTetrad(0, 0, 0, Material.GLASS),
        new MaterialTetrad(0, -1, 0, Material.OBISIDIAN),
        new MaterialTetrad(0, -1, 1, Material.OBISIDIAN),
        new AirTetrad(0, 1, 0)
    };
    
    public static final Tiles[] CAPTURE_BASE = {
        
    }
    
    private Tiles[] tiles = {};
    
    public Component() {
        // No initialization
    }
    
    /**
     * Check if all tiles
     */
    public boolean check() {
        for(Tile tile : this.tiles)
            if(!tile.check())
                return false;
        return true;
    }
    
    public static boolean checkAt(int x, int y, int z) {
        
    }
}
