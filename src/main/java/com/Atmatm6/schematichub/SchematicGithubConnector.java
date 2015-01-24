package com.Atmatm6.schematichub;

import com.Atmatm6.schematichub.config.ReferenceStrings;
import com.Atmatm6.schematichub.schematic.CreateConfig;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = ReferenceStrings.modid, name = "Schematic Github Connector", version = "1.0-1.7.10")
public class SchematicGithubConnector {
    public static void preInit(FMLPreInitializationEvent event)
    {
        CreateConfig.main("schematics");
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        config.save();
    }
    public static void init(FMLInitializationEvent event)
    {

    }
}
