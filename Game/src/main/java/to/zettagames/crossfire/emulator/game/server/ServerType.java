package to.zettagames.crossfire.emulator.game.server;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum ServerType {

    UNKNOWN((byte) -1, "Unknown"),
    NORMAL((byte) 1, "Normal server"),
    CLAN((byte) 2, "Clan Wars server");

    private final byte id;
    private final String name;

    public static ServerType getServerTypeById(byte id) {
        return Arrays.stream(values()).filter(serverType -> serverType.id == id).findFirst().orElse(UNKNOWN);
    }

}
