import java.util.Scanner;

public class Temperature {

	
	private static Scanner input;
	public static int temp(int c)
	{
		int f;
		
		input = new Scanner(System.in);
		System.out.println("enter Temperature in Celcius :");
		c=input.nextInt();
		f=(int) ((c*1.8)+32);
		System.out.println("Temperature in Ferenheit : "+f);
		return f;
		
	}
	public static void main(String[] args) {

	Temperature.temp(45);
	}

}
