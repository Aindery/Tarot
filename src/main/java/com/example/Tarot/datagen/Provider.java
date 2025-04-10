package com.example.Tarot.datagen;

import com.example.Tarot.common.Constant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

public interface Provider {
    public ResourceLocation resourceBlock(String path);

    public ResourceLocation resourceItem(String path);

}
