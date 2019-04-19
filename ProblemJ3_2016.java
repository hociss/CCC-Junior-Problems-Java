import java.util.Scanner;

public class ProblemJ3_2016 {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		String original = thing.nextLine();
		String a;
		int n = 0;
		
		for(int i = 0; i <= original.length(); i++) {
			for(int j = i; j <= original.length(); j++) {
				a = original.substring(i,j);
				
				//System.out.println("a value     " + a);
				
				StringBuffer b = new StringBuffer(a);
				
				//System.out.println("b value     " + b);
				
				StringBuffer c = b.reverse();
				
				//System.out.println("c value     " + c);
				//System.out.println("b == c    " + a.equals(c.toString()));
				
				
				if(b.length() > n && a.equals(c.toString()))
						n = b.length();
				
				//System.out.println(n);
			}
		}
		
		System.out.println(n);
	}
}
