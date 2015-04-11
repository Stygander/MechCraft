package mechcraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mechcraft.MechCraft;
import mechcraft.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.lang.reflect.Modifier;
import java.util.List;

public class AmmoMachineBottom extends Block implements ITileEntityProvider {
    private String  name = "AmmoMachine";

    public AmmoMachineBottom(){
        super(Material.iron);
        GameRegistry.registerBlock(this, name);
        setCreativeTab(MechCraft.tabMechCraft);
    }

    public TileEntity createNewTileEntity(World world) {
        return new TileEntityAmmoMachine();
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void addCollisionBoxesToList(World world, int i, int j, int k, AxisAlignedBB axisalignedbb, List arraylist, Entity par7Entity)
    {
        this.setBlockBounds(-0.0F, 0.0F, -0.0F, 1.0F, 1F, 1.0F);
        super.addCollisionBoxesToList(world, i, j, k, axisalignedbb, arraylist, par7Entity);
    }
    //You don't want the normal render type, or it wont render properly.
    @Override
    public int getRenderType() {
        return -1;
    }
    //It's not an opaque cube, so you need this.
    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);
        this.direction(world, x, y, z);
    }
    private void direction(World world, int x, int y, int z) {
        if (!world.isRemote) {
            Block direction = world.getBlock(x, y, z - 1);
            Block direction1 = world.getBlock(x, y, z + 1);
            Block direction2 = world.getBlock(x - 1, y, z);
            Block direction3 = world.getBlock(x + 1, y, z);
            byte byte0 = 3;
            if (direction.func_149730_j() && direction.func_149730_j()) {
                byte0 = 3;
            }
            if (direction1.func_149730_j() && direction1.func_149730_j()) {
                byte0 = 2;
            }
            if (direction2.func_149730_j() && direction2.func_149730_j()) {
                byte0 = 5;
            }
            if (direction3.func_149730_j() && direction3.func_149730_j()) {
                byte0 = 4;
            }
            world.setBlockMetadataWithNotify(x, y, z, byte0, 2);
        }
    }
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack) {
        int direction = MathHelper.floor_double((double) (entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        if (direction == 0) {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }
        if (direction == 1) {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }
        if (direction == 2) {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }
        if (direction == 3) {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }
    }
    public static void updateBlockState(boolean burning, World world, int x, int y, int z) {
        int direction = world.getBlockMetadata(x, y, z);
        TileEntity tileentity = world.getTileEntity(x, y, z);
        world.setBlockMetadataWithNotify(x, y, z, direction, 2);
        if (tileentity != null) {
            tileentity.validate();
            world.setTileEntity(x, y, z, tileentity);
        }
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
        if(world.isRemote) {
            if (world.getTileEntity(x, y, z) != null){
                player.openGui(ModInfo.CHANNEL_NAME, 0, world, x, y, z);
                System.out.println("NukedHere");
        }
            return true;
        }
        return true;
    }
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
        return AxisAlignedBB.getBoundingBox((double) i + -0.0F, (double) j + 0.0F, (double) k + -0.0F, (double) i + 1.0F, (double) j + 1f, (double) k + 1.0F);
    }
    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int i, int j, int k)
    {
        return this.getCollisionBoundingBoxFromPool(world, i, j, k);
    }
    //It's not a normal block, so you need this too.
    public boolean renderAsNormalBlock() {
        return false;
    }
    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityAmmoMachine();
    }
}
