package mechcraft.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by mediacros on 12/30/2014.
 */
public class ModelGrenadeRound extends ModelBase
{
    //fields
    ModelRenderer body;
    ModelRenderer bomb;

    public ModelGrenadeRound()
    {
        textureWidth = 32;
        textureHeight = 32;

        body = new ModelRenderer(this, 0, 0);
        body.addBox(0F, 0F, 0F, 3, 3, 4);
        body.setRotationPoint(-1F, -1F, 0F);
        body.setTextureSize(32, 32);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        bomb = new ModelRenderer(this, 10, 0);
        bomb.addBox(0F, 0F, 0F, 2, 2, 2);
        bomb.setRotationPoint(-0.5F, -0.5F, -2F);
        bomb.setTextureSize(32, 32);
        bomb.mirror = true;
        setRotation(bomb, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        body.render(f5);
        bomb.render(f5);
    }
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5,entity);
    }

}

