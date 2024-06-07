package inheritance;

public class Car {
	public String brand;
	public String warna;
	public int jumlahroda;
	
	//Constructor
	/*
	 * [Access Modifier] [Nama Class] (List of Attributes)
	*/

	public Car(String brand, String warna, int jumlahRoda) {
		//this -> keyword untuk menunjuk ke attributes milik class tersebut
		this.brand = brand;
		this.warna = warna;
		this.jumlahroda = jumlahRoda;
		
		
	}
	
	//method
	public void drive() {
		System.out.println("The car is moving...");
	}
	public void honk( ) {
		System.out.println("Telolet...");
	}
	public void lampuRiting(String arah) {
		System.out.println("Sen" + arah);
	}
	);
}
