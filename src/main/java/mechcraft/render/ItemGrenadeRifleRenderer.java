package mechcraft.render;

import mechcraft.ModInfo;
import mechcraft.render.models.ModelGrenadeRifle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

/**
 * Created by mediacros on 12/30/2014.
 */
public class ItemGrenadeRifleRenderer implements IItemRenderer {

    protected ModelGrenadeRifle modelGrenadeRifle;

    public ResourceLocation Grifletexture = new ResourceLocation(ModInfo.ID + ":" + "textures/weapons/GrenadeRifle.png");


    public ItemGrenadeRifleRenderer() {
        modelGrenadeRifle = new ModelGrenadeRifle();
    }

    private void renderGrenadeRifle(ItemRenderType type, RenderBlocks render, ItemStack item, float translateX, float translateY, float translateZ, Object... data) {
        GL11.glPushMatrix();
        EntityItem entityItem = null;
        if (data.length == 2 && data[1] instanceof EntityItem) {
            entityItem = (EntityItem) data[1];
        } else if (type == ItemRenderType.ENTITY) {
            GL11.glTranslatef(0.0F, 2.0F, 0F);
            GL11.glRotatef(180f, 1f, 0f, 0f);
            GL11.glScalef(3.0F, 3.0F, 3.0F);
        } else if (type == ItemRenderType.EQUIPPED) {
            GL11.glRotatef(205.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(100.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-5.0F, 1.0F, 0.0F, 0.0F);
            GL11.glTranslatef(.2f, 1f, -1.25f);
            GL11.glScalef(.666f, .666f, .666f);

        } else if (type == ItemRenderType.EQUIPPED_FIRST_PERSON) {
            GL11.glRotatef(180, 1f,0f,0f);
            GL11.glTranslatef(1.5f, 0f, -3F);
            GL11.glScalef(3.0F, 3.0F, 3.0F);
        }else if (type == ItemRenderType.INVENTORY){
            GL11.glScalef(0, 0.12F, 0);
        }
        Minecraft.getMinecraft().renderEngine.bindTexture(Grifletexture);
        this.modelGrenadeRifle.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        switch (type) {
            case ENTITY:
                return true;
            case EQUIPPED:
                return true;
            case EQUIPPED_FIRST_PERSON:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch (type) {
            case EQUIPPED:
                this.renderGrenadeRifle(type, (RenderBlocks) data[0], item, -0.5f, -0.5f, -0.5f, data);
                break;
            case EQUIPPED_FIRST_PERSON:
                this.renderGrenadeRifle(type, (RenderBlocks) data[0], item, -0.5f, -0.5f, -0.5f, data);
                break;
            case ENTITY:
                this.renderGrenadeRifle(type, (RenderBlocks) data[0], item, -0.5f, -0.5f, -0.5f, data);
                break;
            default:
        }
    }
}