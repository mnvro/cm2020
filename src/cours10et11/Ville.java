package cours10et11;



/**
 * The class Ville 
 * @author FlorisGasogo
 *
 */
public class Ville {
    private String nom;
    private GpsFloris gps;
    
    
    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public GpsFloris getGps() {
		return gps;
	}

	public void setGps(GpsFloris gps) {
		this.gps = gps;
	}



	/**
	 * @param nom The name of the town
	 * @param gps The gps coordonates of the town
	 */
	public Ville(String nom, GpsFloris gps) {
		super();
		this.nom = nom;
		this.gps = gps;
	}

	public static double calculeDistance(Ville ville1, Ville ville2) {
		return GpsFloris.calculeDistance(ville1.gps, ville2.gps);
	}
	
	
	public static void main(String[] args) {
	 
		Ville Bujumbura = new Ville("Bujumbura",new GpsFloris(0.586674975,0.5124269231) );
		Ville Kigali = new Ville("Kigali",new GpsFloris(0.033930946, 0.5246791344));
		System.out.println("La distance entre les deux villes est "+ Ville.calculeDistance(Bujumbura, Kigali)+" Km");
	}

}
