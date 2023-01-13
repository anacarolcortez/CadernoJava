package com.subsystem2;

public class ZipcodeAPI {
    
    private static class Holder {
        public static ZipcodeAPI instance = new ZipcodeAPI();
    }

    private ZipcodeAPI(){
        super();
    }

    public static ZipcodeAPI getInstance(){
        return Holder.instance;
    }

    public String getState(String cep){
        return "SP";
    }

    public String getCity(String cep){
        return "Santos";
    }
}
