package aufgabe.zwei;

/**
 * @description     Gemäss Aufgabe 2
 *
 * @author          Marco Rensch
 */
public class App {
    public static void main(String[] args) {
        VinylCreator vinylCreator = new VinylCreator();
        Vinyl vinyl = vinylCreator.create("LP", "red", "Foo", "Bar");
        System.out.println(vinyl);
    }
}
