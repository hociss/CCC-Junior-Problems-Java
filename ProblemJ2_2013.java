import java.util.Scanner;

public class ProblemJ2_2013 {
	public static void main(String[] args){
		Scanner thing = new Scanner(System.in);
		
		String input = thing.nextLine();
		
		while(input.length() > 30){
			System.out.println("Error");
			input = thing.nextLine();
		}
		
		int counter = 0;
		for(int i = 0; i < input.length(); i++){
			/**
			if(input.charAt(i) == 'I')
				counter++;
			if(input.charAt(i) == 'O')
				counter++;
			if(input.charAt(i) == 'S')
				counter++;
			if(input.charAt(i) == 'H')
				counter++;
			if(input.charAt(i) == 'Z')
				counter++;
			if(input.charAt(i) == 'X')
				counter++;
			if(input.charAt(i) == 'N')
				counter++;
				*/
			if("IOSHZXN".indexOf(input.charAt(i)) != -1)
				counter++;
		}
		
			
		
		
		if(counter == input.length())
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
