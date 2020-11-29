package protection.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    RealInternet connection = new RealInternet();
    private static List<String> blockedUrl = new ArrayList<>();

    static {
        blockedUrl.add("abc.com");
        blockedUrl.add("def.com");
        blockedUrl.add("ijk.com");
        blockedUrl.add("lnm.com");
    }

    @Override
    public void connectTo(String address)  {
        if(blockedUrl.contains(address)){
            throw new IllegalArgumentException("The URL '" + address + "' is blocked by your admin.");
        } else {
            connection.connectTo(address);
        }

    }
}
