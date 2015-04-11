package mechcraft.items;


import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mechcraft.MechCraft;
import mechcraft.ModInfo;

import mechcraft.entities.EntityGaussBolt;
import mechcraft.pcp.KeyBindController;
import mechcraft.pcp.packets.server.PacketReload;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

import java.util.List;

public class GaussRifle extends Item{

    private String name = "Gauss Rifle";
    private int delay = 20;
    private int capacity = 20;
    public GaussRifle() {

        setUnlocalizedName(ModInfo.ID + "_" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(MechCraft.tabMechCraft);
        setTextureName(ModInfo.ID + ":" + name);
        setMaxStackSize(1);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) {


        if (itemStack.stackTagCompound != null) {
            int ammoleft = itemStack.stackTagCompound.getInteger("clip");
            list.add("Contains " + String.valueOf(ammoleft) + " round" + (ammoleft == 1 ? "" : "s"));
        }
    }



    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        // verify tag compound:
        if (!itemStack.hasTagCompound()) {
            // didn't have one, so make a new one:
            itemStack.setTagCompound(new NBTTagCompound());
        }
        if (world.getWorldTime() > itemStack.getTagCompound().getLong("lastShotTime")) {
            if (entityPlayer.capabilities.isCreativeMode ||itemStack.getTagCompound().getInteger("clip") > 0) {
                world.playSoundAtEntity(entityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
                if (!world.isRemote) {
                    world.spawnEntityInWorld(new EntityGaussBolt(world, entityPlayer));
                    itemStack.getTagCompound().setLong("lastShotTime", world.getWorldTime() + delay);
                    itemStack.getTagCompound().setInteger("clip", itemStack.getTagCompound().getInteger("clip") - 1);
                }
            }
        }
        return itemStack;
    }


    public void reload(EntityPlayer entityPlayer) {
            if(!entityPlayer.worldObj.isRemote) {
                entityPlayer.inventory.consumeInventoryItem(MechItems.gaussRound);
            }

            if(entityPlayer.worldObj.isRemote) {
                MechCraft.MechCraftNetwork.sendToServer(new PacketReload());
            }

            ItemStack gun = entityPlayer.getCurrentEquippedItem();
            gun.getTagCompound().setInteger("clip", this.capacity);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}