package cours10et11;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

/**
 * La classe GPS affiche la distance en tre 2 coordonees GPS
 * @author francoisparizad
 *
 */
public class GPSFrançois2 {

	private double latitude, longitude;

	public GPSFrançois2(double latitude, double longitude) {
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

	/**
	 * Ce constructeur permet de calculer la distance en KM entre 2 points GPS.
	 * @param gpsA
	 * @param gpsB
	 * @return
	 */
	public static double calculeDistance(GPSFrançois2 gpsA, GPSFrançois2 gpsB) {
		double P1 = Math.sin(gpsA.getLatitude()/360*2*Math.PI) * Math.sin(gpsB.getLatitude()/360*2*Math.PI);
		double P2 = Math.cos(gpsA.getLatitude()/360*2*Math.PI) * Math.cos(gpsB.getLatitude()/360*2*Math.PI);
		double difference = Math.cos((gpsB.getLongitude()/360*2*Math.PI) - gpsA.getLongitude()/360*2*Math.PI);
		return 1.852 * (60 * (Math.acos(P1 + P2 * difference))*360/2/Math.PI);
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
		GPSFrançois2 P1 = new GPSFrançois2(LA, LO);
		GPSFrançois2 P2 = new GPSFrançois2(LA2, LO2);
		NumberFormat format=NumberFormat.getInstance();
 		format.setMinimumFractionDigits(2); //nb de chiffres apres la virgule
 		String s=format.format(GPSFrançois2.calculeDistance(P1, P2));
		System.out.println("la distance en miles entre le Point 1 et le Point 2 est de " + s);
	}

}

