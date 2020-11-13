package protection.proxy;

import java.util.ArrayList;
import java.util.List;

public class RestrictedInternet implements Internet {
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }

    @Override
    public void connectTo(String address) throws Exception {
        if (bannedSites.contains(address.toLowerCase())) {
            throw new Exception("Access Denied");
        }

        internet.connectTo(address);
    }
}
