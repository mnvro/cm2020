package be.itscm.connect4.tcp;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connect4Client extends Socket {
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	
	public Connect4Client() throws UnknownHostException, IOException {
		super("127.0.0.1",1030);
		oos = new ObjectOutputStream(this.getOutputStream());
		ois = new ObjectInputStream(this.getInputStream());
	}
	public Object receiveMessage() {
		try {
			return ois.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public void sentMessage(Object o) {
		try {
			oos.writeObject(o);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
