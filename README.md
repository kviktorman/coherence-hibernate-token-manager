# Introduction

This is a basic helper library implementation for securing Oracle Coherence*Extend client and cache server connections with an identity token. For simplicity reasons the library contains the client and server side implementation. 

To integrate it into your solution you have to do on both(client and server) sides:
* inclide the helper library to the classpath 
* set the JVM argument "-DauthenticationToken=${TOKEN}"
* add the corresponding part to your Coherence cluster configuration.

**client side**
```
   <security-config>
      <identity-transformer>
        <class-name>com.example.coherence.CoherenceTokenManagers.ClientSideTokenManager</class-name>
      </identity-transformer>
   </security-config>
```

**server side** 
```
  <security-config>
    <identity-asserter>
      <class-name>com.example.coherence.CoherenceTokenManagers.ServerSideTokenManager</class-name>
    </identity-asserter>
  </security-config>
```

More information about the topic you can [on the identity token page of the Coherence documentation](https://docs.oracle.com/en/middleware/standalone/coherence/14.1.1.0/secure/securing-extend-client-connections.html#GUID-221F1CA0-89F8-40E6-A081-052FBA87C830).
