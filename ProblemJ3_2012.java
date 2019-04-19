import java.util.Scanner;

public class ProblemJ3_2012 {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		char icon[] = {'*','x','*',' ','x','x','*',' ','*'};
		int k = thing.nextInt();
		
		while(k>=25)
			k = thing.nextInt();
		
		for(int j = 0;j < k; j++) {
			for(int i = 0; i < k; i++) {
				System.out.print(icon[0]);
			}
		
			for(int i = 0; i < k; i++) {
				System.out.print(icon[1]);
			}
		
			for(int i = 0; i < k; i++) {
				System.out.print(icon[2]);
			}
			System.out.println("");
		}
		
		for(int j = 0;j < k; j++) {
			for(int i = 0; i < k; i++) {
				System.out.print(icon[3]);
			}
		
			for(int i = 0; i < k; i++) {
				System.out.print(icon[4]);
			}
		
			for(int i = 0; i < k; i++) {
				System.out.print(icon[5]);
			}
			System.out.println("");
		}
		
		for(int j = 0;j < k; j++) {
			for(int i = 0; i < k; i++) {
				System.out.print(icon[6]);
			}
			
			for(int i = 0; i < k; i++) {
				System.out.print(icon[7]);
			}
		
			for(int i = 0; i < k; i++) {
				System.out.print(icon[8]);
			}
			System.out.println("");
		}
	}
}
