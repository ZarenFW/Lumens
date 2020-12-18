package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.CelestialPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityEliteCelestial extends TileEntityCelestialBlock {

    public TileEntityEliteCelestial()
    {
        super(CelestialPanelLevel.ELITE, RegistryHandler.ELITE_CELESTIAL_TILE.get());
    }
}
