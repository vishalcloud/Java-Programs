//swapping without Third variable
public class Swap2 {

	public void swap()
	{
		int x=7,y=10;
		System.out.println("Values before Swapping :1st value:"+x+"  & 2nd Value:" +y );

		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Values after Swapping : 1st Value :"+x+ "  & 2nd Value : "+y);

	}
	

public static void main(String[] Args)
{
	Swap2 s =new Swap2();
	s.swap();
	
}
}
