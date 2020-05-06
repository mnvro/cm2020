package cours14;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestPing {
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getByName("8.8.8.8");
			System.out.println(ia.isReachable(1000));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
