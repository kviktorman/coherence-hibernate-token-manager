package com.example.coherence.CoherenceTokenManagers;

import javax.security.auth.Subject;
import com.tangosol.net.Service;
import com.tangosol.net.security.IdentityTransformer;
import com.example.coherence.Constants.TokenManagerConstants;

public class ClientSideTokenManager implements IdentityTransformer {

    public Object transformIdentity(Subject subject, Service service) throws SecurityException {
        return System.getProperty(TokenManagerConstants.JVM_TOKEN_ARGUMENT_NAME);
    }
}
