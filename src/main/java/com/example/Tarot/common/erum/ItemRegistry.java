package com.example.Tarot.common.erum;

import com.example.Tarot.common.Constant;
import com.example.Tarot.registry.impl.RegistrationStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ItemRegistry implements RegistrationStrategy<Item> {
    INSTANCE;
    public static final DeferredRegister<Item> ITEMS =  DeferredRegister.create(ForgeRegistries.ITEMS, Constant.MODID);
    @Override
    public RegistryObject<Item> register(String name, Item object) {
        return ITEMS.register(name, () -> object);
    }
    public DeferredRegister<Item> getItems() {
        return ITEMS;
    }


}
