package mechcraft.render.models;
        import net.minecraft.client.model.ModelBase;
        import net.minecraft.client.model.ModelRenderer;
        import net.minecraft.entity.Entity;

public class ModelHoverCraft extends ModelBase
{

    //fields
    public ModelRenderer Skirtbaser;
    public ModelRenderer SkirtFront;
    public ModelRenderer Skirtbody;
    public ModelRenderer EngineBlock;
    public ModelRenderer seatl;
    public ModelRenderer seatr;
    public ModelRenderer seatf;
    public ModelRenderer sheildbase;
    public ModelRenderer rutter2;
    public ModelRenderer rutter4;
    public ModelRenderer jetl;
    public ModelRenderer rutter3;
    public ModelRenderer rutter1;
    public ModelRenderer jetr;
    public ModelRenderer Skirtbasel;

    public ModelHoverCraft()
    {

        textureWidth = 256;
        textureHeight = 128;

        Skirtbaser = new ModelRenderer(this, 0, 47);
        Skirtbaser.addBox(0F, 0F, 0F, 8, 8, 40);
        Skirtbaser.setRotationPoint(-16F, 16F, -8F);
        Skirtbaser.setTextureSize(64, 32);
        Skirtbaser.mirror = true;
        setRotation(Skirtbaser, 0F, 0F, 0F);
        SkirtFront = new ModelRenderer(this, 56, 47);
        SkirtFront.addBox(0F, 0F, 0F, 32, 8, 8);
        SkirtFront.setRotationPoint(-16F, 16F, -16F);
        SkirtFront.setTextureSize(64, 32);
        SkirtFront.mirror = true;
        setRotation(SkirtFront, 0F, 0F, 0F);
        Skirtbody = new ModelRenderer(this, 0, 0);
        Skirtbody.addBox(0F, 0F, 0F, 16, 7, 40);
        Skirtbody.setRotationPoint(-8F, 17F, -8F);
        Skirtbody.setTextureSize(64, 32);
        Skirtbody.mirror = true;
        setRotation(Skirtbody, 0F, 0F, 0F);
        EngineBlock = new ModelRenderer(this, 72, 0);
        EngineBlock.addBox(0F, 0F, 0F, 16, 9, 15);
        EngineBlock.setRotationPoint(-8F, 8F, 10F);
        EngineBlock.setTextureSize(64, 32);
        EngineBlock.mirror = true;
        setRotation(EngineBlock, 0F, 0F, 0F);
        seatl = new ModelRenderer(this, 122, 0);
        seatl.addBox(0F, 0F, 0F, 2, 5, 16);
        seatl.setRotationPoint(6F, 12F, -6F);
        seatl.setTextureSize(64, 32);
        seatl.mirror = true;
        setRotation(seatl, 0F, 0F, 0F);
        seatr = new ModelRenderer(this, 122, 0);
        seatr.addBox(0F, 0F, 0F, 2, 5, 17);
        seatr.setRotationPoint(-8F, 12F, -6F);
        seatr.setTextureSize(64, 32);
        seatr.mirror = true;
        setRotation(seatr, 0F, 0F, 0F);
        seatf = new ModelRenderer(this, 72, 30);
        seatf.addBox(0F, 0F, 0F, 16, 6, 1);
        seatf.setRotationPoint(-8F, 12F, -7F);
        seatf.setTextureSize(64, 32);
        seatf.mirror = true;
        setRotation(seatf, 0F, 0F, 0F);
        sheildbase = new ModelRenderer(this, 138, 0);
        sheildbase.addBox(0F, 0F, 0F, 16, 1, 7);
        sheildbase.setRotationPoint(-8F, 16F, 25F);
        sheildbase.setTextureSize(64, 32);
        sheildbase.mirror = true;
        setRotation(sheildbase, 0F, 0F, 0F);
        rutter2 = new ModelRenderer(this, 0, 0);
        rutter2.addBox(0F, 0F, 0F, 2, 6, 2);
        rutter2.setRotationPoint(-1F, 10F, 27F);
        rutter2.setTextureSize(64, 32);
        rutter2.mirror = true;
        setRotation(rutter2, 0F, 0F, 0F);
        rutter4 = new ModelRenderer(this, 22, 0);
        rutter4.addBox(0F, 0F, 0F, 2, 2, 1);
        rutter4.setRotationPoint(-1F, 14F, 31F);
        rutter4.setTextureSize(64, 32);
        rutter4.mirror = true;
        setRotation(rutter4, 0F, 0F, 0F);
        jetl = new ModelRenderer(this, 28, 0);
        jetl.addBox(0F, 0F, 0F, 3, 3, 1);
        jetl.setRotationPoint(3F, 10F, 25F);
        jetl.setTextureSize(64, 32);
        jetl.mirror = true;
        setRotation(jetl, 0F, 0F, 0F);
        rutter3 = new ModelRenderer(this, 0, 0);
        rutter3.addBox(0F, 0F, 0F, 2, 4, 2);
        rutter3.setRotationPoint(-1F, 12F, 29F);
        rutter3.setTextureSize(64, 32);
        rutter3.mirror = true;
        setRotation(rutter3, 0F, 0F, 0F);
        rutter1 = new ModelRenderer(this, 0, 0);
        rutter1.addBox(0F, 0F, 0F, 2, 8, 2);
        rutter1.setRotationPoint(-1F, 8F, 25F);
        rutter1.setTextureSize(64, 32);
        rutter1.mirror = true;
        setRotation(rutter1, 0F, 0F, 0F);
        jetr = new ModelRenderer(this, 28, 0);
        jetr.addBox(0F, 0F, 0F, 3, 3, 1);
        jetr.setRotationPoint(-6F, 10F, 25F);
        jetr.setTextureSize(64, 32);
        jetr.mirror = true;
        setRotation(jetr, 0F, 0F, 0F);
        Skirtbasel = new ModelRenderer(this, 0, 47);
        Skirtbasel.addBox(0F, 0F, 0F, 8, 8, 40);
        Skirtbasel.setRotationPoint(8F, 16F, -8F);
        Skirtbasel.setTextureSize(64, 32);
        Skirtbasel.mirror = true;
        setRotation(Skirtbasel, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Skirtbaser.render(f5);
        SkirtFront.render(f5);
        Skirtbody.render(f5);
        EngineBlock.render(f5);
        seatl.render(f5);
        seatr.render(f5);
        seatf.render(f5);
        sheildbase.render(f5);
        rutter2.render(f5);
        rutter4.render(f5);
        jetl.render(f5);
        rutter3.render(f5);
        rutter1.render(f5);
        jetr.render(f5);
        Skirtbasel.render(f5);
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
