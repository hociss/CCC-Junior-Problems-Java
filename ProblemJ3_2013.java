import java.util.Scanner;

public class ProblemJ3_2013 {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		int y = thing.nextInt();
		int d = y + 1;
		int r = d;
		int digits[] = new int[String.valueOf(y).length()];
		int b = String.valueOf(y).length();
		
		if (b < 1){
			for(int i = 0; i < b; i++) {
				digits[b - i] = r % 10;
				r /= 10;
			}
		}
		
		//while(digits[0] != digits[1] && digits[0] != digits[])
			
		if(b == 1)
			System.out.println(y+1);
		else if(b == 2){
			while(digits[0] == digits [1]){
				int p = 2;
				d = y + p;
				r = d;
				
				for(int i = 0; i < b; i++) {
					digits[b - i] = r % 10;
					r /= 10;
				}
				
				p++;
			}
			
			System.out.println(d);
			
		}else if(b == 3){
			while(digits[0] == digits[1] || digits[0] == digits[1] || digits[1] == digits[2]){
				int p = 2;
				d = y + p;
				r = d;
				
				for(int i = 0; i < b; i++) {
					digits[b - i] = r % 10;
					r /= 10;
				}
				
				p++;
			}
			
			System.out.println(d);
		}else if(b == 4){
			while(digits[0] == digits[1] || digits[0] == digits[2] || digits[0] == digits[3] ||
					digits[1] == digits[2] || digits[1] == digits[3] || digits[2] == digits[3]) {
				int p = 2;
				d = y + p;
				r = d;
				
				for(int i = 0; i < b; i++) {
					digits[b - i] = r % 10;
					r /= 10;
				}
				
				p++;
			}
			
			System.out.println(d);
		}
	}
}
