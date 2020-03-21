package cours10et11;



import javax.swing.JOptionPane;

/**
 * La classe GPS affiche la distance en tre 2 coordonees GPS
 * @author francoisparizad
 *
 */
public class GPS {

	private double latitude, longitude;

	/**
	 * @param latitude la latitude en radian
	 * @param longitude la longitude en radian
	 */
	public GPS(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	/**
	 * @return
	 */
	public double getLatitude() {
		return this.latitude;
	}

	/**
	 * @return
	 */
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
	public static double calculeDistance(GPS gpsA, GPS gpsB) {
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
		GPS P1 = new GPS(LA, LO);
		GPS P2 = new GPS(LA2, LO2);
		System.out.println("la distance en miles entre le Point 1 et le Point 2 est de " + GPS.calculeDistance(P1, P2));
	}

}

