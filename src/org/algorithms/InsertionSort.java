package org.algorithms;

// program for Insertion sort 
public class InsertionSort {

	public void sort(int num[]) {
		int temp = 0;
		int i = 0;
		for (int j = 1; j < num.length; j++) {
			temp = num[j];
			i = j - 1;
			while (i >= 0 && num[i] > temp) {
				num[i + 1] = num[i];
				i = i - 1;
				num[i + 1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		InsertionSort iSort = new InsertionSort();
		int[] num = { 20, 10, 30, 80, 40, 50, 10 };
		System.out.println("Array elements to be sorted :");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		iSort.sort(num);
		System.out.println();
		System.out.println("Array elements After applying Insertion Sort :");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
