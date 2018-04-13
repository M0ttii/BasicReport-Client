package tv.m0ttii.basicreport.socketio;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;


/**
 * Created by Adrian D. on 26.03.2018.
 */
public class SocketIO {
    private SocketIOServer server;

    public void startServer(Integer port){
        Configuration config = new Configuration();
        config.setHostname("localhost");
        config.setPort(port);

       server = new SocketIOServer(config);

        getServer().startAsync();
        System.out.println("SocketIO server started on port " + port);


    }

    public SocketIOServer getServer(){
        return this.server;
    }


}
