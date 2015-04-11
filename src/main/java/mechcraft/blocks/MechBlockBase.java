package mechcraft.blocks;

import mechcraft.MechCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MechBlockBase extends Block {
    protected MechBlockBase(Material material) {
        super(material);
        setCreativeTab(MechCraft.tabMechCraft);

    }
}
