package com.iluwatar.abstractfactory;

public final class KingdomFactoryProducer {
    public static KingdomFactory produce(String kingdomFactoryType) {
        switch (kingdomFactoryType) {
            case "elf":
                return new ElfKingdomFactory();
            case "orc":
                return new OrcKingdomFactory();
            default:
                throw new Error("kingdomFactoryType not correct!");
        }
    }
}
