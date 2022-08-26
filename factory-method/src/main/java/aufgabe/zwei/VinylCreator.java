package aufgabe.zwei;

public class VinylCreator {
    public static Vinyl create(String type, String color, String name, String artist) {
        if (type.equals("LP")) {
            return new LP(color, name, artist);
        } else if (type.equals("EP")) {
            return new EP(color, name, artist);
        } else {
            return null;
        }
    }
}
