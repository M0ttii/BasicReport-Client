package tv.m0ttii.basicreport.listener;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;
import tv.m0ttii.basicreport.BasicReport;
import tv.m0ttii.basicreport.PermissionManager;
import tv.m0ttii.basicreport.report.ReportManager;
import tv.m0ttii.basicreport.socketio.SocketIO;

/**
 * Created by Adrian D. on 30.03.2018.
 */
public class JoinListener implements Listener{

    @EventHandler
    public void onJoin(ServerConnectEvent event){
        ProxiedPlayer player = event.getPlayer();
        final String prefix = BasicReport.getBasicReport().getPrefix();
        final ReportManager reportManager = BasicReport.getBasicReport().getReportManager();

        if(player.hasPermission(PermissionManager.getStaffPermission())){
            player.sendMessage(prefix + "§cEs sind noch " + reportManager.getReports().size() + " §cReport offen.");
            if(!reportManager.getAviableStaff().contains(player)){
                reportManager.getAviableStaff().add(player);
            }

        }

    }
}
