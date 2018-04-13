package tv.m0ttii.basicreport.objects;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.util.UUID;

/**
 * Created by Adrian D. on 11.03.2018.
 */
public class ReportPlayer {
    private UUID uuid;
    private String name;

    public ReportPlayer(String uuid) {
        this(UUID.fromString(uuid));
    }

    public ReportPlayer(UUID uuid) {
        this.uuid = uuid;
    }

    public static ReportPlayer byName(String name) {
        return new ReportPlayer(UUID.fromString(name));
    }


}
