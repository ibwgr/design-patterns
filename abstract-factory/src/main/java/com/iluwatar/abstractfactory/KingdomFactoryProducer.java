
package com.iluwatar.abstractfactory;

public final class KingdomFactoryProducer {
    enum KingdomType {
        ORC,
        ELF
    }

    public static KingdomFactory getFactory(KingdomType kingdomType) {
        if(kingdomType == KingdomType.ELF) {
            return new ElfKingdomFactory();
        } else if(kingdomType == KingdomType.ORC) {
            return new OrcKingdomFactory();
        }

        // that can never happen as kingdomType ist typesafe
        throw new IllegalArgumentException("kindwomType \"" + kingdomType + "\" not valid");
    }
}
