package wurmcraft.wurmatron.common.recipes.mods;

import advsolar.common.AdvancedSolarPanel;
import advsolar.utils.MTRecipeManager;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.Optional;
import crazypants.enderio.EnderIO;
import ic2.api.item.IC2Items;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import wurmcraft.wurmatron.common.items.WurmTweaksItems;
import wurmcraft.wurmatron.common.recipes.utils.RecipeHelper;

public class AdvancedSolarPanelRecipes {

		private static RecipeHelper r = RecipeHelper.instance;

		@Optional.Method (modid = "AdvancedSolarPanel")
		public static void addRecipes () {
				r.addShaped(new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 0), "GGG", "BCB", "XSX", 'G', AdvancedSolarPanel.itemIrradiantGlassPane, 'B', IC2Items.getItem("advancedMachine"), 'C', WurmTweaksItems.itemSolarCore, 'X', IC2Items.getItem("advancedCircuit"), 'S', IC2Items.getItem("solarPanel"));
				r.addShaped(new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 1), "SXS", "BCB", "PGP", 'S', TFCItems.platinumSheet2x, 'X', AdvancedSolarPanel.itemIrradiantReinforcedPlate, 'B', IC2Items.getItem("advancedMachine"), 'C', new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 0), 'P', WurmTweaksItems.itemCraftingCore, 'G', WurmTweaksItems.ingotGreenSteel);
				r.addCircleWithCenter(new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 2), new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 1), AdvancedSolarPanel.itemEnrichedSunnariumAlloy);
				r.addCircleWithCenter(new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 3), new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 3), AdvancedSolarPanel.itemQuantumCore);
				r.addBasicMachineRecipe(AdvancedSolarPanel.blockMolecularTransformer, IC2Items.getItem("advancedMachine"), IC2Items.getItem("evTransformer"), WurmTweaksItems.ingotEnergyReactor, AdvancedSolarPanel.itemMTCore);
				r.addShapeless(AdvancedSolarPanel.advancedSolarHelmet, new ItemStack(IC2Items.getItem("nanoHelmet").getItem(), 1, OreDictionary.WILDCARD_VALUE), new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 0));
				r.addShapeless(AdvancedSolarPanel.hybridSolarHelmet, new ItemStack(IC2Items.getItem("quantumHelmet").getItem(), 1, OreDictionary.WILDCARD_VALUE), new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 1));
				r.addShapeless(AdvancedSolarPanel.ultimateSolarHelmet, new ItemStack(IC2Items.getItem("quantumHelmet").getItem(), 1, OreDictionary.WILDCARD_VALUE), new ItemStack(AdvancedSolarPanel.blockAdvSolarPanel, 1, 2));
				r.addShaped(AdvancedSolarPanel.itemIrradiantGlassPane, "GGG", "IXI", "GGG", 'G', EnderIO.blockFusedQuartz, 'I', AdvancedSolarPanel.itemIrradiantUranium, IC2Items.getItem("advancedAlloy"));
				r.addShaped(AdvancedSolarPanel.itemIrradiantGlassPane, "GGG", "IXI", "GGG", 'G', IC2Items.getItem("reinforcedGlass").getItem(), 'I', AdvancedSolarPanel.itemIrradiantUranium, IC2Items.getItem("advancedAlloy"));
				r.addCrossWithCenter(AdvancedSolarPanel.itemQuantumCore, WurmTweaksItems.itemMixedSheet, WurmTweaksItems.ingotGreenSteel, TFCItems.unknownIngot);
				r.addCross(AdvancedSolarPanel.itemMTCore, IC2Items.getItem("advancedAlloy"), AdvancedSolarPanel.itemQuantumCore);
				r.add3x(AdvancedSolarPanel.itemSunnarium, AdvancedSolarPanel.itemSunnariumPart);
				r.addCircleWithCenter(AdvancedSolarPanel.itemEnrichedSunnarium, AdvancedSolarPanel.itemSunnarium, AdvancedSolarPanel.itemIrradiantUranium);
				r.addCircleWithCenter(AdvancedSolarPanel.itemEnrichedSunnariumAlloy, IC2Items.getItem("iridiumPlate"), AdvancedSolarPanel.itemEnrichedSunnarium);
				addMolecularTransformerRecipes();
		}

		@Optional.Method (modid = "AdvancedSolarPanel")
		public static void addMolecularTransformerRecipes () {
				MTRecipeManager.transformerRecipes.clear();
				MTRecipeManager.instance.addMTRecipe(new ItemStack(Items.glowstone_dust), AdvancedSolarPanel.itemSunnariumPart, 1000000);
				MTRecipeManager.instance.addMTRecipe(new ItemStack(Blocks.glowstone), AdvancedSolarPanel.itemSunnarium, 9000000);
				MTRecipeManager.instance.addMTOreDict("packIngot", AdvancedSolarPanel.itemIrradiantUranium, 10000000);
				MTRecipeManager.instance.addMTRecipe(new ItemStack(Blocks.skull, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.skull, 1), 100000000);
				MTRecipeManager.instance.addMTRecipe(WurmTweaksItems.ingotGreenSteel, new ItemStack(Blocks.skull, 1), 1000000000);
				MTRecipeManager.instance.addMTRecipe(new ItemStack(TFCItems.platinumIngot), new ItemStack(TFCItems.nickelIngot, 2), 100000);
		}
}
