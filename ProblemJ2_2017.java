import java.util.Scanner;

public class ProblemJ2_2017 {

	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 and 10000: ");
		int N = thing.nextInt();
		while (N<=0 || N>10000){
			System.out.println("Please enter a number within the range");
			System.out.println("Please enter another number: ");
			N = thing.nextInt();
		}
		
		
		System.out.println("Please enter a number between 1 and 5: ");
		int k = thing.nextInt();
		while (k<0 || k>5) {
			System.out.println("Please enter a number within the range");
			System.out.println("Please enter another number: ");
			k = thing.nextInt();
		}
		
		/**
		if (k==0)
			System.out.println(N);
		else if(k==1)
			System.out.println(N+10*N);
		else if(k==2)
			System.out.println(N+10*N+100*N);
		else if(k==3)
			System.out.println(N+10*N+100*N+1000*N);
		else if(k==4)
			System.out.println(N+10*N+100*N+1000*N+10000*N);
		else
			System.out.println(N+10*N+100*N+1000*N+10000*N+100000*N);
		*/
		
		int sum = N;
		for(int i = 1; i <= k ; i++) {
			sum = sum + (int) Math.pow(10, i)*N;
		}
		System.out.println(sum);
	}
}
