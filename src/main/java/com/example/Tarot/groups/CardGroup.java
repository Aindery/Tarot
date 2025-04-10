package com.example.Tarot.groups;


import com.example.Tarot.common.Constant;
import com.example.Tarot.registry.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class CardGroup {
    public static final String CARD_TAB_STRING = "creativetab.card_tab";
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constant.MODID);
    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_TABS.register(
            "card_tab", // 注册名（对应 ResourceLocation 的路径部分）
            () -> CreativeModeTab.builder()
                    .title(Component.translatable(CARD_TAB_STRING)) // 标签页名称的翻译键
                    .icon(() -> new ItemStack(ModItems.Card.get()))  // 图标（使用已注册的物品）
                    .displayItems((params, output) -> {
                        output.accept(ModItems.Card.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
