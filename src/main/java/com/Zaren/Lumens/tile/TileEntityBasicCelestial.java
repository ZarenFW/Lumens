package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.CelestialPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityBasicCelestial extends TileEntityCelestialBlock {

    public TileEntityBasicCelestial()
    {
        super(CelestialPanelLevel.BASIC, RegistryHandler.BASIC_CELESTIAL_TILE.get());
    }
}
