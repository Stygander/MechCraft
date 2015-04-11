package mechcraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mechcraft.MechCraft;
import mechcraft.ModInfo;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockGenerator extends BlockMultiBlock {

    private String name = "Generator";

    public BlockGenerator() {
        super(Material.iron);
        setCreativeTab(MechCraft.tabMechCraft);
        this.setBlockName(ModInfo.ID + "_" + name);
        GameRegistry.registerBlock(this, name);
        this.setResistance(75f);
        this.setHardness(15f);
        this.setHarvestLevel("pickaxe", 3);
        setBlockTextureName(ModInfo.ID + ":" + name);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TileEntityGenerator();
    }
}
