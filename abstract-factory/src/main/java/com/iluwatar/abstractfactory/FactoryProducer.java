package com.iluwatar.abstractfactory;

public class FactoryProducer {

    public static Kingdom createKingdom( String typeOfKingdom) {

        Kingdom kingdom = new Kingdom();
        switch (typeOfKingdom){
            case "Elf":
                ElfKingdomFactory elfKingdomFactory = new ElfKingdomFactory();
                kingdom.setArmy(elfKingdomFactory.createArmy());
                kingdom.setCastle(elfKingdomFactory.createCastle());
                kingdom.setKing(elfKingdomFactory.createKing());
                break;
            case "Orc":
                OrcKingdomFactory orcKingdomFactory = new OrcKingdomFactory();
                kingdom.setArmy(orcKingdomFactory.createArmy());
                kingdom.setCastle(orcKingdomFactory.createCastle());
                kingdom.setKing(orcKingdomFactory.createKing());
                break;
        }
        return kingdom;
    }

}
