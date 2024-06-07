package inheritance;

//extends -> digunakan untuk connect sama  parent class
public class Sedan extends Car{
	public int tinggi;
	
	
	public Sedan(String brand, String warna, int jumlahRoda, int tinggi) {
		super(brand, warna, jumlahRoda);
		//super-> untuk akses suatu dalam superclass
		// TODO Auto-generated constructor stub
		
		this.tinggi = tinggi;
	}
	public void honk() {
		System.out.println("beep beep");
	}
	
}
