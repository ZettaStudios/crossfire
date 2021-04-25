package to.zettagames.crossfire.emulator.game.profile;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum States {

    UNKNOWN((byte) -1, "Unknown"),
    DEFAULT((byte) 0, "Default"),
    BANNED((byte) 1, "Banned"),
    GAME_MASTER((byte) 100, "GameMaster");

    private final byte id;
    private final String name;

    public static States getStateById(byte id) {
        return Arrays.stream(values()).filter(state -> state.id == id).findFirst().orElse(UNKNOWN);
    }

}
