import java.net.InetAddress;
import java.net.UnknownHostException;

public class CheckIPAddressIsLocalMain {
  public static void main(String[] args) {
    System.out.println("Is Local : " + isLocalIPAddress());
  }

  public static boolean isLocalIPAddress() {
    try {
      InetAddress a = InetAddress.getLocalHost();

      if(a.toString().contains("/192.168.")) return true;
    } catch (UnknownHostException ex) {
      ex.printStackTrace();
    }

    return false;
  }
}
