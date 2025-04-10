package com.example.Tarot.groups;

import com.example.Tarot.registry.ModBlocks;
import com.example.Tarot.registry.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;

public class ManagementGroup {
    public static void register(IEventBus event){
            CardGroup.register(event);
    }
}
