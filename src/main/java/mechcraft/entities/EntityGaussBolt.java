package mechcraft.entities;


import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGaussBolt extends EntityThrowable {
    private float explosionRadius = .5F;

    public EntityGaussBolt(World par1World)
    {
        super(par1World);
    }
    public EntityGaussBolt(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
    }
    public EntityGaussBolt(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
    private void setSpeed()
    {
    	this.motionX*=6;
    	this.motionY*=6;
    	this.motionZ*=6;

        setThrowableHeading(this.motionX, this.motionY, this.motionZ, rotationYaw, rotationPitch);

    }

    @Override
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition){
        if (par1MovingObjectPosition.entityHit != null){
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 20f);
        }
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius, true);
        this.setDead();
    }


    @Override
    protected float getGravityVelocity(){
        return 0.001f;
    }

}

