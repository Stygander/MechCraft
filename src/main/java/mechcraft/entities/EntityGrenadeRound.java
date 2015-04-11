package mechcraft.entities;

        import net.minecraft.entity.Entity;
        import net.minecraft.entity.EntityLivingBase;
        import net.minecraft.entity.projectile.EntityThrowable;
        import net.minecraft.util.DamageSource;
        import net.minecraft.util.MovingObjectPosition;
        import net.minecraft.world.Explosion;
        import net.minecraft.world.World;

/**
 * Created by mediacros on 12/16/2014.
 */
public class EntityGrenadeRound extends EntityThrowable {
    private float explosionRadius = 3.5F;

    public EntityGrenadeRound(World world) {
        super(world);
    }

    public EntityGrenadeRound(World world, EntityLivingBase par2EntityLivingBase) {
        super(world, par2EntityLivingBase);
    }

    public EntityGrenadeRound(World par1World, double par2, double par4, double par6) {
        super(par1World, par2, par4, par6);
    }

    private void setSpeed() {
        this.motionX *= 6;
        this.motionY *= 6;
        this.motionZ *= 6;

        setThrowableHeading(this.motionX, this.motionY, this.motionZ, rotationYaw, rotationPitch);

    }

    @Override
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
        if (par1MovingObjectPosition.entityHit != null) {
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 25f);
        }
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, this.explosionRadius, true);

        this.setDead();
    }


    @Override
    protected float getGravityVelocity() {
        return 0.01f;
    }

}

