import java.util.Scanner;

public class ProblemJ3_2014 {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		int n = thing.nextInt();
		int Antonia = 100;
		int David = 100;
		
		int roll[] = new int[n * 2];
		
		for(int i = 0; i < n * 2; i++) {
			roll[i] = thing.nextInt();
		}
		
		for(int i = 0; i < n * 2; i+=2) {
			if(roll[i] < roll[i + 1])
				Antonia -= roll[i + 1];
			if(roll[i + 1] < roll[i])
				David -= roll[i];
		}
		
		System.out.println(Antonia + "\n" + David);
	}
}
