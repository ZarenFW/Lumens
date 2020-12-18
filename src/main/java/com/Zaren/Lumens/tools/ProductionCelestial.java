package com.Zaren.Lumens.tools;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ProductionCelestial {
    public static float computeIntensity(World world, BlockPos pos, CelestialPanelLevel celestialPanelLevel)
    {
        float Intensity = 0;

        if(world.canBlockSeeSky(pos))
        {
            float multiplicator = 1.5f;
            float displacement = 1.2f;
            // Celestial angle == 0 at zenith.
            float celestialAngleRadians = world.getCelestialAngleRadians(1.0f);
            if(celestialAngleRadians > Math.PI)
            {
                celestialAngleRadians = (2 * 3.141592f - celestialAngleRadians);
            }

            Intensity = multiplicator;
            Intensity = Math.max(0, Intensity);
            Intensity = Math.min(1, Intensity);

            if(Intensity > 0)
            {
                if(celestialPanelLevel == CelestialPanelLevel.PRIMITIVE)
                    Intensity = 1;
            }
        }

        return Intensity;
    }
}
