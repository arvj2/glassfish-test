package com.jvra;

import javax.jws.WebService;

/**
 * Created by Jansel R. Abreu (Vanwolf) on 10/27/2014.
 */

@WebService(endpointInterface = "com.jvra.BankService",serviceName = "BankManager")
public class BankImp implements BankService{
    @Override
    public String getAccount() {
        return null;
    }
}
