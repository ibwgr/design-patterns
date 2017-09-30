package com.iluwatar.factory.parametrisiert;

public class Lp extends Vinyl {

    private String type;

    public Lp(String color, String name, String artist) {
        super(color, name, artist);
        type = "LP";
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + " Type: " + type;
    }
}
