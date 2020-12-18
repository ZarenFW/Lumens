package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.CelestialPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityQuantumCelestial extends TileEntityCelestialBlock {

    public TileEntityQuantumCelestial()
    {
        super(CelestialPanelLevel.QUANTUM, RegistryHandler.QUANTUM_CELESTIAL_TILE.get());
    }
}
