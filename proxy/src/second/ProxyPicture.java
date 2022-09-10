package second;

public class ProxyPicture implements Picture {
    private String fileName;
    private String cachedPicture;

    public ProxyPicture(String fileName) {
        this.fileName = fileName;
    }

    public void draw() {
        this.display();
    }

    @Override
    public void display() {
        if(cachedPicture != null && !cachedPicture.isEmpty()){
            cached();
        }else{
            System.out.println("Displaying placeholder " + fileName);
            new RealPicture(fileName).display();
            cachedPicture = "cached.png";
        }
    }

    public void cached(){
        System.out.println("Displaying cached " + fileName);
    }
}
