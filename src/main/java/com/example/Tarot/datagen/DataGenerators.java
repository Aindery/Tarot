package com.example.Tarot.datagen;

import com.example.Tarot.common.Constant;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Constant.MODID,bus=Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

        //generator model
        generator.addProvider(event.includeClient(),new ItemModelProvider(packOutput,helper));
        //generator block
        generator.addProvider(event.includeClient(), new BlcokModelProvider(packOutput, helper));
        //generator language
        generator.addProvider(event.includeClient(), new LanguageProvider(packOutput, "en_us"));
    }
}
