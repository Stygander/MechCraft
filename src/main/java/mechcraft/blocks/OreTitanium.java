package mechcraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mechcraft.MechCraft;
import mechcraft.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreTitanium extends Block {
    private String  name = "TitaniumOre";
    public OreTitanium(){
        super(Material.rock);
        setCreativeTab(MechCraft.tabMechCraft);
        this.setBlockName(ModInfo.ID + "_" + name);
        GameRegistry.registerBlock(this, name);
        this.setResistance(1750f);
        this.setHardness(30f);
        this.setHarvestLevel("pickaxe", 3);
        setBlockTextureName(ModInfo.ID+ ":" + name);
    }
}
