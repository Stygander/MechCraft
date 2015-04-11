package mechcraft.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGaussBolt extends ModelBase
{
    //fields
    ModelRenderer Bolt1;
    ModelRenderer Bolt2;
    ModelRenderer Bolt3;
    ModelRenderer Bolt4;

    public ModelGaussBolt()
    {
        textureWidth = 64;
        textureHeight = 32;

        Bolt1 = new ModelRenderer(this, 0, 0);
        Bolt1.addBox(0F, 0F, 0F, 3, 3, 12);
        Bolt1.setRotationPoint(0F, 0F, 0F);
        Bolt1.setTextureSize(64, 32);
        Bolt1.mirror = true;
        setRotation(Bolt1, 0F, 0F, 0F);
        Bolt2 = new ModelRenderer(this, 18, 0);
        Bolt2.addBox(0F, 0F, 0F, 5, 5, 1);
        Bolt2.setRotationPoint(-1F, -1F, -1F);
        Bolt2.setTextureSize(64, 32);
        Bolt2.mirror = true;
        setRotation(Bolt2, 0F, 0F, 0F);
        Bolt3 = new ModelRenderer(this, 0, 2);
        Bolt3.addBox(0F, 0F, 0F, 3, 3, 1);
        Bolt3.setRotationPoint(0F, 0F, -2F);
        Bolt3.setTextureSize(64, 32);
        Bolt3.mirror = true;
        setRotation(Bolt3, 0F, 0F, 0F);
        Bolt4 = new ModelRenderer(this, 0, 0);
        Bolt4.addBox(0F, 0F, 0F, 1, 1, 1);
        Bolt4.setRotationPoint(1F, 1F, -3F);
        Bolt4.setTextureSize(64, 32);
        Bolt4.mirror = true;
        setRotation(Bolt4, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Bolt1.render(f5);
        Bolt2.render(f5);
        Bolt3.render(f5);
        Bolt4.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
