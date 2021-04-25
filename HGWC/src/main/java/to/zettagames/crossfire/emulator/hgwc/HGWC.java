package to.zettagames.crossfire.emulator.hgwc;

import lombok.Getter;
import to.zettagames.crossfire.emulator.hgwc.session.HGCWSession;
import to.zettagames.crossfire.emulator.shared.server.Server;

import java.net.Socket;

@Getter
public class HGWC extends Server {

    @Getter
    private static HGWC instance;

    private HGWC(String[] args) {
        super(args);

        this.name = "HGWC Server";
        this.port = 16666;

        this.Start();
    }

    @Override
    public void onRun(Socket socket) {
        HGCWSession session = new HGCWSession(this, socket);
        session.start();

        super.onRun(socket);
    }

    public static void main(String[] args) {
        HGWC.instance = new HGWC(args);
    }

}
