package to.zettagames.crossfire.emulator.game.room;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum RoomWeapon {

    UNKNOWN((byte) -1, "Unknown"),
    ALL_WEAPONS((byte) 0, "All weapons"),
    KNIFE((byte) 1, "Knife only"),
    PISTOL((byte) 2, "Pistol only"),
    SNIPER((byte) 3, "Sniper only");

    private final byte id;
    private final String name;

    public static RoomWeapon getRoomWeaponById(byte id) {
        return Arrays.stream(values()).filter(roomWeapon -> roomWeapon.id == id).findFirst().orElse(UNKNOWN);
    }

}
