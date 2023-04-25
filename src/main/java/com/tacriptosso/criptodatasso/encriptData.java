package com.tacriptosso.criptodatasso;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import com.pingidentity.opentoken.Agent;
import com.pingidentity.opentoken.TokenException;

public class encriptData {
    

    public static String generateTokenDomain(SeismicSSOData_Model.DataModel dataModel) {
        String token ="";
        try {
            com.pingidentity.opentoken.Agent agent= new com.pingidentity.opentoken.Agent("agent-config-demo-mo.txt");
            HashMap<String,String> userInfo = new HashMap<String, String>();
            userInfo.put(Agent.TOKEN_SUBJECT, dataModel.criptoData.TOKEN_SUBJECT);
            userInfo.put("SAML_SUBJECT", dataModel.criptoData.SAML_SUBJECT);
            userInfo.put("firstName", dataModel.dataCripto.firstName);
            userInfo.put("lastName", dataModel.dataCripto.lastName);
            userInfo.put("payload", Base64.getEncoder().encodeToString((dataModel.dataCripto.payload).getBytes()));
            token = agent.writeToken(userInfo);
        } catch (TokenException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return token;
    }
}
