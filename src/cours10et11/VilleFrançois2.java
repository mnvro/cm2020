package cours10et11;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

/**
 * La classe Ville affiche la distance en KM entre 2 villes
 * @author francoisparizad
 *
 */
public class VilleFranšois2 {

	private GPSFranšois2 gps; 
	private String nom;

	public double getDistance (VilleFranšois2 autreVille) {
		return GPSFranšois2.calculeDistance (this.gps, autreVille.gps);
	}

	/**
	 * Cette methode permet d'obtenir le gps
	 * @return
	 */
	public GPSFranšois2 getGps() {
		return gps;
	}
	/**
	 * Cette methode permet de modifier le gps
	 * @param gps
	 */
	public void setGps(GPSFranšois2 gps) {
		this.gps = gps;
	}
	/**
	 * Cette methode permet d'obtenir le nom
	 * @return
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Permet de modifier le nom 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Ce constructeur Ville permet de construire une ville dont on connait 
	 * le nom et les coordonn├ęes GPS
	 * @param gps les coordonnees GPS de la ville 
	 * @param nom le nom de la ville
	 */
	public VilleFranšois2(GPSFranšois2 gps, String nom) {
		this.gps = gps;
		this.nom = nom;
	}

	/**
	 * Le main nous permet de tester la classe
	 * @param args
	 */
	public static void main(String args[]) {
		double LA, LO, LA2, LO2;
		String ville = JOptionPane.showInputDialog("Donnez-moi le nom de la ville :");
		String LAs = JOptionPane.showInputDialog("Donnez-moi latitude de la ville de : "+ville);
		String LOs = JOptionPane.showInputDialog("Donnez-moi la longitude de la ville de : "+ville);
		LA = Double.parseDouble(LAs);
		LO = Double.parseDouble(LOs);
		String autreVille = JOptionPane.showInputDialog("Donnez-moi le nom de l'autre ville :");
		String LA2s = JOptionPane.showInputDialog("Donnez-moi latitude de la ville de : "+autreVille);
		String LO2s = JOptionPane.showInputDialog("Donnez-moi la longitude de la ville de : "+autreVille);
		LA2 = Double.parseDouble(LA2s);
		LO2 = Double.parseDouble(LO2s);
		GPSFranšois2 P1 = new GPSFranšois2(LA, LO);
		GPSFranšois2 P2 = new GPSFranšois2(LA2, LO2);
		VilleFranšois2 ville1 = new VilleFranšois2(P1, ville);
		VilleFranšois2 ville2 = new VilleFranšois2(P2, autreVille);
		NumberFormat format=NumberFormat.getInstance();
		format.setMinimumFractionDigits(2); //nb de chiffres apres la virgule
		String s=format.format(ville1.getDistance(ville2));
		System.out.println("la distance en kilometre entre "+ville1.nom+" et "+ville2.nom+" est de " +s+ " km\n");
	}

}
