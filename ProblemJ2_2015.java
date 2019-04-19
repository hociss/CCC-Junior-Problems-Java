import java.util.Scanner;

public class ProblemJ2_2015 {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		String sentence = thing.nextLine();
		int happy = 0;
		int sad = 0;
		
		for(int i = 0; i < sentence.length() - 2; i++) {
			//System.out.println(sentence.substring(i,i+3));
			if (sentence.substring(i,i+3).equals(":-)"))
				happy++;
				
			if (sentence.substring(i,i+3).equals(":-("))
				sad++;
		}
		
		if(happy == 0 && sad == 0)
			System.out.println("None");
		else if(happy>sad)
			System.out.println("Happy");
		else if(happy<sad)
			System.out.println("Sad");
		else
			System.out.println("Unsure");
	}
}
