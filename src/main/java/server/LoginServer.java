package server;

import session.LoginSession;

import java.net.Socket;

public class LoginServer extends Server {
    public LoginServer(String[] args) {
        super(args);
        this.name = "Login Server";
        this.network.registerLoginPackets();
    }

    @Override
    public void onRun(Socket socket) {
        LoginSession session = new LoginSession(this, socket);
        session.start();
        super.onRun(socket);
    }
}
