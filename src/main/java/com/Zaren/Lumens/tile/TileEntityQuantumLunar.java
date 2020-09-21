package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.LunarPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityQuantumLunar extends TileEntityLunarBlock {

    public TileEntityQuantumLunar()
    {
        super(LunarPanelLevel.QUANTUM, RegistryHandler.QUANTUM_LUNAR_TILE.get());
    }
}
