package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.SolarPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityBasicSolar extends TileEntitySolarBlock{

    public TileEntityBasicSolar()
    {
        super(SolarPanelLevel.BASIC, RegistryHandler.BASIC_SOLAR_TILE.get());
    }

}
