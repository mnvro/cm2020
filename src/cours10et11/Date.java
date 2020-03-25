package cours10et11;

import java.util.GregorianCalendar;

public class Date {
	private int jj;
	private int mm;
	private int aaaa;
	public Date(String s) {
		String tab[] = s.split("/");
		jj = Integer.parseInt(tab[0]);
		mm = Integer.parseInt(tab[1]);
		aaaa = Integer.parseInt(tab[2]);
	}
	public String toString() {
		String s = jj+"/"+mm+"/"+aaaa;
		if (estBissextile1()) s+=" est une année bissextile";
		if (estBissextile2()) s+= " et c'est confirmé par la seconde méthode";
		else s += "n'est pas une année bissextile";
		return s;
	}
	public boolean estBissextile1() {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(aaaa);
	}
	public boolean estBissextile2() {
		if (aaaa%400==0) return true;
		if (aaaa%100==0) return false;
		if (aaaa%4==0) return true;
		return false;
	}
	public static void main(String[] args) {
		Date date = new Date("30/12/1980");
		System.out.println(date);
		date = new Date("30/12/2000");
		System.out.println(date);
		date = new Date("30/12/2001");
		System.out.println(date);
		date = new Date("30/12/2020");
		System.out.println(date);
	}
}
