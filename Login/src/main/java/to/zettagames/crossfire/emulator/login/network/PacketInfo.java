package to.zettagames.crossfire.emulator.login.network;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PacketInfo {

    LOGIN_PACKET("0000");

    private final String id;

}
