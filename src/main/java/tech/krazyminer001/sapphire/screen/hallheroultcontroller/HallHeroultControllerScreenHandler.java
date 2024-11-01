package tech.krazyminer001.sapphire.screen.hallheroultcontroller;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import org.jetbrains.annotations.Nullable;
import tech.krazyminer001.sapphire.screen.SapphireScreenHandlers;

public class HallHeroultControllerScreenHandler extends ScreenHandler {
    public HallHeroultControllerScreenHandler(int syncId, PlayerInventory playerInventory) {
        super(SapphireScreenHandlers.HALL_HEROULT_CONTROLLER_SCREEN_HANDLER, syncId);

        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9, 8 + col * 18, 84 + 22 + row * 18));
            }
        }

        for (int row = 0; row < 9; ++row) {
            this.addSlot(new Slot(playerInventory, row, 8 + row * 18, 142 + 22));
        }
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return null;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return false;
    }
}
