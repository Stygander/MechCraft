package mechcraft.gui;

import mechcraft.ModInfo;
import mechcraft.blocks.TileEntityAmmoMachine;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/**
 * Created by mediacros on 2/28/2015.
 */
public class GUIAmmoMachine extends GuiContainer {

    private static final ResourceLocation texture = new ResourceLocation(ModInfo.ID + ":" + "textures/gui/AmmoGui.png");

    public GUIAmmoMachine(Container container) {
        super(container);
    }

    public GUIAmmoMachine(InventoryPlayer inventoryPlayer, TileEntityAmmoMachine tileEntity) {
        super(new ContainerAmmoMachine(inventoryPlayer, new TileEntityAmmoMachine()));
    }

        @Override
    protected void drawGuiContainerBackgroundLayer(float renderPartialTicks, int mouseX, int mouseY) {
        this.mc.renderEngine.bindTexture(texture);
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
