package be.cardinalmercier.cours13;

import java.util.Arrays;

public class Etudiant implements Comparable<Etudiant> {
	private int num;
	public Etudiant(int num) {
		this.num = num;
	}
	public String toString() {
		return num+"";
	}
	public int compareTo(Etudiant et) {
		return -(this.num - et.num);
	}
	public static void main(String[] args) {
		Etudiant tabEtu[] = new Etudiant[5];
		tabEtu[0] = new Etudiant(15);
		tabEtu[1] = new Etudiant(12);
		tabEtu[2] = new Etudiant(10);
		tabEtu[3] = new Etudiant(50);
		tabEtu[4] = new Etudiant(6);
		for (int i = 0; i < tabEtu.length; i++) {
			System.out.println(tabEtu[i]);
		}
		Arrays.sort(tabEtu);
		System.out.println("----------------");
		for (int i = 0; i < tabEtu.length; i++) {
			System.out.println(tabEtu[i]);
		}
	}

}
