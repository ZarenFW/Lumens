package com.Zaren.Lumens.blocks;

import com.Zaren.Lumens.Lumens;
import com.Zaren.Lumens.config.Config;
import com.Zaren.Lumens.tools.SolarPanelLevel;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(Lumens.TAB));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        //Solars
       if (stack.getTranslationKey().contains("solar_primitive")) {
                tooltip.add(new TranslationTextComponent( "solar.tooltip").appendText(Config.PRIMITIVE_SOLARBLOCK_GENERATE.get().toString()).appendText("RF/t"));
       }
       else if(stack.getTranslationKey().contains("solar_basic")){
           tooltip.add(new TranslationTextComponent( "solar.tooltip").appendText(Config.BASIC_SOLARBLOCK_GENERATE.get().toString()).appendText("RF/t"));
       }
       else if(stack.getTranslationKey().contains("solar_advanced")){
           tooltip.add(new TranslationTextComponent( "solar.tooltip").appendText(Config.ADVANCED_SOLARBLOCK_GENERATE.get().toString()).appendText("RF/t"));
       }
       else if(stack.getTranslationKey().contains("solar_elite")){
           tooltip.add(new TranslationTextComponent( "solar.tooltip").appendText(Config.ELITE_SOLARBLOCK_GENERATE.get().toString()).appendText("RF/t"));
       }
       else if(stack.getTranslationKey().contains("solar_hellborn")){
           tooltip.add(new TranslationTextComponent( "solar.tooltip").appendText(Config.HELLBORN_SOLARBLOCK_GENERATE.get().toString()).appendText("RF/t"));
       }
       else if(stack.getTranslationKey().contains("solar_quantum")){
           tooltip.add(new TranslationTextComponent( "solar.tooltip").appendText(Config.QUANTUM_SOLARBLOCK_GENERATE.get().toString()).appendText("RF/t"));
       }
       else if(stack.getTranslationKey().contains("solar_dragonforged")){
           tooltip.add(new TranslationTextComponent( "solar.tooltip").appendText(Config.DRAGONFORGED_SOLARBLOCK_GENERATE.get().toString()).appendText("RF/t"));
       }
            //Lunars
                if (stack.getTranslationKey().contains("lunar_primitive")) {
                    tooltip.add(new TranslationTextComponent( "lunar.tooltip").appendText(Config.PRIMITIVE_SOLARBLOCK_GENERATE.get().toString()).appendText("RF/t"));
                }
                else if(stack.getTranslationKey().contains("lunar_basic")){
                    tooltip.add(new TranslationTextComponent( "lunar.tooltip").appendText(Config.BASIC_SOLARBLOCK_GENERATE.get().toString()).appendText("RF/t"));
                }
                else if(stack.getTranslationKey().contains("lunar_advanced")){
                    tooltip.add(new TranslationTextComponent( "lunar.tooltip").appendText(Config.ADVANCED_SOLARBLOCK_GENERATE.get().toString()).appendText("RF/t"));
                }
                else if(stack.getTranslationKey().contains("lunar_elite")){
                    tooltip.add(new TranslationTextComponent( "lunar.tooltip").appendText(Config.ELITE_SOLARBLOCK_GENERATE.get().toString()).appendText("RF/t"));
                }
                else if(stack.getTranslationKey().contains("lunar_hellborn")){
                    tooltip.add(new TranslationTextComponent( "lunar.tooltip").appendText(Config.HELLBORN_SOLARBLOCK_GENERATE.get().toString()).appendText("RF/t"));
                }
                else if(stack.getTranslationKey().contains("lunar_quantum")){
                    tooltip.add(new TranslationTextComponent( "lunar.tooltip").appendText(Config.QUANTUM_SOLARBLOCK_GENERATE.get().toString()).appendText("RF/t"));
                }
                else if(stack.getTranslationKey().contains("lunar_dragonforged")){
                    tooltip.add(new TranslationTextComponent( "lunar.tooltip").appendText(Config.DRAGONFORGED_SOLARBLOCK_GENERATE.get().toString()).appendText("RF/t"));
                }
       
    }
}

