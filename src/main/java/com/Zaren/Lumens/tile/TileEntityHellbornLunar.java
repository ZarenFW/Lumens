package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.LunarPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityHellbornLunar extends TileEntityLunarBlock {

    public TileEntityHellbornLunar()
    {
        super(LunarPanelLevel.HELLBORN, RegistryHandler.HELLBORN_LUNAR_TILE.get());
    }
}
