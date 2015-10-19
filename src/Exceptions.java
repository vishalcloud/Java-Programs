
public class Exceptions {

	public void division() {
		int x = 8, y = 0, z;
		z = x / y;
		System.out.println(z);

	}

	public static void main(String[] args) {

		Exceptions ex = new Exceptions();
		try {
			ex.division();
		} catch (ArithmeticException e) {
			System.out.println("Exception Divisible by zero Error");
		}
	}

}
