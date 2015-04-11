package mechcraft.render;

import mechcraft.ModInfo;
import mechcraft.render.models.ModelAmmoMachine;
import mechcraft.render.models.ModelAmmoMachineBottom;
import mechcraft.render.models.ModelAmmoMachineTop;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

/**
 * Created by mediacros on 2/22/2015.
 */
public class AmmoMachineTileRenderer extends TileEntitySpecialRenderer
{

    private static final ResourceLocation AmmoMachineTexture = new ResourceLocation(ModInfo.ID + ":" + "textures/blocks/TileEntity/AmmoMachine.png");
    public ModelAmmoMachineBottom modelBottom = new ModelAmmoMachineBottom();
    public ModelAmmoMachineTop modelTop = new ModelAmmoMachineTop();
    public ModelAmmoMachine model = new ModelAmmoMachine();

    public AmmoMachineTileRenderer() {
        this.model = new ModelAmmoMachine();
    }


    private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        GL11.glPushMatrix();
        GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
        GL11.glPopMatrix();
    }
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
        GL11.glPushMatrix();

        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glTranslatef((float) x + 1f, (float) y + 1.5f , (float) z);
        GL11.glPushMatrix();
        GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        this.bindTexture(AmmoMachineTexture);
        this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }


}
