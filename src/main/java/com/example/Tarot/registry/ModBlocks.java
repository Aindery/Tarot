package com.example.Tarot.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.example.Tarot.common.erum.BlockRegistry.BLOCKS;
import static com.example.Tarot.common.erum.ItemRegistry.ITEMS;

public class ModBlocks {
    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
            () -> new Block(BlockBehaviour.Properties.of().destroyTime(5).mapColor(MapColor.DEEPSLATE)));
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
