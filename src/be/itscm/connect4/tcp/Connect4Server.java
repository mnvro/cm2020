package be.itscm.connect4.tcp;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Connect4Server extends ServerSocket {
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	public Connect4Server() throws IOException {
		super(1030);
		socket = this.accept();
		ois = new ObjectInputStream(socket.getInputStream());
		oos = new ObjectOutputStream(socket.getOutputStream());
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
