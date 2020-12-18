package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.CelestialPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityAdvancedCelestial extends TileEntityCelestialBlock {

    public TileEntityAdvancedCelestial()
    {
        super(CelestialPanelLevel.ADVANCED, RegistryHandler.ADVANCED_CELESTIAL_TILE.get());
    }
}
