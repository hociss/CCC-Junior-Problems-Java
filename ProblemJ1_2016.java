import java.util.Scanner;

public class ProblemJ1_2016 {
	
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		char results[] = new char[6];
		for (int i = 0; i < 6; i++)
		   results[i] = thing.next().charAt(0);
		
		
		int counter = 0;
		for(int i = 0; i < results.length; i++){
			if (results[i] == 'W')
				counter++;
		}
		
		if (counter == 0)
			System.out.println("-1");
		else if (counter == 1 || counter == 2)
			System.out.println("3");
		else if (counter == 3 || counter == 4)
			System.out.println("2");
		else
			System.out.println("1");
	}
}
