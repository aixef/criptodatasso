package com.tacriptosso.criptodatasso;

public class SeismicSSOData_Model {

    public class DataModel {
        public CryptcoBase criptoData;
        public DataWrap dataCripto;
    }

    public class CryptcoBase {
        public String TOKEN_SUBJECT;
        public String SAML_SUBJECT;
    }

    public class DataWrap {
        public String firstName;
        public String lastName;
        public String payload;
    }
}
