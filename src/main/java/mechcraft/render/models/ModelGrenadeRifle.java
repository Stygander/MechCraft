package mechcraft.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGrenadeRifle extends ModelBase
{
    //fields
    ModelRenderer BarrelL;
    ModelRenderer Body;
    ModelRenderer BarrelT;
    ModelRenderer BarrelR;
    ModelRenderer Backfire;
    ModelRenderer Stock;
    ModelRenderer BarrelB;
    ModelRenderer BodyB;
    ModelRenderer grip;
    ModelRenderer StockButt;

    public ModelGrenadeRifle()
    {
        textureWidth = 64;
        textureHeight = 32;

        BarrelL = new ModelRenderer(this, 0, 0);
        BarrelL.addBox(0F, 0F, 0F, 1, 3, 8);
        BarrelL.setRotationPoint(1F, -1F, 0F);
        BarrelL.setTextureSize(64, 32);
        BarrelL.mirror = true;
        setRotation(BarrelL, 0F, 0F, 0F);
        Body = new ModelRenderer(this, 0, 20);
        Body.addBox(0F, 0F, 0F, 1, 1, 8);
        Body.setRotationPoint(0F, 3F, 2F);
        Body.setTextureSize(64, 32);
        Body.mirror = true;
        setRotation(Body, 0F, 0F, 0F);
        BarrelT = new ModelRenderer(this, 0, 11);
        BarrelT.addBox(0F, 0F, 0F, 1, 1, 8);
        BarrelT.setRotationPoint(0F, -1F, 0F);
        BarrelT.setTextureSize(64, 32);
        BarrelT.mirror = true;
        setRotation(BarrelT, 0F, 0F, 0F);
        BarrelR = new ModelRenderer(this, 0, 0);
        BarrelR.addBox(0F, 0F, 0F, 1, 3, 8);
        BarrelR.setRotationPoint(-1F, -1F, 0F);
        BarrelR.setTextureSize(64, 32);
        BarrelR.mirror = true;
        setRotation(BarrelR, 0F, 0F, 0F);
        Backfire = new ModelRenderer(this, 10, 11);
        Backfire.addBox(0F, 0F, 0F, 3, 3, 2);
        Backfire.setRotationPoint(-1F, -1F, 8F);
        Backfire.setTextureSize(64, 32);
        Backfire.mirror = true;
        setRotation(Backfire, 0F, 0F, 0F);
        Stock = new ModelRenderer(this, 18, 11);
        Stock.addBox(0F, 0F, 0F, 2, 2, 8);
        Stock.setRotationPoint(-0.5F, 1F, 9F);
        Stock.setTextureSize(64, 32);
        Stock.mirror = true;
        setRotation(Stock, 0F, 0F, 0F);
        BarrelB = new ModelRenderer(this, 0, 11);
        BarrelB.addBox(0F, 0F, 0F, 1, 1, 8);
        BarrelB.setRotationPoint(0F, 1F, 0F);
        BarrelB.setTextureSize(64, 32);
        BarrelB.mirror = true;
        setRotation(BarrelB, 0F, 0F, 0F);
        BodyB = new ModelRenderer(this, 18, 0);
        BodyB.addBox(0F, 0F, 0F, 2, 1, 10);
        BodyB.setRotationPoint(-0.5F, 2F, 1F);
        BodyB.setTextureSize(64, 32);
        BodyB.mirror = true;
        setRotation(BodyB, 0F, 0F, 0F);
        grip = new ModelRenderer(this, 16, 0);
        grip.addBox(0F, 0F, 0F, 1, 4, 2);
        grip.setRotationPoint(0F, 4F, 8F);
        grip.setTextureSize(64, 32);
        grip.mirror = true;
        setRotation(grip, 0.4363323F, 0F, 0F);
        StockButt = new ModelRenderer(this, 10, 0);
        StockButt.addBox(0F, 0F, 0F, 2, 5, 1);
        StockButt.setRotationPoint(-0.5F, 0F, 17F);
        StockButt.setTextureSize(64, 32);
        StockButt.mirror = true;
        setRotation(StockButt, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        BarrelL.render(f5);
        Body.render(f5);
        BarrelT.render(f5);
        BarrelR.render(f5);
        Backfire.render(f5);
        Stock.render(f5);
        BarrelB.render(f5);
        BodyB.render(f5);
        grip.render(f5);
        StockButt.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}