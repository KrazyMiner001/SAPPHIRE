package tech.krazyminer001.sapphire.screen.hallheroultcontroller;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static tech.krazyminer001.sapphire.util.Utility.of;

@Environment(EnvType.CLIENT)
public class HallHeroultControllerScreen extends HandledScreen<HallHeroultControllerScreenHandler> {
    private static final Identifier TEXTURE = of("textures/gui/container/hall_heroult_controller.png");

    public HallHeroultControllerScreen(HallHeroultControllerScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        this.playerInventoryTitleY += 22;
        this.backgroundHeight += 22;
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        context.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight + 22);
    }
}
