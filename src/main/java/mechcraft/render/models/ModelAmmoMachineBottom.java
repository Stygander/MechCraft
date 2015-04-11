package mechcraft.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by mediacros on 2/23/2015.
 */

public class ModelAmmoMachineBottom extends ModelBase
{
    //fields
    ModelRenderer Base;
    ModelRenderer output;
    ModelRenderer BottomFrameBack;
    ModelRenderer BottomMachina;

    public ModelAmmoMachineBottom()
    {
        textureWidth = 256;
        textureHeight = 128;

        Base = new ModelRenderer(this, 0, 0);
        Base.addBox(0F, 0F, 0F, 16, 4, 16);
        Base.setRotationPoint(0F, 20F, 0F);
        Base.setTextureSize(64, 32);
        Base.mirror = true;
        setRotation(Base, 0F, 0F, 0F);
        output = new ModelRenderer(this, 1, 40);
        output.addBox(0F, 0F, 0F, 14, 4, 14);
        output.setRotationPoint(1F, 16F, 1F);
        output.setTextureSize(64, 32);
        output.mirror = true;
        setRotation(output, 0F, 0F, 0F);
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
        output.render(f5);
        BottomFrameBack.render(f5);
        BottomMachina.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(Entity entity,float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}

