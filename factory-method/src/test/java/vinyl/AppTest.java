package vinyl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dieterbiedermann on 28.09.17.
 */
public class AppTest {
    @Test
    public void createVinyl() throws Exception {
        App app = new App();
        Vinyl vinyl = app.createVinyl("EP");
        Assert.assertEquals("EP",vinyl.getType());
    }

}