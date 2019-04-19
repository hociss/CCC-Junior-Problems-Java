import java.util.Scanner;

public class ProblemJ2_2014 {
	public static void main(String[] args){
		Scanner thing = new Scanner(System.in);
	
		int V = thing.nextInt();
		int A = 0;
		int B = 0;
	
		while (V < 1 || V > 15) {
			System.out.println("Error");
			V = thing.nextInt();
		}
		
		thing.nextLine();
		String input = thing.nextLine();
		
		while(input.length() != V){
			System.out.println("Error");
			input = thing.nextLine();
		}
			
		
		
		for(int i = 0; i < V; i++){
			if (input.charAt(i) == 'A')
				A++;
			if (input.charAt(i) == 'B')
				B++;
		}
		
		if (A == B)
			System.out.println("Tie");
		else if (A > B)
			System.out.println("A");
		else
			System.out.println("B");
	
	}
}
