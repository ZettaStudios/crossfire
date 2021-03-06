package to.zettagames.crossfire.emulator.shared.server;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import to.zettagames.crossfire.emulator.shared.network.Network;
import to.zettagames.crossfire.emulator.shared.session.Session;
import to.zettagames.crossfire.emulator.shared.util.Console;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

@Getter @Setter
public class Server {
    protected String name = "Base Server";
    protected String token = "Zetta@123";
    protected String address = "0.0.0.0";

    protected short port = 13008;

    @Setter(AccessLevel.NONE) protected Thread thread;
    @Setter(AccessLevel.NONE) protected ArrayList<Session> sessions = new ArrayList<Session>();
    @Setter(AccessLevel.NONE) protected Network network = new Network();

    public Server(String[] args) {
        if (args.length > 0)
            this.port = Short.parseShort(args[0]);
    }

    public void Start() {
        thread = new Thread(() -> {
            Thread.currentThread().setName(name);

            Log("Loading...");

            try {
                ServerSocket server = new ServerSocket();
                server.bind(new InetSocketAddress(address, port));

                Log(String.format("Listening at %s:%s.", server.getInetAddress().getHostAddress(), port));

                while (true)
                    onRun(server.accept());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        thread.start();
    }

    public void onRun(Socket socket) {
    }

    public void getServerInfo() {
        Log(String.format("Sessions: %s.", sessions.size()));
    }

    public void Log(String message) {
        Console.Log(String.format("[%s] %s", name, message));
    }

}
