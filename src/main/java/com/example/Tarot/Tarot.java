package com.example.Tarot;

import com.example.Tarot.common.Constant;
//import com.example.Tarot.registry.CommonRegistry;
import com.example.Tarot.groups.CardGroup;
import com.example.Tarot.groups.ManagementGroup;
import com.example.Tarot.registry.ModBlocks;
import com.example.Tarot.registry.ModItems;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.example.Tarot.groups.CardGroup.CREATIVE_TABS;

@Mod(Constant.MODID)
public class Tarot
{
    public Tarot() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        CardGroup.register(modEventBus);
    }

}


