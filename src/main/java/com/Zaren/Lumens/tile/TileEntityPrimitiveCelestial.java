package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.CelestialPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityPrimitiveCelestial extends TileEntityCelestialBlock {

    public TileEntityPrimitiveCelestial()
    {
        super(CelestialPanelLevel.PRIMITIVE, RegistryHandler.PRIMITIVE_CELESTIAL_TILE.get());
    }
}
