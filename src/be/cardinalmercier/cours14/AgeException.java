package be.cardinalmercier.cours14;

public class AgeException extends Exception {
	private String message;
	public AgeException(String message) {
		this.message = message;
	}
	public String toString() {
		return message;
	}
}
