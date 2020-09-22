package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.CelestialPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityDragonforgedCelestial extends TileEntityCelestialBlock {

    public TileEntityDragonforgedCelestial()
    {
        super(CelestialPanelLevel.DRAGONFORGED, RegistryHandler.DRAGONFORGED_CELESTIAL_TILE.get());
    }
}
