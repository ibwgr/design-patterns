package com.iluwatar.factory.parametrisiert;

public class VinylCreator {

    public Vinyl create(String color, String name, String artist, String type ){

        Vinyl vinyl = null;

        switch (type){
            case "LP":
                vinyl = new Lp(color,name,artist);
            break;
            case "EP":
                vinyl = new EP(color,name,artist);
                break;
        }
        return vinyl;
    }
}
