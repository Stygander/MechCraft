package mechcraft.items;

import mechcraft.MechCraft;
import mechcraft.pcp.packets.server.PacketReload;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;

public class ItemGunBase extends Item {
    public int ammoCount;
    public int maxAmmoCount;


    public void reload(EntityPlayer player){

        if (!player.worldObj.isRemote)
        {
            player.inventory.consumeInventoryItem(MechItems.gaussRound);
        }

        if (player.worldObj.isRemote)
        {
            MechCraft.MechCraftNetwork.sendToServer(new PacketReload());
        }

        this.ammoCount = this.maxAmmoCount;
    }
}
