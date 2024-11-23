package krazyminer001.sapphire.blocks.hallheroult;

import krazyminer001.sapphire.blocks.SapphireBlocks;
import krazyminer001.sapphire.blocks.SapphireHatchFlags;
import krazyminer001.sapphire.blocks.SimpleMembers;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import tech.krazyminer001.aquamarine.multiblocks.HatchFlags;
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
        //Layer 1
        for (int x = -3; x <= 3; x++) {
            for (int z = 0; z < 7; z++) {
                if (x == -3 || x == 3 || z == 0 || z == 6) {
                    builder.add(new BlockPos(x, 0, z), SimpleMembers.STEEL_CASING, SapphireHatchFlags.FLUID_AND_ITEMS);
                } else {
                    builder.add(new BlockPos(x, 0, z), SimpleMembers.STEEL_CASING);
                }
            }
        }

        //Layer 2
        for (int x = -3; x <= 3; x++) {
            for (int z = 0; z < 7; z++) {
                if (x == -3 || x == 3 || z == 0 || z == 6) {
                    builder.add(new BlockPos(x, 1, z), SimpleMembers.STEEL_CASING, SapphireHatchFlags.FLUID_AND_ITEMS);
                } else {
                    builder.add(new BlockPos(x, 1, z), SimpleMembers.TERRACOTTA);
                }
            }
        }

        //Layer 3
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

        //Layer 4
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

        //Layer 5
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

        //Layer 6
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

        //Layer 7
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

        //Layer 8
        builder
                .add(new BlockPos(-1,  7, 3), SimpleMembers.STEEL_CASING)
                .add(new BlockPos(0,  7, 2), SimpleMembers.STEEL_CASING)
                .add(new BlockPos(0,  7, 3), SimpleMembers.STEEL_CASING)
                .add(new BlockPos(0,  7, 4), SimpleMembers.STEEL_CASING)
                .add(new BlockPos(1,  7, 3), SimpleMembers.STEEL_CASING)
                //Layer 9
                .add(new BlockPos(0,  8, 3), SimpleMembers.STEEL_CASING);
        shapeTemplate = builder.build();
    }
}
