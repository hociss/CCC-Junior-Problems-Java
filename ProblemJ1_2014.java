import java.util.Scanner;

public class ProblemJ1_2014 {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		int A = thing.nextInt();
		int B = thing.nextInt();
		int C = thing.nextInt();
		
		int sum = A + B + C;
		
		while (sum != 180) {
			System.out.println("Error");
			A = thing.nextInt();
			B = thing.nextInt();
			C = thing.nextInt();
			sum = A + B + C;
		}
		
		if (A==B && A==C)
			System.out.println("Equilateral");
		else if(A==B || B==C || A==C)
			System.out.println("Isosceles");
		else 
			System.out.println("Scalene");
	}
}
