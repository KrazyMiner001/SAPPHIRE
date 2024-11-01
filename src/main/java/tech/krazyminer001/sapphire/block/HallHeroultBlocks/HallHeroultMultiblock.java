package tech.krazyminer001.sapphire.block.HallHeroultBlocks;

import com.mojang.serialization.MapCodec;
import nazario.liby.block.LibyMultiBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class HallHeroultMultiblock extends LibyMultiBlock {
    public HallHeroultMultiblock(Settings settings) {
        super(settings, new BlockPos[]{
                new BlockPos(0, 0, 0),
                new BlockPos(1, 0, 0),
        });
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return createCodec(HallHeroultMultiblock::new);
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new HallHeroultMultiblockEntity(pos, state);
    }
}
