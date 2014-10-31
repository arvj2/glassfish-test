package com.jvra;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Jansel R. Abreu (Vanwolf) on 10/27/2014.
 */

@WebService( name = "com.jvra.BankService",targetNamespace = "http://com.jvra/service")
public abstract interface BankService {

    @WebMethod
    public abstract String getAccount();
}
