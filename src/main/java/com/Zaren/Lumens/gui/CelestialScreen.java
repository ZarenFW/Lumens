package com.Zaren.Lumens.gui;

import com.Zaren.Lumens.Lumens;
import com.Zaren.Lumens.blocks.containers.CelestialContainer;
import com.Zaren.Lumens.blocks.containers.CelestialContainer;
import com.Zaren.Lumens.tile.TileEntityCelestialBlock;
import com.Zaren.Lumens.tile.TileEntityCelestialBlock;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.text.DecimalFormat;
import java.util.Collections;

@OnlyIn(Dist.CLIENT)
public class CelestialScreen extends ContainerScreen<CelestialContainer> {

    private static final ResourceLocation TEXTURES = new ResourceLocation(Lumens.MOD_ID, "textures/gui/celestial_panel.png");
    private final TileEntityCelestialBlock tile;

    public CelestialScreen(CelestialContainer container, PlayerInventory inv, ITextComponent name)
    {
        super(container, inv, name);
        this.guiLeft = 0;
        this.guiTop = 0;
        this.xSize = 176;
        this.ySize = 90;
        this.tile = container.tile;
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks)
    {
        this.renderBackground();
        super.render(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
        if(mouseX > guiLeft + 8 && mouseX < guiLeft + 27 && mouseY > guiTop + 10 && mouseY < guiTop + 73)
            this.renderTooltip(Collections.singletonList("Energy: " + getPercent() + "%"), mouseX, mouseY, font);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        String energy = "Stored energy: " + getEnergyFormatted(tile.energyClient);
        this.font.drawString(energy, (xSize / 2 - font.getStringWidth(energy) / 2) + 14, 20, 4210752);

        String maxEnergy = "Max capacity: " + getEnergyFormatted(tile.maxEnergy);
        this.font.drawString(maxEnergy, (xSize / 2 - font.getStringWidth(maxEnergy) / 2) + 14, 30, 4210752);

        String generation = "Generation: " + tile.energyProductionClient + " RF/t";
        this.font.drawString(generation, (xSize / 2 - font.getStringWidth(generation) / 2) + 14, 40, 4210752);
    }
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.minecraft.getTextureManager().bindTexture(TEXTURES);
        this.blit(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);

        // Energy
        int y = this.getEnergyScaled(60);
        this.blit(this.guiLeft + 10, this.guiTop + 12 + y, 176, 0, 16, 60 - y);
        // Star
        int on = tile.currentAmountEnergyProduced();
        if(on>0) {
            this.blit(this.guiLeft + 156, this.guiTop + 70, 192, 0, 17, 17);
        }

    }
    private static DecimalFormat df = new DecimalFormat("0.00");
    private double energyNew;
    private String getEnergyFormatted(double energy)
    {
        if(energy>=1000000000){
            energyNew = energy/1000000000;
            return(df.format(energyNew)) + "GRF";}
        else if(energy>= 1000000){
            energyNew = energy/1000000;
            return(df.format(energyNew)) + "MRF";}
        else if(energy >= 1000){
            energyNew = energy/1000;
            return(df.format(energyNew)) + " kRF";}
        else
            return energy + " RF";
    }

    private int getEnergyScaled(int pixels)
    {
        return pixels - (pixels * getPercent() / 100);
    }

    private int getPercent()
    {
        Long currentEnergy = new Long(tile.energyClient);
        int maxEnergy = tile.maxEnergy;

        long result = currentEnergy * 100 / maxEnergy;

        return (int) result;
    }

}

