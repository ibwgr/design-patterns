package com.snr.factory.method;

public final class VinylCreator {

    private VinylCreator(){
    }

    public static Vinyl create(String type){
        if(type.equals("LP")){
            return new LP();
        } else if(type.equals("EP")){
            return new EP();
        } else {
            throw new IllegalArgumentException("Nur LP oder EP erlaubt.");
        }
    }
}
