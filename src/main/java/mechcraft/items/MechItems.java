package mechcraft.items;

import cpw.mods.fml.common.registry.GameRegistry;
import mechcraft.MechCraft;
import mechcraft.ModInfo;
import net.minecraft.item.Item;


public class MechItems {

    public static Item gaussRifle;
//    public static Item grenadeRifle;

    public static Item gaussRound;
    public static Item grenadeRound;
    public static Item mechSig;

    public static void init() {

        gaussRifle = new GaussRifle();


        grenadeRound = new Item().setUnlocalizedName(ModInfo.ID +"_" +  "GrenadeRound").setCreativeTab(MechCraft.tabMechCraft).setTextureName(ModInfo.ID + ":GrenadeRound");
        gaussRound = new Item().setUnlocalizedName(ModInfo.ID +"_" + "GaussRound").setCreativeTab(MechCraft.tabMechCraft).setTextureName(ModInfo.ID + ":GaussRound");
        mechSig = new Item().setUnlocalizedName(ModInfo.ID + "_MechSig").setCreativeTab(MechCraft.tabMechCraft).setTextureName(ModInfo.ID + ":tab");


        GameRegistry.registerItem(gaussRound, "GaussRound");
        GameRegistry.registerItem(grenadeRound, "GrenadeRound");
        GameRegistry.registerItem(mechSig, "MechSig");
//        GameRegistry.registerItem(grenadeRifle, "GrenadeRifle");
    }
}