package org.algorithms;

// program for bubble sort 
public class BubbleSort {
	int temp = 0;

	public void sort(int num[]) {
		for (int i = 0; i < num.length + 1; i++) {
			for (int j = 1; j < num.length; j++) {
				if (num[j - 1] > num[j]) {
					temp = num[j - 1];
					num[j - 1] = num[j];
					num[j] = temp;

				}
			}
		}
		//return num;
		
	}

	public static void main(String[] args) {
		BubbleSort bSort = new BubbleSort();
		int[] num = { 20, 10, 30, 80, 40, 50, 10 };
		System.out.println("Array elements to be sorted :");
	
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	
		bSort.sort(num);
		System.out.println();
		System.out.println("Array elements After applying Bubble Sort :");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
