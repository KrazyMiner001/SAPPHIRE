package tech.krazyminer001.sapphire.block.HallHeroultBlocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import tech.krazyminer001.sapphire.block.SapphireBlockEntities;

public class HallHeroultControllerBlockEntity extends BlockEntity {
    public HallHeroultControllerBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public HallHeroultControllerBlockEntity(BlockPos pos, BlockState state) {
        this(SapphireBlockEntities.HALL_HEROULT_CONTROLLER_BLOCK_ENTITY, pos, state);
    }
}
