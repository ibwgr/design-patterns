package protection.proxy;

import java.util.Arrays;
import java.util.List;

public class Internet {
    private List<String> forbiddenUri = Arrays.asList(new String[]{"abc.com", "def.com", "ijk.com", "lnm.com"});
    public void connectTo(String address)  {
       if(isRestrictedUri(address)){
           System.out.println("Connection not allowed to "+ address);
       }else{
            RealInternet internet = new RealInternet();
            internet.connectTo(address);
       }
    }

    private boolean isRestrictedUri(String address){
      return forbiddenUri.contains(address);
    }
}
