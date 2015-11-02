import java.util.Scanner;

public class Grades {

	public void grade()
	{
		int obtainedMarks;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Marks :");
		obtainedMarks = input.nextInt();
		
		if(obtainedMarks<40)
		{
			System.out.println("Fails");
		}
			else if(obtainedMarks>=40 && obtainedMarks<60)
			{
				System.out.println("Second Class");
			}
			else if (obtainedMarks>=60 && obtainedMarks<65)
			{
				System.out.println(" First Class");
				
			}
			else if (obtainedMarks>=65 && obtainedMarks<=100)
			{
				System.out.println("Distinction");
			}
			else
			{
				System.out.println("Invalid Marks");
				
			}
		}
	int x;
	
	
	public static void main(String[] args) {
				
		Grades g = new Grades();
		g.grade();
	
	}

}
