package net.yummyramen2011.themod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.yummyramen2011.themod.YummyMod;

public class ModItems{
    //to add new item:
    //public static final Item YOUR_ITEM_NAME = registerItem("your_item_id", new Item(new Item.Settings()));
    //add item model
    //add texture
    //creative mode tab?

    public static final Item AN_AMAZING_ITEM = registerItem("amazing_item", new Item(new Item.Settings().rarity(Rarity.EPIC).fireproof().maxDamage(100)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(YummyMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        YummyMod.LOGGER.info("Regisitering Mod Items for" + YummyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(AN_AMAZING_ITEM);
        });
    }
}
