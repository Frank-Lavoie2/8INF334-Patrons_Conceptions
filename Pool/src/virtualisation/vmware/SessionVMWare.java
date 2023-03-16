package virtualisation.vmware;

import virtualisation.core.Session;

public class SessionVMWare extends Session {

    public SessionVMWare(int sessionId) {
        super(sessionId);
    }

    @Override
    protected String faireOperationImpl() {

        return "OPERATION DANS UNE SESSION VMWARE {sid:" + getSessionId()+ ",uid:" + getUtilisateur()+ "}";
    }
}
