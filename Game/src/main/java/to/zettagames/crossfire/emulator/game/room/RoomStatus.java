package to.zettagames.crossfire.emulator.game.room;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum RoomStatus {

    UNKNOWN((byte) -1, "Unknown"),
    IN_GAME_CANT_JOIN((byte) 0, "In-Game and unable to join."),
    WAITING((byte) 1, "Waiting"),
    IN_GAME((byte) 2, "In-Game");

    private final byte id;
    private final String name;

    public static RoomStatus getRoomStatusById(byte id) {
        return Arrays.stream(values()).filter(roomStatus -> roomStatus.id == id).findFirst().orElse(UNKNOWN);
    }

}
