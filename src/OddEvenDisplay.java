import java.util.Scanner;

public class OddEvenDisplay {

	public void disp() {
		int x;
		System.out.println("Enter Number upto which you want to Display Odd and Even Numbers");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		System.out.println("Even Numbers :");
		for (int i = 1; i <= x; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Odd Numbers :");

		for (int j = 1; j <= x; j++) {
			if (j % 2 != 0) {
				System.out.println(j);
			}

		}

	}

	public static void main(String[] args) {

		OddEvenDisplay oed = new OddEvenDisplay();
		oed.disp();

	}

}
