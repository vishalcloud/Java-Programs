package org.algorithms;


//extending class
public class Calculation {

	int a;

	public void Add(int b, int c) {
		a = b + c;
		System.out.println("Addition:" + a);
	}

	public void Sub(int b, int c) {
		a = b - c;
		System.out.println("Substraction :" + a);
	}
}

class MyCalc extends Calculation {
	public void multiply(int b, int c) {
		a = b * c;
		System.out.println("Multiplication:" + a);
	}

	public void divide(int b, int c) {
		a = b / c;
		System.out.println("Division:" + a);
	}

	public static void main(String[] args) {
		int b = 20, c = 10;

		MyCalc newCalc = new MyCalc();
		newCalc.Add(b, c);
		newCalc.Sub(b, c);
		newCalc.multiply(b, c);
		newCalc.divide(b, c);
	}

}


