package to.zettagames.crossfire.emulator.game.room;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum RoomGameMode {

    UNKNOWN((byte) -1, "Unknown"),
    SEARCH_AND_DESTROY((byte) 1, "Search and Destroy"),
    TEAM_DEATH_MATCH((byte) 2, "Team Death Match"),
    SHADOW_MODE((byte) 3, "Shadow"),
    GHOST_MODE((byte) 4, "Ghost"),
    ELIMINATION((byte) 5, "Elimination"),
    FREE_FOR_ALL((byte) 6, "Free-For-All"),
    WEAPON_MASTER((byte) 36, "Weapon Master"),
    ESCAPE_MODE((byte) 37, "Escape"),
    WAVE((byte) 38, "Wave"),
    SUPER_SOLDIER_TDM((byte) 39, "Super Soldier (TDM)"),
    SUPER_SOLDIER_SAND((byte) 40, "Super Soldier (Sand)"),
    SUPPRESSION_MODE((byte) 41, "Suppression"),
    SPY_MODE((byte) 42, "Spy"),
    CAPTAIN_MODE((byte) 43, "Captain"),
    BOMBING_MODE((byte) 44, "Bombing"),
    TEAM_ESCAPE_MODE((byte) 45, "Team Escape");

    private final byte id;
    private final String name;

    public static RoomGameMode getRoomGameModeById(byte id) {
        return Arrays.stream(values()).filter(roomGameMode -> roomGameMode.id == id).findFirst().orElse(UNKNOWN);
    }

}
