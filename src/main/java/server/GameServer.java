package server;

public class GameServer extends Server {
    public GameServer(String[] args) {
        super(args);
        this.name = "Game Server";
        this.port = 13009;
    }
}
