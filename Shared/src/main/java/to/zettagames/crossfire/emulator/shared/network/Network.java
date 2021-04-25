package to.zettagames.crossfire.emulator.shared.network;

import lombok.NoArgsConstructor;
import to.zettagames.crossfire.emulator.shared.network.packets.DataPacket;

import java.util.HashMap;

@NoArgsConstructor
public class Network {

    private final HashMap<String, Class<? extends DataPacket>> packetPool = new HashMap<>();

    public DataPacket getPacket(String id) {
        Class<? extends DataPacket> clazz = this.packetPool.get(id);
        if (clazz != null) {
            try {
                return clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public void registerPacket(String id, Class<? extends DataPacket> clazz) {
        this.packetPool.put(id, clazz);
    }

}