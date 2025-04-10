package com.example.Tarot.common.erum;

import com.example.Tarot.common.Constant;
import com.example.Tarot.registry.impl.RegistrationStrategy;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@AllArgsConstructor
@NoArgsConstructor
public enum BlockRegistry implements RegistrationStrategy<Block> {
    INSTANCE;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constant.MODID);
    @Override
    public RegistryObject<Block> register(String name, Block object) {
        return BLOCKS.register(name, () -> object);
    }
    public DeferredRegister<Block> getBlocks() {
        return BLOCKS;
    }
}
