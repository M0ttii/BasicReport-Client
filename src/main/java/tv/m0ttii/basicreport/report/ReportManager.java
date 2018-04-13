package tv.m0ttii.basicreport.report;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import tv.m0ttii.basicreport.BasicReport;
import tv.m0ttii.basicreport.objects.ReportPlayer;

import java.util.ArrayList;

/**
 * Created by Adrian D. on 11.03.2018.
 */
public class ReportManager{
    private BasicReport basicReport;
    private static ArrayList<String> reports = new ArrayList<>();
    private static ArrayList<ProxiedPlayer> staff = new ArrayList<>();

    public ReportManager() {
        super();
    }

    public void reportPlayer(ReportPlayer player, ReportPlayer reporter, String reason){

    }


    public void acceptReport(String id){

    }

    public ArrayList<String> getReports(){
        return reports;
    }

    public ArrayList<ProxiedPlayer> getAviableStaff(){
        return staff;
    }
}
