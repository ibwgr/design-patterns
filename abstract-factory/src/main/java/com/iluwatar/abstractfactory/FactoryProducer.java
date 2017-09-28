package com.iluwatar.abstractfactory;

/**
 * Created by dieterbiedermann on 28.09.17.
 */
public class FactoryProducer {

    public static KingdomFactory getKingdom(String choice){
        switch(choice.toUpperCase()){
            case "ELF":
                return new ElfKingdomFactory();
            case "ORC":
                return new OrcKingdomFactory();
        }
        return null;
    }

}
