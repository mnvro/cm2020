package cours12;

import java.util.GregorianCalendar;

/**
 * Voici la correction de l'exercice de la semaine deni�re
 * @author Marie-No�l Vroman
 *
 */
public class Date {
	private int jj, mm, aaaa;
	/**
	 * @param s une chaine de caract�res qui repr�sente une date par ex "30/12/1970"
	 */
	public Date(String s) {
		String tab[] = s.split("/");
		jj = Integer.parseInt(tab[0]);
		mm = Integer.parseInt(tab[1]);
		aaaa = Integer.parseInt(tab[2]);
	}
	public boolean estBissextile() {
		if (aaaa % 400 == 0) return true;
		if (aaaa % 100 == 0) return false;
		if (aaaa % 4 == 0 ) return true;
		return false;
	}
	public boolean estBissextile2() {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(aaaa);
	}
	public String toString() {
		String s = jj+"/"+mm+"/"+aaaa;
		if (estBissextile()) s += " est une ann�e bissextile"; // + concat�nation
		else s += " n'est pas une ann�e bissextile";
		if (estBissextile2()) s+= " et cela est bien confirm� par la m�thode isLeapYear";

		return s;
	}
	public static void main(String[] args) {
		Date date = new Date("1/1/2000");
		System.out.println(date);
		date = new Date("1/1/2015");
		System.out.println(date);
		date = new Date("1/1/2020");
		System.out.println(date);
		date = new Date("1/1/2016");
		System.out.println(date);
		date = new Date("1/1/2600");
		System.out.println(date);
	}

}
