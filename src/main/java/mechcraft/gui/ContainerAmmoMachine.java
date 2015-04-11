package mechcraft.gui;

import mechcraft.blocks.TileEntityAmmoMachine;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

/**
 * Created by mediacros on 2/28/2015.
 */
public class ContainerAmmoMachine extends Container {

    public ContainerAmmoMachine(InventoryPlayer player, TileEntityAmmoMachine tileEntityAm){}


    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }
}
