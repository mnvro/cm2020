package be.cardinalmercier.ip;

public class IP {
	private int valeur;
	/**
	 * Ce constructeur permet de créer une adresse IP à partir d'une chaine de caractères.
	 * Par exemple "192.168.30.1"
	 * @param ips l'adressse IP sous forme d'une chaine de caractères
	 */
	public IP(String ips) {
		String tab [] = ips.split("\\.");
		System.out.println(ips);
		int oct1 = (Integer.parseInt(tab[0]))<<24; //"192 devient '192'.0000 0000.0000 0000.0000 0000"
		int oct2 = Integer.parseInt(tab[1])<<16; //"168 devient           '168'.0000 0000.0000 0000"
		int oct3 = Integer.parseInt(tab[2])<<8;  //"30 devient                       '30'.0000 0000"
		int oct4 = Integer.parseInt(tab[3]);     //"1 devient                                    '1'
		valeur = oct1+oct2+oct3+oct4;
	}
	public int getOct1() {
		return valeur >>> 24;
	}
	public int getOct2() {
		return (valeur >> 16) & 0xFF;
	}
	public int getOct3() {
		return (valeur >> 8) & 0xFF;
	}
	public int getOct4() {
		return valeur & 0xFF;
	}
	public String toString() {
		return getOct1()+"."+getOct2()+"."+getOct3()+"."+getOct4();		
	}
	public static void main(String[] args) {
		IP ip1 = new IP("192.168.0.1");
		System.out.println(ip1);
	}
}
