package com.snr.factory.method;

public class App {
    public static void main(String[] args) {
        final VinylCreator vinylCreator = new VinylCreator();

        Vinyl ep = vinylCreator.create("EP");
        Vinyl lp = vinylCreator.create("LP");


        System.out.println(lp.getClass());
        System.out.println(ep.getClass());
    }
}
