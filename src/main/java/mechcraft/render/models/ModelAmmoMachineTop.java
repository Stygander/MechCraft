package mechcraft.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAmmoMachineTop extends ModelBase
{
    //fields
    ModelRenderer Top;
    ModelRenderer FrameBack;
    ModelRenderer Ingots;
    ModelRenderer Topmachina;

    public ModelAmmoMachineTop()
    {
        textureWidth = 256;
        textureHeight = 128;

        Top = new ModelRenderer(this, 0, 20);
        Top.addBox(0F, 0F, 0F, 16, 4, 16);
        Top.setRotationPoint(0F, -8F, 0F);
        Top.setTextureSize(64, 32);
        Top.mirror = true;
        setRotation(Top, 0F, 0F, 0F);
        FrameBack = new ModelRenderer(this, 64, 0);
        FrameBack.addBox(0F, 0F, 0F, 16, 12, 1);
        FrameBack.setRotationPoint(0F, -4F, 15F);
        FrameBack.setTextureSize(64, 32);
        FrameBack.mirror = true;
        setRotation(FrameBack, 0F, 0F, 0F);
        Ingots = new ModelRenderer(this, 98, 0);
        Ingots.addBox(0F, 0F, 0F, 14, 8, 14);
        Ingots.setRotationPoint(1F, -4F, 1F);
        Ingots.setTextureSize(64, 32);
        Ingots.mirror = true;
        setRotation(Ingots, 0F, 0F, 0F);
        Topmachina = new ModelRenderer(this, 0, 58);
        Topmachina.addBox(0F, 0F, 0F, 16, 4, 15);
        Topmachina.setRotationPoint(0F, 4F, 0F);
        Topmachina.setTextureSize(64, 32);
        Topmachina.mirror = true;
        setRotation(Topmachina, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Top.render(f5);
        FrameBack.render(f5);
        Ingots.render(f5);
        Topmachina.render(f5);
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
