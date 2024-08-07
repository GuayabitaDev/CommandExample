package guayabita.me.commandexample.commands;

import guayabita.me.commandexample.utils.command.BaseCommand;
import guayabita.me.commandexample.utils.command.Command;
import guayabita.me.commandexample.utils.command.CommandArgs;
import org.bukkit.command.CommandSender;

public class ExampleCMD extends BaseCommand {

	// Average command!
	@Command(name = "example")
	@Override
	public void onCommand(CommandArgs command) {
		CommandSender sender = command.getSender();
		sender.sendMessage("This is example CMD!");
	}
}
