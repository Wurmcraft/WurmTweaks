package wurmcraft.wurmatron.common.config;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import wurmcraft.wurmatron.common.reference.Global;
import wurmcraft.wurmatron.common.utils.LogHandler;

public class ConfigHandler {

		public static Configuration config;

		private static Property debug;
		// Mods
		private static Property Avaritia;
		private static Property AdvancedSolarPanels;
		private static Property AM2;
		private static Property AE2;
		private static Property EnderIO;
		private static Property BigReactors;
		private static Property BloodMagic;
		private static Property Botania;
		private static Property BuildCraft;
		private static Property CarpentersBlocks;
		private static Property Chisel;
		private static Property ComputerCraft;
		private static Property CraftHeraldry;
		private static Property DraconicEvolution;
		private static Property IronChest;
		private static Property EnderStorage;
		private static Property ExtraCells;
		private static Property ExtraUtilities;
		private static Property GalaticCraft;
		private static Property GraviSuite;
		private static Property ImmersiveEngineering;
		private static Property IC2;
		private static Property JABBA;
		private static Property MalisisDoors;
		private static Property Mekanism;

		public static void init (FMLPreInitializationEvent e) {
				config = new Configuration(e.getSuggestedConfigurationFile());
				syncConfig();
		}

		public static void syncConfig () {
				debug = config.get(Configuration.CATEGORY_GENERAL, Global.DEBUG, Defaults.DEBUG, "Enable debug mode");
				Settings.debug = debug.getBoolean();
				// Mods
				Avaritia = config.get(Global.CATEGORY_MODS, "Avaritia", true);
				Settings.Avaritia = Avaritia.getBoolean();
				AdvancedSolarPanels = config.get(Global.CATEGORY_MODS, "AdvancedSolarPanels", true);
				Settings.AdvancedSolarPanels = AdvancedSolarPanels.getBoolean();
				AM2 = config.get(Global.CATEGORY_MODS, "ArsMagica2", true);
				Settings.AM2 = AM2.getBoolean();
				AE2 = config.get(Global.CATEGORY_MODS, "AppliedEnergistics", true);
				Settings.AE2 = AE2.getBoolean();
				EnderIO = config.get(Global.CATEGORY_MODS, "EnderIO", true);
				Settings.EnderIO = EnderIO.getBoolean();
				BigReactors = config.get(Global.CATEGORY_MODS, "BigReactors", true);
				Settings.BigReactors = BigReactors.getBoolean();
				BloodMagic = config.get(Global.CATEGORY_MODS, "BloodMagic", true);
				Settings.BloodMagic = BloodMagic.getBoolean();
				Botania = config.get(Global.CATEGORY_MODS, "Botania", true);
				Settings.Botania = Botania.getBoolean();
				BuildCraft = config.get(Global.CATEGORY_MODS, "Buildcraft", true);
				Settings.BuildCraft = BuildCraft.getBoolean();
				CarpentersBlocks = config.get(Global.CATEGORY_MODS, "CarpentersBlocks", true);
				Settings.CarpentersBlocks = CarpentersBlocks.getBoolean();
				Chisel = config.get(Global.CATEGORY_MODS, "Chisel", true);
				Settings.Chisel = Chisel.getBoolean();
				ComputerCraft = config.get(Global.CATEGORY_MODS, "ComputerCraft", true);
				Settings.ComputerCraft = ComputerCraft.getBoolean();
				CraftHeraldry = config.get(Global.CATEGORY_MODS, "CraftHeraldry", true);
				Settings.CraftHeraldry = CraftHeraldry.getBoolean();
				DraconicEvolution = config.get(Global.CATEGORY_MODS, "DraconicEvolution", true);
				Settings.DraconicEvolution = DraconicEvolution.getBoolean();
				IronChest = config.get(Global.CATEGORY_MODS, "IronChest", true);
				Settings.IronChest = IronChest.getBoolean();
				EnderStorage = config.get(Global.CATEGORY_MODS, "EnderStorage", true);
				Settings.EnderStorage = EnderStorage.getBoolean();
				ExtraCells = config.get(Global.CATEGORY_MODS, "ExtraCells", true);
				Settings.ExtraCells = ExtraCells.getBoolean();
				ExtraUtilities = config.get(Global.CATEGORY_MODS, "ExtraUtilities", true);
				Settings.ExtraUtilities = ExtraUtilities.getBoolean();
				GalaticCraft = config.get(Global.CATEGORY_MODS, "GalaticCraft", true);
				Settings.GalaticCraft = GalaticCraft.getBoolean();
				GraviSuite = config.get(Global.CATEGORY_MODS, "GraviSuite", true);
				Settings.GraviSuite = GraviSuite.getBoolean();
				ImmersiveEngineering = config.get(Global.CATEGORY_MODS, "ImmersiveEngineering", true);
				Settings.ImmersiveEngineering = ImmersiveEngineering.getBoolean();
				IC2 = config.get(Global.CATEGORY_MODS, "IndustrialCraft2", true);
				Settings.IC2 = IC2.getBoolean();
				JABBA = config.get(Global.CATEGORY_MODS, "JABBA", true);
				Settings.JABBA = JABBA.getBoolean();
				MalisisDoors = config.get(Global.CATEGORY_MODS, "MalisisDoors", true);
				Settings.MalisisDoors = MalisisDoors.getBoolean();
				Mekanism = config.get(Global.CATEGORY_MODS, "Mekanism", true);
				Settings.Mekanism = Mekanism.getBoolean();

				LogHandler.info("Loaded Config");
				if (config.hasChanged()) {
						config.save();
						LogHandler.info("Config Saved");
				}
		}

		private static class Defaults {
				private static final boolean DEBUG = false;
		}
}
