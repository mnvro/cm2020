package cours3et4;



import javax.swing.JOptionPane;

/**
 * @author François
 *
 */
public class CarreF {
	private double longueur; 
	public double aire() {
		return (longueur * longueur);
	}
	public double  perimetre() {
		return (longueur * 4);
	}
	public static void main(String[] args) {
		CarreF carre1 = new CarreF();
		carre1.longueur = Double.parseDouble(JOptionPane.showInputDialog(null, "Donnez-moi la longueur de votre carrÃ© :"));
		JOptionPane.showMessageDialog(null, "L'aire de votre carré est : " +carre1.aire(), "titre", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Le perimetre de votre carré est : " +carre1.perimetre(), "titre", JOptionPane.INFORMATION_MESSAGE);
	}
}