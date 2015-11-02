
public class Greatest {
	int max=0;

	public int getMax(){
		return max;
	}
	
	public static void main(String[] args) {

		int x=2, y=9 , z=4 ;

		new Greatest();
		//Greatest.findGreatestNumber(x, y, z);

	}

	public  void findGreatestNumber(int x, int y, int z) {
		if (x > y && x > z) {
			System.out.println("x is greater :" + x);
			max =x;
			//return x;

		} else if (y > z && y > x)

		{
			System.out.println("Y is greater :" + y);
			max =y;
		//	return y;
		} else if (z > x && z > y) {
			System.out.println("Z is greater : " + z);
			max = z;
			//return z;
		} else{
			System.out.println(" numbers are not distinct");
		     max = x;	
		}
		//return x;
		 
				
	}
}
