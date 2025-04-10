package com.example.Tarot.datagen;

import com.example.Tarot.common.Constant;
import com.example.Tarot.groups.CardGroup;
import com.example.Tarot.registry.ModItems;
import net.minecraft.data.PackOutput;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {
    public LanguageProvider(PackOutput output, String locale) {
        super(output, Constant.MODID, locale);
    }
    @Override
    protected void addTranslations() {
        add(CardGroup.CARD_TAB_STRING, "卡牌");
        add(ModItems.EXAMPLE_ITEM.get(), "愚者");
        add(ModItems.EXAMPLE_BLOCK_ITEM.get(), "魔术师");
    }
}
