import java.util.Scanner;

public class OddEven {

	public void Parity() {
		int x;
		System.out.println("Enter Number to be checked");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		if (x % 2 != 0) {
			System.out.println("Odd Number");
		} else if (x % 2 == 0) {
			System.out.println("Even Number");

		}
	}

	public static void main(String[] args) {
		OddEven parityCheck = new OddEven();
		parityCheck.Parity();
	}

}
