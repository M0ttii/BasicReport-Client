package tv.m0ttii.basicreport.objects;

/**
 * Created by Adrian D. on 31.03.2018.
 */
public class Report {
    private ReportPlayer player;
    private ReportPlayer reporter;
    private String reason;
    private String id;

    public Report(ReportPlayer player, ReportPlayer reporter, String reason, String id){
        this.player = player;
        this.reason = reason;
        this.reporter = reporter;
        this.id = id;
    }

    public ReportPlayer getPlayer(){
        return player;
    }

    public ReportPlayer getReporter(){
        return reporter;
    }

    public String getID(){
        return id;
    }
}
