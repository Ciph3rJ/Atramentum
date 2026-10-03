package io.github.ciph3rj.atramentum.data.provider;

import io.github.ciph3rj.atramentum.Atramentum;
import io.github.ciph3rj.atramentum.content.AtramentumParticleTypes;
import io.github.ciph3rj.cipherlib.data.ParticleResourceProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.resources.Identifier;

import java.util.ArrayList;
import java.util.List;

public class AtramentumParticleResourceProvider extends ParticleResourceProvider {
    public AtramentumParticleResourceProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    protected void generate(Output output) {
        output.accept(AtramentumParticleTypes.DYED_INK_FOOTSTEPS, getNumberedList(Atramentum.id("dyed_ink_footsteps"), 4));
        output.accept(AtramentumParticleTypes.GLOW_INK_FOOTSTEPS, getNumberedList(Atramentum.id("glow_ink_footsteps"), 4));
    }

    public List<Identifier> getNumberedList(Identifier base, int index) {
        List<Identifier> list = new ArrayList<>();
        for (int j = 0; j < index + 1; j++) list.add(base.withSuffix("_" + j));
        return list;
    }

    @Override
    public String getName() {
        return "Particle Resource Provider";
    }
}
