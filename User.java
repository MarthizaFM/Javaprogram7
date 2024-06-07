package encapsulelation;

public class User {
	//Attributes
	public int angka1; //alt + shift + s + o, public (global)
	public User(int angka1, int angka2, int angka3, int angka4) {
		super();
		this.angka1 = angka1;
		this.angka2 = angka2;
		this.angka3 = angka3;
		this.angka4 = angka4;
	}
	protected int angka2; //akses package yang sama / subclass
	private int angka3; //cuma bisa 1 class aja 
	int angka4; // di package yang sama 
	
	
}
