import java.util.Scanner;

public class ProblemJ1_2011 {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		System.out.println("How many antennas?");
		int antenna = thing.nextInt();
		System.out.println("How many eyes?");
		int eyes = thing.nextInt();
		
		if (antenna >= 3 && eyes <= 4)
			System.out.println("TroyMartian");
		
		if (antenna <= 6 && eyes >= 2)
			System.out.println("VladSaturnian");
		
		if (antenna <= 2 && eyes <=3)
			System.out.println("GraemeMercurian");
	}
}
