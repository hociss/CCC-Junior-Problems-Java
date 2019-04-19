import java.util.Scanner;

public class ProblemJ1_2017 {

	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		System.out.println("Please enter the x coordinate: ");
		
		int x = thing.nextInt();
		while (x<=-1000 || x>=1000 || x==0){
			System.out.println("This number is out of the range");
			System.out.println("Please enter the x coordinate");
			x = thing.nextInt();
		}
		
		System.out.println("Please enter the y coordinate");
		int y = thing.nextInt();
		while (y<=-1000 || y>=1000 || y==0){
			System.out.println("This number is out of the range");
			System.out.println("Please enter the y coordinate");
			y = thing.nextInt();
		}
		System.out.print("The quadrant of the coordinates (" + x + "," + y + ") is ");
		System.out.println((x>0 && y>0)? "1" : (x<0 && y>0)? "2" : (x<0 && y<0)? "3" : "4");
		
		/**if(x>0 && y>0)
			System.out.println("1");
		else if(x<0 && y>0)
			System.out.println("2");
		else if(x<0 && y<0)
			System.out.println("3");
		else
			System.out.println("4");
		*/
	}

}
