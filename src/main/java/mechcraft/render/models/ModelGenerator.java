package mechcraft.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGenerator extends ModelBase
{
    //fields
    ModelRenderer Generator;

    public ModelGenerator()
    {
        textureWidth = 256;
        textureHeight = 128;

        Generator = new ModelRenderer(this, 0, 0);
        Generator.addBox(0F, 0F, 0F, 48, 48, 48);
        Generator.setRotationPoint(0F, -24F, 0F);
        Generator.setTextureSize(256, 128);
        Generator.mirror = true;
        setRotation(Generator, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Generator.render(f5);
    }
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
