import java.util.Scanner;

public class ProblemJ3_2011 {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		int t[] = new int[10000];
		t[0] = thing.nextInt();
		while (t[0] < 0 || t[0] > 10000) 
			t[0] = thing.nextInt();
		
		t[1] = thing.nextInt();
		while (t[1] < 0 || t[1] > 10000) 
			t[1] = thing.nextInt();
		
		int n = 2;
		for (int i = 1; t[i] < t[i-1]; i++) {
			t[i+1] = t[i-1] - t[i];
			n++;
			//System.out.println(t[i+1]);
		}
		
		System.out.println(n);
	}
}
