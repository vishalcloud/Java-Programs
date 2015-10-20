package TestCaseImplementation;

public class Greatest {

	public static void main(String[] args) {

		int x=2, y=9 , z=4 ;

		new Greatest();
		Greatest.findGreatestNumber(x, y, z);

	}

	public static int findGreatestNumber(int x, int y, int z) {
		if (x > y && x > z) {
			System.out.println("x is greater :" + x);
			return x;

		} else if (y > z && y > x)

		{
			System.out.println("Y is greater :" + y);
			return y;
		} else if (z > x && z > y) {
			System.out.println("Z is greater : " + z);
			return z;
		} else
			System.out.println(" numbers are not distinct");
			return x;
		 

	}
}
