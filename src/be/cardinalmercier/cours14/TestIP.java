package be.cardinalmercier.cours14;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIP {

	public static void main(String[] args) {
		InetAddress ia;
		try {
			ia = InetAddress.getByName("10.10.10.10");
			if (ia.isReachable(1000))
				System.out.println(ia.getHostName()+" est joignable");
			else
				System.out.println(ia.getHostName()+" n'est pas joignable");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
