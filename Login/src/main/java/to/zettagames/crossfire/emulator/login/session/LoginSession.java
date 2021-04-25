package to.zettagames.crossfire.emulator.login.session;

import to.zettagames.crossfire.emulator.shared.network.packets.DataPacket;
import to.zettagames.crossfire.emulator.shared.server.Server;
import to.zettagames.crossfire.emulator.shared.session.Session;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class LoginSession extends Session {

    public LoginSession(Server server, Socket socket) {
        super(server, socket);
    }

    @Override
    public void onRun(DataOutputStream output, DataInputStream input) throws IOException {
        byte[] buffer = new byte[2047];
        input.read(buffer);

        StringBuilder id = new StringBuilder();
        for (int i = 3; i < 7; i++)
            id.append(String.valueOf(buffer[i]));

        DataPacket packet = server.getNetwork().getPacket(id.toString());
        packet.setBuffer(buffer);
        packet.decode();

        server.Log(String.format("Packet Received > %s.", packet.pid()));
        super.onRun(output, input);
    }

}
