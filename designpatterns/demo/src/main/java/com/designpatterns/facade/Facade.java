package com.designpatterns.facade;

import com.subsystem1.CrmService;
import com.subsystem2.ZipcodeAPI;

public class Facade {

    public void migrateClient(String name, String zipcode){
        String city = ZipcodeAPI.getInstance().getCity(zipcode);
        String state = ZipcodeAPI.getInstance().getState(zipcode);
        CrmService.createClient(name, zipcode, city, state);
    }
    
}
