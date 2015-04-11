package mechcraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mechcraft.MechCraft;
import mechcraft.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class OreCopper extends Block {
    private String name = "CopperOre";

    public OreCopper() {
        super(Material.rock);
        setCreativeTab(MechCraft.tabMechCraft);
        this.setBlockName(ModInfo.ID + "_" + name);
        GameRegistry.registerBlock(this, name);
        this.setResistance(67f);
        this.setHardness(10f);
        this.setHarvestLevel("pickaxe", 3);
        setBlockTextureName(ModInfo.ID+ ":" + name);
    }
}
