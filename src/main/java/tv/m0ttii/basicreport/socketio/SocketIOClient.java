package tv.m0ttii.basicreport.socketio;

import com.corundumstudio.socketio.AckCallback;
import com.corundumstudio.socketio.HandshakeData;
import com.corundumstudio.socketio.SocketIONamespace;
import com.corundumstudio.socketio.Transport;
import com.corundumstudio.socketio.protocol.Packet;

import java.net.SocketAddress;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Adrian D. on 30.03.2018.
 */
public class SocketIOClient {
    final static com.corundumstudio.socketio.SocketIOClient client = new com.corundumstudio.socketio.SocketIOClient() {
        @Override
        public void set(String key, Object val) {

        }

        @Override
        public <T> T get(String key) {
            return null;
        }

        @Override
        public boolean has(String key) {
            return false;
        }

        @Override
        public void del(String key) {

        }

        @Override
        public void send(Packet packet) {

        }

        @Override
        public void disconnect() {

        }

        @Override
        public void sendEvent(String name, Object... data) {

        }

        @Override
        public HandshakeData getHandshakeData() {
            return null;
        }

        @Override
        public Transport getTransport() {
            return null;
        }

        @Override
        public void sendEvent(String name, AckCallback<?> ackCallback, Object... data) {

        }

        @Override
        public void send(Packet packet, AckCallback<?> ackCallback) {

        }

        @Override
        public SocketIONamespace getNamespace() {
            return null;
        }

        @Override
        public UUID getSessionId() {
            return null;
        }

        @Override
        public SocketAddress getRemoteAddress() {
            return null;
        }

        @Override
        public boolean isChannelOpen() {
            return false;
        }

        @Override
        public void joinRoom(String room) {

        }

        @Override
        public void leaveRoom(String room) {

        }

        @Override
        public Set<String> getAllRooms() {
            return null;
        }
    };
}
