import java.util.Scanner;

public class ProblemJ1_2013 {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		int ageY = thing.nextInt();
		int ageM = thing.nextInt();
		//int ageO = ageM-ageY+ageM;
		
		System.out.println("The oldest child is " + (ageM-ageY+ageM) + " years old");
	}
}
