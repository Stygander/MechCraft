package mechcraft.pcp.packets.server;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import mechcraft.items.GaussRifle;

public class PacketReload implements IMessage,IMessageHandler<PacketReload, PacketReload> {
    @Override
    public void fromBytes(ByteBuf buf) {

    }

    @Override
    public void toBytes(ByteBuf buf) {

    }

    @Override
    public PacketReload onMessage(PacketReload message, MessageContext ctx) {
        ((GaussRifle) ctx.getServerHandler().playerEntity.inventory.getCurrentItem().getItem()).reload(ctx.getServerHandler().playerEntity);
        return null;
    }
}
