package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.LunarPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityDragonforgedLunar extends TileEntityLunarBlock {

    public TileEntityDragonforgedLunar()
    {
        super(LunarPanelLevel.DRAGONFORGED, RegistryHandler.DRAGONFORGED_LUNAR_TILE.get());
    }
}
