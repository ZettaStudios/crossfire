package to.zettagames.crossfire.emulator.game.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Bags {

    UNKNOWN((byte) -1, "Unknown", ItemType.UNKNOWN),
    BAG_1((byte) 1, "Bag 1", ItemType.BAG),
    BAG_2((byte) 2, "Bag 2", ItemType.BAG),
    BAG_3((byte) 3, "Bag 3", ItemType.BAG),
    BAG_4((byte) 4, "Bag 4", ItemType.BAG),
    BAG_5((byte) 5, "Bag 5", ItemType.BAG),
    BAG_6((byte) 6, "Bag 6", ItemType.BAG),
    BAG_7((byte) 7, "Bag 7", ItemType.BAG);

    private final byte id;
    private final String name;
    private final ItemType type;

    public static Bags getBagById(byte id) {
        return Arrays.stream(values()).filter(bag -> bag.id == id).findFirst().orElse(UNKNOWN);
    }

}
