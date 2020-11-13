package protection.proxy;

public class Client {
    public static void main(String[] args) {
        Internet internet = InternetConnection.create();

        try {
            internet.connectTo("ibw.com");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
