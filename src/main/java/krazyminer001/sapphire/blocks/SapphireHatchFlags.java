package krazyminer001.sapphire.blocks;

import tech.krazyminer001.aquamarine.multiblocks.HatchFlags;
import tech.krazyminer001.aquamarine.multiblocks.HatchType;

public class SapphireHatchFlags {
    public static final HatchFlags FLUID_AND_ITEMS = new HatchFlags.Builder().with(
            HatchType.ITEM_INPUT,
            HatchType.ITEM_OUTPUT,
            HatchType.FLUID_INPUT,
            HatchType.FLUID_OUTPUT
    ).build();
}
