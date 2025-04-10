package com.example.Tarot.registry.impl;

import net.minecraftforge.registries.RegistryObject;

public interface RegistrationStrategy<T> {
    RegistryObject<T> register(String name, T object);
}
