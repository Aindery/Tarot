package com.example.Tarot.datagen;

import com.example.Tarot.common.Constant;
import com.example.Tarot.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {
    public ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Constant.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        Set<Item> items = ForgeRegistries.ITEMS.getValues().stream().filter(i -> Constant.MODID.equals(ForgeRegistries.ITEMS.getKey(i).getNamespace()))
                .collect(Collectors.toSet());
        //加物品
        List<Item> ItemsList = Arrays.asList(
                ModItems.Card.get(), ModItems.EXAMPLE_ITEM.get()
        );
        for(Item i:ItemsList){
            itemGeneratedModel(i,resourceItem(Name(i)));
            items.remove(i);
        }
    }
    public void itemGeneratedModel(Item item, ResourceLocation texture) {
        withExistingParent(Name(item), Constant.GENERATED).texture("layer0", texture);
    }
    private String Name(Item item) {
        return ForgeRegistries.ITEMS.getKey(item).getPath();
    }
    public ResourceLocation resourceBlock(String path) {
        return new ResourceLocation(Constant.MODID, "block/" + path);
    }

    public ResourceLocation resourceItem(String path) {
        return new ResourceLocation(Constant.MODID, "item/" + path);
    }
}
