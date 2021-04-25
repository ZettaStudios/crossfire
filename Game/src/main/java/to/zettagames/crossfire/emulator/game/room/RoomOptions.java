package to.zettagames.crossfire.emulator.game.room;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum RoomOptions {

    UNKNOWN((byte) -1, "Unknown"),
    ROUNDS((byte) 0, "Rounds"),
    KILLS((byte) 1, "Kills"),
    TIME((byte) 2, "Time"),
    ESCAPE_MODE_ATTACK_AND_DEFENSE((byte) 3, "Escape mode - Attack and Defense"),
    ZOMBIE_MODE_EASY((byte) 5, "Zombie mode - Difficulty Easy"),
    ZOMBIE_MODE_NORMAL((byte) 6, "Zombie mode - Difficulty Normal"),
    ZOMBIE_MODE_HARD((byte) 7, "Zombie mode - Difficulty Hard"),
    ZOMBIE_MODE_EXPERT((byte) 8, "Zombie mode - Difficulty Expert"),
    ZOMBIE_MODE_NIGHTMARE((byte) 9, "Zombie mode - Difficulty Nightmare"),
    SHADOW_ELIMINATION((byte) 11, "Shadow mode - Elimination"),
    SHADOW_INFECTION((byte) 12, "Shadow mode - Infection"),
    SCORE((byte) 13, "Score"),
    SINGLE_ROUND((byte) 14, "Single Round");

    private final byte id;
    private final String name;

    public static RoomOptions getRoomOptionById(byte id) {
        return Arrays.stream(values()).filter(roomOption -> roomOption.id == id).findFirst().orElse(UNKNOWN);
    }

}
