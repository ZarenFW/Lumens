package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.SolarPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityEliteSolar extends TileEntitySolarBlock {

    public TileEntityEliteSolar()
    {
        super(SolarPanelLevel.ELITE, RegistryHandler.ELITE_SOLAR_TILE.get());
    }
}
