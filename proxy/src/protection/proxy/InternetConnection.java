package protection.proxy;

public final class InternetConnection {
    private InternetConnection() {
    }

    static ProxyInternet create() {
        return new ProxyInternet();
    }
}
