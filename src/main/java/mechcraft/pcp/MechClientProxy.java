package mechcraft.pcp;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mechcraft.blocks.TileEntityAmmoMachine;
import mechcraft.entities.*;
import mechcraft.items.MechItems;
import mechcraft.render.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraftforge.client.MinecraftForgeClient;


@SideOnly(Side.CLIENT)
public class MechClientProxy extends MechCommonProxy {

    public static void initRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(EntityGaussBolt.class, new RenderGaussBolt());
        RenderingRegistry.registerEntityRenderingHandler(EntityGrenadeRound.class, new RenderGrenadeRound());


        MinecraftForgeClient.registerItemRenderer(MechItems.gaussRifle, new ItemGaussRifleRenderer());

    }


    @Override
    public EntityPlayer getPlayerFromNetHandler(INetHandler handler)
    {
        if (handler instanceof NetHandlerPlayServer)
        {
            return ((NetHandlerPlayServer) handler).playerEntity;
        }
        else
        {
            return FMLClientHandler.instance().getClientPlayerEntity();
        }
    }
}
