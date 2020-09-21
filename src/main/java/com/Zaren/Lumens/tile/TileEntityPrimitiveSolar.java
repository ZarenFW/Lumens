package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.SolarPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityPrimitiveSolar extends TileEntitySolarBlock{

    public TileEntityPrimitiveSolar()
    {
        super(SolarPanelLevel.PRIMITIVE, RegistryHandler.PRIMITIVE_SOLAR_TILE.get());
    }

}
