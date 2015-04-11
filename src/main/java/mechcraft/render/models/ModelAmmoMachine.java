package mechcraft.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by mediacros on 2/23/2015.
 */

public class ModelAmmoMachine extends ModelBase
{
    //fields
    ModelRenderer Base;
    ModelRenderer Top;
    ModelRenderer FrameBack;
    ModelRenderer output;
    ModelRenderer Ingots;
    ModelRenderer Topmachina;
    ModelRenderer BottomFrameBack;
    ModelRenderer BottomMachina;

    public ModelAmmoMachine()
    {
        textureWidth = 256;
        textureHeight = 128;

        Base = new ModelRenderer(this, 0, 0);
        Base.addBox(0F, 0F, 0F, 16, 4, 16);
        Base.setRotationPoint(0F, 20F, 0F);
        Base.setTextureSize(256, 128);
        Base.mirror = true;
        setRotation(Base, 0F, 0F, 0F);
        Top = new ModelRenderer(this, 0, 20);
        Top.addBox(0F, 0F, 0F, 16, 4, 16);
        Top.setRotationPoint(0F, -8F, 0F);
        Top.setTextureSize(256, 128);
        Top.mirror = true;
        setRotation(Top, 0F, 0F, 0F);
        FrameBack = new ModelRenderer(this, 64, 0);
        FrameBack.addBox(0F, 0F, 0F, 16, 12, 1);
        FrameBack.setRotationPoint(0F, -4F, 15F);
        FrameBack.setTextureSize(256, 128);
        FrameBack.mirror = true;
        setRotation(FrameBack, 0F, 0F, 0F);
        output = new ModelRenderer(this, 1, 40);
        output.addBox(0F, 0F, 0F, 14, 4, 14);
        output.setRotationPoint(1F, 16F, 1F);
        output.setTextureSize(256, 128);
        output.mirror = true;
        setRotation(output, 0F, 0F, 0F);
        Ingots = new ModelRenderer(this, 98, 0);
        Ingots.addBox(0F, 0F, 0F, 14, 8, 14);
        Ingots.setRotationPoint(1F, -4F, 1F);
        Ingots.setTextureSize(256, 128);
        Ingots.mirror = true;
        setRotation(Ingots, 0F, 0F, 0F);
        Topmachina = new ModelRenderer(this, 0, 58);
        Topmachina.addBox(0F, 0F, 0F, 16, 4, 15);
        Topmachina.setRotationPoint(0F, 4F, 0F);
        Topmachina.setTextureSize(256, 128);
        Topmachina.mirror = true;
        setRotation(Topmachina, 0F, 0F, 0F);
        BottomFrameBack = new ModelRenderer(this, 64, 13);
        BottomFrameBack.addBox(0F, 0F, 0F, 16, 12, 1);
        BottomFrameBack.setRotationPoint(0F, 8F, 15F);
        BottomFrameBack.setTextureSize(256, 128);
        BottomFrameBack.mirror = true;
        setRotation(BottomFrameBack, 0F, 0F, 0F);
        BottomMachina = new ModelRenderer(this, 97, 22);
        BottomMachina.addBox(0F, 0F, 0F, 16, 8, 15);
        BottomMachina.setRotationPoint(0F, 8F, 0F);
        BottomMachina.setTextureSize(256, 128);
        BottomMachina.mirror = true;
        setRotation(BottomMachina, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Base.render(f5);
        Top.render(f5);
        FrameBack.render(f5);
        output.render(f5);
        Ingots.render(f5);
        Topmachina.render(f5);
        BottomFrameBack.render(f5);
        BottomMachina.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }


    public void setRotationAngles(Entity entity ,float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAngles( f, f1, f2, f3, f4, f5,entity);
    }

}
