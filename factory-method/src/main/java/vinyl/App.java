package vinyl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by dieterbiedermann on 28.09.17.
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(com.iluwatar.factory.method.App.class);

    public App() {

    }

    public Vinyl createVinyl(String type){
        return VinylCreator.create(type);
    }

    public static void main(String[] args) {
        App app = new App();
        Vinyl vinyl;
        vinyl = app.createVinyl("EP");
        LOGGER.info(vinyl.toString());
        vinyl = app.createVinyl("LP");
        LOGGER.info(vinyl.toString());
    }

}
