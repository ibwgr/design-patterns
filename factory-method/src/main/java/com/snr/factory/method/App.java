package com.snr.factory.method;

public class App {
    public static void main(String[] args) {

        Vinyl ep = VinylCreator.create("EP");
        Vinyl lp = VinylCreator.create("LP");


        System.out.println(lp.getClass());
        System.out.println(ep.getClass());
    }
}
