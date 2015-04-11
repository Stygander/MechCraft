package mechcraft.blocks;


import cpw.mods.fml.common.registry.GameRegistry;
import mechcraft.MechCraft;
import mechcraft.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreUranium extends Block {
    private String name = "UraniumOre";

    public OreUranium() {
        super(Material.rock);
        setCreativeTab(MechCraft.tabMechCraft);
        this.setBlockName(ModInfo.ID + "_" + name);
        GameRegistry.registerBlock(this, name);
        this.setResistance(550f);
        this.setHardness(20f);
        this.setHarvestLevel("pickaxe", 3);
        setBlockTextureName(ModInfo.ID+ ":" + name);

    }
}