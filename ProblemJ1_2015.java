import java.util.Scanner;

public class ProblemJ1_2015 {
	public static void main(String[] args){
		Scanner thing = new Scanner(System.in);
		
		int month = thing.nextInt();
		int day = thing.nextInt();
		
		if (month == 2 && day < 18 || month < 2)
			System.out.println("Before");
		else if (month == 2 && day == 18)
			System.out.println("Special");
		else
			System.out.println("After");
	}
}
