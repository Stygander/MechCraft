package mechcraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class MechBlocks {

    public static Block oreTitanium;
    public static Block oreCopper;
    public static Block oreAluminium;
    public static Block oreUranium;
    public static Block ammoMachineBottom;
    public static Block generatorMeta;

    public static void init() {
        oreTitanium = new OreTitanium();
        oreCopper = new OreCopper();
        oreAluminium = new OreAluminium();
        oreUranium = new OreUranium();
        generatorMeta = new BlockGenerator();
        ammoMachineBottom = new AmmoMachineBottom();
       // ammoMachineTop = new AmmoMachineTop();
    }

    public static void TEinit() {
        GameRegistry.registerTileEntity(TileEntityAmmoMachine.class, "AmmoMachine");
        GameRegistry.registerTileEntity(TileEntityGenerator.class, "Generator");
    }

}

