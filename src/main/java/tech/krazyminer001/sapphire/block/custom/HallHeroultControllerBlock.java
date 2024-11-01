package tech.krazyminer001.sapphire.block.custom;

import dev.mayaqq.nexusframe.NexusFrame;
import dev.mayaqq.nexusframe.api.multiblock.Multiblock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HallHeroultControllerBlock extends Block {
    private static final char[][][] MULTIBLOCK_PATTERN = {
            {
                    {}
            }
    };

    public HallHeroultControllerBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        return ActionResult.PASS;
    }
}
