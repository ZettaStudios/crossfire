package server;

import network.Network;
import session.Session;
import util.Console;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    protected String name = "Base Server";
    protected String token = "Zetta@123";
    protected String address = "0.0.0.0";
    protected short port = 13008;
    protected Thread thread;
    protected ArrayList<Session> sessions = new ArrayList<>();
    protected Network network = new Network();

    public Server(String[] args) {
        if(args.length > 0) {
            this.port = Short.parseShort(args[0]);
        }
    }

    public void Start() {
        thread = new Thread(() -> {
            Thread.currentThread().setName(name);
            Log("Loading...");
            try {
                ServerSocket server = new ServerSocket();
                server.bind(new InetSocketAddress(address, port));
                Log(String.format("Listening at %s:%s.", server.getInetAddress().getHostAddress(), port));
                while (true) {
                    onRun(server.accept());
                }
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public short getPort() {
        return port;
    }

    public void setPort(short port) {
        this.port = port;
    }

    public Thread getThread() {
        return thread;
    }

    public ArrayList<Session> getSessions() {
        return sessions;
    }

    public Network getNetwork() {
        return network;
    }
}