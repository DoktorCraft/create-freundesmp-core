package ch.dok.cfsmp.item;

import ch.dok.cfsmp.Cfsmp;
import ch.dok.cfsmp.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cfsmp.MODID);

    public static final RegistryObject<CreativeModeTab> CFSMP_TAB = CREATIVE_MODE_TABS.register("cfsmp_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MECHANIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.cfsmp"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MECHANIUM_INGOT.get());
                        pOutput.accept(ModItems.MECHANIUM_CRYSTAL.get());
                        pOutput.accept(ModItems.MECHANIUM_FRAGMENT.get());
                        pOutput.accept(ModItems.MECHANIUM_SHEET.get());
                        pOutput.accept(ModItems.MECHANIUM_NUGGET.get());
                        pOutput.accept(ModItems.NEPTUNIUM_INGOT.get());
                        pOutput.accept(ModItems.BLASTED_YELLOWCAKE.get());
                        pOutput.accept(ModItems.YELLOWCAKE.get());
                        pOutput.accept(ModItems.URANIUM_HEXAFLOURITE.get());
                        pOutput.accept(ModItems.PURE_URANIUM.get());
                        pOutput.accept(ModItems.RAW_MECHANIUM_CRYSTAL.get());
                        pOutput.accept(ModItems.PLUTONIUM_INGOT.get());
                        pOutput.accept(ModItems.URANINIT.get());
                        pOutput.accept(ModItems.CRUSHED_URANINIT.get());
                        pOutput.accept(ModBlocks.MECHANIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.NUCLEAR_CASING.get());
                        pOutput.accept(ModBlocks.NUCLEAR_CONTROLLER.get());
                        pOutput.accept(ModBlocks.ELECTORMAGNETIC_COIL.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}