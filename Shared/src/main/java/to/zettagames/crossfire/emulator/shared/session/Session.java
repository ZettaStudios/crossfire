package to.zettagames.crossfire.emulator.shared.session;

import to.zettagames.crossfire.emulator.shared.server.Server;

import java.io.*;
import java.net.Socket;

public class Session extends Thread {
    protected final String id;
    protected final Server server;
    protected final Socket socket;

    public Session(Server server, Socket socket) {
        this.id = byPaddingZeros((server.getSessions().size() + 1), 3);
        this.server = server;
        this.socket = socket;

        this.server.getSessions().add(this);
    }

    public static String byPaddingZeros(int value, int paddingLength) {
        return String.format("%0" + paddingLength + "d", value);
    }

    public void onRun(DataOutputStream output) {

    }

    public void onRun(DataInputStream input) {

    }

    public void onRun(DataOutputStream output, DataInputStream input) throws IOException {

    }

    public boolean isConnected() {
        return socket.isConnected();
    }

    @Override
    public void run() {
        try {
            server.Log(String.format("[ID: %s] Client Connected [%s:%s].", id, socket.getInetAddress().getHostAddress(), socket.getPort()));

            while (true) {
                if (!socket.isConnected()) return;

                DataOutputStream output = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
                DataInputStream input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
                this.onRun(output, input);
            }
        } catch (IOException e) {
            if (e.getMessage() == null)
                return;
            if (e.getMessage().contains("Connection reset")) {
                try {
                    server.getSessions().remove(this);
                    socket.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                return;
            }
        }

        super.run();
    }

}
