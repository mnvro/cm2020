package cours10et11;



/**
 * The class Gps show the cordinates of two towns
 * @author fgaso
 *
 */
public class GpsFloris {
	private double latitude;
	private double longitude;
	
	public GpsFloris(double latitude, double longitude) {
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
	public static double calculeDistance(GpsFloris gpsA, GpsFloris gpsB) {
		double a = Math.sin(gpsA.getLatitude())*Math.sin(gpsB.getLatitude());
		double b = Math.cos(gpsA.getLatitude())*Math.cos(gpsB.getLatitude());
        double c = Math.cos(gpsB.getLongitude()-gpsA.getLongitude());
		return 2*(60*(Math.acos(a+b*c))/2/Math.PI*360)*1.852;
	}
	
	@Override
	public String toString() {
		return latitude + ", " + longitude + " Km";
	}
	public static void main(String[] args) {
		GpsFloris washington = new GpsFloris(0.6790587427,1.344547551);
		GpsFloris amsterdam = new GpsFloris(0.9139713334,0.0854251402);
		System.out.println("Distance entre Wshington et Amsterdam est"+GpsFloris.calculeDistance(washington,amsterdam) +"Km");
	}

}
