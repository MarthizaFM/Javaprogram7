package main;

import java.util.ArrayList;

public class Insertion {
	public static void insertionSort (ArrayList<Integer> numbers) {
		for (int i = 1; i <numbers.size(); i++) { // iterasi dimulai pada index 1
			int valueSekarang = numbers.get(i);
			int j = i - 1; // j untuk penanda posisi valueSekarang disisip.
						//inisialisasi dimulai dari i - 1
			while (j >= 0 && numbers.get(j) > valueSekarang) {
				numbers.set(j + 1, numbers.get(j));
				//geser nilai
				j--; //penanda dikurangi buat nilai sebelumnya
			}
			numbers.set(j + 1, valueSekarang);//sisip nilai
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(8);
		numbers.add(7);
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(2);
		
		System.out.println("Sebelum di sorting: " + numbers );
		insertionSort(numbers);
		System.out.println("Setelah di sorting: " + numbers);
	}

}
