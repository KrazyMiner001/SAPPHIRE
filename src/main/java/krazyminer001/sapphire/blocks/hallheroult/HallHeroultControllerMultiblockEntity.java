package krazyminer001.sapphire.blocks.hallheroult;

import krazyminer001.sapphire.blocks.SapphireBlocks;
import krazyminer001.sapphire.blocks.SimpleMembers;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import tech.krazyminer001.aquamarine.multiblocks.MultiblockBlockEntity;
import tech.krazyminer001.aquamarine.multiblocks.ShapeTemplate;
import tech.krazyminer001.aquamarine.multiblocks.inventory.MultiblockInventory;

public class HallHeroultControllerMultiblockEntity extends MultiblockBlockEntity {
    public static ShapeTemplate shapeTemplate;
    private final MultiblockInventory inventory = new MultiblockInventory();

    public HallHeroultControllerMultiblockEntity(BlockPos pos, BlockState state) {
        super(SapphireBlocks.HALL_HEROULT_CONTROLLER_MULTIBLOCK_ENTITY_TYPE, pos, state);
    }

    @Override
    protected void tick() {
        super.tick();
    }

    @Override
    public ShapeTemplate getShapeTemplate() {
        return shapeTemplate;
    }

    @Override
    public MultiblockInventory getMultiblockInventory() {
        return inventory;
    }

    static {
        ShapeTemplate.Builder builder = new ShapeTemplate.Builder();
        for (int x = -3; x <= 3; x++) {
            for (int z = 0; z < 7; z++) {
                builder.add(new BlockPos(x, 0, z), SimpleMembers.STEEL_CASING);
            }
        }
        for (int x = -3; x <= 3; x++) {
            for (int z = 0; z < 7; z++) {
                if (x == -3 || x == 3 || z == 0 || z == 6) {
                    builder.add(new BlockPos(x, 1, z), SimpleMembers.STEEL_CASING);
                } else {
                    builder.add(new BlockPos(x, 1, z), SimpleMembers.TERRACOTTA);
                }
            }
        }
        for (int x = -3; x <= 3; x++) {
            for (int z = 0; z < 7; z++) {
                if (x == -3 || x == 3 || z == 0 || z == 6) {
                    builder.add(new BlockPos(x, 2, z), SimpleMembers.STEEL_CASING);
                } else if (x == -2 || x == 2 || z == 1 || z == 5) {
                    builder.add(new BlockPos(x, 2, z), SimpleMembers.TERRACOTTA);
                } else {
                    builder.add(new BlockPos(x, 2, z), SimpleMembers.GRAPHITE);
                }
            }
        }
        for (int x = -3; x <= 3; x++) {
            for (int z = 0; z < 7; z++) {
                if (x == -3 || x == 3 || z == 0 || z == 6) {
                    builder.add(new BlockPos(x, 3, z), SimpleMembers.STEEL_CASING);
                } else if (x == -2 || x == 2 || z == 1 || z == 5) {
                    builder.add(new BlockPos(x, 3, z), SimpleMembers.TERRACOTTA);
                } else {
                    builder.add(new BlockPos(x, 3, z), SimpleMembers.AIR);
                }
            }
        }
        for (int x = -3; x <= 3; x++) {
            for (int z = 0; z < 7; z++) {
                if (x == -3 || x == 3 || z == 0 || z == 6) {
                    builder.add(new BlockPos(x, 4, z), SimpleMembers.STEEL_CASING);
                } else if (x == -2 || x == 2 || z == 1 || z == 5) {
                    builder.add(new BlockPos(x, 4, z), SimpleMembers.TERRACOTTA);
                } else {
                    builder.add(new BlockPos(x, 4, z), SimpleMembers.AIR);
                }
            }
        }
        for (int x = -3; x <= 3; x++) {
            for (int z = 0; z < 7; z++) {
                if (x == -3 || x == 3 || z == 0 || z == 6) {
                    builder.add(new BlockPos(x, 5, z), SimpleMembers.STEEL_CASING);
                } else if (x == -2 || x == 2 || z == 1 || z == 5) {
                    builder.add(new BlockPos(x, 5, z), SimpleMembers.TERRACOTTA);
                } else {
                    builder.add(new BlockPos(x, 5, z), SimpleMembers.COKE);
                }
            }
        }
        for (int x = -3; x <= 3; x++) {
            for (int z = 0; z < 7; z++) {
                if (x == -3 || x == 3 || z == 0 || z == 6) {
                    builder.add(new BlockPos(x, 6, z), SimpleMembers.STEEL_CASING);
                } else if (x == -2 || x == 2 || z == 1 || z == 5) {
                    builder.add(new BlockPos(x, 6, z), SimpleMembers.TERRACOTTA);
                }
            }
        }
        builder
                .add(new BlockPos(-1, 6, 2), SimpleMembers.COKE)
                .add(new BlockPos(-1, 6, 3), SimpleMembers.STEEL_CASING)
                .add(new BlockPos(-1, 6, 4), SimpleMembers.COKE)
                .add(new BlockPos(0, 6, 2), SimpleMembers.STEEL_CASING)
                .add(new BlockPos(0, 6, 3), SimpleMembers.COKE)
                .add(new BlockPos(0, 6, 4), SimpleMembers.STEEL_CASING)
                .add(new BlockPos(1, 6, 2), SimpleMembers.COKE)
                .add(new BlockPos(1, 6, 3), SimpleMembers.STEEL_CASING)
                .add(new BlockPos(1, 6, 4), SimpleMembers.COKE);
        builder
                .add(new BlockPos(-1,  7, 3), SimpleMembers.STEEL_CASING)
                .add(new BlockPos(0,  7, 2), SimpleMembers.STEEL_CASING)
                .add(new BlockPos(0,  7, 3), SimpleMembers.STEEL_CASING)
                .add(new BlockPos(0,  7, 4), SimpleMembers.STEEL_CASING)
                .add(new BlockPos(1,  7, 3), SimpleMembers.STEEL_CASING)
                .add(new BlockPos(0,  8, 3), SimpleMembers.STEEL_CASING);
        shapeTemplate = builder.build();
    }
}
