package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.SolarPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;


public class TileEntityDragonforgedSolar extends TileEntitySolarBlock {


    public TileEntityDragonforgedSolar()
    {
        super(SolarPanelLevel.DRAGONFORGED, RegistryHandler.DRAGONFORGED_SOLAR_TILE.get());
    }

}
