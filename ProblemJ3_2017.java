import java.util.Scanner;

public class ProblemJ3_2017 {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		int a = thing.nextInt();
		while (a < -1000 || a > 1000){
			System.out.println("Try again");
			a = thing.nextInt();
		}	
		
		int b = thing.nextInt();
		while (b < -1000 || b > 1000){
			System.out.println("Try again");
			b = thing.nextInt();
		}	
		
		int c = thing.nextInt();
		while (c < -1000 || c > 1000){
			System.out.println("Try again");
			c = thing.nextInt();
		}	
		
		int d = thing.nextInt();
		while (d < -1000 || d > 1000){
			System.out.println("Try again");
			d = thing.nextInt();
		}
		
		int t = thing.nextInt();
		while (t < 0 || t > 10000){
			System.out.println("Try again");
			t = thing.nextInt();
		}	
		
		int x = Math.abs(c - a);
		int y = Math.abs(d - b);
		int min = x + y;
		
		if(t % 2 == min % 2 && t >= min)
			System.out.println("Y");
		else
			System.out.println("N");
	}
}
