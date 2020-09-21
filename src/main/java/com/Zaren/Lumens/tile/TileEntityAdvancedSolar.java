package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.SolarPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityAdvancedSolar extends TileEntitySolarBlock{

    public TileEntityAdvancedSolar()
    {
        super(SolarPanelLevel.ADVANCED, RegistryHandler.ADVANCED_SOLAR_TILE.get());
    }

}
