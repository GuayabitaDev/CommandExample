package guayabita.me.commandexample.commands;

import guayabita.me.commandexample.utils.command.BaseCommand;
import guayabita.me.commandexample.utils.command.Command;
import guayabita.me.commandexample.utils.command.CommandArgs;
import org.bukkit.command.CommandSender;

public class TestCMD extends BaseCommand {

	// Another average command!
	@Command(name = "test")
	@Override
	public void onCommand(CommandArgs command) {
		CommandSender sender = command.getSender();
		sender.sendMessage("This is test CMD!");
	}
}
