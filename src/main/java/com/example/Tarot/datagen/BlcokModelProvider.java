package com.example.Tarot.datagen;

import com.example.Tarot.common.Constant;
import com.example.Tarot.registry.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BlcokModelProvider extends net.minecraftforge.client.model.generators.BlockModelProvider {

    public BlcokModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Constant.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        Set<Block> items = ForgeRegistries.BLOCKS.getValues().stream().filter(i -> Constant.MODID.equals(ForgeRegistries.BLOCKS.getKey(i).getNamespace()))
                .collect(Collectors.toSet());
        //加方块
        List<Block> ItemsList = Arrays.asList(
                ModBlocks.EXAMPLE_BLOCK.get()
        );
        for(Block i:ItemsList){
            itemGeneratedModel(i,resourceItem(Name(i)));
            items.remove(i);
        }
    }

    public void itemGeneratedModel(Block block, ResourceLocation texture) {
        withExistingParent(Name(block), Constant.GENERATED).texture("layer0", texture);
    }

    private String Name(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block).getPath();
    }

    public ResourceLocation resourceBlock(String path) {
        return null;
    }

    public ResourceLocation resourceItem(String path) {
        return null;
    }
}
