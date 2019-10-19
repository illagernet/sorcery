package net.illager.sorcery.component;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class AntiTile extends Tile {
    
    private boolean superCheckAt(Block origin) {
        super.checkAt(origin);
    }
    
    @Override
    public boolean checkAt(Block origin) {
        return !superCheckAt(origin);
    }
}
