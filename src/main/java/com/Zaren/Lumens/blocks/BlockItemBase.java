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
                tooltip.add(new TranslationTextComponent( "solar.tooltip").appendString(Config.PRIMITIVE_SOLARBLOCK_GENERATE.get().toString()).appendString("RF/t"));
       }
       else if(stack.getTranslationKey().contains("solar_basic")){
           tooltip.add(new TranslationTextComponent( "solar.tooltip").appendString(Config.BASIC_SOLARBLOCK_GENERATE.get().toString()).appendString("RF/t"));
       }
       else if(stack.getTranslationKey().contains("solar_advanced")){
           tooltip.add(new TranslationTextComponent( "solar.tooltip").appendString(Config.ADVANCED_SOLARBLOCK_GENERATE.get().toString()).appendString("RF/t"));
       }
       else if(stack.getTranslationKey().contains("solar_elite")){
           tooltip.add(new TranslationTextComponent( "solar.tooltip").appendString(Config.ELITE_SOLARBLOCK_GENERATE.get().toString()).appendString("RF/t"));
       }
       else if(stack.getTranslationKey().contains("solar_hellborn")){
           tooltip.add(new TranslationTextComponent( "solar.tooltip").appendString(Config.HELLBORN_SOLARBLOCK_GENERATE.get().toString()).appendString("RF/t"));
       }
       else if(stack.getTranslationKey().contains("solar_quantum")){
           tooltip.add(new TranslationTextComponent( "solar.tooltip").appendString(Config.QUANTUM_SOLARBLOCK_GENERATE.get().toString()).appendString("RF/t"));
       }
       else if(stack.getTranslationKey().contains("solar_dragonforged")){
           tooltip.add(new TranslationTextComponent( "solar.tooltip").appendString(Config.DRAGONFORGED_SOLARBLOCK_GENERATE.get().toString()).appendString("RF/t"));
       }
            //Lunars
                if (stack.getTranslationKey().contains("lunar_primitive")) {
                    tooltip.add(new TranslationTextComponent( "lunar.tooltip").appendString(Config.PRIMITIVE_LUNARBLOCK_GENERATE.get().toString()).appendString("RF/t"));
                }
                else if(stack.getTranslationKey().contains("lunar_basic")){
                    tooltip.add(new TranslationTextComponent( "lunar.tooltip").appendString(Config.BASIC_LUNARBLOCK_GENERATE.get().toString()).appendString("RF/t"));
                }
                else if(stack.getTranslationKey().contains("lunar_advanced")){
                    tooltip.add(new TranslationTextComponent( "lunar.tooltip").appendString(Config.ADVANCED_LUNARBLOCK_GENERATE.get().toString()).appendString("RF/t"));
                }
                else if(stack.getTranslationKey().contains("lunar_elite")){
                    tooltip.add(new TranslationTextComponent( "lunar.tooltip").appendString(Config.ELITE_LUNARBLOCK_GENERATE.get().toString()).appendString("RF/t"));
                }
                else if(stack.getTranslationKey().contains("lunar_hellborn")){
                    tooltip.add(new TranslationTextComponent( "lunar.tooltip").appendString(Config.HELLBORN_LUNARBLOCK_GENERATE.get().toString()).appendString("RF/t"));
                }
                else if(stack.getTranslationKey().contains("lunar_quantum")){
                    tooltip.add(new TranslationTextComponent( "lunar.tooltip").appendString(Config.QUANTUM_LUNARBLOCK_GENERATE.get().toString()).appendString("RF/t"));
                }
                else if(stack.getTranslationKey().contains("lunar_dragonforged")){
                    tooltip.add(new TranslationTextComponent( "lunar.tooltip").appendString(Config.DRAGONFORGED_LUNARBLOCK_GENERATE.get().toString()).appendString("RF/t"));
                }
                        //Celestial
                        if (stack.getTranslationKey().contains("celestial_primitive")) {
                            tooltip.add(new TranslationTextComponent( "celestial.tooltip").appendString(Config.PRIMITIVE_CELESTIALBLOCK_GENERATE.get().toString()).appendString("RF/t"));
                        }
                        else if(stack.getTranslationKey().contains("celestial_basic")){
                            tooltip.add(new TranslationTextComponent( "celestial.tooltip").appendString(Config.BASIC_CELESTIALBLOCK_GENERATE.get().toString()).appendString("RF/t"));
                        }
                        else if(stack.getTranslationKey().contains("celestial_advanced")){
                            tooltip.add(new TranslationTextComponent( "celestial.tooltip").appendString(Config.ADVANCED_CELESTIALBLOCK_GENERATE.get().toString()).appendString("RF/t"));
                        }
                        else if(stack.getTranslationKey().contains("celestial_elite")){
                            tooltip.add(new TranslationTextComponent( "celestial.tooltip").appendString(Config.ELITE_CELESTIALBLOCK_GENERATE.get().toString()).appendString("RF/t"));
                        }
                        else if(stack.getTranslationKey().contains("celestial_hellborn")){
                            tooltip.add(new TranslationTextComponent( "celestial.tooltip").appendString(Config.HELLBORN_CELESTIALBLOCK_GENERATE.get().toString()).appendString("RF/t"));
                        }
                        else if(stack.getTranslationKey().contains("celestial_quantum")){
                            tooltip.add(new TranslationTextComponent( "celestial.tooltip").appendString(Config.QUANTUM_CELESTIALBLOCK_GENERATE.get().toString()).appendString("RF/t"));
                        }
                        else if(stack.getTranslationKey().contains("celestial_dragonforged")){
                            tooltip.add(new TranslationTextComponent( "celestial.tooltip").appendString(Config.DRAGONFORGED_CELESTIALBLOCK_GENERATE.get().toString()).appendString("RF/t"));
                        }
       
    }
}

