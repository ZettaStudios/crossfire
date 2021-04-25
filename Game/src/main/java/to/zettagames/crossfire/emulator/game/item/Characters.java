package to.zettagames.crossfire.emulator.game.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Characters {

    UNKNOWN((byte) -1, "Unknown", ItemType.UNKNOWN),
    SWAT((byte) 1, "SWAT", ItemType.CHARACTER),
    OMOH((byte) 2, "O.M.O.H", ItemType.CHARACTER),
    SAS((byte) 3, "S.A.S", ItemType.CHARACTER),
    ULP((byte) 4, "ULP", ItemType.CHARACTER),
    HERO((byte) 5, "Hero", ItemType.CHARACTER),
    FOX_HOWL((byte) 6, "FOX Howl", ItemType.CHARACTER),
    GHOST_X_FEMALE((byte) 7, "Ghost X Female", ItemType.CHARACTER),
    GHOST_X_MALE((byte) 8, "Ghost X Male", ItemType.CHARACTER),
    MOS((byte) 9, "MOS", ItemType.CHARACTER),
    ULP_X((byte) 10, "ULP X", ItemType.CHARACTER),
    HUMAN_BOSS((byte) 11, "Human Boss", ItemType.CHARACTER),
    GSG_9((byte) 12, "GSG-9", ItemType.CHARACTER),
    GHOST_X((byte) 13, "Ghost X", ItemType.CHARACTER),
    RANGER((byte) 14, "Ranger", ItemType.CHARACTER);

    private final byte id;
    private final String name;
    private final ItemType type;

    public static Characters getCharacterById(byte id) {
        return Arrays.stream(values()).filter(bag -> bag.id == id).findFirst().orElse(UNKNOWN);
    }

}
