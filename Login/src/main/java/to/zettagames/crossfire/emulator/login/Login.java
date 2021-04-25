package to.zettagames.crossfire.emulator.login;

import lombok.Getter;
import to.zettagames.crossfire.emulator.login.network.PacketInfo;
import to.zettagames.crossfire.emulator.login.network.packets.LoginPacket;
import to.zettagames.crossfire.emulator.login.session.LoginSession;
import to.zettagames.crossfire.emulator.shared.server.Server;

import java.net.Socket;

@Getter
public class Login extends Server {

    @Getter
    private static Login instance;

    private Login(String[] args) {
        super(args);

        this.name = "Login Server";

        this.network.registerPacket(PacketInfo.LOGIN_PACKET.getId(), LoginPacket.class);
    }

    @Override
    public void onRun(Socket socket) {
        LoginSession session = new LoginSession(this, socket);
        session.start();

        super.onRun(socket);
    }

    public static void main(String[] args) {
        Login.instance = new Login(args);
    }

}
