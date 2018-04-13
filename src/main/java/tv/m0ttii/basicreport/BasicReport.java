package tv.m0ttii.basicreport;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;
import org.springframework.boot.SpringApplication;
import tv.m0ttii.basicreport.commands.ReportCommand;
import tv.m0ttii.basicreport.listener.JoinListener;
import tv.m0ttii.basicreport.report.ReportManager;
import tv.m0ttii.basicreport.rest.Application;
import tv.m0ttii.basicreport.socketio.SocketIO;

/**
 * Created by Adrian D. on 11.03.2018.
 */
public class BasicReport extends Plugin {
    private static BasicReport basicReport;
    private ReportManager reportManager;
    private SocketIO socketIO;

    public void onEnable(){
        basicReport = this;
        this.reportManager = new ReportManager();
        this.socketIO = new SocketIO();
        getSocketIO().startServer(9000);
        Application.run();
        init();
    }

    public void onDisable(){
        getSocketIO().getServer().stop();

    }

    private void init(){
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new ReportCommand("report", "test", "report"));
        ProxyServer.getInstance().getPluginManager().registerListener(this, new JoinListener());
    }

    public static BasicReport getBasicReport(){
        return basicReport;
    }

    public ReportManager getReportManager(){
        return reportManager;
    }

    public SocketIO getSocketIO(){
        return socketIO;
    }

    public String getPrefix(){
        return "Report: ";
    }

}
