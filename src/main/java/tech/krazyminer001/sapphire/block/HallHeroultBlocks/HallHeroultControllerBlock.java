package tech.krazyminer001.sapphire.block.HallHeroultBlocks;

import com.mojang.serialization.MapCodec;
import dev.mayaqq.nexusframe.api.multiblock.Multiblock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.predicate.block.BlockStatePredicate;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import tech.krazyminer001.sapphire.block.SapphireBlocks;

import java.util.HashMap;
import java.util.function.Predicate;

public class HallHeroultControllerBlock extends BlockWithEntity {
    public static final MapCodec<HallHeroultControllerBlock> CODEC = createCodec(HallHeroultControllerBlock::new);

    private static final HashMap<BlockPos, Multiblock> Multiblocks = new HashMap<>();

    private static final char[][][] MULTIBLOCK_PATTERN = {
            {
                    {'$'}
            }
    };

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    public boolean isMultiblockValid(BlockPos pos, World world) {
        getMultiblock(pos);
        return Multiblocks.get(pos).check(pos, world);
    }

    public HallHeroultControllerBlock(Settings settings) {
        super(settings);
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new HallHeroultControllerBlockEntity(pos, state);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        return ActionResult.PASS;
    }

    private static HashMap<Character, Predicate<BlockState>> getPredicates() {
        HashMap<Character, Predicate<BlockState>> predicates = new HashMap<>();
        predicates.put('$', BlockStatePredicate.forBlock(SapphireBlocks.HALL_HEROULT_CONTROLLER_BLOCK));
        return predicates;
    }

    private static void getMultiblock(BlockPos pos) {
        if (Multiblocks.get(pos) != null) {
            Multiblocks.put(pos, new Multiblock(MULTIBLOCK_PATTERN, getPredicates(), true));
        }
    }
}
