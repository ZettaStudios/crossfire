package server;

import session.HGCWSession;

import java.net.Socket;

public class HGWCServer extends Server {
    public HGWCServer(String[] args) {
        super(args);
        this.name = "HGWC Server";
        this.port = 16666;
    }

    @Override
    public void onRun(Socket socket) {
        HGCWSession session = new HGCWSession(this, socket);
        session.start();
        super.onRun(socket);
    }
}
