package guayabita.me.commandexample;

import guayabita.me.commandexample.commands.ExampleCMD;
import guayabita.me.commandexample.commands.TestCMD;
import guayabita.me.commandexample.utils.command.CommandManager;
import guayabita.me.commandexample.utils.config.FileConfig;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandExample extends JavaPlugin {

	@Override
	public void onEnable() {
		// Creating the ConfigFile
		FileConfig fileConfig = new FileConfig(this, "config.yml");

		// Casting Command manager by defining the JavaPlugin and the arraylist
		// in which the command I want to disable will be found.
		// You need to declare this before initializing the commands
		CommandManager commandManager = new CommandManager(this, fileConfig.getStringList("DISABLED-CMDS"));
		new ExampleCMD();
		new TestCMD();
	}
}
