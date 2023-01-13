package com.subsystem1;

public class CrmService {

    private CrmService(){
        super();
    }
    
    public static void createClient(String name, String zipcode, String city, String state){
        System.out.println("Client created in CRM: " + name + ", from " + city + "/" + state);
    }
}
