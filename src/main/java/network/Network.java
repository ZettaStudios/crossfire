package network;

import network.packets.DataPacket;
import network.packets.LoginPacket;

import java.util.HashMap;

public class Network {

    @SuppressWarnings("unchecked")
    private final HashMap<String, Class<? extends DataPacket>> packetPool = new HashMap<>();

    public Network(){
    }

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

    public void registerLoginPackets(){
        registerPacket(PacketInfo.LOGIN_PACKET, LoginPacket.class);
    }

}