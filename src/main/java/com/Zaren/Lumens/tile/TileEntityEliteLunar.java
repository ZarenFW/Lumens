package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.LunarPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityEliteLunar extends TileEntityLunarBlock {

    public TileEntityEliteLunar()
    {
        super(LunarPanelLevel.ELITE, RegistryHandler.ELITE_LUNAR_TILE.get());
    }
}
