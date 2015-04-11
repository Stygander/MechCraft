package mechcraft.entities;

import cpw.mods.fml.common.registry.EntityRegistry;
import mechcraft.ModInfo;

import java.util.HashMap;

public class EntityReg {
    public static void entityinit(){
        RegisterBullets();
    }

    public static void RegisterBullets(){
        //HashMap<String, Integer> entityIDs = MechCraft.config().entityList;

        EntityRegistry.registerModEntity(EntityGaussBolt.class, "GaussBolt", 0, ModInfo.ID, 80, 3, true);
        EntityRegistry.registerModEntity(EntityGrenadeRound.class, "entityGrenade", 1, ModInfo.ID, 80, 3, true);
    }
}