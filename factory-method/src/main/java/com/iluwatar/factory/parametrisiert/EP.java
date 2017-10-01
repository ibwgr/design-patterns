package com.iluwatar.factory.parametrisiert;

public class EP extends Vinyl {

    private String type;

    public EP(String color, String name, String artist) {
        super(color, name, artist);
        type = "EP";
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return super.toString() + " Type: " + type;
    }
}
