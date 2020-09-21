package com.Zaren.Lumens.util;

import com.Zaren.Lumens.Lumens;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.VersionChecker;

public class EventHandler {

    public static final EventHandler INSTANCE = new EventHandler();

    @SubscribeEvent
    public void handlePlayerLoggedInEvent(ClientPlayerNetworkEvent.LoggedInEvent event)
    {
        VersionChecker.CheckResult versionRAW = VersionChecker.getResult(ModList.get().getModFileById(Lumens.MOD_ID).getMods().get(0));
        VersionChecker.Status result = versionRAW.status;

        if(!(result.equals(VersionChecker.Status.UP_TO_DATE) || result.equals(VersionChecker.Status.PENDING) || result.equals(VersionChecker.Status.AHEAD)))
        {
            event.getPlayer().sendStatusMessage(new StringTextComponent(TextFormatting.GREEN + "[" + Lumens.MOD_NAME + "] " + TextFormatting.WHITE + "A new version is available (" + versionRAW.target + "), please update!"), false);
            event.getPlayer().sendStatusMessage(new StringTextComponent(TextFormatting.YELLOW + "Changelog:"), false);

            String changes = versionRAW.changes.get(versionRAW.target);
            if(changes != null)
            {
                String changesFormat[] = changes.split("\n");

                for(String change : changesFormat)
                {
                    event.getPlayer().sendStatusMessage(new StringTextComponent(TextFormatting.WHITE + "- " + change), false);
                }
                if(versionRAW.changes.size() > 1)
                {
                    event.getPlayer().sendStatusMessage(new StringTextComponent(TextFormatting.WHITE + "- And more..."), false);
                }
            }
        }
        if(result.equals(VersionChecker.Status.AHEAD))
        {
            event.getPlayer().sendStatusMessage(new StringTextComponent(TextFormatting.GREEN + "[" + Lumens.MOD_NAME + "] " + TextFormatting.WHITE + "Version not released yet"), false);
        }
    }
}
