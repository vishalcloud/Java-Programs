//swapping with temporary variable
public class Swap1 {

	public void swap()
	{
		int x=4,y=6,temp;
		System.out.println("Values before Swapping :1st value:"+x+"  & 2nd Value:" +y );
		temp=x;
		x=y;
		y=temp;
		System.out.println("Values after Swapping : 1st Valie :"+x+ "  & 2nd Value : "+y);
	}
	public static void main(String[] args) {

		Swap1 s = new Swap1();
		s.swap();
	}
	

}
