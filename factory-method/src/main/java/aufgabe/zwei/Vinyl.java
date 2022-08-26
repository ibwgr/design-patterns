package aufgabe.zwei;

public abstract class Vinyl {
    private String color;
    private String name;
    private String artist;

    public Vinyl(String color, String name, String artist) {
        this.color = color;
        this.name = name;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Vinyl [color=" + color + ", name=" + name + ", artist=" + artist + "]";
    }
}
