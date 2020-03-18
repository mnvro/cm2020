package cours8et9;

public class MainMourad {

	public static void main(String[] args) {
	
		DateMourad date1 = new DateMourad("20/02/1995");
		DateMourad date2 = new DateMourad();
		DateMourad date3 = new DateMourad(20,2,1995);
		
		date2.setJour(10);
		date2.setMois(2);
		date2.setAnnee(2000);
		
		System.out.println(date1.toString());
		System.out.println(date3.toString());
		System.out.println(date2.toString());
		
		
		
	}

}
