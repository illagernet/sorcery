package net.illager.sorcery.altar;

import org.bukkit.block.Block;
import net.illager.sorcery.api.Altar;
import net.illager.sorcery.component.Component;
import net.illager.sorcery.component.

/**
 * An altar for conjuring spirits
 */
class ConjuringAltar extends Altar {

    /**
     * Constructor
     * @see Altar#Altar(org.bukkit.block.Block)
     */
    public ConjuringAltar(Block origin) {
        super(origin);
        this.components = new Components[] {
            new BaseComponent(),
            
        };
    }
}
