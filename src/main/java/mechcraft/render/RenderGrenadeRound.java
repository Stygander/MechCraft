package mechcraft.render;

import mechcraft.ModInfo;
import mechcraft.render.models.ModelGrenadeRound;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderGrenadeRound extends Render {

    public ResourceLocation GrenadeRoundtexture = new ResourceLocation(ModInfo.ID + ":" + "textures/entities/GrenadeRound.png");
    public ModelGrenadeRound model;

    public RenderGrenadeRound() {
        this.shadowSize = 1f;
        model = new ModelGrenadeRound();
    }
    public void renderGaussBolt(Entity entitygrenade, double x, double y, double z, float yaw, float partialTickTime)
    {
        GL11.glPushMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x, (float) y, (float) z);
        GL11.glRotatef(entitygrenade.prevRotationYaw + (entitygrenade.rotationYaw - entitygrenade.prevRotationYaw) * partialTickTime - 180.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(entitygrenade.prevRotationPitch + (entitygrenade.rotationPitch - entitygrenade.prevRotationPitch) * partialTickTime - 0f, 0.0F,0.0F, 1.0F);
        this.bindTexture(GrenadeRoundtexture);
        this.model.render(entitygrenade, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }


    @Override
    public void doRender(Entity GrenadeRound, double x, double y, double z, float yaw, float partialTickTime)
    {
        this.renderGaussBolt(GrenadeRound, x, y, z, yaw, partialTickTime);
    }


    @Override
    protected ResourceLocation getEntityTexture(Entity GaussBolt) {
        return new ResourceLocation(ModInfo.ID + "textures/entities/Grenade.png");
    }
}
