import server.GameServer;
import server.HGWCServer;
import server.LoginServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader {
    private final HGWCServer hgwcServer;
    private final LoginServer loginServer;
    private final GameServer gameServer;

    public Loader(String[] args) {
        hgwcServer = new HGWCServer(args);
        loginServer = new LoginServer(args);
        gameServer = new GameServer(args);
    }

    public void Start() throws InterruptedException {
        // hgwcServer.Start();
        // Thread.sleep(100);
        loginServer.Start();
        Thread.sleep(100);
        gameServer.Start();
        Thread.sleep(100);
        new Thread(() -> {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String line = "";
                while (!line.equals("exit")) {
                    line = reader.readLine();
                    // this.commandMap.execute(line);
                    switch (line.toLowerCase()) {
                        case "info":
                            loginServer.getServerInfo();
                            break;
                    }
                    loginServer.getThread().interrupt();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public static void main(String[] args) throws InterruptedException {
        Loader loader = new Loader(args);
        loader.Start();
    }
}
