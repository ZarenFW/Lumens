package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.SolarPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityHellbornSolar extends TileEntitySolarBlock{

    public TileEntityHellbornSolar()
    {
        super(SolarPanelLevel.HELLBORN, RegistryHandler.HELLBORN_SOLAR_TILE.get());
    }

}
