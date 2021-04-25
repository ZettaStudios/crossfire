package to.zettagames.crossfire.emulator.game.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum ItemType {

    UNKNOWN((byte) -1, 'U', "Unknown"),
    WEAPON((byte) 0, 'C', "Weapon"),
    CHARACTER_EQUIPMENT((byte) 1, 'B', "Character Equipment"),
    CHARACTER((byte) 2, 'A', "Character"),
    ITEM((byte) 3, 'I', "Item"),
    BAG((byte) 4, 'D', "Bag");

    private final byte id;
    private final char packetId;
    private final String name;

    public static ItemType getItemTypeById(byte id) {
        return Arrays.stream(values()).filter(itemType -> itemType.id == id).findFirst().orElse(UNKNOWN);
    }

    public static ItemType getItemTypeByPacketId(char packetId) {
        return Arrays.stream(values()).filter(itemType -> itemType.packetId == packetId).findFirst().orElse(UNKNOWN);
    }

}
