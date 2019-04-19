import java.util.Scanner;

public class ProblemJ4_2016 {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		int h = 0,m = 0;
		String time = thing.nextLine();
		//System.out.println(time);
		h = Integer.parseInt(time.substring(0, 2));
		m = Integer.parseInt(time.substring(3));
		
		int v1 = 1, v2 = 2, d = 4;
		int n1 = 0;
		float n2 = 0, n3 = 0;
		
		if (h >= 7 && h < 10) {
			n1 = 10 - h;
			if (m == 20) {
				n1--;
				n2 = ((float) 2/3);
			}
			
			if (m == 40) {
				n1--;
				n2 = ((float) 1/3);
				
			}
			
			n3 = (4 - (n1 + n2)) / 2;
			
			h += n1;
			
			
			if (n2 + n3 >= 1) {
				h += (int) (n2 + n3);
				//System.out.println(n2);
				//System.out.println(n3);
				
				m += Math.round(60 * ( n2 + n3 - ((int) (n2 + n3))));
				
				//System.out.println(m);
			} else {
				m += Math.round(60 * ( n2 + n3));
			}
			//System.out.println((float) n3);		
			//System.out.println(n1);
		}
		System.out.print(h);
		System.out.print(':');
		System.out.println(m);
		//System.out.println(time.substring(0, 1));
	}
}
