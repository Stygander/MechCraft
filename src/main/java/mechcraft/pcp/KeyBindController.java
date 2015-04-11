package mechcraft.pcp;


import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import mechcraft.MechCraft;
import mechcraft.pcp.packets.server.PacketReload;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class KeyBindController{


    public static KeyBinding WeaponReload;


    public static void KeyInit(){
        WeaponReload = new KeyBinding("Reload Key", Keyboard.KEY_Z , "key.categories.MechCraft");

        ClientRegistry.registerKeyBinding(WeaponReload);
    }


    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event){
            if(WeaponReload.getIsKeyPressed()){
                MechCraft.MechCraftNetwork.sendToServer(new PacketReload());
            }
    }

}
