import java.util.Scanner;

public class ProblemJ2_2012 {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		int p1 = thing.nextInt();
		int p2 = thing.nextInt();
		int p3 = thing.nextInt();
		int p4 = thing.nextInt();
		
		if (p1 < p2 && p2 < p3 && p3 < p4)
			System.out.println("Fish Rising");
		else if (p1 > p2 && p2 > p3 && p3 > p4)
			System.out.println("Fish Diving");
		else if (p1 == p2 && p1 == p3 && p1 == p4)
			System.out.println("Fish At Constant Depth");
		else
			System.out.println("No Fish");
	}
}
