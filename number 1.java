package main;

import java.util.Scanner;

public class Main {
	public static int bubbleSort(int[] arr) {
        int swapCount = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                }
            }
        }
        return swapCount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input ukuran array: "); // berapa banyak nilai yang dimasukkan
		int n = scan.nextInt();
		
		int[] arr = new int[n];
        System.out.println("Masukkan value ke dalam array: "); //masukkan nilai
        for (int i = 0; i < n; i++) {
            System.out.print("Index ke-" + i + ": ");
            arr[i] = scan.nextInt();
        }
        int swapCount = bubbleSort(arr);

        System.out.print("Sorted array: "); //nilai yang sudah diurutkan
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Banyak terjadi petukaran: " + swapCount); //berapa banyak terjado pertukaran nilai

        scan.close();

        
        
		
	}

}
