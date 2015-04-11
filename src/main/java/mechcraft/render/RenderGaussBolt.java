package mechcraft.render;


import mechcraft.ModInfo;
import mechcraft.render.models.ModelGaussBolt;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;


public class RenderGaussBolt extends Render{

    public ResourceLocation GaussBolttexture = new ResourceLocation(ModInfo.ID + ":" + "textures/entities/GaussBolt.png");
    public ModelGaussBolt model;

    public RenderGaussBolt() {
        this.shadowSize = 1f;
        model = new ModelGaussBolt();
    }
    public void renderGaussBolt(Entity entitygaussbolt, double x, double y, double z, float yaw, float partialTickTime)
    {
        GL11.glPushMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x, (float) y, (float) z);
        GL11.glRotatef(entitygaussbolt.prevRotationYaw + (entitygaussbolt.rotationYaw - entitygaussbolt.prevRotationYaw) * partialTickTime - 180.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(entitygaussbolt.prevRotationPitch + (entitygaussbolt.rotationPitch - entitygaussbolt.prevRotationPitch) * partialTickTime - 0f, 0.0F,0.0F, 1.0F);
        this.bindTexture(GaussBolttexture);
        this.model.render(entitygaussbolt, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }


    @Override
    public void doRender(Entity GaussBolt, double x, double y, double z, float yaw, float partialTickTime)
    {
        this.renderGaussBolt(GaussBolt, x, y, z, yaw, partialTickTime);
    }


    @Override
    protected ResourceLocation getEntityTexture(Entity GaussBolt) {
        return new ResourceLocation(ModInfo.ID + "textures/entities/GaussBolt.png");
    }
}