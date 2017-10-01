package com.iluwatar.factory.parametrisiert;

public class App {


    public static void main(String[] args) {
        Vinyl lp = new VinylCreator().create("Blau","Rock","Polo","LP");
        System.out.println(lp);

        Vinyl ep = new VinylCreator().create("Gelb", "Pop", "ABBA","EP");
        System.out.println(ep);
    }
}
