package cours10et11;



import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class GPS_François {

	private double latitude, longitude;

	public GPS_François(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public static double calculeDistance(GPS_François gpsA, GPS_François gpsB) {
		double P1 = Math.sin(gpsA.getLatitude()) * Math.sin(gpsB.getLatitude());
		double P2 = Math.cos(gpsA.getLatitude()) * Math.cos(gpsB.getLatitude());
		double difference = Math.cos(gpsB.getLongitude() - gpsA.getLongitude())*(360/2/Math.PI);
		return 1.852 * (60 * (Math.acos(P1 + P2 * difference)));
	}

	public static void main(String args[]) {
		double LA, LO, LA2, LO2;
		String LAs = JOptionPane.showInputDialog("Donnez-moi latitude du point 1 :");
		String LOs = JOptionPane.showInputDialog("Donnez-moi la longitude du point 1 :");
		LA = Integer.parseInt(LAs);
		LO = Integer.parseInt(LOs);
		String LA2s = JOptionPane.showInputDialog("Donnez-moi latitude du point 2 :");
		String LO2s = JOptionPane.showInputDialog("Donnez-moi la longitude du point 2 :");
		LA2 = Integer.parseInt(LA2s);
		LO2 = Integer.parseInt(LO2s);
		GPS_François P1 = new GPS_François(LA, LO);
		GPS_François P2 = new GPS_François(LA2, LO2);
//		NumberFormat format=NumberFormat.getInstance();
//		format.setMinimumFractionDigits(2); //nb de chiffres apres la virgule
//		String s=format.format(GPS.calculeDistance(P1, P2)); 
		System.out.println("la distance en miles entre le Point 1 et le Point 2 est de " + GPS_François.calculeDistance(P1, P2));
	}

}

