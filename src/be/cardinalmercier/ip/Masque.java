package be.cardinalmercier.ip;

public class Masque {
	private int nb1;
	public Masque(int nb1) {
		this.nb1 = nb1;
	}
	private int getValeur() {
		int valeur = 0xffffffff;
		return valeur>>>32-nb1<<32-nb1;
	}
	public int getOct1() {
		return getValeur() >>> 24;
	}
	public int getOct2() {
		return (getValeur() >> 16) & 0xFF;
	}
	public int getOct3() {
		return (getValeur() >> 8) & 0xFF;
	}
	public int getOct4() {
		return getValeur() & 0xFF;
	}
	public String toString() {
		return getOct1()+"."+getOct2()+"."+getOct3()+"."+getOct4();		
	}
	public static void main(String[] args) {
		Masque masque1 = new Masque(23);
		System.out.println(masque1);
	}

}
