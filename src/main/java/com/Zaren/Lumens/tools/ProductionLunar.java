package com.Zaren.Lumens.tools;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ProductionLunar {
    public static float computeMoonIntensity(World world, BlockPos pos, LunarPanelLevel lunarPanelLevel)
    {
        float moonIntensity = 0;

        if(world.canBlockSeeSky(pos))
        {
            float multiplicator = 1.5f;
            float pi = 3.14159265359f;
            float displacement = 1.2f;
            // Celestial angle == 0 at zenith.
            float celestialAngleRadians = world.getCelestialAngleRadians(1.0f);
            if(celestialAngleRadians > Math.PI)
            {
                celestialAngleRadians = (2 * 3.141592f - celestialAngleRadians);
            }

            moonIntensity = multiplicator * MathHelper.cos(celestialAngleRadians + pi/ displacement);
            moonIntensity = Math.max(0, moonIntensity);
            moonIntensity = Math.min(1, moonIntensity);

            if(moonIntensity > 0)
            {
                if(lunarPanelLevel == LunarPanelLevel.PRIMITIVE)
                    moonIntensity = 1;

                if(world.isRaining())
                    moonIntensity *= 0.4;

                if(world.isThundering())
                    moonIntensity *= 0.2;
            }
        }

        return moonIntensity;
    }
}
