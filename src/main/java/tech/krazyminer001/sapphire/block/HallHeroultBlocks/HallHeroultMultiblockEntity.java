package tech.krazyminer001.sapphire.block.HallHeroultBlocks;

import nazario.liby.block.LibyMultiBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import tech.krazyminer001.sapphire.block.SapphireBlockEntities;

public class HallHeroultMultiblockEntity extends LibyMultiBlockEntity {
    public HallHeroultMultiblockEntity(BlockPos pos, BlockState state) {
        this(SapphireBlockEntities.HALL_HEROULT_MULTIBLOCK_ENTITY, pos, state);
    }

    public HallHeroultMultiblockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }
}
