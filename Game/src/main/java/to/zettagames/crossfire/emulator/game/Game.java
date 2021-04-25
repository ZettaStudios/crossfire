package to.zettagames.crossfire.emulator.game;

import lombok.Getter;
import to.zettagames.crossfire.emulator.shared.server.Server;

@Getter
public class Game extends Server {

    @Getter
    private static Game instance;

    private Game(String[] args) {
        super(args);

        this.name = "Game Server";
        this.port = 13009;

        this.Start();
    }

    public static void main(String[] args) {
        Game.instance = new Game(args);
    }

}
