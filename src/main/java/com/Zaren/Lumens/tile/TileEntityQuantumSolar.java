package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.SolarPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityQuantumSolar extends TileEntitySolarBlock{

    public TileEntityQuantumSolar()
    {
        super(SolarPanelLevel.QUANTUM, RegistryHandler.QUANTUM_SOLAR_TILE.get());
    }

}
