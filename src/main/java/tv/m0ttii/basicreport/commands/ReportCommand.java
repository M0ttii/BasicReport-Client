package tv.m0ttii.basicreport.commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import tv.m0ttii.basicreport.BasicReport;
import tv.m0ttii.basicreport.objects.ReportPlayer;
import tv.m0ttii.basicreport.report.ReportManager;

/**
 * Created by Adrian D. on 11.03.2018.
 */
public class ReportCommand extends Command{

    public ReportCommand(String command, String permission, String... aliases) {
        super(command, permission, aliases);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if(!(sender instanceof ProxiedPlayer)){
            return;
        }



    }
}
