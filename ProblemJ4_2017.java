import java.util.Scanner;

public class ProblemJ4_2017 {
	public static void main (String[] args) {
		Scanner thing = new Scanner(System.in);
		
		int m = 0, n = 0, o = 0, p = 0;
		
		
		int D = thing.nextInt();
		while (D > 1000000000 || D < 0) {
			D = thing.nextInt();
		}
			
		int c = 0;	
		int B = 0;
		
		abcdefg:
		for (int z = 0; z <= 1388889; z++) {
		for (int i = 0; i <= 11; i++) {
			if (i == 0) {
				m = 1;
				n = 2;
			}
			if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9) {
				m = 0;
				n = i;
			}
			if (i == 10) {
				m = 1;
				n = 0;
			}
			if (i == 11) {
				m = 1;
				n = 1;
			}
			
			for (int j = 0; j <= 5; j++) {
				o = j;
				
				for (int k = 0; k <= 9; k++) {
					p = k;
					//System.out.println (m+""+n+":"+o+""+p);
						if (m == 0) {
							if (n - o == o - p) {
								//System.out.println ("find one as B"+B+""+m+""+n+":"+o+""+p);
								B++;
							}
						}else {
							if (m - n == n - o && n-o == o - p) {
								//System.out.println ("find one as B"+B+""+m+""+n+":"+o+""+p);
								B++;
							}
						}
						
						c++;
						
						if (c > D) {
							System.out.println(B);
							break abcdefg;
						}
				}
			}
			
		}
		}
	}
}
