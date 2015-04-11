package mechcraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import mechcraft.blocks.MechBlocks;
import mechcraft.entities.*;
import mechcraft.items.MechItems;

import mechcraft.pcp.KeyBindController;
import mechcraft.pcp.MechClientProxy;
import mechcraft.pcp.MechCommonProxy;
import mechcraft.pcp.tabMechCraft;
import mechcraft.world.MechWorldGenerator;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = ModInfo.ID, name = ModInfo.Name, version = ModInfo.VERSION)
public class MechCraft {

    @Mod.Instance("MechCraft")
    public static MechCraft instance;



    @SidedProxy(clientSide = "mechcraft.pcp.MechClientProxy", serverSide = "mechcraft.pcp.MechCommonProxy")
    public static MechCommonProxy proxy;


    public static CreativeTabs tabMechCraft = new tabMechCraft("MechCraft");
    public static SimpleNetworkWrapper MechCraftNetwork;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MechCraftNetwork = NetworkRegistry.INSTANCE.newSimpleChannel("MechCraftChannel");
        //MechCraftNetwork.registerMessage(PacketReload.class, PacketReload.class, 0, Side.SERVER);

        GameRegistry.registerWorldGenerator(new MechWorldGenerator(), 1);
        MechBlocks.init();
        MechItems.init();
        MechClientProxy.initRenderers();
        EntityReg.entityinit();
        KeyBindController.KeyInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
