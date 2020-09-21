package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.LunarPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityBasicLunar extends TileEntityLunarBlock {

    public TileEntityBasicLunar()
    {
        super(LunarPanelLevel.BASIC, RegistryHandler.BASIC_LUNAR_TILE.get());
    }
}
