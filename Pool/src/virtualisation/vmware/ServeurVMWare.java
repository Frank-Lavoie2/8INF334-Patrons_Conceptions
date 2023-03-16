package virtualisation.vmware;

import virtualisation.core.ServeurMV;
import virtualisation.core.Session;
import virtualisation.core.SessionException;

public class ServeurVMWare extends ServeurMV {

    public int sessionID;

    public ServeurVMWare() throws SessionException {

        sessionID = 0;
    }

    @Override
    protected Session creerSession() {

        return new SessionVMWare(sessionID++);
    }
}
