package com.duckblade.runelite.comborunes;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ComboRunesOnlyPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ComboRunesOnlyPlugin.class);
		RuneLite.main(args);
	}
}
