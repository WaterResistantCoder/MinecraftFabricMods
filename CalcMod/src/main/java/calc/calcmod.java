package calc;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;




public class calcmod implements ModInitializer {

    /* Declare and initialize our custom block instance.
       We set our block material to METAL, which requires a pickaxe to efficiently break.
       Hardness represents how long the break takes to break. Stone has a hardness of 1.5f, while Obsidian has a hardness of 50.0f.
    */
    public static final CalcModClass CALC_BLOCK = new CalcModClass(FabricBlockSettings.of(Material.METAL).hardness(4.0f));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("calcmod", "calc"), CALC_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("calcmod","calc"), new BlockItem(CALC_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
    }
}