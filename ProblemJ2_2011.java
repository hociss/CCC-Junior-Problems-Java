import java.util.Scanner;

public class ProblemJ2_2011 {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		int h = thing.nextInt();
		while(h > 100 || h < 0)
			h = thing.nextInt();
			
		int M = thing.nextInt();
		while(M >= 240 || M<= 0)
			M = thing.nextInt();
		
		int t = 0;
		int A = 999999;
		
		while (A > 0 && t <= M) {
			t++;
			// if t>M or A<=0 then stop the loop
			// if t<=M and A> 0 then continue in the loop
			// so t>M || A<=0 is counter condition of t<=M and A>0
			// t>M || A<=0 = ! (t<=M && A>0)
			// !(A || B) = !A && !B
			
			
			A = (int) (-6*Math.pow(t, 4) + h*Math.pow(t, 3) + 2*Math.pow(t, 2) + t);
			//A= - 6 * t*t*t*t + h*t*t*t +2*t*t + t;
			//System.out.println(A);
			
		}
		
		if (t > M)
			System.out.println("The balloon does not touch ground in the given time.");
		else {
			System.out.println("The balloon first touches the ground at hour:");
			System.out.println(t);
		}
	}
}
