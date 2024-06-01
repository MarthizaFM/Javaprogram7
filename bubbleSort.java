package main;

import java.util.ArrayList;

public class main2 {
    public static void bubbleSort(ArrayList<Integer> list) {
    	int n = list.size();
    	for (int i = 0; i < n - 1; i++) {
    		for (int j = 0; j < n - i - 1; j++) {
    			if (list.get(j) > list.get(j + 1)) {
    				//swap
    				int temp = list.get(j);
    				list.set(j, list.get(j + 1));
    				list.set(j + 1, temp);
    			}
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
		bubbleSort(numbers);
		System.out.println("Setelah di sorting: " + numbers);
	;
	}

}
