package mechcraft.pcp;

import mechcraft.ModInfo;
import mechcraft.items.MechItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class tabMechCraft extends CreativeTabs {
    public tabMechCraft(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return MechItems.mechSig;
    }


}
