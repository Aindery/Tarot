//package com.example.Tarot.registry;
//
//import com.example.Tarot.common.erum.BlockRegistry;
//import com.example.Tarot.common.erum.ItemRegistry;
//import lombok.extern.slf4j.Slf4j;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.level.block.Block;
//import net.minecraftforge.registries.RegistryObject;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Slf4j
//public class CommonRegistry {
//    private static final Map<Class<?>, Object> strategyMap = new HashMap<>();
//
//    static {
//        strategyMap.put(Block.class, BlockRegistry.INSTANCE);
//        strategyMap.put(Item.class, ItemRegistry.INSTANCE);
//    }
//
//    @SuppressWarnings("unchecked")
//    public static <T> RegistryObject<T> register(String name, T object) {
//        RegistrationStrategy<T> strategy = (RegistrationStrategy<T>) strategyMap.get(object.getClass());
//        if (strategy == null) {
//            throw new IllegalArgumentException("Unsupported object type for registration: " + object.getClass());
//        }
//        return strategy.register(name, object);
//    }
//
//}
