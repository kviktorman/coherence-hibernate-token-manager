package com.example.coherence.CoherenceTokenManagers;

import javax.security.auth.Subject;
import com.tangosol.net.Service;
import com.tangosol.net.security.IdentityAsserter;
import com.example.coherence.Constants.TokenManagerConstants;

public class ServerSideTokenManager implements IdentityAsserter {

    public Subject assertIdentity(Object oToken, Service service) throws SecurityException {
        if (oToken instanceof String) {
            if (((String) oToken).equals(System.getProperty(TokenManagerConstants.JVM_TOKEN_ARGUMENT_NAME))) {
                return null;
            }
        }
        throw new SecurityException("Access denied");
    }
}
