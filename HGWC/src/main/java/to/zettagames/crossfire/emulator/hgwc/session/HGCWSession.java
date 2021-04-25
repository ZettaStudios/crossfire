package to.zettagames.crossfire.emulator.hgwc.session;

import to.zettagames.crossfire.emulator.shared.server.Server;
import to.zettagames.crossfire.emulator.shared.session.Session;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class HGCWSession extends Session {

    public HGCWSession(Server server, Socket socket) {
        super(server, socket);
    }

    @Override
    public void onRun(DataOutputStream output, DataInputStream input) throws IOException {
        super.onRun(output, input);
    }

}
