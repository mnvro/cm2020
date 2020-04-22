package be.cardinalmercier.cours14;

public class IMC {
	public static final String MESSAGES[] = {
			"une anorexie",
			"une maigreur",
			"un poids normal",
			"un surpoids",
			"une obésité modérée",
			"une obésité sévère",
			"une obésité massive"
	};
	public static String getMessage(double imc) {
		if (imc < 16.5) return MESSAGES[0];
		if (imc < 18.5) return MESSAGES[1];
		if (imc < 25) return MESSAGES[2];
		if (imc < 30) return MESSAGES[3];
		if (imc < 35) return MESSAGES[4];
		if (imc < 40) return MESSAGES[5];
		return MESSAGES[6];
	}
}
