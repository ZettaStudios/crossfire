package to.zettagames.crossfire.emulator.game.weapon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import to.zettagames.crossfire.emulator.game.item.ItemType;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum WeaponType {

    UNKNOWN((byte) -1, "Unknown", ItemType.UNKNOWN),
    SHOTGUN((byte) 0, "Shotgun", ItemType.WEAPON),
    SMG((byte) 1, "SMG", ItemType.WEAPON),
    RIFLE((byte) 2, "Rifle", ItemType.WEAPON),
    SNIPER_RIFLE((byte) 3, "Sniper Rifle", ItemType.WEAPON),
    MACHINE_GUN((byte) 4, "Machine Gun", ItemType.WEAPON),
    PISTOL((byte) 5, "Pistol", ItemType.WEAPON),
    KNIFE((byte) 6, "Knife", ItemType.WEAPON),
    GRENADE((byte) 7, "Grenade", ItemType.WEAPON);

    private final byte id;
    private final String name;
    private final ItemType type;

    public static WeaponType getWeaponTypeById(byte id) {
        return Arrays.stream(values()).filter(weaponType -> weaponType.id == id).findFirst().orElse(UNKNOWN);
    }

}
