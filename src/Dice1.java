import java.util.Random;

public class Dice1 {

 public int throwDice()
 {
	int res=0;
	Random r =new Random();
	res = r.nextInt(6)+1;
	 System.out.println(res);
	 return 0;
	 
 }
	
	
	
	public static void main(String[] args) {
		Dice1 dice= new Dice1();
		dice.throwDice();
	}

}
