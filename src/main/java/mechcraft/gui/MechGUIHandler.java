package mechcraft.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import mechcraft.blocks.TileEntityAmmoMachine;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by mediacros on 2/28/2015.
 */
public class MechGUIHandler implements IGuiHandler {

    public MechGUIHandler(){

    }
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        System.out.println("HELPmoFucker");
        if(ID == 0){
            TileEntityAmmoMachine tileEntityFurnace = (TileEntityAmmoMachine) world.getTileEntity(x, y, z);
            return new ContainerAmmoMachine(player.inventory, tileEntityFurnace);
        }
        return null;
    }
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        System.out.println("HELPFucker");
        if(ID == 0){
            TileEntityAmmoMachine tileEntityAMcontainer = (TileEntityAmmoMachine) world.getTileEntity(x, y, z);
            System.out.println("HELPFucker");
            return new GUIAmmoMachine(player.inventory, tileEntityAMcontainer);
        }
        return null;

    }
}
