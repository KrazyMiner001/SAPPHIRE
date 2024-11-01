package tech.krazyminer001.sapphire.block;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import tech.krazyminer001.sapphire.Sapphire;
import tech.krazyminer001.sapphire.block.HallHeroultBlocks.HallHeroultControllerBlockEntity;
import tech.krazyminer001.sapphire.block.HallHeroultBlocks.HallHeroultMultiblockEntity;

import static tech.krazyminer001.sapphire.util.Utility.of;

public class SapphireBlockEntities {
    public static final BlockEntityType<HallHeroultMultiblockEntity> HALL_HEROULT_MULTIBLOCK_ENTITY = register("hall_heroult_multiblock_entity",
            BlockEntityType.Builder.create(HallHeroultMultiblockEntity::new,
                    SapphireBlocks.HALL_HEROULT_MULTIBLOCK).build());

    public static final BlockEntityType<HallHeroultControllerBlockEntity> HALL_HEROULT_CONTROLLER_BLOCK_ENTITY = register("hall_heroult_controller_block_entity",
            BlockEntityType.Builder.create(HallHeroultControllerBlockEntity::new,
                    SapphireBlocks.HALL_HEROULT_CONTROLLER_BLOCK).build());



    private static <T extends BlockEntity> BlockEntityType<T> register(String id, BlockEntityType<T> type) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, of(id), type);
    }

    public static void registerBlockEntities() {
        Sapphire.LOGGER.info("Registering Block Entities for " + Sapphire.MOD_ID);
    }
}
