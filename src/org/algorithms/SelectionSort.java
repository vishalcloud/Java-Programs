package org.algorithms;

// program for Selection sort 
public class SelectionSort {

	public void sort(int num[]) {
		int temp = 0;
		int j = 0;
		for (int i = 0; i < num.length; i++) {
			j = i;
			for (int k = i; k < num.length; k++) {
				if (num[j] > num[k]) {
					j = k;
				}
			}
			temp = num[i];
			num[i] = num[j];
			num[j] = temp;

		}

	}

	public static void main(String[] args) {
		SelectionSort sSort = new SelectionSort();
		int[] num = { 20, 10, 30, 80, 40, 50, 10 };
		System.out.println("Array elements to be sorted :");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		sSort.sort(num);
		System.out.println();
		System.out.println("Array elements After applying Selection Sort :");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
