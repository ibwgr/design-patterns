package vinyl;

/**
 * Created by dieterbiedermann on 28.09.17.
 */
public class VinylCreator {

    public static Vinyl create(String type){
        Vinyl vinyl = null;
        switch (type.toUpperCase()) {
            case "EP":
                vinyl = new EP();
                break;
            case "LP":
                vinyl = new LP();
                break;
        }
        return vinyl;
    }

}
