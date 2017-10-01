package com.iluwatar.factory.parametrisiert;

public class Vinyl {

    private String color;
    private String name;
    private String artist;

    public Vinyl(String color, String name, String artist) {
        this.color = color;
        this.name = name;
        this.artist = artist;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return  "Color: " + color + " Name: " + name + " Artist: " + artist;
    }
}
