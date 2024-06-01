package main;

import java.util.ArrayList;

public class Selectionsort {
	public static void selectionSort(ArrayList<Integer>numbers) {
		for(int i = 0; i < numbers.size(); i++) {
			int minIndex = i;
			for(int j = i + 1; j < numbers.size(); j++) {
				if (numbers.get(j) < numbers.get(minIndex)) {
					minIndex = j;
				}
			}
			if (minIndex !=i) {
				int temp = numbers.get(i);
				numbers.set(i, numbers.get(minIndex));
				numbers.set(minIndex, temp);
			}
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
		selectionSort(numbers);
		System.out.println("Setelah di sorting: " + numbers);
	}

}
