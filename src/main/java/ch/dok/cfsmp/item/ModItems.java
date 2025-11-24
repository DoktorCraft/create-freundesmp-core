package ch.dok.cfsmp.item;

import ch.dok.cfsmp.Cfsmp;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Cfsmp.MODID);

    public static final RegistryObject<Item> MECHANIUM_INGOT = ITEMS.register("mechanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MECHANIUM_NUGGET = ITEMS.register("mechanium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MECHANIUM_SHEET = ITEMS.register("mechanium_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEPTUNIUM_INGOT = ITEMS.register("neptunium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOWCAKE = ITEMS.register("yellowcake",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLASTED_YELLOWCAKE = ITEMS.register("blasted_yellowcake",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MECHANIUM_CRYSTAL = ITEMS.register("mechanium_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MECHANIUM_FRAGMENT = ITEMS.register("mechanium_fragment",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURE_URANIUM = ITEMS.register("pure_uranium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_HEXAFLOURITE = ITEMS.register("uranium_hexaflourite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MECHANIUM_CRYSTAL = ITEMS.register("raw_mechanium_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUTONIUM_INGOT = ITEMS.register("plutonium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANINIT = ITEMS.register("uraninit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_URANINIT = ITEMS.register("crushed_uraninit",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
