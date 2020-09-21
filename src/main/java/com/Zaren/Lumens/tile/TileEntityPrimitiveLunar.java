package com.Zaren.Lumens.tile;

import com.Zaren.Lumens.tools.LunarPanelLevel;
import com.Zaren.Lumens.util.RegistryHandler;

public class TileEntityPrimitiveLunar extends TileEntityLunarBlock {

    public TileEntityPrimitiveLunar()
    {
        super(LunarPanelLevel.PRIMITIVE, RegistryHandler.PRIMITIVE_LUNAR_TILE.get());
    }
}
