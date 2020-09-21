package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.LunarPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityAdvancedLunar extends TileEntityLunarBlock {

    public TileEntityAdvancedLunar()
    {
        super(LunarPanelLevel.ADVANCED, RegistryHandler.ADVANCED_LUNAR_TILE.get());
    }
}
