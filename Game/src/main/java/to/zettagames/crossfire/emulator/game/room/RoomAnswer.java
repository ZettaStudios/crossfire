package to.zettagames.crossfire.emulator.game.room;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum RoomAnswer {

    SUCCESS((byte) 0, "Success"),
    FULL((byte) 1, "Full"),
    UNKNOWN((byte) 2, "Unknown"),
    WRONG_PASSWORD((byte) 3, "Wrong Password");

    private final byte id;
    private final String name;

    public static RoomAnswer getRoomAnswerById(byte id) {
        return Arrays.stream(values()).filter(roomAnswer -> roomAnswer.id == id).findFirst().orElse(UNKNOWN);
    }

}
