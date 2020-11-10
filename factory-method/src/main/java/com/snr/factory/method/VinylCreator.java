package com.snr.factory.method;

public class VinylCreator {
    public Vinyl create(String type){
        if(type.equals("LP")){
            return new LP();
        } else if(type.equals("EP")){
            return new EP();
        } else {
            return null;
        }
    }
}
