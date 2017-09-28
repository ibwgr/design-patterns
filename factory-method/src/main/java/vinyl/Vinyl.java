package vinyl;

/**
 * Created by dieterbiedermann on 28.09.17.
 */
public class Vinyl {

    private String color = null;
    private String name = null;
    private String artist = null;
    private String type = null;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vinyl{" +
                "type='" + type + '\'' +
                '}';
    }
}
