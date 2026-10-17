package io.github.ciph3rj.atramentum.data;

import io.github.ciph3rj.atramentum.data.generator.AtramentumRecipeGenerator;
import io.github.ciph3rj.atramentum.data.provider.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.registries.VanillaRegistries;
import net.minecraft.util.Util;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

public class AtramentumDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		CompletableFuture<HolderLookup.Provider> completableFuture = CompletableFuture.supplyAsync(
			VanillaRegistries::createLookup, Util.backgroundExecutor()
		);

		pack.addProvider(AtramentumBlockLootTableProvider::new);
		pack.addProvider(AtramentumBlockTagProvider::new);
		pack.addProvider(AtramentumItemTagProvider::new);

		pack.addProvider(toFactory(AtramentumRecipeGenerator.Provider::new, completableFuture));
	}

	private static <T extends DataProvider> DataProvider.Factory<T> toFactory(BiFunction<PackOutput, CompletableFuture<HolderLookup.Provider>, T> baseFactory, CompletableFuture<HolderLookup.Provider> registriesFuture) {
			return output -> (T)baseFactory.apply(output, registriesFuture);
	}
}
