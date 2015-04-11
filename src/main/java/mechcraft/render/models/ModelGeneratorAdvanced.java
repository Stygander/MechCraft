package mechcraft.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by mediacros on 2/27/2015.
 */
public class ModelGeneratorAdvanced extends ModelBase
{
    //fields
    ModelRenderer GenCore;
    ModelRenderer GenWallB;
    ModelRenderer GenWalla;
    ModelRenderer GenCornerfr;
    ModelRenderer GenCornerfl;
    ModelRenderer GenCornerbl;
    ModelRenderer GenCornerbr;
    ModelRenderer PillarBR;
    ModelRenderer Coil4BR;
    ModelRenderer Coil3BR;
    ModelRenderer Coil1BR;
    ModelRenderer Coil2BR;
    ModelRenderer Coil3FR;
    ModelRenderer Coil1FR;
    ModelRenderer Coil2FR;
    ModelRenderer Pillarfr;
    ModelRenderer Coil4FR;
    ModelRenderer Pillarfl;
    ModelRenderer Coil2FL;
    ModelRenderer Coil1FL;
    ModelRenderer Coil3FL;
    ModelRenderer Coil4FL;
    ModelRenderer Coil1BL;
    ModelRenderer Coil2BL;
    ModelRenderer Coil4BL;
    ModelRenderer Coil3BL;
    ModelRenderer PillarBL;

    public ModelGeneratorAdvanced()
    {
        textureWidth = 256;
        textureHeight = 128;

        GenCore = new ModelRenderer(this, 0, 0);
        GenCore.addBox(0F, 0F, 0F, 48, 48, 24);
        GenCore.setRotationPoint(-24F, -24F, -12F);
        GenCore.setTextureSize(64, 32);
        GenCore.mirror = true;
        setRotation(GenCore, 0F, 0F, 0F);
        GenWallB = new ModelRenderer(this, 144, 0);
        GenWallB.addBox(0F, 0F, 0F, 24, 48, 12);
        GenWallB.setRotationPoint(-12F, -24F, -24F);
        GenWallB.setTextureSize(64, 32);
        GenWallB.mirror = true;
        setRotation(GenWallB, 0F, 0F, 0F);
        GenWalla = new ModelRenderer(this, 144, 0);
        GenWalla.addBox(0F, 0F, 0F, 24, 48, 12);
        GenWalla.setRotationPoint(-12F, -24F, 12F);
        GenWalla.setTextureSize(64, 32);
        GenWalla.mirror = true;
        setRotation(GenWalla, 0F, 0F, 0F);
        GenCornerfr = new ModelRenderer(this, 0, 72);
        GenCornerfr.addBox(0F, 0F, 0F, 12, 36, 12);
        GenCornerfr.setRotationPoint(-24F, -12F, -24F);
        GenCornerfr.setTextureSize(64, 32);
        GenCornerfr.mirror = true;
        setRotation(GenCornerfr, 0F, 0F, 0F);
        GenCornerfl = new ModelRenderer(this, 0, 72);
        GenCornerfl.addBox(0F, 0F, 0F, 12, 36, 12);
        GenCornerfl.setRotationPoint(12F, -12F, -24F);
        GenCornerfl.setTextureSize(64, 32);
        GenCornerfl.mirror = true;
        setRotation(GenCornerfl, 0F, 0F, 0F);
        GenCornerbl = new ModelRenderer(this, 0, 72);
        GenCornerbl.addBox(0F, 0F, 0F, 12, 36, 12);
        GenCornerbl.setRotationPoint(12F, -12F, 12F);
        GenCornerbl.setTextureSize(64, 32);
        GenCornerbl.mirror = true;
        setRotation(GenCornerbl, 0F, 0F, 0F);
        GenCornerbr = new ModelRenderer(this, 0, 71);
        GenCornerbr.addBox(0F, 0F, 0F, 12, 36, 12);
        GenCornerbr.setRotationPoint(-24F, -12F, 12F);
        GenCornerbr.setTextureSize(64, 32);
        GenCornerbr.mirror = true;
        setRotation(GenCornerbr, 0F, 0F, 0F);
        PillarBR = new ModelRenderer(this, 0, 0);
        PillarBR.addBox(0F, 0F, 0F, 4, 11, 4);
        PillarBR.setRotationPoint(-20F, -23F, 16F);
        PillarBR.setTextureSize(64, 32);
        PillarBR.mirror = true;
        setRotation(PillarBR, 0F, 0F, 0F);
        Coil4BR = new ModelRenderer(this, 48, 108);
        Coil4BR.addBox(0F, 0F, 0F, 6, 2, 6);
        Coil4BR.setRotationPoint(-21F, -24F, 15F);
        Coil4BR.setTextureSize(64, 32);
        Coil4BR.mirror = true;
        setRotation(Coil4BR, 0F, 0F, 0F);
        Coil3BR = new ModelRenderer(this, 48, 98);
        Coil3BR.addBox(0F, 0F, 0F, 8, 2, 8);
        Coil3BR.setRotationPoint(-22F, -21F, 14F);
        Coil3BR.setTextureSize(64, 32);
        Coil3BR.mirror = true;
        setRotation(Coil3BR, 0F, 0F, 0F);
        Coil1BR = new ModelRenderer(this, 48, 72);
        Coil1BR.addBox(0F, 0F, 0F, 12, 2, 12);
        Coil1BR.setRotationPoint(-24F, -15F, 12F);
        Coil1BR.setTextureSize(64, 32);
        Coil1BR.mirror = true;
        setRotation(Coil1BR, 0F, 0F, 0F);
        Coil2BR = new ModelRenderer(this, 48, 86);
        Coil2BR.addBox(0F, 0F, 0F, 10, 2, 10);
        Coil2BR.setRotationPoint(-23F, -18F, 13F);
        Coil2BR.setTextureSize(64, 32);
        Coil2BR.mirror = true;
        setRotation(Coil2BR, 0F, 0F, 0F);
        Coil3FR = new ModelRenderer(this, 48, 98);
        Coil3FR.addBox(0F, 0F, 0F, 8, 2, 8);
        Coil3FR.setRotationPoint(-22F, -21F, -22F);
        Coil3FR.setTextureSize(64, 32);
        Coil3FR.mirror = true;
        setRotation(Coil3FR, 0F, 0F, 0F);
        Coil1FR = new ModelRenderer(this, 48, 72);
        Coil1FR.addBox(0F, 0F, 0F, 12, 2, 12);
        Coil1FR.setRotationPoint(-24F, -15F, -24F);
        Coil1FR.setTextureSize(64, 32);
        Coil1FR.mirror = true;
        setRotation(Coil1FR, 0F, 0F, 0F);
        Coil2FR = new ModelRenderer(this, 48, 86);
        Coil2FR.addBox(0F, 0F, 0F, 10, 2, 10);
        Coil2FR.setRotationPoint(-23F, -18F, -23F);
        Coil2FR.setTextureSize(64, 32);
        Coil2FR.mirror = true;
        setRotation(Coil2FR, 0F, 0F, 0F);
        Pillarfr = new ModelRenderer(this, 0, 0);
        Pillarfr.addBox(0F, 0F, 0F, 4, 11, 4);
        Pillarfr.setRotationPoint(-20F, -23F, -20F);
        Pillarfr.setTextureSize(64, 32);
        Pillarfr.mirror = true;
        setRotation(Pillarfr, 0F, 0F, 0F);
        Coil4FR = new ModelRenderer(this, 48, 108);
        Coil4FR.addBox(0F, 0F, 0F, 6, 2, 6);
        Coil4FR.setRotationPoint(-21F, -24F, -21F);
        Coil4FR.setTextureSize(64, 32);
        Coil4FR.mirror = true;
        setRotation(Coil4FR, 0F, 0F, 0F);
        Pillarfl = new ModelRenderer(this, 0, 0);
        Pillarfl.addBox(0F, 0F, 0F, 4, 11, 4);
        Pillarfl.setRotationPoint(16F, -23F, -20F);
        Pillarfl.setTextureSize(64, 32);
        Pillarfl.mirror = true;
        setRotation(Pillarfl, 0F, 0F, 0F);
        Coil2FL = new ModelRenderer(this, 48, 86);
        Coil2FL.addBox(0F, 0F, 0F, 10, 2, 10);
        Coil2FL.setRotationPoint(13F, -18F, -23F);
        Coil2FL.setTextureSize(64, 32);
        Coil2FL.mirror = true;
        setRotation(Coil2FL, 0F, 0F, 0F);
        Coil1FL = new ModelRenderer(this, 48, 72);
        Coil1FL.addBox(0F, 0F, 0F, 12, 2, 12);
        Coil1FL.setRotationPoint(12F, -15F, -24F);
        Coil1FL.setTextureSize(64, 32);
        Coil1FL.mirror = true;
        setRotation(Coil1FL, 0F, 0F, 0F);
        Coil3FL = new ModelRenderer(this, 48, 98);
        Coil3FL.addBox(0F, 0F, 0F, 8, 2, 8);
        Coil3FL.setRotationPoint(14F, -21F, -22F);
        Coil3FL.setTextureSize(64, 32);
        Coil3FL.mirror = true;
        setRotation(Coil3FL, 0F, 0F, 0F);
        Coil4FL = new ModelRenderer(this, 48, 108);
        Coil4FL.addBox(0F, 0F, 0F, 6, 2, 6);
        Coil4FL.setRotationPoint(15F, -24F, -21F);
        Coil4FL.setTextureSize(64, 32);
        Coil4FL.mirror = true;
        setRotation(Coil4FL, 0F, 0F, 0F);
        Coil1BL = new ModelRenderer(this, 48, 72);
        Coil1BL.addBox(0F, 0F, 0F, 12, 2, 12);
        Coil1BL.setRotationPoint(12F, -15F, 12F);
        Coil1BL.setTextureSize(64, 32);
        Coil1BL.mirror = true;
        setRotation(Coil1BL, 0F, 0F, 0F);
        Coil2BL = new ModelRenderer(this, 48, 86);
        Coil2BL.addBox(0F, 0F, 0F, 10, 2, 10);
        Coil2BL.setRotationPoint(13F, -18F, 13F);
        Coil2BL.setTextureSize(64, 32);
        Coil2BL.mirror = true;
        setRotation(Coil2BL, 0F, 0F, 0F);
        Coil4BL = new ModelRenderer(this, 48, 108);
        Coil4BL.addBox(0F, 0F, 0F, 6, 2, 6);
        Coil4BL.setRotationPoint(15F, -24F, 15F);
        Coil4BL.setTextureSize(64, 32);
        Coil4BL.mirror = true;
        setRotation(Coil4BL, 0F, 0F, 0F);
        Coil3BL = new ModelRenderer(this, 48, 98);
        Coil3BL.addBox(0F, 0F, 0F, 8, 2, 8);
        Coil3BL.setRotationPoint(14F, -21F, 14F);
        Coil3BL.setTextureSize(64, 32);
        Coil3BL.mirror = true;
        setRotation(Coil3BL, 0F, 0F, 0F);
        PillarBL = new ModelRenderer(this, 0, 0);
        PillarBL.addBox(0F, 0F, 0F, 4, 11, 4);
        PillarBL.setRotationPoint(16F, -23F, 16F);
        PillarBL.setTextureSize(64, 32);
        PillarBL.mirror = true;
        setRotation(PillarBL, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GenCore.render(f5);
        GenWallB.render(f5);
        GenWalla.render(f5);
        GenCornerfr.render(f5);
        GenCornerfl.render(f5);
        GenCornerbl.render(f5);
        GenCornerbr.render(f5);
        PillarBR.render(f5);
        Coil4BR.render(f5);
        Coil3BR.render(f5);
        Coil1BR.render(f5);
        Coil2BR.render(f5);
        Coil3FR.render(f5);
        Coil1FR.render(f5);
        Coil2FR.render(f5);
        Pillarfr.render(f5);
        Coil4FR.render(f5);
        Pillarfl.render(f5);
        Coil2FL.render(f5);
        Coil1FL.render(f5);
        Coil3FL.render(f5);
        Coil4FL.render(f5);
        Coil1BL.render(f5);
        Coil2BL.render(f5);
        Coil4BL.render(f5);
        Coil3BL.render(f5);
        PillarBL.render(f5);
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