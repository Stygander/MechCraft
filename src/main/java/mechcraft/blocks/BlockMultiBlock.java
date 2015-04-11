package mechcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by mediacros on 2/25/2015.
 */
public class BlockMultiBlock extends BlockContainer {

    protected BlockMultiBlock(Material material) {
        super(material);
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        TileEntity tile = world.getTileEntity(x, y, z);
        if (tile != null && tile instanceof TileEntityMultiCube) {
            TileEntityMultiCube multiBlock = (TileEntityMultiCube) tile;
            if (multiBlock.hasMaster()) {
                if (multiBlock.isMaster()) {
                    if (!multiBlock.checkMultiBlockForm())
                        multiBlock.resetStructure();
                } else {
                    if (!multiBlock.checkForMaster())
                        multiBlock.reset();
                }
            }
        }
        super.onNeighborBlockChange(world, x, y, z, block);
    }


    public TileEntity createNewTileEntity(World world, int meta) {
        return null;
    }

}
