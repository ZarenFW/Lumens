package com.Zaren.Lumens.gui;

import com.Zaren.Lumens.Lumens;
import com.Zaren.Lumens.blocks.containers.LunarContainer;
import com.Zaren.Lumens.blocks.containers.LunarContainer;
import com.Zaren.Lumens.tile.TileEntityLunarBlock;
import com.Zaren.Lumens.tile.TileEntityLunarBlock;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.IReorderingProcessor;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.opengl.GL11;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@OnlyIn(Dist.CLIENT)
public class LunarScreen extends ContainerScreen<LunarContainer>{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Lumens.MOD_ID, "textures/gui/lunar_panel.png");

    public final TileEntityLunarBlock tile;
    private final PlayerInventory pinv;
    private static final int GUAGE_WIDTH = 18;
    private static final int GUAGE_HEIGHT = 96;
    private static final int GUAGE_INNER_WIDTH = GUAGE_WIDTH - 2;
    private static final int GUAGE_INNER_HEIGHT = GUAGE_HEIGHT - 2;



    private List<IReorderingProcessor> tooltip = Lists.newArrayList();

    public LunarScreen(LunarContainer screenContainer,PlayerInventory inv, ITextComponent titleIn)
    {
        super(screenContainer, inv, titleIn);
        this.pinv = inv;
        this.tile = container.tile;
        xSize = 176;
        ySize = 90;

    }
    @Override
    protected void drawGuiContainerForegroundLayer(MatrixStack mstack, int mouseX, int mouseY)
    {
        GlStateManager.pushMatrix();
        String energy = "Stored energy: " + getEnergyFormatted(tile.energyClient);
        this.font.drawString(mstack, energy, (xSize / 2 - font.getStringWidth(energy) / 2) + 14, 20, 4210752);
        String maxEnergy = "Max capacity: " + getEnergyFormatted(tile.maxEnergy);
        this.font.drawString(mstack, maxEnergy, (xSize / 2 - font.getStringWidth(maxEnergy) / 2) + 14, 30, 4210752);
        String generation = "Generation: " + tile.energyProductionClient + " RF/t";
        this.font.drawString(mstack, generation, (xSize / 2 - font.getStringWidth(generation) / 2) + 14, 40, 4210752);
        GlStateManager.popMatrix();
        boolean hover = inBounds(10 + guiLeft, 12 + guiTop, GUAGE_WIDTH, GUAGE_HEIGHT, mouseX, mouseY);
        if(hover){
            if(pinv.getItemStack().isEmpty())
                drawMouseOver("Energy: " + getPercent() + "%");
        }
    }
    @Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack mstack, float partialTicks, int mouseX, int mouseY)
    {

        int xStart = (width - xSize) / 2;
        int yStart = (height - ySize) / 2;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        minecraft.getTextureManager().bindTexture(TEXTURE);
        blit(mstack, xStart, yStart, 0, 0, xSize, ySize);
        int y = this.getEnergyScaled(60);
        this.blit(mstack,this.guiLeft + 10, this.guiTop + 12 + y, 176, 0, 16, 60 - y);
        int on = tile.currentAmountEnergyProduced();
        if(on>0){
            this.blit(mstack, this.guiLeft + 162, this.guiTop + 71, 192, 0, 17, 17);
        }
    }
    @Override
    public void render(MatrixStack mstack, int mouseX, int mouseY, float partialTicks) {
        renderBackground(mstack);
        tooltip.clear();
        super.render(mstack, mouseX, mouseY, partialTicks);
        renderTooltip(mstack, tooltip, mouseX, mouseY);
        renderHoveredTooltip(mstack, mouseX, mouseY);
        if(mouseX > guiLeft + 8 && mouseX < guiLeft + 27 && mouseY > guiTop + 10 && mouseY < guiTop + 73)
            renderTooltip(mstack, tooltip, mouseX, mouseY);
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
    public void drawMouseOver(String line)
    {
        if(line != null)
            Arrays.stream(line.split("\n")).map(StringTextComponent::new).map(StringTextComponent::func_241878_f).forEach(tooltip::add);
    }
    public boolean inBounds(int x, int y, int w, int h, int mx, int my)
    {
        return mx >= x && mx < x + w && my >= y && my <= y + h;
    }
}