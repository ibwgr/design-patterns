package com.iluwatar.abstractfactory;

public class FactoryProducer {
    public enum KingdomOf {
        ELF, ORC
    }

    public static KingdomFactory getFactory(KingdomOf type){
        if(type.equals(KingdomOf.ELF)){
            return new ElfKingdomFactory();
        }
        if(type.equals(KingdomOf.ORC)){
            return new OrcKingdomFactory();
        }
        throw new IllegalArgumentException("Only ELF or ORC kingdoms allowed!");
    }
}
