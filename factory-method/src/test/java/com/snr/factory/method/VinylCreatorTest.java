package com.snr.factory.method;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class VinylCreatorTest{


    @Test
    public void testVinylCreatorWithEP() {
        VinylCreator vinylCreator = new VinylCreator();
        Vinyl ep = vinylCreator.create("EP");
        verifyVinyl(ep,ep, EP.class);
    }

    @Test
    public void testVinylCreatorWithLP() {
        VinylCreator vinylCreator = new VinylCreator();
        Vinyl ep = vinylCreator.create("LP");
        verifyVinyl(ep,ep, LP.class);
    }


    private void verifyVinyl(Vinyl type, Vinyl expectedVinyl, Class<?> clazz) {
        assertTrue("Vinyl must be an object of: " + clazz.getName(), clazz.isInstance(type));
    }

}
