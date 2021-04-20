package session;

import network.packets.DataPacket;
import network.packets.LoginPacket;
import server.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class LoginSession extends Session {
    public LoginSession(Server server, Socket socket) {
        super(server, socket);
    }

    @Override
    public void onRun(DataOutputStream output, DataInputStream input) throws IOException {
        byte[] buffer = new byte[2047];
        input.read(buffer);
        ArrayList<Byte> head = new ArrayList<>();
        String id = "";
        for(int i = 3; i < 7; i++) {
            id += String.valueOf(buffer[i]);
        }

        DataPacket packet = server.getNetwork().getPacket(id);
        packet.setBuffer(buffer);
        packet.decode();

        server.Log(String.format("Packet Received > %s.", packet.pid()));
        super.onRun(output, input);
    }

}
