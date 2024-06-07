package sesi;

import inheritance.SUV;
import inheritance.Sedan;

public class OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new-> keyword untuk memanggil constructor
//		Car guido = new Car("Toyota", "Biru", 3);
//		System.out.println(guido.brand);
//		System.out.println(guido.warna);
//		System.out.println(guido.jumlahroda);
//		
//		guido.honk();
//		guido.drive();
//		guido.lampuRiting("kiri");
		
		Sedan mobilWill = new Sedan("Honda", "Pink", 2, 160);
		SUV mobilCiKaren = new SUV("Toyata", "hitam", 4, 8);
		mobilWill.honk();
		mobilCiKaren.honk();
			
		}
	}
