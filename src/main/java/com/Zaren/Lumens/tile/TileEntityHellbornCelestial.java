package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.CelestialPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityHellbornCelestial extends TileEntityCelestialBlock {

    public TileEntityHellbornCelestial()
    {
        super(CelestialPanelLevel.HELLBORN, RegistryHandler.HELLBORN_CELESTIAL_TILE.get());
    }
}
