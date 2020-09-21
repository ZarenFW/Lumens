package com.Zaren.Lumens.tools;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.List;
import java.util.regex.Pattern;

public class Tooltip {
    private static final Pattern COMPILE = Pattern.compile("@", Pattern.LITERAL);
        private static void addInformationLocalized(List<ITextComponent> tooltip, String key, Object... parameters)
    {
        String translated = I18n.format(key, parameters);
        translated = COMPILE.matcher(translated).replaceAll("\u00a7");
        String[] formatted = translated.split("\n");
        for(String line : formatted)
            tooltip.add(new TranslationTextComponent(line));
    }
}
