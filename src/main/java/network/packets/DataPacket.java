package network.packets;

import util.BinaryStream;

public abstract class DataPacket extends BinaryStream implements Cloneable{

    public abstract String pid();

    public abstract void decode();

    public abstract void encode();

    @Override
    public DataPacket reset() {
        super.reset();
        this.putString(this.pid());
        this.putShort(0);
        return this;
    }

    public DataPacket clean() {
        this.setBuffer(null);
        this.setOffset(0);
        return this;
    }

    @Override
    public DataPacket clone() {
        try {
            return (DataPacket) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}