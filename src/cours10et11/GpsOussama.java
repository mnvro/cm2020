package cours10et11;



/**
 * blabla 
 * @author Oussame
 *
 */
public class GpsOussama {
	private double latitude; //radians
	private double longitude; //radians



	/**
	 * Ce constructeur...
	 * @param degreN Le nombre de d° au N. Si sud entrez une valeur négative
	 * @param minuteN 
	 * @param secondeN 
	 * @param degreE 
	 * @param minuteE
	 * @param secondeE
	 */
	public GpsOussama (double degreN, double minuteN, double secondeN,
			double degreE, double minuteE, double secondeE) {
		double latitudeDegre = degreN+minuteN/60+secondeN/60/60;
		double longitudeDegre = degreE+minuteE/60+secondeE/60/60;
		this.latitude = latitudeDegre*2*Math.PI/360;
		this.longitude = longitudeDegre*2*Math.PI/360;
	}

	/**
	 * calcul est la méthode
	 * @param b Les coordonnées GPS du point avec lequel on veut calculer la distance
	 * @return La distance en KM
	 */
	public double calcul (GpsOussama b){ 
		double m; 
		m = 60*(Math.acos(
				Math.sin(this.latitude)*Math.sin(b.latitude)+
				Math.cos(this.latitude)*Math.cos(b.latitude)*Math.cos(b.longitude-this.longitude)
				))*360/2/Math.PI;
		double km = m*1.852;
		return km;
	}
	
	public static void main(String[] args) {
		GpsOussama adress1 = new GpsOussama(50,39,0,4,34,0 );
		GpsOussama adress2 = new GpsOussama (50,51,39,4,23,15 );
		System.out.println("La distance entre Ottignies et Schaerbeek est de "+adress1.calcul(adress2) + " km\n\n");
	}
	
}